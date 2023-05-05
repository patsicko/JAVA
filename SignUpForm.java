import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUpForm extends JFrame implements ActionListener {
    private JLabel fnameLabel, lnameLabel,emailLabel, passwordLabel;
    private JTextField fnameField,lnameField, emailField;
    private JPasswordField passwordField;
    private JButton signUpButton;

    public SignUpForm() {
        setTitle("Sign Up Form");
        setSize(800, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fnameLabel = new JLabel("First Name:");
        fnameField = new JTextField(20);

        lnameLabel = new JLabel("Last Name:");
        lnameField = new JTextField(20);

        emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);

        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);

        signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        panel.add(lnameLabel);
        panel.add(lnameField);
        panel.add(fnameLabel);
        panel.add(fnameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(signUpButton);
        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Handle sign-up button click event
        String fname = fnameField.getText();
        String lname =lnameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        // Add code here to save user data to database or file
        // ...

        // Show confirmation message
        JOptionPane.showMessageDialog(this, "Thank you for signing up!");
    }

    public static void main(String[] args) {
        new SignUpForm();
    }
}
