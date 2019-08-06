package com.Bookmyshow.Driver;

public class Seat {
    int Seatnumber;
    boolean isreserved;


    Seat(int Seatnumber,boolean isreserved){
        this.Seatnumber=Seatnumber;
        this.isreserved=isreserved;
    }


    boolean getseatstatus(){
        return isreserved;
    }



    void reserve()
    {
        isreserved=true;
    }
}
