import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener {
    JPanel panel;
    JTextField inputField;
    String operator;
    double numb1, numb2;
    public Calculator(){
        setTitle("Calculator");
        setSize(400,400);
        setLayout(new BorderLayout());
    
        
        inputField= new JTextField();
        inputField.setEditable(false);
        add(inputField,BorderLayout.NORTH);
    
        panel=new JPanel();
        panel.setLayout(new GridLayout(5,4));
    
        String[] buttons={"7","8","9","C","4","5","6","*","1","2","3","-","0",".","+","=","%"};
        for(int i=0; i<buttons.length; i++){
            JButton button= new JButton(buttons[i]);
            button.addActionListener(this);
            panel.add(button);
        }
    
        add(panel,BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    
    
    }
    
    public void actionPerformed(ActionEvent e) {
        String clickedButton=e.getActionCommand();
        if(clickedButton.equals("C")){
           inputField.setText(" ");
        } else if(clickedButton.equals("+")) {
            numb1=Double.parseDouble(inputField.getText());
            operator="+";
            inputField.setText("");
        } else if(clickedButton.equals("-")) {
            numb1=Double.parseDouble(inputField.getText());
            operator="-";
            inputField.setText("");
        } else if(clickedButton.equals("*")) {
            numb1=Double.parseDouble(inputField.getText());
            operator="*";
            inputField.setText("");
        } else if(clickedButton.equals("/")){
            numb1=Double.parseDouble(inputField.getText());
            operator="/";
            inputField.setText("");
        } else if(clickedButton.equals("%")){
            numb1=Double.parseDouble(inputField.getText());
            operator="%";
            inputField.setText("");
        } else if(clickedButton.equals("=")){
            // double result = evaluate(inputField.getText());
            // inputField.setText(inputField.getText() + " = " + result);
            numb2=Double.parseDouble(inputField.getText());
            switch(operator) {
                case "+":
                inputField.setText(Double.toString(numb1 + numb2));
                break;
                case "-":
                inputField.setText(Double.toString(numb1 - numb2));
                break;
                case "*":
                inputField.setText(Double.toString(numb1 * numb2));
                break;
                case "/":
                inputField.setText(Double.toString(numb1 / numb2));
                break;
                case "%":
                inputField.setText(Double.toString(numb1 % numb2));
                break;
                default:
                inputField.setText("");
                break;
            }
        } else{
            inputField.setText(inputField.getText() + clickedButton);
        }
    }
    public static void main(String[] args){
        new Calculator();
    }
}