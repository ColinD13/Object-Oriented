import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTVDownload implements ActionListener {

    private JButton s1,s2,s3,s4,s5;
    private JLabel t;
    public JTVDownload()
    {
        //Frame
        JFrame frame = new JFrame("On Demand");
        frame.setLayout(new GridBagLayout());
        frame.setSize(1000,750);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //Buttons

        s1 = new JButton("Flash");
        s2 = new JButton("Green Arrow");
        s3 = new JButton("Supergirl");
        s4 = new JButton("Legends of Tomorrow");
        s5 = new JButton("Batgirl");
        s1.addActionListener(this);
        s2.addActionListener(this);
        s3.addActionListener(this);
        s4.addActionListener(this);
        s5.addActionListener(this);
        frame.add(s1);
        frame.add(s2);
        frame.add(s3);
        frame.add(s4);
        frame.add(s5);

        //Text Field

        t =new JLabel("Description");
        t.setVisible(true);
        frame.add(t);


    }

    public static void main(String[] args) {

        JTVDownload tv = new JTVDownload();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==s1)
        {
            t.setText("A show about the flash and how he stops villians like Captain Cold");
        }
        else if(e.getSource()==s2)
        {
            t.setText("A show about Green Arrow and how he stops villians like Deathstroke");
        }
        else if(e.getSource()==s3)
        {
            t.setText("A show about Supergirl and how she stops villians like Lex Luthor");
        }
        else if(e.getSource()==s4)
        {
            t.setText("A show about The Legends of Tomorrow and how they travel through time");
        }
        else
        {
            t.setText("A show about Batgirl and how she stops villians like The Riddler");
        }
    }
}
