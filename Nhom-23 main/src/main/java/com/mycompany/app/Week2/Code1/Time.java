package com.mycompany.app.week2.code1;

public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }
    
    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
    }
    
    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }
    }
    
    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Second must be between 0 and 59");
        }
    }
 
    public int getHour() {
        return hour;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public int getSecond() {
        return second;
    }
    
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    public static void main(String[] args) {
        Time time = new Time(14, 30, 45);
        System.out.println("Current time: " + time);
        
        time.setHour(18);
        time.setMinute(15);
        time.setSecond(0);
        System.out.println("Modified time: " + time);
    }
}
