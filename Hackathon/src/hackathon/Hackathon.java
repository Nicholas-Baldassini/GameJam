
package _____;

import javax.swing.*;
import java.awt.event.*;  
public class _____ {
   

public static void main(String[] args) { 
    
    JFrame Frame=new JFrame("Button Example");
    
    final JTextField TextBox=new JTextField();
    
    JButton Button=new JButton("Click Here");
    
    JLabel Label=new JLabel("Hello world");
    
    TextBox.setBounds(50,50, 150,20);  
    
    Label.setBounds(0,0,100,100);
    
    Button.setBounds(50,100,95,30);  
    
    Button.addActionListener(new ActionListener(){  
    
public void actionPerformed(ActionEvent e){  
            
            
            TextBox.setText("hello world");  
            
        }  

    });  
    Frame.add(Button);
    Frame.add(TextBox);
    Frame.add(Label);
    Frame.setSize(400,400);  
    
    Frame.setLayout(null);  

    Frame.setVisible(true);   
}  
}  

