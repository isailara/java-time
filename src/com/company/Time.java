package com.company;

public class Time {
    private int hour;
    private int minute;
    private int second;
    private int hour2;
    private int minute2;
    private int second2;

    Time(int hour, int minute, int second){

        //this.second=second;
        //this.minute=minute;
        //this.hour=hour;
        hour2=hour;
        minute2=minute;
        second2=second;

        if(hour2>23)
        {
            hour=1;
        }
        else
        {
            this.hour=hour2;
        }

        if(minute2>59)
        {
            hour++;
            this.minute=minute2-60;
            if(hour>23){
                this.hour = 1;
            }
        }
        else
        {
            this.minute=minute2;
        }

        if(second2>59)
        {
            this.second=second2-60;
            minute++;
            if(minute>59)
            {
                hour++;
                this.minute=minute-60;
                if(hour>23){
                    hour = 1;
                }
            }

        }
        else{
            this.second=second2;
        }
    }

    public void setTime(int hour, int minute, int second){

        //this.second=second;
        //this.minute=minute;
        //this.hour=hour;
        hour2=hour;
        minute2=minute;
        second2=second;

        if(hour2>23)
        {
            hour=1;
        }
        else
        {
            this.hour=hour2;
        }

        if(minute2>59)
        {
            hour++;
            this.minute=minute2-60;
            if(hour>23){
                this.hour = 1;
            }
        }
        else
        {
            this.minute=minute2;
        }

        if(second2>59)
        {
            this.second=second2-60;
            minute++;
            if(minute>59)
            {
                hour++;
                this.minute=minute-60;
                if(hour>23){
                    hour = 1;
                }
            }

        }
        else{
            this.second=second2;
        }
    }

    public int getHour(){
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void addHour(int delta){
        //0<23
        //¿Como hacerle para que si es 23 y sumo 2 que quede en 1
        hour2=hour+delta;
        if(hour2>23)
        {
            hour=1;
        }
        else
        {
            hour=hour2;
        }
    }

    public void addMinute(int delta){
        //0<59
        //¿Como hacerle para que si es 59 y sumo 10 quede en 09 y la hora a la sig hora?
        minute2=delta+minute;
        if(minute2>59)
        {
            hour++;
            minute=minute2-60;
            if(hour>23){
                hour = 1;
            }
        }
        else
        {
            minute=minute2;
        }
    }

    public void addSecond(int delta){
        //0<59
        second2=second+delta;
        if(second2>59)
        {
            second=second2-60;
            minute++;
            if(minute>59)
            {
                hour++;
                minute=minute-60;
                if(hour>23){
                    hour = 1;
                }
            }

        }
        else{
            second=second2;
        }
    }

    public String toString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
}
