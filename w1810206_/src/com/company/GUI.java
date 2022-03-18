package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

//Shankashana Prathaban Krishnakumar_w1810206_2019772;
//”I confirm that I understand what plagiarism is and have read and understood the
//section on Assessment Offences in the Essential Information for Students. The work
//that I have submitted is entirely my own. Any work from other authors is duly
//referenced and acknowledged.”


public class GUI  implements ActionListener {

    Formula1ChampionshipManager Details = new Formula1ChampionshipManager(); //Object used to access the Formula1ChampionshipManager.
    ArrayList <Formula1Driver> obj = Details.getDriver_Details(); //object created.
    ArrayList <Formula1Driver> objy = Details.getDriver_Details(); //object created.
    ArrayList <Formula1Driver> objys = Details.getDriver_Details(); //object created.
    ArrayList<Race> Boom = new ArrayList<>(); //object created.

    JFrame Frame = new JFrame(); //global
    JButton button1 = new JButton("Display driver details"); //global
    JButton button2 = new JButton("Sorting of driver details according to points"); //global
    JButton button3 = new JButton("Sorting of driver details according to 1st positions won"); //global
    JButton button4 = new JButton("Generate Random Race"); //global
    JButton button5 = new JButton("Probability"); //global
    JButton button6 = new JButton("Display Date"); //global


    //this method is used to generate a random date.
    public String D_G() throws Exception
    {
        Random year = new Random();
        Random month = new Random();
        Random Day = new Random();
        int Year = 2000 + year.nextInt(2022-2000+1);
        int Month = 1+month.nextInt(12);
        int day = 1+Day.nextInt(31);
        String Date = Year +"/"+Month+"/"+ day;
        System.out.println();
        System.out.println("The date is: "+ day+"/"+Month+"/"+Year);

        //if-else if condition is used check if month of Feb has 29th day .
        if (Month==2 && day>28)
        {
            day=day-3;
        } else {
            if ((Month%2==0 && Month!=8)&&day==31)
            {
                day=day-1;
            };
        };
        return Date;
    };

    //a method created to create the structure of the frame.
    public void frame()
    {

        Frame.setDefaultCloseOperation(EXIT_ON_CLOSE); //Frame (window) closes when "close" is clicked.
        Frame.setTitle("Formula 1 Championship"); //Title is placed.
        Frame.setVisible(true); // The window is visible.
        Frame.setBounds(340,90,850,680); //The size of the Window.
        Frame.setResizable(true); //The szie of the window is fixed.
        Frame.setLayout(null); // To set out a lay-out to a container.


        ImageIcon image = new ImageIcon("src/com/company/F1-logo.png");//Gets the image by given name.
        Frame.setIconImage(image.getImage());//Sets the image as the icon of the Frame.
        Frame.getContentPane().setBackground(Color.darkGray);//background color is dark grey.

        JPanel panel = new JPanel(); //local object created.
        Frame.getContentPane().add(panel); //The container(panel) is added to frame.
        panel.setBounds(50,50,710,70); //panel's size is set.
        panel.setBackground(Color.darkGray); //panel's background color is dark grey.

        JLabel title = new JLabel("FORMULA 1 CHAMPIONSHIP RACE"); //create title object with a text.
        panel.add(title); //label added.
        title.setForeground(Color.white); //font color changed.
        title.setFont(new Font("Times New Roman",Font.ITALIC,35)); //customizing the font color.

        Frame.getContentPane().add(button1); //button is added.
        button1.setFocusPainted(false); //when the button is clicked, no dotted lines wii be shown over the text.
        button1.setBounds(26,400,200,50);//size of the button.
        button1.addActionListener(this); //listens to the button.

        Frame.getContentPane().add(button2);//button is added.
        button2.setFocusPainted(false);//when the button is clicked, no dotted lines wii be shown over the text.
        button2.setBounds(250,400,280,50);//size of the button.
        button2.addActionListener(this);//listens to the button.

        Frame.getContentPane().add(button3);//button is added.
        button3.setFocusPainted(false);//when the button is clicked, no dotted lines wii be shown over the text.
        button3.setBounds(26,480,380,50);//size of the button.
        button3.addActionListener(this);

        Frame.getContentPane().add(button4);//button is added.
        button4.setFocusPainted(false);//when the button is clicked, no dotted lines wii be shown over the text.
        button4.setBounds(545,400,250,50);//size of the button.
        button4.addActionListener(this); //listens to the button.

        Frame.getContentPane().add(button5);//button is added.
        button5.setFocusPainted(false);//when the button is clicked, no dotted lines wii be shown over the text.
        button5.setBounds(600,480,180,50);//size of the button.
        button5.addActionListener(this);//listens to the button.

        Frame.getContentPane().add(button6);//button is added.
        button6.setFocusPainted(false);//when the button is clicked, no dotted lines wii be shown over the text.
        button6.setBounds(430,480,150,50);//size of the button.
        button6.addActionListener(this);//listens to the button.


    };


