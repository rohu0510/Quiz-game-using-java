//Run from here 
package quizgamebyatr;

/**
 *
 * @author Rohit
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class QuizGamebyATR extends JFrame implements ActionListener {
    
    JButton b1, b2;
    JTextField t1;
    QuizGamebyATR(){
        setBounds(100, 50, 1100, 572 ); 
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizgamebyatr/icons/quiztime.jpg"));
        JLabel l1= new JLabel(i1);
        l1.setBounds(0, 0, 550, 572);
        add(l1);
        
        //head label
        JLabel l2 = new JLabel("Quiz By ATR");
        l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        l2.setForeground(Color.red);
        l2.setBounds(700, 30, 300, 40);
        add(l2);
        
        //name label
        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        l3.setForeground(Color.black);
        l3.setBounds(800, 175, 300, 20);
        add(l3);
        
        //text field for entering name
        t1= new JTextField();
        t1.setBounds(720, 200, 300, 25);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t1);
        
        //rule button
        b1 = new JButton("Rules");
        b1.setBounds(720, 300, 120, 25);
        b1.setBackground(Color.blue);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
        //exit button
        b2 = new JButton("Exit");
        b2.setBounds(900, 300, 120, 25);
        b2.setBackground(Color.blue);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
        setVisible(true);
    }

    public static void main(String[] args) {
        new QuizGamebyATR();
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1){
            String name= t1.getText();
            this.setVisible(false);
            new Rules(name);
        }else{
            System.exit(0);
        }
    }
    
}
