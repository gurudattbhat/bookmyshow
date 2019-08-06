package com.Bookmyshow.Driver;

public class Customer {
    int customerid;
    String name,showname;
    int seatnumber;
    int price;


    Customer(int customerid,String name,int seatnumber,String showname,int price)
    {
        this.customerid=customerid;
        this.name=name;
        this.seatnumber=seatnumber;
        this.showname=showname;
        this.price=price;
    }

    String getname()
    {
        return name;
    }

    int getcustomerid()
    {
        return customerid;
    }

    void customerinfo(){
        System.out.println("Name:"+name);
        System.out.println("id:"+customerid);
        System.out.println("Seatnumber:"+seatnumber);
        System.out.println("Show name:"+showname);
        System.out.println("Price:"+price);

    }
}
