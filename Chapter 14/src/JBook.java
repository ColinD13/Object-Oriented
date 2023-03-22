import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JBook {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel quote = new JLabel("Remember, the enemy's gate is down");

        frame.add(quote);
        frame.setSize(100,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}