    //method created to display list (table) of all the drivers and their statistics in descending order of points.
    public void DisplayDetails() {
        String [][] row = new String[15][8]; //rows created in a 2D array.
        String [] Col = {"FirstName", "LastName", "Location", "Team", "Points", "FirstPos","SecondPos", "ThirdPos"}; //column created in a array and filled.
        JTable Table = new JTable(row,Col); //global
        JScrollPane Shell =new JScrollPane(Table); //Is used to scroll down and up the table.

        Frame.getContentPane().add(Shell); //add to the frame.
        Table.setRowHeight(20); //fixed height
        Shell.setBounds(50,150,700,200);//set the size of the table.

        Arrays.sort(obj.toArray()); //sort method used to sort the details according to points in descending order.
        for (int x = 0; x<obj.size() ;x++ )
        {
            row[x][0] = obj.get(x).getFirstName();
            row[x][1] = obj.get(x).getLastName();
            row[x][2] = obj.get(x).getLocation();
            row[x][3] = obj.get(x).getWhich_Team_They_Belong_To();
            row[x][4] = String.valueOf(obj.get(x).getPoints());
            row[x][5] = String.valueOf(obj.get(x).getFirst_Positions());
            row[x][6] = String.valueOf(obj.get(x).getSecond_Positions());
            row[x][7] = String.valueOf(obj.get(x).getThird_Positions());
        }Table.repaint(); //to refresh the table.
    }

    //method created to sorting the previous table according to points won by drivers (ascending order).
    public void P2ints()
    {
        String [][] row = new String[15][8];//rows created in a 2D array.
        String [] Col = {"FirstName", "LastName", "Location", "Team", "Points", "FirstPos","SecondPos", "ThirdPos"};//column created in a array and filled.
        JTable Table3 = new JTable(row,Col); //global
        JScrollPane Shell1 =new JScrollPane(Table3);//Is used to scroll down and up the table.

        Frame.getContentPane().add(Shell1);//Is used to scroll down and up the table.
        Table3.setRowHeight(20);//fixed height.
        Shell1.setBounds(50,150,700,200);//set the size of the table.


        Collections.sort(objys); //sort method used to sort the details according to points in ascending order.
        for (int x = 0; x<objys.size() ;x++ )
        {
            row[x][0] = objys.get(x).getFirstName();
            row[x][1] = objys.get(x).getLastName();
            row[x][2] = objys.get(x).getLocation();
            row[x][3] = objys.get(x).getWhich_Team_They_Belong_To();
            row[x][4] = String.valueOf(objys.get(x).getPoints());
            row[x][5] = String.valueOf(objys.get(x).getFirst_Positions());
            row[x][6] = String.valueOf(objys.get(x).getSecond_Positions());
            row[x][7] = String.valueOf(objys.get(x).getThird_Positions());
        }Table3.repaint();  //to refresh the table.

    };

    //method created to sorting the previous table according to the largest number of first position won in races (descending order).
    public void positionS()
    {
        String [][] row = new String[15][8];//rows created in a 2D array.
        String [] Col = {"FirstName", "LastName", "Location", "Team", "Points", "FirstPos","SecondPos", "ThirdPos"};//column created in a array and filled.
        JTable Table2 = new JTable(row,Col); //global
        JScrollPane Shell0 =new JScrollPane(Table2);//Is used to scroll down and up the tabel.

        Frame.getContentPane().add(Shell0);//Is used to scroll down and up the table.
        Table2.setRowHeight(20);//fixed height.
        Shell0.setBounds(50,150,700,200);//set the size of the table.


        Collections.sort(objy,Collections.reverseOrder()); //sort method used to sort the details according to how many first position won in ascending order.
        for (int x = 0; x<objy.size() ;x++ )
        {
            row[x][0] = objy.get(x).getFirstName();
            row[x][1] = objy.get(x).getLastName();
            row[x][2] = objy.get(x).getLocation();
            row[x][3] = objy.get(x).getWhich_Team_They_Belong_To();
            row[x][4] = String.valueOf(objy.get(x).getPoints());
            row[x][5] = String.valueOf(objy.get(x).getFirst_Positions());
            row[x][6] = String.valueOf(objy.get(x).getSecond_Positions());
            row[x][7] = String.valueOf(objy.get(x).getThird_Positions());
        }Table2.repaint();
    };

