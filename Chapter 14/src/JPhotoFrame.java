import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPhotoFrame implements ActionListener
{
    private JCheckBox c1,c2,c3,c4,c5;
    private JPanel p1,p2;
    private JLabel total;

    JPhotoFrame(){
        //Frame
        JFrame frame = new JFrame("Dorm");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setSize(1000, 750);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //Boxes
        c1 = new JCheckBox("One person >>> $40");
        c2 = new JCheckBox("Two or more people >>> $75");
        c3 = new JCheckBox("Add a pet >>> $95");
        c4 = new JCheckBox("In Studio >>> No Added Cost");
        c5 = new JCheckBox("On Sight >>> $90");

        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        c5.addActionListener(this);

        //Panels
        p1 = new JPanel();
        p2 = new JPanel();

        p1.add(c1);
        p1.add(c2);
        p1.add(c3);
        p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));

        p2.add(c4);
        p2.add(c5);
        p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
        frame.add(p1);
        frame.add(p2);

        //Label

        total = new JLabel("Total Price >>> $");
        frame.add(total);
    }

    public static void main(String[] args) {
        new JPhotoFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int price =0;

        if(c1.isSelected())
            price+=40;
        else if(c2.isSelected())
            price+=75;

        if(c3.isSelected())
            price+=95;

        if(c5.isSelected())
            price+=90;

        total.setText("Total Price >>> $" + price);
    }

}
