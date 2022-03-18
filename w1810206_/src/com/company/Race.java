package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;


//Shankashana Prathaban Krishnakumar_w1810206_2019772;
//”I confirm that I understand what plagiarism is and have read and understood the
//section on Assessment Offences in the Essential Information for Students. The work
//that I have submitted is entirely my own. Any work from other authors is duly
//referenced and acknowledged.”
public class Race {

    String Dates ;
    Date race_date;

    //Linkedlist created since it's more rapid in terms of changing of data.
    LinkedList<Formula1Driver> Race_Driver_Details;
    ArrayList<String> Start_Race;
    ArrayList<String> End_Race;

    //constructor used to pass dates and a link list connected to formula1driver to the GUI.
    public Race(String Dates, LinkedList<Formula1Driver> fd1) {
        this.Dates = Dates;
        this.Race_Driver_Details = fd1;
    }

    //getters and setters created, used in GUI.
    public String getDates() {
        return Dates;
    }

    //getters and setters created, used in GUI.
    public void setDates(String dates) {
        Dates = dates;
    }


    //constructor for the race.
    public Race(Date race_date, LinkedList<Formula1Driver> race_Driver_Details) {
        this.race_date = race_date;
        Race_Driver_Details = race_Driver_Details;
    }

    //getters and setters created.
    public Date getRace_date() {
        return race_date;
    }

    //getters and setters created.
    public void setRace_date(Date race_date) {
        this.race_date = race_date;
    }

    //getters and setters created.
    public LinkedList<Formula1Driver> getRace_Driver_Details() {
        return Race_Driver_Details;
    }

    //getters and setters created.
    public void setRace_Driver_Details(LinkedList<Formula1Driver> race_Driver_Details) {
        Race_Driver_Details = race_Driver_Details;
    }
}