    //this method is used to generate a random race.
    public void random_race()
    {

        LinkedList<Formula1Driver> FD1 = new LinkedList<>();//Creating a linked list for driver details to be stored in race.
        LinkedList<Race> Race_Driver_Details1 = new LinkedList<>(); //creating a linked list for storing the race details.


        //for-loop is used to get the full name of the selected driver because to display the race position, points and more.
        for (int s = 0; s < Details.getDriver_Details().size(); s++) {

            Random rand = new Random(); //Randome obj created.
            int rank = rand.nextInt(10)+1; //Random method is used to enerates positions achieved by drivers.
            int score;

            //adding driver points, 1st,2nd, 3rd and num of races taken accoring to the driver's rank. it is done using switch-case.
            switch (rank) {
                case 1:
                    score = 25;
                    int TotalScore = Details.getDriver_Details().get(s).getPoints() + score;
                    int FinalParticipation = Details.getDriver_Details().get(s).getNum_Of_Races() + 1;

                    Details.getDriver_Details().get(s).setPoints(TotalScore);
                    Details.getDriver_Details().get(s).setNum_Of_Races(FinalParticipation);
                    Details.getDriver_Details().get(s).setFirst_Positions();
                    break;
                case 2:
                    score = 18;
                    int TotalScore1 = Details.getDriver_Details().get(s).getPoints() + score;
                    int FinalParticipation1 = Details.getDriver_Details().get(s).getNum_Of_Races() + 1;

                    Details.getDriver_Details().get(s).setPoints(TotalScore1);
                    Details.getDriver_Details().get(s).setNum_Of_Races(FinalParticipation1);
                    Details.getDriver_Details().get(s).setSecond_Positions();
                    break;
                case 3:
                    score = 15;
                    int TotalScore2 = Details.getDriver_Details().get(s).getPoints() + score;
                    int FinalParticipation2 = Details.getDriver_Details().get(s).getNum_Of_Races() + 1;

                    Details.getDriver_Details().get(s).setPoints(TotalScore2);
                    Details.getDriver_Details().get(s).setNum_Of_Races(FinalParticipation2);
                    Details.getDriver_Details().get(s).setThird_Positions();
                    break;
                case 4:
                    score = 12;
                    int TotalScore3 = Details.getDriver_Details().get(s).getPoints() + score;
                    int FinalParticipation3 = Details.getDriver_Details().get(s).getNum_Of_Races() + 1;

                    Details.getDriver_Details().get(s).setPoints(TotalScore3);
                    Details.getDriver_Details().get(s).setNum_Of_Races(FinalParticipation3);
                    Details.getDriver_Details().get(s).setFourth_Positions();
                    break;
                case 5:
                    score = 10;
                    int TotalScore4 = Details.getDriver_Details().get(s).getPoints() + score;
                    int FinalParticipation4 = Details.getDriver_Details().get(s).getNum_Of_Races() + 1;

                    Details.getDriver_Details().get(s).setPoints(TotalScore4);
                    Details.getDriver_Details().get(s).setNum_Of_Races(FinalParticipation4);
                    Details.getDriver_Details().get(s).setFifth_Positions();
                    break;
                case 6:
                    score = 8;
                    int TotalScore5 = Details.getDriver_Details().get(s).getPoints() + score;
                    int FinalParticipation5 = Details.getDriver_Details().get(s).getNum_Of_Races() + 1;

                    Details.getDriver_Details().get(s).setPoints(TotalScore5);
                    Details.getDriver_Details().get(s).setNum_Of_Races(FinalParticipation5);
                    Details.getDriver_Details().get(s).setSixth_Positions();
                    break;
                case 7:
                    score = 6;
                    int TotalScore6 = Details.getDriver_Details().get(s).getPoints() + score;
                    int FinalParticipation6 = Details.getDriver_Details().get(s).getNum_Of_Races() + 1;

                    Details.getDriver_Details().get(s).setPoints(TotalScore6);
                    Details.getDriver_Details().get(s).setNum_Of_Races(FinalParticipation6);
                    Details.getDriver_Details().get(s).setSeventh_Positions();
                    break;
                case 8:
                    score = 4;
                    int TotalScore7 = Details.getDriver_Details().get(s).getPoints() + score;
                    int FinalParticipation7 = Details.getDriver_Details().get(s).getNum_Of_Races() + 1;

                    Details.getDriver_Details().get(s).setPoints(TotalScore7);
                    Details.getDriver_Details().get(s).setNum_Of_Races(FinalParticipation7);
                    Details.getDriver_Details().get(s).setEighth_Positions();
                    break;
                case 9:
                    score = 2;
                    int TotalScore8 = Details.getDriver_Details().get(s).getPoints() + score;
                    int FinalParticipation8 = Details.getDriver_Details().get(s).getNum_Of_Races() + 1;

                    Details.getDriver_Details().get(s).setPoints(TotalScore8);
                    Details.getDriver_Details().get(s).setNum_Of_Races(FinalParticipation8);
                    Details.getDriver_Details().get(s).setNinth_Positions();
                    break;
                case 10:
                    score = 1;
                    int TotalScore9 = Details.getDriver_Details().get(s).getPoints() + score;
                    int FinalParticipation9 = Details.getDriver_Details().get(s).getNum_Of_Races() + 1;

                    Details.getDriver_Details().get(s).setPoints(TotalScore9);
                    Details.getDriver_Details().get(s).setNum_Of_Races(FinalParticipation9);
                    Details.getDriver_Details().get(s).setTenth_Positions();
                    break;

            };

            String fn = Details.getDriver_Details().get(s).getFirstName();//Getting the first name to the driver linked list.
            String ln = Details.getDriver_Details().get(s).getLastName();//Getting the last name to the driver linked list.
            FD1.add(new Formula1Driver(fn, ln, rank));//Adding the first, last and rank to the linked list.
            System.out.println();
            System.out.println("The name of the driver is "+fn+" "+ln+"\n"+
                    "His'Her position is "+"- "+ rank);

        }
        try {
            String raceDate = D_G();
            Boom.add(new Race(raceDate,FD1));//Adding the date of the race and driver linked list to the main race linked list;
        } catch (Exception e) {
            e.printStackTrace();
        }
    };

