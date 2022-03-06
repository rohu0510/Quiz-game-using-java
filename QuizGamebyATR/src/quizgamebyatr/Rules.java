package quizgamebyatr;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Rohit
 */
public class Rules extends JFrame implements ActionListener {
    
    JButton b1, b2;
    String username;
    Rules(String username){
        this.username= username;
        setBounds(100, 50, 1100, 572 );
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);
        
        
       JLabel l1 = new JLabel("Welcome "+username + " to QuizbyATR");
       l1.setForeground(Color.red);
       l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
       l1.setBounds(320, 20, 700, 30);
       add(l1);
       
       
       //labels for RULES
       JLabel l2 = new JLabel("");
       l2.setForeground(Color.black);
       l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
       l2.setBounds(350, 0, 400, 550);
       l2.setText(
        "<html>"+
                "1. All questions are compulsory."+ "<br><br>"+
                "2. There are only 30 seconds for each question."+ "<br><br>"+
                "3. Do not open any tab aur press back button."+ "<br><br>"+
                "4. There is no any negative marking."+ "<br><br>"+
                "5. There are total 10 quesions each 10 marks."+ "<br><br>"+
        "</html>"
       );
       add(l2); 
       
       //Back button
       b1 = new JButton("Back");
       b1.setBounds(350, 400, 100, 30);
       b1.setBackground(Color.lightGray);
       b1.setForeground(Color.black);
       b1.addActionListener(this);
       add(b1);
       
       //next button
       b2 = new JButton("Start Quiz");
       b2.setBounds(575, 400, 100, 30);
       b2.setBackground(Color.red);
       b2.setForeground(Color.black);
       b2.addActionListener(this);
       add(b2);
       
       
       
       setVisible(true);
    }
    
    public static void main(String[] args){
        new Rules("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1){
            this.setVisible(false);
            new QuizGamebyATR().setVisible(true);
        }else if(ae.getSource() == b2){
            new Quiz(username).setVisible(true);
        }
    }
}
