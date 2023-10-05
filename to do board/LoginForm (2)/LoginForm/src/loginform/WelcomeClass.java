/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginform;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Babalo Nogqala
 */
public class WelcomeClass {
    
    public static boolean checkTaskDescription(){
          String tnum = JOptionPane.showInputDialog("enter task number: ");
           String tname = JOptionPane.showInputDialog("enter task name: ");
                ////////////////////////////////////////////////////////////////////
                String Desc = JOptionPane.showInputDialog("enter task description: ");
               Pattern P = Pattern.compile("(^.{0,50})");
               Matcher M = P.matcher(Desc);
               if(M.matches()){
                   JOptionPane.showMessageDialog(null,"Task successfully captured");
               }else{
                 JOptionPane.showMessageDialog(null,"please enter task deiscription of less then 50 characters");  
               }
        return true;
    }
    
    
    public static String createTaskID(){
         String tname = JOptionPane.showInputDialog("enter task name: ");
          String tnum = JOptionPane.showInputDialog("enter task number: ");
           String devs = JOptionPane.showInputDialog(null,"Task developer details name and last name: ");
            String tn = tname.substring(0,2);
                   String last3 = devs.substring(devs.length()-3);
                   
                   JOptionPane.showMessageDialog(null, "task ID ," + (tn+ " : "+ tnum + " : " + last3).toUpperCase());
                   
        return createTaskID();
    }
    
    
    public static String printTaskDetails(){
         String tnum = JOptionPane.showInputDialog("enter task number: ");
                String tname = JOptionPane.showInputDialog("enter task name: ");
                ////////////////////////////////////////////////////////////////////
                String Desc = JOptionPane.showInputDialog("enter task description: ");
                Pattern P = Pattern.compile("(^.{0,50})");
                Matcher M = P.matcher(Desc);
               if(M.matches()){
                   JOptionPane.showMessageDialog(null,"Task successfully captured");
               }else{
                 JOptionPane.showMessageDialog(null,"please enter task deiscription of less then 50 characters");  
               }
               //////////////////////////////////////////////////////////////////////////////
               
                   String devs = JOptionPane.showInputDialog(null,"Task developer details name and last name: ");
                   String der = JOptionPane.showInputDialog(null,"task duration hrs");
                   ///////////////////////////////////////////
                   String tn = tname.substring(0,2);
                   String last3 = devs.substring(devs.length()-3);
                   
                   JOptionPane.showMessageDialog(null, "task ID ," + (tn+ " : "+ tnum + " : " + last3).toUpperCase());
                   
                   //////////////////////////////////////////////////////////////
                   String[]status = {"to do", "doing", "done"};
                 int stat = JOptionPane.showOptionDialog(null, "please select a task status", "status", 
                                                        JOptionPane.YES_NO_CANCEL_OPTION,
                                                        JOptionPane.PLAIN_MESSAGE, null, status, 0);
                  
                   ///////////////////////////////////////////////////////////////////////
                   JOptionPane.showMessageDialog(null, "Text status: " + stat + "\n" + 
                                                                    "Developer deyails: "+ devs + "\n"+
                                                                    "Task number: " + tnum + "\n"+
                                                                    "Task description: " + Desc + "\n"+
                                                                    "Task ID: "+ (tn + ":"+ tnum + ":" + last3).toUpperCase() + "\n" +
                                                                    "Duration: " + der+"hrs");
        return  printTaskDetails();
    }
    
    
    public static int returnTotalHours(){
          String tnum = JOptionPane.showInputDialog("enter task number: ");
                String tname = JOptionPane.showInputDialog("enter task name: ");
                ////////////////////////////////////////////////////////////////////
                String Desc = JOptionPane.showInputDialog("enter task description: ");
                Pattern P = Pattern.compile("(^.{0,50})");
                Matcher M = P.matcher(Desc);
               if(M.matches()){
                   JOptionPane.showMessageDialog(null,"Task successfully captured");
               }else{
                 JOptionPane.showMessageDialog(null,"please enter task deiscription of less then 50 characters");  
               }
               //////////////////////////////////////////////////////////////////////////////
               
                   String devs = JOptionPane.showInputDialog(null,"Task developer details name and last name: ");
                   String der = JOptionPane.showInputDialog(null,"task duration hrs");
                   ///////////////////////////////////////////
                   String tn = tname.substring(0,2);
                   String last3 = devs.substring(devs.length()-3);
                   
                   JOptionPane.showMessageDialog(null, "task ID ," + (tn+ " : "+ tnum + " : " + last3).toUpperCase());
                   
                   //////////////////////////////////////////////////////////////
                   String[]status = {"to do", "doing", "done"};
                 int stat = JOptionPane.showOptionDialog(null, "please select a task status", "status", 
                                                        JOptionPane.YES_NO_CANCEL_OPTION,
                                                        JOptionPane.PLAIN_MESSAGE, null, status, 0);
                   ///////////////////////////////////////////////////////////////////////
                   JOptionPane.showMessageDialog(null, "Text status: " + stat + "\n" + 
                                                                    "Developer deyails: "+ devs + "\n"+
                                                                    "Task number: " + tnum + "\n"+
                                                                    "Task description: " + Desc + "\n"+
                                                                    "Task ID: "+ (tn + ":"+ tnum + ":" + last3).toUpperCase() + "\n" +
                                                                    "Duration: " + der+"hrs");
                   
        
        return returnTotalHours();
    }
}