    //This method will display race dates completed in ascending order.
    public void DislayDate()
    {
        String [][] row = new String[15][1];//rows created in a 2D array.
        String [] Col = {"Date of Race"};//column created in a array and filled.
        JTable Table4 = new JTable(row,Col); //global
        JScrollPane Shell =new JScrollPane(Table4);//Is used to scroll down and up the table.

        Frame.getContentPane().add(Shell);//Is used to scroll down and up the table.
        Table4.setRowHeight(20); //fixed row.
        Shell.setBounds(50,150,700,200); //set the size of the table.

        //for-loop is used to run the arraylist.
        for (int x = 0; x<Boom.size() ;x++ )
        {
            row[x][0] = String.valueOf(Boom.get(x).getDates());

        }Table4.repaint();//To refresh the table.

        //bubble sorting is used to print out the ascending order of the table of dates.
        String[] temp;
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < Boom.size() - 1; i++){
                String firstVal = row[i][0];
                String secondVal = row[i + 1][0];
                if (firstVal.compareTo(secondVal) > 0) {
                    temp = row[i];
                    row[i] = row[i + 1];
                    row[i + 1] = temp;
                    sorted = false;
                }
            }
        };


    };


    //Override method used to activate the events when button is clicked.
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button1) {
            button1.setBounds(26,400,200,50);
            DisplayDetails();

        } //button1
        else if (e.getSource()==button2){
            button2.setBounds(250,400,280,50);
            P2ints();

        } //button2
        else if (e.getSource()==button3){
            button3.setBounds(26,480,380,50);
            positionS();
        } //button3
        else if (e.getSource()==button4){
            button4.setBounds(545,400,250,50);
            random_race();
        } //button4
        else if (e.getSource()==button5){
            button5.setBounds(600,480,180,50);
        } //button5
        else if (e.getSource()==button6){
            button6.setBounds(430,480,150,50);
            DislayDate();

        }; //button6
    }
}
