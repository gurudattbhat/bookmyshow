package com.Bookmyshow.Driver;

public class Seat {
    int Seatnumber;
    boolean isreserved;
    int[] seat=new int[10];

    Seat(int Seatnumber,boolean isreserved){
        this.Seatnumber=Seatnumber;
        this.isreserved=isreserved;
    }

    boolean getseatstatus(){
        return isreserved;
    }



    /*setseatstatus(boolean isreserved)
    {
        this.isreserved=isreserved;
    }

     */
    void reserve()
    {
        isreserved=true;
    }
}
