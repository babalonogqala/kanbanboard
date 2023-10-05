/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginform;
//imports for the gui to appear and output message
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
 

    

/**
 *
 * @author Babalo Nogqala
 * Student number :ST10268692
 */
public class Welcome implements ActionListener{
        JFrame frame;
        JMenuBar menubar;
        JMenu menu;
        JMenuItem i,i1,i2,i3,i4;
        Container container;
        JTextArea textarea;
        
    public Welcome(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 440, 440);
        container = frame.getContentPane();
        container.setLayout(null);
        menubar = new JMenuBar();
        menu = new JMenu("File");
    
        i1 = new JMenuItem("Add task");
        i2 = new JMenuItem("show report");
        i3 = new JMenuItem("cencel");
       
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
     
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        
        
        menubar.add(menu);
        frame.setJMenuBar(menubar);
       
         frame.setVisible(true);
        
       
       
        
    }
  
   public static void main(String[] args){
       Welcome click = new Welcome();
       Welcome.StoringApp();
   }

    @Override
    public void actionPerformed(ActionEvent e) {
     
      
        if(e.getSource()== i1){
              TaskNum();
        }
         if(e.getSource()== i2){
            StoringApp();
        }
       
          if(e.getSource()== i3){}
         
          
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static boolean TaskNum(){
        String number = JOptionPane.showInputDialog(null,"please add number of Tasks: ");
        int a = Integer.parseInt(number);
        for(int i = 0 ; i < a ; i++){
            Taskapp();
        }
            
        return true;
    }
    public static boolean Taskapp(){
                String tnum = JOptionPane.showInputDialog("please enter task number: ");
                String tname = JOptionPane.showInputDialog("please enter task name: ");
               
                String Desc = JOptionPane.showInputDialog("please enter task description: ");
                Pattern P = Pattern.compile("(^.{0,50})");
                Matcher M = P.matcher(Desc);
               if(M.matches()){
                   JOptionPane.showMessageDialog(null,"Task successfully captured");
               }else{
                 JOptionPane.showMessageDialog(null,"please enter task deiscription of less then 50 characters");  
               }
              
               
                   String devs = JOptionPane.showInputDialog(null,"Task developer details name and last name: ");
                   String der = JOptionPane.showInputDialog(null,"task duration hrs");
                
                   String tn = tname.substring(0,2);
                   String last3 = devs.substring(devs.length()-3);
                   
                   JOptionPane.showMessageDialog(null, "task ID ," + (tn+ " : "+ tnum + " : " + last3).toUpperCase());
                   
               
                   String[]status = {"to do", "doing", "done"};
                 int stat = JOptionPane.showOptionDialog(null, "please select a task status", "status", 
                                                        JOptionPane.YES_NO_CANCEL_OPTION,
                                                        JOptionPane.PLAIN_MESSAGE, null, status, 0);
                   
                   JOptionPane.showMessageDialog(null, "Text status: " + status[stat]+ "\n" + 
                                                                    "Developer details: "+ devs + "\n"+
                                                                    "Task number: " + tnum + "\n"+
                                                                    "Task description: " + Desc + "\n"+
                                                                    "Task ID: "+ (tn + ":"+ tnum + ":" + last3).toUpperCase() + "\n" +
                                                                    "Duration: " + der+"hrs");
                   
                   ArrayList<String> List = new ArrayList<>();
                   List.add("Developer: " + devs ) ;
                   List.add("Task Name: " + tn);
                   List.add("Task ID: " + tn + ":"+ tnum + ":" + last3.toUpperCase());
                   List.add("Task Duration: " + Desc );
                   List.add("Task Status: " + status[stat]);
                         
                    String[] app = List.toArray(new String [0]);
                    JOptionPane.showMessageDialog(null, Arrays.toString(app));
                         
                    StoringApp();
                   
        
        return true;
    }

public static boolean StoringApp(){
       int ListOp;
        do{
            ListOp = JOptionPane.showOptionDialog(null,
            "do you want to see the task lists?",
            "LIST OPTION",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null, 
            null,
            0);
            
            String[]Options = {"completed task", "longest rask duration", "search for task",
                "search developer","delete task ","display report","cancel"};
          int LA =  JOptionPane.showOptionDialog(null,
                    "please select option",
                    "List app",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    Options,
                    0);
          //these are the user information in arrays
          String[] Person1 = {"Mike Smith","create login","2","to do"};
          String[] Person2 = {"edward harrison","create add fetures ","8","doing"};
          String[] Person3 = {"Samantha Paulson","create report","done"};
          String[] Person4 = {"Glenda Oberholzer","add array","11","to do"};
         
                                                 
                    
          if (LA == 0){
              if (Arrays.asList(Person3).contains("done")){
                  for(String a: Person3){
                  System.out.println(a);
                      }
                  }
              }
          if (LA == 1){
               if (Arrays.asList(Person4).contains("11")){
                  for(String b: Person4){
                  System.out.println(b);
                      }  
               }
          }
          //search for task name
          if (LA == 2){
              String task = JOptionPane.showInputDialog("please enter task name: ");
                if (Arrays.asList(Person1).contains(task)){
                  for(String c: Person1){
                  System.out.println(c);
                      }  
               }
           
                if (Arrays.asList(Person2).contains(task)){
                  for(String c: Person2){
                          System.out.println(c);
                      }  
               }
                 if (Arrays.asList(Person3).contains(task)){
                  for(String c: Person3){
                          System.out.println(c);
                      }  
               }
                  if (Arrays.asList(Person4).contains(task)){
                  for(String c: Person4){
                          System.out.println(c);
                      }  
               }
            }  
               
          //developer name
          
          if (LA == 3){
             String dev = JOptionPane.showInputDialog("please enter developer name: ");
               if (Arrays.asList(Person1).contains(dev)){
                  for(String d: Person1){
                          System.out.println(d);
                      }  
               }
                 if (Arrays.asList(Person2).contains(dev)){
                  for(String d: Person2){
                          System.out.println(d);
                      }  
               }
                   if (Arrays.asList(Person3).contains(dev)){
                  for(String d: Person3)
                          System.out.println(d);
                      }
                    if (Arrays.asList(Person4).contains(dev)){
                  for(String d: Person4)
                          System.out.println(d);
                      } 
                   
               }  
               
              
               
         
          if (LA == 4){
            String TaskD = JOptionPane.showInputDialog("please enter task name: ");
             if(Arrays.asList(Person1).contains(TaskD)){
              Person1[0] = null;
              Person1[1] = null;
              Person1[2] = null;
              Person1[3] = null;
                System.out.println("your task has been deleted");
                for(String e: Person1){
                    System.out.println(e);
          }
          }
           
                if(Arrays.asList(Person2).contains(TaskD)){
              Person2[0] = null;
              Person2[1] = null;
              Person2[2] = null;
              Person2[3] = null;
                System.out.println("your task has been deleted");
                for(String e: Person2){
                    System.out.println(e);
          }
          }
                  if(Arrays.asList(Person3).contains(TaskD)){
              Person3[0] = null;
              Person3[1] = null;
              Person3[2] = null;
              Person3[3] = null;
                System.out.println("your task has been deleted");
                for(String e: Person3){
                    System.out.println(e);
          }
          }
                    if(Arrays.asList(Person4).contains(TaskD)){
              Person4[0] = null;
              Person4[1] = null;
              Person4[2] = null;
              Person4[3] = null;
                System.out.println("your task has been deleted");
                for(String e: Person4){
                    System.out.println(e);
          }
          }
          }
          //show report
          if (LA == 5){ 
              for(String f : Person1){
                System.out.println(f);
          }
              System.out.println("");
              
              for(String f : Person2){
                System.out.println(f);
          }
              System.out.println("");
              
              for(String f : Person3){
                System.out.println(f);
          }
              System.out.println("");
              
              for(String f : Person4){
                System.out.println(f);
          }
              System.out.println("");
          }
          
          
          //this is ends the program
          if (LA == 6){
            
          }
          JOptionPane.showMessageDialog(null,"enjoy have a nice day!");
          break;
          
        }while(ListOp != 1);
    return true;
}
}




