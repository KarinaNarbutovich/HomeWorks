package by.overone.lesson8;

import jdk.jfr.TransitionTo;

/**
 * @author Karina Narbutovich
 */
public class Time {
    private int hour = 1, minute = 2, second = 3;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int Meter() {
        return this.hour * 3600 + this.minute * 60 + this.second;
    }

    public void Output() {
        System.out.println("Total number of seconds: ");
    }

    public static void main(String[] args) {
        Time time = new Time();
        time.setHour(3);
        time.setMinute(50);
        time.setSecond(90);
        time.Output();
        System.out.println(time.Meter() + "\nnumber of hour: " + time.getHour() + "\nnumber of minute: " + time.getMinute() + "\nnumber of seconds: " + time.getSecond());
    }
}
