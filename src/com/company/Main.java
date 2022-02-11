package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Time time;
        Time time2;

        time=new Time(4,50,58);
        time2=new Time(0,0,0);

        time2.setTime(10,12,14);


        System.out.println("Tiempo 1: "+time2.getHour()+":"+ time2.getMinute()+":"+ time2.getSecond());
        System.out.println("Tiempo 1: "+ time2.toString());

        time2.addHour(1);
        time2.addMinute(20);
        time2.addSecond(4);

        System.out.println("Tiempo 1 despues de añadir: "+time2.getHour()+":"+ time2.getMinute()+":"+ time2.getSecond());
        System.out.println("Tiempo 1 despues de añadir: "+time2.toString());

        System.out.println("Tiempo 2: "+time.getHour()+":"+ time.getMinute()+":"+ time.getSecond());

        System.out.println("Tiempo 2: "+time.toString());

        time.addHour(1);
        time.addMinute(20);
        time.addSecond(4);

        System.out.println("Tiempo 2 despues de añadir: "+time.getHour()+":"+ time.getMinute()+":"+ time.getSecond());
        System.out.println("Tiempo 2 despues de añadir: "+time.toString());
    }
}
