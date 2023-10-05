/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginform;
//imports for functionality
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Babalo Nogqala
 * student number : ST10268692
 */


public class LoginPage implements ActionListener{

       JFrame form = new JFrame();
       JButton LoginButton = new JButton("Login");
       JButton registerButton = new JButton("Register");
       JTextField Username = new JTextField();
       JPasswordField userPassword = new JPasswordField();
       JLabel userIdLabel = new JLabel("Username:");
       JLabel userPasswordLabel = new JLabel("Password :");
       JLabel headingLabel = new JLabel("Login Page");

    @SuppressWarnings("LeakingThisInConstructor")
    LoginPage(){
       userIdLabel.setBounds(50,100,75,25);
       userPasswordLabel.setBounds(50,150,75,25);
       Username.setBounds(125,100,150,25);
       userPassword.setBounds(125,150,150,25);
       headingLabel.setBounds(125,50,250,25);
  
       
       LoginButton.setBounds(125,200,100,25);
       LoginButton.addActionListener(this);
       registerButton.setBounds(225,200,100,25);
       registerButton.addActionListener(this);
    
       form.add(userIdLabel);
       form.add(userPasswordLabel);
       form.add(Username);
       form.add(userPassword);
       form.add(headingLabel);
       form.add(LoginButton);
       form.add(registerButton);
       form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       form.setSize(420,420);
       form.setLayout(null);
       form.setVisible(true);
    }
    


  
  
public void actionPerformed(ActionEvent ae){
        //if register button clicked it will take the user to registration page
            if(ae.getSource()== registerButton)
            {
              Registration registration = new Registration(); 
            } 
            /*when the login button is clicked what is entered in the text field
             *then it will check if what is entered matches what is in the text file "userinfo.txt"
            *f it deos it will output successfull
            */
            if(ae.getSource()== LoginButton)
            {
              boolean matched= false;
              String username = Username.getText();
              String password = userPassword.getText();
              try {
                   FileReader fr = new FileReader("userinfo.txt");
                   BufferedReader br = new BufferedReader(fr);
                   String line;
                while((line=br.readLine())!=null){
                    String userID = Username.getText();
                    if(line.equals(username+"\t"+password)){
                       matched = true;
                       break;
                    }
                    }
                    fr.close();   
                  } catch (Exception e) {}
                if(matched){
                    
                    JOptionPane.showMessageDialog(null, "Username and password successful captured");
                    JOptionPane.showMessageDialog(null,"welcome");
                    Welcome welcome = new Welcome();
                }else{
                    JOptionPane.showMessageDialog(null,"Wrong username or password!");
                   
              }
          }
   

} 
}

    





    
        
       

