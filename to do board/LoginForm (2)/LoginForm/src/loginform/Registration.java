/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginform;
//imports for functionality
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.logging.Level;
import java.util.logging.Logger;
//Gui imports
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;





/**
 *
 * @author Babalo Nogqala
 * STUDENT NUMBER :ST10268692
 */
   
public class Registration implements ActionListener {
   
       JPanel panel = new JPanel();
       JFrame form = new JFrame();
   
       JButton RegisterButton = new JButton("Register");
       JButton ResetButton = new JButton("Reset");
       JButton BackButton = new JButton("Return");
       JTextField firstname = new JTextField();
       JTextField lastname= new JTextField();
       JTextField Username= new JTextField();
       JPasswordField userPassword = new JPasswordField();
    
       JLabel firstnamelabel = new JLabel("Firstname:");
       JLabel lastnamelabel = new JLabel("Lastname:");
       JLabel userIdLabel = new JLabel("Username:");
       JLabel userPasswordLabel = new JLabel("Password :");
       JLabel messageLabel = new JLabel("Registration Page");
   
    
  
    @SuppressWarnings("LeakingThisInConstructor")
    Registration(){
        //Gui styling
      firstnamelabel.setBounds(50,5,75,25);
      lastnamelabel.setBounds(50,50,75,25);
      userIdLabel.setBounds(50,100,75,25);
      userPasswordLabel.setBounds(50,150,75,25);
      
      
      firstname.setBounds(125,5,150,25);
      lastname.setBounds(125,50,150,25);
      Username.setBounds(125,100,150,25);
      userPassword.setBounds(125,150,150,25);
      messageLabel.setBounds(125,250,250,25);
 
       
      RegisterButton.setBounds(125,200,100,25);
      RegisterButton.addActionListener(this);
      ResetButton.setBounds(225,200,100,25);
      ResetButton.addActionListener(this);
      BackButton.setBounds(28,200,100,25);
      BackButton.addActionListener(this);
      
      form.add(firstname);
      form.add(lastname);
      form.add(firstnamelabel);
      form.add(lastnamelabel);
      form.add(userIdLabel);
      form.add(userPasswordLabel);
      form.add(Username);
      form.add(userPassword);
      form.add(messageLabel);
      form.add(BackButton);
      form.add(RegisterButton);
      form.add(ResetButton);
      form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      form.setSize(420,420);
      form.setLayout(null);
      form.setVisible(true);
      
    }
 

 
     @SuppressWarnings("IncompatibleEquals")
     public void actionPerformed(ActionEvent ae){
         //When back button clicked it will take the user to the login page.
        if(ae.getSource()== BackButton)
        {
            LoginPage loginpage = new LoginPage(); 
        }
        //when reset button is clicked it will erase everything in the text fields.
        if(ae.getSource()== ResetButton)
        {
            lastname.setText(null);
            firstname.setText(null);
            Username.setText(null);
            userPassword.setText(null);
        } 
        if(ae.getSource()== RegisterButton)
        {
  

             try {
  
                 //reads text and stores it in text file"userinfo.txt"
                    FileWriter fw = new FileWriter("userinfo.txt",true);
                    fw.write("\n"+ Username.getText()+"\t"+userPassword.getText());
                    fw.close();
                    /*
                    declaration for username and validation
                        * at least 5 Characters long
                        * must have an underscore
                    */
                    String username = Username.getText();
                    
                if((username.length() <= 5 )&& username.contains("_"))
                {
                   JOptionPane.showMessageDialog(null,"username successfuly captured");
                   form.dispose();
            
                }else if((username.length()>5)||(username.contains("_")||(username.contains("")))){
                
                   JOptionPane.showMessageDialog(null,"Username must not be more then 5 characters long with underscore");
                }
              
        
                    /*declaration for validation for password 
                    • At least 8 characters long
                    • Contain a capital letter
                    • Contain a number
                    • Contain a special character
                    */ 
                    String password = userPassword.getText();
                    String input = userPassword.getText();
                    //if successful it will take you to login page
                if(Pattern.matches("(?=.*[0-9])"
                                    + "(?=.*[a-z])"
                                    + "(?=.*[A-Z])"
                                    + "(?=.*[@#$%^&+=])"
                                    + "(?=\\S+$).{8,}",input)){
                    
                        LoginPage loginpage = new LoginPage();
                        
                }  else{
                    
                  JOptionPane.showMessageDialog(null,"password must contain a digit an uppercse a special characters\n and at laast 8 characters");
                }    
                if((password.length() <= 8)||(username.length() <= 5)){
                    
                   JOptionPane.showMessageDialog(null, "registered successfully ");  
                }
                else{
                    
                   JOptionPane.showMessageDialog(null, "the registration is incomplet ");  
                }
            }catch (IOException e) {
                    
                    Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, e);
                }
                
        }
        }
        }
         
             
             
             
                 
             
             
             
             
         
             

  
        
     



    
    


  

    

  



  

    
    

