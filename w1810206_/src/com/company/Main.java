package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;


//Shankashana Prathaban Krishnakumar_w1810206_2019772;
//”I confirm that I understand what plagiarism is and have read and understood the
//section on Assessment Offences in the Essential Information for Students. The work
//that I have submitted is entirely my own. Any work from other authors is duly
//referenced and acknowledged.”

public class Main extends GUI{

    public static void main(String[] args) throws IOException, ParseException {

        GUI frame1 = new GUI(); //GUI object created.
        Formula1ChampionshipManager v = new Formula1ChampionshipManager(); //object created.
        v.Load();

        try (Scanner input = new Scanner(System.in)) {

            boolean x = true;
            while (x) {
                v.Menu();

                System.out.println("Enter the letter of your choice;");
                String L = input.nextLine();
                switch (L) {
                    case "N":
                        v.AddDriver();
                        break;
                    case "D":
                        v.Delete();
                        break;
                    case "C":
                        v.Change();
                        break;
                    case "V":
                        v.stats();
                        break;
                    case "T":
                        v.Table();
                        break;
                    case "A":
                        v.Add_Complete_Race();
                        break;
                    case "G":
                        frame1.frame();
                        break;
                    case "Q":
                        v.Store(v.getDriver_Details());
                        x = false;
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
