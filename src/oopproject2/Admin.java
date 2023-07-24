
package oopproject2;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public  class Admin  implements MainFunctions {
    
    private String username;
    private String password;
      private int id= 0;  
   PreparedStatement engineerinfo;
   PreparedStatement salariesinfo;
   PreparedStatement count_engineers;
   PreparedStatement count_salaries;
   ResultSet engineerinfoRS;
   ResultSet salariesinfoRS;
   ResultSet count_engineers_RS;
   ResultSet count_salaries_RS;
   Connection con;
   
   //Resultset is considered a pointer hence it's used to point at a row and get it's data   
     public void setId(int id) {
            this.id = id;
        }
      public int getId() {
            return id;
        }
 
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
 public boolean Login()
    {
        if(this.username.equals("Admin") && this.password.equals("admin"))
        {
            return true;
        }
        else
        {
            return false;
        }
}
    
 
    @Override
public boolean Add_Engineer(Engineer eng) {
          try
       {
            Connection con = DatabaseConnection.setConnection();
            Statement st = con.createStatement();
            String sql = "insert into Engineer values ("+eng.ID +",'" + eng.name + "'," + eng.age + ", '" + eng.getGrade().getPosition()+"',"+ eng.getGrade().getJob_id() +")";
            st.executeUpdate(sql); 
            con.close();
            return true;
        }
        catch(SQLException e)
        {
            
            return false;     
        }
    }
    
    @Override

public boolean Add_Trainees(Trainee trainee)
    { try
        {
           Connection con = DatabaseConnection.setConnection();
           Statement st = con.createStatement();
           String sql = "insert into Trainee values ("+trainee.ID +",'" + trainee.name + "'," + trainee.age + "," + 1000+ " ,'" + trainee.getUni_name()+"', "+trainee.getGPA()+", "+trainee.getAcademic_year()+")";
           st.executeUpdate(sql);
            con.close();
            return true;
       }
      catch(SQLException e)
       {
          
              return false;     
        }
 
    }
    @Override
public boolean Update_Engineer(int ID, Engineer eng)
    {
         try
        {
            Connection con = DatabaseConnection.setConnection();
            Statement st = con.createStatement();
            String sql = "update Engineer set Name  = '" + eng.name + "', age =  "+ eng.age + ", position = '"+ eng.getGrade().getPosition()+ "'where ID ="+ ID;
            st.executeUpdate(sql);
            con.close();
            return true;
        }
        catch(SQLException e)
        {
 
           
 
            return false;
        }
    }
    
    @Override
public boolean Delete_Trainee(int ID)
    {
        try
        {
            Connection con = DatabaseConnection.setConnection();
            Statement st = con.createStatement();
            String sql = "Delete from trainee where ID= " + ID;
            st.executeUpdate(sql);
            
            con.close();
            return true;
        }
        catch(SQLException e)
        {
               return false;     
         }
    }

    @Override
public ArrayList<Engineer> engineerlist(){
        ArrayList<Engineer> engineerlist = new ArrayList<>();
        try
        {
            Connection con = DatabaseConnection.setConnection();
            Statement st = con.createStatement();
            String sql="SELECT * FROM engineer";
            ResultSet rs =st.executeQuery(sql);
            Engineer eng;
            while (rs.next())
                    {
                         eng =new Engineer ();
              Grade g;
             eng.setID(rs.getInt(1));
             eng.setName(rs.getString(2));
             eng.setAge(rs.getInt(3));
             g = new Grade(rs.getString(5));
             eng.setGrade(g);
             
                        engineerlist.add(eng);
                     
 
                            }
 
        }
          catch(SQLException e)
        {
          
        }
        return engineerlist;
    }
    @Override
public boolean Delete_Engineer(int ID)
    {
        try
        {
            Connection con = DatabaseConnection.setConnection();
            Statement st = con.createStatement();
            String sql = "Delete from Engineer where ID= " + ID;
            st.executeUpdate(sql);
            con.close();
            return true;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
               return false;     
         }
    }
    @Override
public ArrayList<Trainee> traineelist(){
        ArrayList<Trainee> traineelist = new ArrayList<>();
        try
        {
            Connection con = DatabaseConnection.setConnection();
            Statement st = con.createStatement();
            String sql="SELECT * FROM trainee";
            ResultSet rs =st.executeQuery(sql);
            Trainee trainee;
            while (rs.next())
                    {
                        trainee =new Trainee (rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getString(5),rs.getDouble(6),rs.getInt(7));
                        traineelist.add(trainee);
                     
 
                            }
        }
          catch(SQLException e)
        {
           
        }
        return traineelist;
    }
    @Override
public Trainee search_trainee(int ID)
    {
        Trainee trainee = null;
 
         try
        {
            Connection con = DatabaseConnection.setConnection();
            Statement st = con.createStatement();
            String sql = "select *  from Trainee where ID = "+ ID ;
            ResultSet rs = st.executeQuery(sql);
                          while(rs.next())
            {
             trainee =new Trainee (rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getString(5),rs.getDouble(6),rs.getInt(7));
             trainee.setSalary(rs.getDouble(4));
            }
            con.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
         }
              return trainee; 
    }
   
    @Override
public boolean Update_Trainee(int ID, Trainee t)
    {
        try
        {
            Connection con = DatabaseConnection.setConnection();
            Statement st = con.createStatement();
            String sql = "update Trainee set Name  = '" + t.name + "', age =  "+ t.age + ", salary = " + 1000 + ", uni_name = '"+ t.getUni_name()+"', gpa =  "
                    + t.getGPA()+", academic_year = " + t.getAcademic_year()
                    + "where ID ="+ ID;
            st.executeUpdate(sql);
            con.close();
            return true;
        }
        catch(SQLException e)
        {
          
            return false;
        }
    }
      @Override
public Engineer search_Engineer(int ID)
    {
        Engineer eng = null;
         try
        {
            Connection con = DatabaseConnection.setConnection();
            Statement st = con.createStatement();
            String sql = "select *  from Engineer where ID = "+ ID ;
            ResultSet rs = st.executeQuery(sql);
                  while(rs.next())
            {
             eng =new Engineer ();
              Grade g;
             eng.setID(rs.getInt(1));
             eng.setName(rs.getString(2));
             eng.setAge(rs.getInt(3));
             g = new Grade(rs.getString(4));
             eng.setGrade(g);
            }
            con.close();
        }
        catch(SQLException e)
        {
        }  
        return eng; 
    }
    @Override
 
public double salary (double hours, double taxes, double payrate)
        {
                double hourlypayment, aftertaxes ;
               hourlypayment= payrate*hours;
               aftertaxes= (taxes) *hourlypayment;
               return hourlypayment-aftertaxes ;
        }
 @Override
 public void insert_salaries(JTextField ID, JTextField working_hours, JComboBox day, JComboBox month, JComboBox year)
    { 
                String position= null;
                double total =0.0; String date= null;
                Engineer eng= new Engineer();
                Admin a= new Admin();
         try {
             Connection con= DatabaseConnection.setConnection();
             Statement search_by_id =con.createStatement();
             //query for searching by id (to get the position of this specific engineer)
             String search_id="select engineer.id,"
        + "engineer.position from engineer where engineer.id="+Integer.parseInt(ID.getText())+"";
              ResultSet RS_Id = search_by_id.executeQuery(search_id);
             while (RS_Id.next()) //extracts the position 
             {
                position= RS_Id.getString("position");
                eng.setID(RS_Id.getInt("Id"));
             }

            if (eng.getID()==Integer.parseInt(ID.getText())) //validation of ID
            {
               //to search if this date was entered before
                  Grade g = new Grade(position);
                String check_date= "select month(salary.date) as \"month\", year(salary.date) as \"year\" from salary"
                        + " where month(salary.date)=? and year(salary.date)=? and id=?";
                PreparedStatement checkdate= con.prepareStatement(check_date);
                checkdate.setInt(1,Integer.parseInt(month.getSelectedItem().toString()));//entering month and year from combobox
                checkdate.setInt(2,Integer.parseInt(year.getSelectedItem().toString()));
                checkdate.setInt(3,eng.getID());
                ResultSet checkdateRS=checkdate.executeQuery() ;
                int checkmonth=0,checkyear=0;
                while (checkdateRS.next()) //gets the informations based on that date
                    //so if theres info then its added before 
                {
                    checkmonth= checkdateRS.getInt("month");
                    checkyear= checkdateRS.getInt("year");
                }
                if (Integer.parseInt(month.getSelectedItem().toString())== checkmonth&&Integer.parseInt(year.getSelectedItem().toString())== checkyear)
                { //validation of month
                      JOptionPane.showMessageDialog(null, "Entry for this month and year is already added");
                }
                else
                {
                    // if it hasn't been recorded before it can insert the data easily in the database 
               total= a.salary(Double.parseDouble(working_hours.getText()), g.getTax_rate(), g.getPay_rate());
               JOptionPane.showMessageDialog(null, "Salary is:"+ total);
                String Insert_Salary="insert into salary (salary.id,salary.date,salary.working_hours, salary.salary) "
                        + "values( ?, ? ,?,? ) ";
                PreparedStatement InsertSala= con.prepareStatement(Insert_Salary);
                InsertSala.setInt(1,eng.getID());
                //to enter the date in the same format 
                date =year.getSelectedItem()+"-"+ month.getSelectedItem()+"-"+ day.getSelectedItem();
                InsertSala.setString(2,date);
                InsertSala.setDouble(3, Double.parseDouble(working_hours.getText()));
                InsertSala.setDouble(4, total);
                InsertSala.execute();
                }
            }
            else 
                // if the ID isn't in the database 
                JOptionPane.showMessageDialog(null, "ID Doesn't Exist");
     
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "InValid Input");
         }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "InValid Input");
        }
       
        
        
    }
    @Override 
    public String[][] engineer_information(ResultSet RS, int counter) //extracts engineers information    
   {   
 // since we will use the engineer information a lot in the multiple view options, we isolated it in a function
   //function type is a 2D array that holds a copy of the table we need to display 
       String [][] info = new String [counter][5] ;
       int j=0;
       try
       {
           while(RS.next())
           { 
               // pointer stores all the data it needs 
                 info[j][0]=String.valueOf(RS.getInt("ID"));
                  info[j][1]=RS.getString("name");
                 info[j][2]=RS.getString("job_id");
                info[j][3]=String.valueOf(RS.getInt("age"));
                 info[j][4]= String.valueOf(RS.getString("position"));
                 
                 j++;
           }
       }
        catch (SQLException e)
        {
             JOptionPane.showMessageDialog(null, "InValid Input");
        }
       return info;
   }
    @Override
     public int count_data( ResultSet RS) 
   {
       // since we have query's like count(*) that extracts one row 
           // we will use this to our advantage and get counted data from this row, so we know exactly how many 
           //rows we need in the 2d array we extract data into 
       int counter=0; // a counter to hold the value from the query
       try {
           while (RS.next())
           {
               counter= RS.getInt("rowcount");
           }
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "InValid Input");
       }
    
        return counter;
         
   }
    @Override
  public String[][] salaries_information(ResultSet RS, int counter)
   {
       // salaries information extracted in a 2D array that represents a copy of the table 
           int i=0;
           String[][] salaries = new String [counter][5];;
       try {
           while( RS.next ()){ // to extract information from the database until there's no data left
               salaries[i][0]=String.valueOf(RS.getInt("ID"));
               salaries[i][1]=RS.getString("month");
               salaries[i][2]=RS.getString("year");
               salaries[i][3]=String.valueOf(RS.getDouble("working_hours"));
               salaries[i][4]=String.valueOf(RS.getDouble("salary"));
               i++;
           }
       } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "InValid Input");
       }
       return salaries;
   }
    @Override
   public void view () //view all
   {
       try {
          Connection con= DatabaseConnection.setConnection();
           engineerinfo= con.prepareStatement( "select engineer.ID, engineer.name, engineer.job_id ,engineer.age,"
                   + " engineer.position from engineer") ;
           salariesinfo = con.prepareStatement("select salary.id,engineer.name, month(salary.date) as \"Month\", "
                   + "salary.working_hours, salary.salary, year(salary.date) as \"year\" from salary, engineer "
                   + "where salary.id=engineer.id");
           count_engineers=con.prepareStatement("select count(*) as rowcount from engineer");
           count_salaries= con.prepareStatement("select Count(*) as rowcount from salary, engineer where salary.id=engineer.id");
            // pointer points at the first row of each statement 
            engineerinfoRS = engineerinfo.executeQuery();
            salariesinfoRS= salariesinfo.executeQuery();
            count_engineers_RS = count_engineers.executeQuery();
            count_salaries_RS = count_salaries.executeQuery();
            // counting data using the method in the decleration 
           String[] info_columnNames = {"ID","Name", "Job ID", "Age","Position"};
           String[] salary_columnNames = {"ID", "Month", "Year","Working Hours", "Salary"};  
            View_data_tables_design_engineer viewtables= new View_data_tables_design_engineer();
            viewtables.tables_design(engineer_information(engineerinfoRS, count_data(count_engineers_RS)),
            info_columnNames, salaries_information(salariesinfoRS, count_data(count_salaries_RS)), salary_columnNames);
           
       } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "InValid Input");
       }
   
   }
   @Override
   public void view(int id) // view by ID function 
   {
       try {
                Connection con= DatabaseConnection.setConnection();      
         engineerinfo= con.prepareStatement("Select engineer.id, engineer.name, engineer.job_id, "
                 + "engineer.age,engineer.position"
                   + " from engineer where engineer.id=? ");
           salariesinfo = con.prepareStatement("Select salary.id, month(salary.date) as \"month\", year(salary.date) as \"year\", "
                   + "salary.working_hours, salary.salary from salary where id=?");
           // count data queries 
           count_engineers=con.prepareStatement("Select count(*) as rowcount from engineer where id=?");
           count_salaries= con.prepareStatement("Select Count(*) as rowcount from salary where id=?");
           // entering the id values in query 
           engineerinfo.setInt(1,id);
            salariesinfo.setInt(1,id);
            count_engineers.setInt(1,id);
            count_salaries.setInt(1,id);
            // pointer points at the first row of each statement 
            engineerinfoRS = engineerinfo.executeQuery();
            salariesinfoRS= salariesinfo.executeQuery();
            count_engineers_RS = count_engineers.executeQuery();
            count_salaries_RS = count_salaries.executeQuery();
            // counting data using the method in the decleration 
           String[] info_columnNames = {"ID","Name", "Job ID", "Age","Position"};
           String[] salary_columnNames = {"ID", "Month", "Year","Working Hours", "Salary"};  
          // we use the data tables design to create the tables window 
            View_data_tables_design_engineer viewtables= new View_data_tables_design_engineer();
            viewtables.tables_design(engineer_information(engineerinfoRS, count_data(count_engineers_RS)),
            info_columnNames, salaries_information(salariesinfoRS, count_data(count_salaries_RS)), salary_columnNames);
           
           
       } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "InValid Input");
       }
   }
   @Override
   public void view (int id, JComboBox month, JComboBox year) //view by id , month and year
   {
        try {
            
           Connection con= DatabaseConnection.setConnection(); //connection to database 
           engineerinfo= con.prepareStatement("Select engineer.id, engineer.name, engineer.job_id, "
                   + "engineer.age,engineer.position from engineer "
                   + " where engineer.id=? ");
           salariesinfo = con.prepareStatement("Select salary.id, month(salary.date) as \"month\", year(salary.date)"
                   + " as \"year\", salary.working_hours, salary.salary \n" +
        "from salary where salary.id=? and month(salary.date)=? and year(salary.date)=?");
           count_engineers=con.prepareStatement("Select count(*) as rowcount from engineer where id=?");
           count_salaries= con.prepareStatement("Select Count(*) as rowcount from salary where id=? "
                   + "and month(salary.date)=? and year(salary.date)=?");
           // entering the id values in query 
           engineerinfo.setInt(1,id);
            salariesinfo.setInt(1,id);
             salariesinfo.setInt(2, month.getSelectedIndex()+1);
            salariesinfo.setInt(3, 2021-year.getSelectedIndex());
            count_engineers.setInt(1,id);
            
            count_salaries.setInt(1,id);
             count_salaries.setInt(2, month.getSelectedIndex()+1);
            count_salaries.setInt(3, 2021-year.getSelectedIndex());
            
            // pointer points at the first row of each statement 
            engineerinfoRS = engineerinfo.executeQuery();
            salariesinfoRS= salariesinfo.executeQuery();
            count_engineers_RS = count_engineers.executeQuery();
            count_salaries_RS = count_salaries.executeQuery();
            // counting data using the method in the decleration 
           String[] info_columnNames = {"ID","Name", "Job ID", "Age","Position"};
           String[] salary_columnNames = {"ID", "Month", "Year","Working Hours", "Salary"};  

            View_data_tables_design_engineer viewtables= new View_data_tables_design_engineer();
            viewtables.tables_design(engineer_information(engineerinfoRS, count_data(count_engineers_RS)),
            info_columnNames, salaries_information(salariesinfoRS, count_data(count_salaries_RS)), salary_columnNames);
       } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "InValid Input");
       }
   }
   
}
