package com.company;



//Shankashana Prathaban Krishnakumar_w1810206_2019772;
//”I confirm that I understand what plagiarism is and have read and understood the
//section on Assessment Offences in the Essential Information for Students. The work
//that I have submitted is entirely my own. Any work from other authors is duly
//referenced and acknowledged.”

abstract public class Driver {

    private String FirstName; //attribute for the first name of the driver.
    private String LastName; //attribute for the last name of the driver.
    private String Location; //attribute for the location.
    private String Which_Team_They_Belong_To; //attribute for the team they belong to.


    //constructore built for the above attributes
    public Driver(String firstName, String lastName, String location, String which_Team_They_Belong_To) {
        FirstName = firstName;
        LastName = lastName;
        Location = location;
        Which_Team_They_Belong_To = which_Team_They_Belong_To;


    }

    //Another constructor created for the race class to determine the amount races.
    public Driver( String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }
    //constructor built to sustain the number of races and points.
    public Driver() {

    }


    //Getter and setters created
    public String getFirstName() {
        return FirstName;
    }

    //Getter and setters created
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    //Getter and setters created
    public String getLastName() {
        return LastName;
    }

    //Getter and setters created
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    //Getter and setters created
    public String getLocation() {
        return Location;
    }

    //Getter and setters created
    public void setLocation(String location) {
        Location = location;
    }

    //Getter and setters created
    public String getWhich_Team_They_Belong_To() {
        return Which_Team_They_Belong_To;
    }

    //Getter and setters created
    public void setWhich_Team_They_Belong_To(String which_Team_They_Belong_To) {
       Which_Team_They_Belong_To = which_Team_They_Belong_To;
    }



    //Override methods used when saving the information to the text file.
    @Override
    public String toString() {
        return
                FirstName +","+ LastName + "," + Location + "," + Which_Team_They_Belong_To+ "," ;
    }
}
