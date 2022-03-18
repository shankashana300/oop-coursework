package com.company;

import java.text.ParseException;

//Shankashana Prathaban Krishnakumar_w1810206_2019772;
//”I confirm that I understand what plagiarism is and have read and understood the
//section on Assessment Offences in the Essential Information for Students. The work
//that I have submitted is entirely my own. Any work from other authors is duly
//referenced and acknowledged.”

public interface ChampionshipManager
{
    void AddDriver();
    void Delete();
    void Change();
    void stats();
    void Add_Complete_Race() throws ParseException;
};
