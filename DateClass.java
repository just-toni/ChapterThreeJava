package Chapter3;

import java.util.Date;

public class DateClass {
    int month;
    int day;
    int year;

    public String displayDate() {
        return month + "/" + day + "/" + year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >0 && month <13)
        this.month = month;
        else
            System.out.println("Incorrect input");
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (month == 2 && day > 28)
            System.out.println("Month can not exceed 28 days");
        else if ((month == 4 || month == 6 || month  == 9 || month  == 11)  && day > 30)
            System.out.println("Month can not exceed 30 days");
        else if (day < 1 && day > 31)
            System.out.println("Incorrect input");
        else
            this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public DateClass (int month, int day, int year){
    this.month = month;
    this.day = day;
    this.year = year;
    }

    public void leapYear(int day){
        if ((month == 2 && day > 29) && (year %4 == 0))
            System.out.println("Leap year can not exceed 29 days");
    }

    public static void main(String[] args) {
        DateClass date = new DateClass(1, 1, 1999);
        date.setMonth(2);
        date.leapYear(29);
        date.setYear(2020);
        System.out.println(date.displayDate());
    }

}

//else if ((month == 2 && day > 29) && (year %4 == 0))
//        System.out.println("Leap year can not exceed 29 days");