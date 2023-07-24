/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject2;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public interface MainFunctions {
     
   boolean  Add_Engineer(Engineer eng);
   boolean  Add_Trainees(Trainee trainee);
   boolean Update_Engineer(int ID, Engineer eng);
   boolean Delete_Trainee(int ID);
   boolean Delete_Engineer(int ID);
   boolean Update_Trainee(int ID, Trainee t);
   Trainee search_trainee(int ID);
   Engineer search_Engineer(int ID);
   ArrayList<Engineer> engineerlist();
   ArrayList<Trainee> traineelist();
   public void insert_salaries(JTextField ID, JTextField working_hours, JComboBox day, JComboBox month, JComboBox year);
   public abstract void view ();
   public abstract void view(int id );
   public abstract void view(int id, JComboBox month, JComboBox year); 
    public String[][] engineer_information(ResultSet RS, int counter) ;
    public int count_data( ResultSet RS);
    public String[][] salaries_information(ResultSet RS, int counter);
    public double salary (double hours, double taxes, double payrate);
}
