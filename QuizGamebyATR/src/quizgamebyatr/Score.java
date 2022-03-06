

package quizgamebyatr;

/**
 *
 * @author Rohit
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String username, int score){
        setBounds(100, 50, 1100, 572);
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("quizgamebyatr/icons/score.jpg"));
        Image i2=i1.getImage().getScaledInstance(550, 572, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l1= new JLabel(i3);
        l1.setBounds(0, 0, 550, 572);
        add(l1);
        
        JLabel l2= new JLabel("Thankyou "+username+ " For Playing Quizz!!!");
        l2.setBounds(650, 200, 300, 150);
        l2.setFont(new Font("RALEWAY", Font.PLAIN, 22));
        add(l2);
        
        JLabel l3= new JLabel("Your Score Is "+ score);
        l3.setBounds(720, 300, 200, 30);
        l3.setFont(new Font("Jokerman", Font.PLAIN, 22));
        l3.setForeground(Color.magenta);
        add(l3);
        
        JButton b1= new JButton("Play Again");
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.BLACK);
        b1.setBounds(750, 400, 100, 50);
        add(b1);
    }
    
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
        new QuizGamebyATR().setVisible(true);
    }
}
