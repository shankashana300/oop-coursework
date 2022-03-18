package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



//Shankashana Prathaban Krishnakumar_w1810206_2019772;
//”I confirm that I understand what plagiarism is and have read and understood the
//section on Assessment Offences in the Essential Information for Students. The work
//that I have submitted is entirely my own. Any work from other authors is duly
//referenced and acknowledged.”
public class Formula1ChampionshipManager implements ChampionshipManager {

    //Arraylist variable created for the main storage.
    private static ArrayList<Formula1Driver> Driver_Details = new ArrayList<>();//array-list created for Formula1Driver class

    //getters and setters created for the arraylist (Driver details).
    public ArrayList<Formula1Driver> getDriver_Details() {
        return Driver_Details;
    }

    //getters and setters created for the arraylist (Driver details).
    public void setDriver_Details(ArrayList<Formula1Driver> driver_Details) {
        Driver_Details = driver_Details;
    }

    //menu method was created to display the options needed for the user to select.
    public void Menu() {
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Enter N to Create new Driver.\n"
                + "Enter A to Add a race which is completed.\n"
                + "Enter D to Delete Driver and team.\n"
                + "Enter C to Change the driver for an existing constructor team.\n"
                + "Enter V to Display the statistics for the selected driver.\n"
                + "Enter T to Display Formula 1 Driver Table.\n"
                + "Enter G to start the GUI. \n"
                + "Enter Q to quit the program. \n"
        );
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println();
    };

    //method created for adding a driver.
    public void AddDriver() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Driver's Firstname:");
        String driver_first_name = input.nextLine();


        System.out.println("Enter the Driver's Lastname:");
        String driver_second_name = input.nextLine();

        System.out.println("Enter the Location:");
        String location = input.nextLine();

        System.out.println("Enter the Team they belong to:");
        String team = input.nextLine();


        Driver_Details.add(new Formula1Driver(driver_first_name, driver_second_name, location, team));//adding driver details for the driver details arraylist.

    };

    //delete driver method can be created.
    public void Delete() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the driver's firstname:");
        String Delete_Firstname = input.nextLine();
        System.out.println("Enter the name of the driver's lastname:");
        String Delete_Lastname = input.nextLine();
        boolean x =true;

        //deleting the driver (full details) from the arraylist by typing in the first and last name.
        for (int i = 0; i < Driver_Details.size(); i++) {
            if (Driver_Details.get(i).getFirstName().equalsIgnoreCase(Delete_Firstname) && Driver_Details.get(i).getLastName().equalsIgnoreCase(Delete_Lastname)) {
                Driver_Details.remove(i);
            } else {
                x = false;
                System.out.println("No driver");
            }
            ;
        }
        ;
    }

    ;

    //change of team method created.
    public void Change() {
        Scanner input = new Scanner(System.in);
        String New_Team = "";

        System.out.println("Enter the Driver's Firstname:");
        String DriverF = input.nextLine();

        System.out.println("Enter the Driver's Lastname:");
        String DriverL = input.nextLine();
        boolean n = true;
        boolean h = true;
        //taking the input of the driver details who wants to change to another exisiting team.
        for (int i = 0; i < Driver_Details.size(); i++) {
            n = false;
            if (Driver_Details.get(i).getFirstName().equalsIgnoreCase(DriverF) && Driver_Details.get(i).getLastName().equalsIgnoreCase(DriverL)) {
                Scanner input0 = new Scanner(System.in);
                System.out.println("Enter the new team:");
                New_Team = input0.nextLine();

            }
            for (int k = 0; k < Driver_Details.size(); k++) {
                h = false;
                if (Driver_Details.get(k).getWhich_Team_They_Belong_To().equalsIgnoreCase(New_Team)) {
                    System.out.println("Team exists");
                    Driver_Details.get(i).setWhich_Team_They_Belong_To(New_Team);

                }
            }
            if (h) {
                System.out.println("No existing team.");
            }
            ;

        }
        ;
        if (n) {
            System.out.println("No driver.");
        }
        ;

    }

    ;

    //stats for single driver method created
    public void stats() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Driver's Firstname:");
        String StatF = input.nextLine();

        System.out.println("Enter the Driver's Lastname:");
        String StatL = input.nextLine();
        boolean m = true;
        //searching for the driver's first and last name and displaying his individual stats. This is done per driver.
        for (int z = 0; z < Driver_Details.size(); z++) {
            if (Driver_Details.get(z).getFirstName().equalsIgnoreCase(StatF) && Driver_Details.get(z).getLastName().equalsIgnoreCase(StatL)) {
                m = false;
                System.out.println("stat recieved!");
                System.out.println();
                System.out.println("Driver's Firstname; " + Driver_Details.get(z).getFirstName());
                System.out.println("Driver's Lastname; " + Driver_Details.get(z).getLastName());
                System.out.println("Location; " + Driver_Details.get(z).getLocation());
                System.out.println("Team; " + Driver_Details.get(z).getWhich_Team_They_Belong_To());
                System.out.println("First Position; " + Driver_Details.get(z).getFirst_Positions());
                System.out.println("Second Position; " + Driver_Details.get(z).getSecond_Positions());
                System.out.println("Third Position; " + Driver_Details.get(z).getThird_Positions());
                System.out.println("Fourth Position; " + Driver_Details.get(z).getFourth_Positions());
                System.out.println("Fifth Position; " + Driver_Details.get(z).getFifth_Positions());
                System.out.println("Sixth Position; " + Driver_Details.get(z).getSixth_Positions());
                System.out.println("Seventh Position; " + Driver_Details.get(z).getSeventh_Positions());
                System.out.println("Eigth Position; " + Driver_Details.get(z).getEighth_Positions());
                System.out.println("Ninth Position; " + Driver_Details.get(z).getNinth_Positions());
                System.out.println("Tenth Position; " + Driver_Details.get(z).getTenth_Positions());
                System.out.println("Points; " + Driver_Details.get(z).getPoints());
                System.out.println("The number of races; " + Driver_Details.get(z).getNum_Of_Races());

            }
            ;
        }
        if (m) {
            System.out.println("No stats.");
        }
        ;
    }

    ;

    //This method is used for displaying all the drivers.
    public void Table() {
        Collections.sort(Driver_Details, Collections.reverseOrder());//Sorting used according to decending order in terms of first position achieved if the points are same.

            String format = "%1$-15s|%2$-15s|%3$-7s|%4$-10s|%5$-10s|%6$-10s|%7$-11s|%8$-10s|%9$-10s|%10$-10s|%11$-10s|%12$-10s|%13$-13s|%14$-10s|%15$-10s|\n";
            System.out.format(format, "Fname","Lname", "Points", "FPositions", "SPositions", "TPositions","FouPosition","FiPosition","SxPosition","S7Position","EiPosition","NiPosition","TenthPosition","Location", "Team");
            for (int y = 0; y < Driver_Details.size(); y++) {
                System.out.format(format, Driver_Details.get(y).getFirstName(),Driver_Details.get(y).getLastName(), Driver_Details.get(y).getPoints()
                        , Driver_Details.get(y).getFirst_Positions(), Driver_Details.get(y).getSecond_Positions()
                        , Driver_Details.get(y).getThird_Positions(), Driver_Details.get(y).getFourth_Positions()
                        ,Driver_Details.get(y).getFifth_Positions(),Driver_Details.get(y).getSixth_Positions(),Driver_Details.get(y).getSeventh_Positions()
                        ,Driver_Details.get(y).getEighth_Positions(),Driver_Details.get(y).getNinth_Positions(), Driver_Details.get(y).getTenth_Positions()
                        ,Driver_Details.get(y).getLocation(), Driver_Details.get(y).getWhich_Team_They_Belong_To());


            }
    };



    //Adding a completed a race using the Add_Complete_Race method.
    public void Add_Complete_Race() throws ParseException {
        LinkedList<Formula1Driver> FD1 = new LinkedList<>();//Creating a linked list for driver details to be stored in race.
        LinkedList<Race> Race_Driver_Details1 = new LinkedList<>(); //creating a linked list for storing the race details.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the date of the race in the format of DD-MM-YYYY:");
        String date = input.nextLine();

        Date race_date; // date variable created.
        race_date = new SimpleDateFormat("DD-MM-YYYY").parse(date); //passing the string date to a "Date" date.

        //for-loop is used to get the full name of the selected driver because to display the race position, points and more.
        for (int s = 0; s < Driver_Details.size(); s++) {
            System.out.println("Driver's first name is " + Driver_Details.get(s).getFirstName());
            System.out.println("Driver's last name is " + Driver_Details.get(s).getLastName());

            Scanner inputa = new Scanner(System.in);

            System.out.println("Enter the Position of the driver in the race in a season:");
            int rank = inputa.nextInt();
            int score;

            //adding driver points, 1st,2nd, 3rd and num of races taken accoring to the driver's rank. it is done using switch-case.
            switch (rank) {
                case 1:
                    score = 25;
                    int TotalScore = Driver_Details.get(s).getPoints() + score;
                    int FinalParticipation = Driver_Details.get(s).getNum_Of_Races() + 1;

                    Driver_Details.get(s).setPoints(TotalScore);
                    Driver_Details.get(s).setNum_Of_Races(FinalParticipation);
                    Driver_Details.get(s).setFirst_Positions();
                    break;
                case 2:
                    score = 18;
                    int TotalScore1 = Driver_Details.get(s).getPoints() + score;
                    int FinalParticipation1 = Driver_Details.get(s).getNum_Of_Races() + 1;

                    Driver_Details.get(s).setPoints(TotalScore1);
                    Driver_Details.get(s).setNum_Of_Races(FinalParticipation1);
                    Driver_Details.get(s).setSecond_Positions();
                    break;
                case 3:
                    score = 15;
                    int TotalScore2 = Driver_Details.get(s).getPoints() + score;
                    int FinalParticipation2 = Driver_Details.get(s).getNum_Of_Races() + 1;

                    Driver_Details.get(s).setPoints(TotalScore2);
                    Driver_Details.get(s).setNum_Of_Races(FinalParticipation2);
                    Driver_Details.get(s).setThird_Positions();
                    break;
                case 4:
                    score = 12;
                    int TotalScore3 = Driver_Details.get(s).getPoints() + score;
                    int FinalParticipation3 = Driver_Details.get(s).getNum_Of_Races() + 1;

                    Driver_Details.get(s).setPoints(TotalScore3);
                    Driver_Details.get(s).setNum_Of_Races(FinalParticipation3);
                    Driver_Details.get(s).setFourth_Positions();
                    break;
                case 5:
                    score = 10;
                    int TotalScore4 = Driver_Details.get(s).getPoints() + score;
                    int FinalParticipation4 = Driver_Details.get(s).getNum_Of_Races() + 1;

                    Driver_Details.get(s).setPoints(TotalScore4);
                    Driver_Details.get(s).setNum_Of_Races(FinalParticipation4);
                    Driver_Details.get(s).setFifth_Positions();
                    break;
                case 6:
                    score = 8;
                    int TotalScore5 = Driver_Details.get(s).getPoints() + score;
                    int FinalParticipation5 = Driver_Details.get(s).getNum_Of_Races() + 1;

                    Driver_Details.get(s).setPoints(TotalScore5);
                    Driver_Details.get(s).setNum_Of_Races(FinalParticipation5);
                    Driver_Details.get(s).setSixth_Positions();
                    break;
                case 7:
                    score = 6;
                    int TotalScore6 = Driver_Details.get(s).getPoints() + score;
                    int FinalParticipation6 = Driver_Details.get(s).getNum_Of_Races() + 1;

                    Driver_Details.get(s).setPoints(TotalScore6);
                    Driver_Details.get(s).setNum_Of_Races(FinalParticipation6);
                    Driver_Details.get(s).setSeventh_Positions();
                    break;
                case 8:
                    score = 4;
                    int TotalScore7 = Driver_Details.get(s).getPoints() + score;
                    int FinalParticipation7 = Driver_Details.get(s).getNum_Of_Races() + 1;

                    Driver_Details.get(s).setPoints(TotalScore7);
                    Driver_Details.get(s).setNum_Of_Races(FinalParticipation7);
                    Driver_Details.get(s).setEighth_Positions();
                    break;
                case 9:
                    score = 2;
                    int TotalScore8 = Driver_Details.get(s).getPoints() + score;
                    int FinalParticipation8 = Driver_Details.get(s).getNum_Of_Races() + 1;

                    Driver_Details.get(s).setPoints(TotalScore8);
                    Driver_Details.get(s).setNum_Of_Races(FinalParticipation8);
                    Driver_Details.get(s).setNinth_Positions();
                    break;
                case 10:
                    score = 1;
                    int TotalScore9 = Driver_Details.get(s).getPoints() + score;
                    int FinalParticipation9 = Driver_Details.get(s).getNum_Of_Races() + 1;

                    Driver_Details.get(s).setPoints(TotalScore9);
                    Driver_Details.get(s).setNum_Of_Races(FinalParticipation9);
                    Driver_Details.get(s).setTenth_Positions();
                    break;

            }
            ;

            String fn = Driver_Details.get(s).getFirstName();//Getting the first name to the driver linked list.
            String ln = Driver_Details.get(s).getLastName();//Getting the last name to the driver linked list.
            FD1.add(new Formula1Driver(fn, ln, rank)); //Adding the first, last and rank to the linked list.

        }
        Race_Driver_Details1.add(new Race(race_date, FD1));//Adding the date of the race and driver linked list to the main race linked list;
    }

    ;

    //Load data of a file when entered L.
    //Reading
    public void Load() throws IOException {
        String firstn;
        String lastn;
        String loca;
        String t3am;
        int point;
        int[] z = new int[10];
        File file = new File("Information.txt");
        Scanner input = new Scanner(file); //file is assigned to input.
        while (input.hasNextLine()) { //scan input
            String input1 = input.nextLine(); //scan the next line
            String[] F = input1.split("[\\[\\]\\,\\s+]"); //brackets and comma being split.

            firstn = F[0];
            lastn = F[1];
            loca = F[2];
            t3am = F[3];
            point = Integer.parseInt(F[4]);
            int Index = 0;

            for (int i = 6; i <= 15; i++) {
                z[i - 6] = Integer.valueOf(F[i]);
            }
            //System.out.println(Arrays.toString(z)); //assign the the next to a container
            Driver_Details.add(new Formula1Driver(firstn, lastn, loca, t3am, point, z));
        }
        System.out.println(Driver_Details);
        input.close(); //close file.
    }

    //Storage of data in a file when entered S.
    //Write
    //Storing
    public void Store(ArrayList<Formula1Driver> driver_details) throws IOException {
        FileWriter file = new FileWriter("Information.txt");
        for (Formula1Driver d : Driver_Details) { //for-each is used.

            System.out.println(d.toString());
            file.write(d.toString());
        }
        System.out.println("File is stored"); //message displayed to know if it's done or not.
        file.close(); // close file.
    }

}
