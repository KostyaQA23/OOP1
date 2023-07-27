package org.example;

public class FormDate {
    public int day;
    public int month;
    public int year;

    public FormDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String showBirthday(){
        return
                "\n\tДень: " + this.day +
                        "\n\tМесяц: " + this.month +
                        "\n\tГод: " + this.year;
    }
}
