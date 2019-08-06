package com.Bookmyshow.Driver;

import java.util.List;

public class Theatre {
    int id;
    String name;
    //int[] seat=new seat[100];
    Theatre(int id, String name){
        this.id=id;
        this.name=name;
    }

    //Adding default theatres

    Theatre(List Theatres,int theatreid){

        Theatre theatre1=new Theatre(theatreid,"Sterling");
        //  Theatre theatre2=new Theatre(2,"Shantala");
        Theatres.add(theatre1);
        //  Theatres.add(theatre2);
    }
    String getname()
    {
        return name;
    }

    int getid(){
        return id;
    }
}
