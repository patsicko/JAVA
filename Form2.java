import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form2 extends JFrame implements ActionListener {

    JLabel nameLabel, departmentLabel, regLabel,outputLabel;

    JTextField nameField, depField,regField,outpuField;
    JButton register,cancel;


    public Form2 (){

        nameLabel= new JLabel("name");
        nameField= new JTextField();
        departmentLabel =new JLabel("department");
        depField = new JTextField();
        regLabel = new JLabel("regNo");
        regField = new JTextField();
        register = new JButton("register");
        cancel = new JButton("cancel");
        outputLabel = new JLabel("output");
        outpuField = new JTextField();
        
        add(outputLabel);
        add(outpuField);
        add(nameLabel);
        add(nameField);
        add(departmentLabel);
        add(depField);
        add(regLabel);
        add(regField);
        add(register);
        add(cancel);

        setVisible(true);
        setLayout( new GridLayout(5,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        outpuField.setEditable(false);

        register.addActionListener(this);
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                depField.setText("");
                regField.setText("");
            }
            
        });

    }



    public void actionPerformed(ActionEvent e){
    
        String name = nameField.getText();
        String department =depField.getText();
        String reg = regField.getText();
        outpuField.setText(name + " " + department + " " + reg);

         

    }

    public static void main (String[] args){
        new Form2();
    }




}