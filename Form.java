import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form extends JFrame implements ActionListener {

JLabel fnameLabel,lnameLabel,emailLabel,passwordLabel,textAreaLabel;
JTextField fnameTextField,lnameTextField,emailTextField;
JPasswordField passwordTextField;
JButton submit,reset;

JTextArea textarea;

Form (){
    setTitle("Signup Form");
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400,200);
    setLayout(new GridLayout(6,2 ));

    textAreaLabel =new JLabel("info");
    textarea= new JTextArea();

    fnameLabel = new JLabel("fname");
    fnameTextField = new JTextField(20);

    lnameLabel =new JLabel("lname");
    lnameTextField = new JTextField(20);
    
    emailLabel = new JLabel("email");
    emailTextField = new JTextField();

    passwordLabel = new JLabel("password");
    passwordTextField = new JPasswordField();
    

    submit = new JButton("Submit");
    reset = new JButton("Reset");
    textarea.setEditable(false);

   
    //add(fnameLabel);
   add(textAreaLabel);
   add(textarea);
   add(fnameLabel);
   add(fnameTextField);
   add(lnameLabel);
   add(lnameTextField);
   add(emailLabel);
   add(emailTextField);
   add(passwordLabel);
   add(passwordTextField);
   add(submit);
   add(reset);
    
    

    submit.addActionListener(this);
    reset.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e){


            fnameTextField.setText("");
            lnameTextField.setText("");
            emailTextField.setText("");
            passwordTextField.setText("");
        }

    });

}

public void actionPerformed(ActionEvent e) {
    String fname=fnameTextField.getText();
    String lname =lnameTextField.getText();
    String email = emailTextField.getText();
    String password =new String(passwordTextField.getPassword()) ;
    textarea.setText(fname+" "+lname+" "+email+" "+password);
   


}


public static void main (String []args){

    new Form();
}

}