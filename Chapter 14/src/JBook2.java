import javax.swing.*;
import java.awt.*;

public class JBook2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel quote = new JLabel("Remember, the enemy's gate is down");
        JButton showTitle = new JButton();

        showTitle.addActionListener(e -> JOptionPane.showMessageDialog(frame,"Ender's Game"));
        showTitle.setSize(50,50);

        frame.add(quote);
        frame.add(showTitle, BorderLayout.SOUTH);
        frame.setSize(250,250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}