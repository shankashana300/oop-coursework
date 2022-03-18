package com.company;



//Shankashana Prathaban Krishnakumar_w1810206_2019772;
//”I confirm that I understand what plagiarism is and have read and understood the
//section on Assessment Offences in the Essential Information for Students. The work
//that I have submitted is entirely my own. Any work from other authors is duly
//referenced and acknowledged.”
public class Formula1Driver extends Driver implements Comparable<Formula1Driver> {


    private static int[] num = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private int Num_Of_Races; //the number of races taken part in a season is stored.
    private int Race_Position; //Rank of the driver per race.
    private int Points; //how many points the driver has currently.
    private int First_Positions; //How many drivers hold the first place in a season.
    private int Second_Positions; //How many drivers hold the second place in a season.
    private int Third_Positions; //How many drivers hold the third place in a season.
    private int Fourth_Positions; //How many drivers hold the fourth place in a season.
    private int Fifth_Positions; //How many drivers hold the Fifth place in a season.
    private int Sixth_Positions; //How many drivers hold the Sixth place in a season.
    private int Seventh_Positions; //How many drivers hold the Seventh place in a season.
    private int Eighth_Positions; //How many drivers hold the Eigth place in a season.
    private int Ninth_Positions; //How many drivers hold the Ninth place in a season.
    private int Tenth_Positions; //How many drivers hold the Tenth place in a season.


    //Main constructor created to get the details of drivers.
    public Formula1Driver(String firstName,
                          String lastName,
                          String location,
                          String which_Team_They_Belong_To) {
        super(firstName, lastName, location, which_Team_They_Belong_To);
    }

    //constructor was built to pass the number of races and points.
    public Formula1Driver(int num_Of_Races, int points) {
        Num_Of_Races = num_Of_Races;
        Points = points;
    }
    //Constructor was built to pass the stats and details of driver.
    public Formula1Driver(String firstName,
                          String lastName,
                          String location,
                          String which_Team_They_Belong_To,
                          int first_Positions,
                          int second_Positions,
                          int third_Positions,
                          int fourth_Positions,
                          int fifth_Positions,
                          int sixth_Positions,
                          int seventh_Positions,
                          int eighth_Positions,
                          int ninth_Positions,
                          int tenth_Positions) {
        super(firstName, lastName, location, which_Team_They_Belong_To);
        First_Positions = first_Positions;
        Second_Positions = second_Positions;
        Third_Positions = third_Positions;
        Fourth_Positions = fourth_Positions;
        Fifth_Positions = fifth_Positions;
        Sixth_Positions = sixth_Positions;
        Seventh_Positions = seventh_Positions;
        Eighth_Positions = eighth_Positions;
        Ninth_Positions = ninth_Positions;
        Tenth_Positions = tenth_Positions;
    }

    //Another constructor created for the race class to race details.
    public Formula1Driver(String firstName, String lastName, String loca, String t3am, int point, int[] z) {
        super(firstName, lastName, loca, t3am);
        Points = point;
        Race_Position = z.length;
        num = z;

        First_Positions = z[0];
        Second_Positions = z[1];
        Third_Positions = z[2];
        Fourth_Positions = z[3];
        Fifth_Positions = z[4];
        Sixth_Positions = z[5];
        Seventh_Positions = z[6];
        Eighth_Positions = z[7];
        Ninth_Positions = z[8];
        Tenth_Positions = z[9];



    }


    //Another constructor created for Add completed race method to get race details.
    public Formula1Driver(String fn, String ln, int rank) {
        super();
    }

    //Getter and setters created
    public int getNum_Of_Races() {
        return Num_Of_Races;
    }

    //Getter and setters created
    public void setNum_Of_Races(int num_Of_Races) {
        Num_Of_Races = num_Of_Races;
    }

    //Getter and setters created
    public int[] getNum() {
        return num;
    }

    //Getter and setters created
    public void setNum(int[] num) {
        this.num = num;
    }

    //Getter and setters created
    public int getPoints() {
        return Points;
    }

    //Getter and setters created
    public void setPoints(int points) {
        Points = points;
    }

    //Getter and setters created
    public int getFirst_Positions() {
        return First_Positions;
    }

    //Getter and setters created
    public void setFirst_Positions() {
        First_Positions += 1;
        num[0] += 1;

    }

    //Getter and setters created
    public int getSecond_Positions() {
        return Second_Positions;
    }

    //Getter and setters created
    public void setSecond_Positions() {
        Second_Positions += 1;
        num[1] += 1;
    }

    //Getter and setters created
    public int getThird_Positions() {
        return Third_Positions;
    }

    //Getter and setters created
    public void setThird_Positions() {
        Third_Positions += 1;
        num[2] += 1;
    }

    //Getter and setters created
    public int getRace_Position() {
        return Race_Position;
    }

    //Getter and setters created
    public void setRace_Position(int race_Position) {
        Race_Position = race_Position;
    }

    //Getter and setters created
    public int getFourth_Positions() {
        return Fourth_Positions;
    }

    //Getter and setters created
    public void setFourth_Positions() {
        Fourth_Positions += 1;
        num[3] += 1;
    }

    //Getter and setters created
    public int getFifth_Positions() {
        return Fifth_Positions;
    }

    //Getter and setters created
    public void setFifth_Positions() {
        Fifth_Positions += 1;
        num[4] += 1;
    }

    //Getter and setters created
    public int getSixth_Positions() {
        return Sixth_Positions;
    }

    //Getter and setters created
    public void setSixth_Positions() {
        Sixth_Positions += 1;
        num[5] += 1;
    }

    //Getter and setters created
    public int getSeventh_Positions() {
        return Seventh_Positions;
    }

    //Getter and setters created
    public void setSeventh_Positions() {
        Seventh_Positions += 1;
        num[6] += 1;
    }

    //Getter and setters created
    public int getEighth_Positions() {
        return Eighth_Positions;
    }

    //Getter and setters created
    public void setEighth_Positions() {
        Eighth_Positions += 1;
        num[7] += 1;
    }

    //Getter and setters created
    public int getNinth_Positions() {
        return Ninth_Positions;
    }

    //Getter and setters created
    public void setNinth_Positions() {
        Ninth_Positions +=1;
        num[8] += 1;
    }

    //Getter and setters created
    public int getTenth_Positions() {
        return Tenth_Positions;
    }

    //Getter and setters created
    public void setTenth_Positions() {
        Tenth_Positions += 1;
        num[9] += 1;
    }

    //creating the method for sorting the driver list in descending in terms of points.
    @Override
    public int compareTo(Formula1Driver f) {
        int value = this.getPoints() - f.getPoints();
        if (value == 0) {
            return this.First_Positions - f.First_Positions;
        }
        return value;
    }


    //Override method was created for getting the positions.
    private String getNums() {
        String stringNums = "[";


        stringNums+=First_Positions+","+Second_Positions+","+Third_Positions+","+Fourth_Positions+","+Fifth_Positions+","+Sixth_Positions+","+Seventh_Positions+","+Eighth_Positions+","+Ninth_Positions+","+Tenth_Positions;




        stringNums += "]";

        return stringNums;
    }

    @Override
    public String toString() {
        return super.toString() +
                Points + "," + getNums() + "\n";
    }
}
