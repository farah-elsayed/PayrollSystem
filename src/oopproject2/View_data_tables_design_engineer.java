/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject2;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;

/**
 *
 * @author ISHAK
 */
// THIS FOLDER IS JUST A DESIGN FOR THE VIEW TABLES WINDOW  
public class View_data_tables_design_engineer {
    
    public void tables_design(String[][] info , String[]columnNames_information, String[][] salaries, String[]columnNames_salary)
    {
        JFrame frame = new JFrame();
        JTable tab1 = new JTable(info, columnNames_information); // the table of information
        JTable tab2 = new JTable(salaries, columnNames_salary); // data of information 
        JLabel lab1= new JLabel ("Information");
        JLabel lab2= new JLabel ("Salary Per Engineer"); 
        lab1.setFont(new Font(lab1.getFont().getName(), lab1.getFont().getStyle(), 20));
        lab2.setFont(new Font(lab2.getFont().getName(), lab2.getFont().getStyle(), 20));
        JScrollPane spTable = new JScrollPane(tab1);
        JScrollPane spTable2 = new JScrollPane(tab2);
        JScrollPane sptable3= new JScrollPane(lab1);
        JScrollPane sptable4= new JScrollPane(lab2);

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3= new JPanel();
        JPanel panel4 = new JPanel ();
        Dimension expectedDimension2 = new Dimension(464, 50);
        panel3.setPreferredSize(expectedDimension2);
        Dimension expectedDimension3= new Dimension(500, 50);
        panel2.setPreferredSize(expectedDimension3);
        panel3.setBorder(null);

        panel.add(spTable);
        panel2.add(spTable2);
        panel3.add(sptable3);
        panel4.add(sptable4);
        JSplitPane sp1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel,panel2); // the first part of the GUI that contain the labels 
        JSplitPane sp2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel3,panel4);// the first part that contains the tables 
        JSplitPane sp3= new JSplitPane (JSplitPane.VERTICAL_SPLIT, sp2,sp1); // both of them organized 
        sp2.setDividerSize(1);
        sp1.setDividerSize(1);
        sp3.setDividerSize(1);
        frame.add(sp3);
        
        frame.setVisible(true);
        frame.setSize(1000,600);
    }
    
}
