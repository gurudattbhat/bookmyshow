package com.Bookmyshow.Driver;

import java.util.List;

public class Shows {
    String sname;
    String sdate;
    Theatre t;
    int price;
    Shows(String sname, String sdate,int price, Theatre t)
    {
        this.sname= sname;
        this.sdate=sdate;
        this.price=price;
        this.t=t;

    }

    //  Shows(List Show, List Theatres)
    //   {
    //     Shows show1=new Shows("Avengers", "22/2/2019", 200, (Theatre) Theatres.get(0));
    //     Show.add(show1);
    // }
    String getsname(){

        return sname;
    }
    int getprice(){
        return price;
    }
    String getsdate(){
        return sdate;
    }

    void setsname(String sname)
    {
        this.sname=sname;
    }

    void setsdate(String sdate)
    {
        this.sdate=sdate;
    }

    Theatre gettheatre(){
        return t;
    }

    void settheatre(Theatre t)
    {
        this.t=t;
    }


}
