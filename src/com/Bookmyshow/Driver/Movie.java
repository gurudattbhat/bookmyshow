package com.Bookmyshow.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Movie {
    static int id = 2;
    static List<Theatre> Theatres = new ArrayList<Theatre>();
    static List<Shows> Show = new ArrayList<Shows>();
    static List<Seat> Seats = new ArrayList<Seat>();

    //Creating arraylist of arraylist to hold seats for different theatres

    static ArrayList<List<Seat>> Theatreslist = new ArrayList<List<Seat>>();

    static List<Customer> Customers = new ArrayList<Customer>();


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Adding  default theatre
        Seat s1 = new Seat(0, false);
        Seat s2 = new Seat(1, false);
        Seat s3 = new Seat(2, false);
        Seat s4 = new Seat(3, false);
        Seat s5 = new Seat(4, false);
        Seat s6 = new Seat(5, false);
        Seats.add(s1);
        Seats.add(s2);
        Seats.add(s3);
        Seats.add(s4);
        Seats.add(s5);
        Seats.add(s6);
        Theatreslist.add(Seats);
        Theatre theatre=new Theatre(Theatres,1);



        //Adding default show
        Shows show1 = new Shows("race", "22/3/2019", 200, Theatres.get(0));
        Show.add(show1);




        while (true) {
            System.out.println("Enter 1 to add theatre");
            System.out.println("Enter 2 to add show");
            System.out.println("Enter 3 to see available shows");
            System.out.println("Enter 4 to do booking");
            System.out.println("Enter 5 to exit");


            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.print("Enter the name of the theatre:\n");
                    String name = sc.next();
                    int theatreid = id;
                    System.out.println("Theatre id is:" + theatreid + "\n");
                    id++;
                  //  Addseats();
                    Seat s7 = new Seat(0, false);
                    Seat s8 = new Seat(1, false);
                    Seat s9 = new Seat(2, false);
                    Seat s10 = new Seat(3, false);
                    Seat s11 = new Seat(4, false);
                    Seat s12 = new Seat(5, false);
                    Seats.add(s7);
                    Seats.add(s8);
                    Seats.add(s9);
                    Seats.add(s10);
                    Seats.add(s11);
                    Seats.add(s12);
                    Theatreslist.add(Seats);

                    Theatre theatre1 = new Theatre(theatreid, name);
                    Theatres.add(theatre1);
                    id++;
                    break;


                case 2:
                    System.out.print("Enter the name of the show:\n");
                    String showname = sc.next();
                    System.out.print("Enter the show date: \n");
                    String showdate = sc.next();
                    System.out.println("Enter the show price");
                    int price = sc.nextInt();
                    System.out.println("Select the Theatre by entering the theatre id");
                    for (int i = 1; i <= Theatres.size(); i++) {
                        System.out.println(i + " " + Theatres.get(i - 1).getname());
                    }
                    int theatrenumber = sc.nextInt();
                    Shows shows = new Shows(showname, showdate, price, Theatres.get(theatrenumber - 1));
                    Show.add(shows);
                    break;


                case 3:
                     printshow();
                     break;


                case 4:
                    Random rd = new Random();
                    int custid = rd.nextInt(100);
                    System.out.println("Please Enter your name");
                    String custname = sc.next();

                    System.out.println("Available Movies are");
                    printshow();

                    System.out.println("Select show number");
                    int showNumber = sc.nextInt();
                    String showName = Show.get(showNumber - 1).getsname();
                    int showPrice = Show.get(showNumber - 1).getprice();
                    int theatreNumber = Show.get(showNumber - 1).gettheatre().getid();


                    System.out.println("This show is available in" + " " + Show.get(showNumber - 1).gettheatre().getname());


                    System.out.println("Available seats are");
                    for (int i = 0; i < 6; i++) {
                        if (Theatreslist.get(theatreNumber - 1).get(i).getseatstatus() == false) {
                            System.out.println(i);
                        }
                    }

                    System.out.println("Select any of the available seats");
                    int selectedseat = sc.nextInt();

                    // If user selects already booked seat, throw custom exception
                    if (Theatreslist.get(theatreNumber - 1).get(selectedseat).getseatstatus() == true) {
                        try {
                            throw new InvalidseatException("not valid");
                        } catch (InvalidseatException e) {
                            System.out.println("This seat is reserved..!! Please select another  seat");
                        }
                        System.out.println("This seat is not available. Please select any of the available seats");
                    }

                     //If user select valid seat reserve
                    else {
                        Theatreslist.get(theatreNumber - 1).get(selectedseat).reserve();
                        System.out.println("Seat booked successfully");
                        Customer c = new Customer(custid, custname, selectedseat, showName, showPrice);
                        Customers.add(c);
                        System.out.println("----------------Info------------------------");
                        c.customerinfo();
                        System.out.println("--------------------------------------------");
                    }
                    break;


                case 5:
                    System.exit(0);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

        }


    }
    public static void printshow ()
    {
        for (int i = 0; i < Show.size(); i++) {
            int showNumber = i + 1;
            System.out.println("Show Number: " + showNumber);
            ;
            System.out.println("Show Name: " + Show.get(i).getsname());
            System.out.println("Show Date: " + Show.get(i).getsdate());
            System.out.println("\n");
        }
    }





}




