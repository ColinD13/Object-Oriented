import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTVDownload2 implements ActionListener {
    private JComboBox box;
    private JLabel t;
    public JTVDownload2()
    {
        //Frame
        JFrame frame = new JFrame("On Demand");
        frame.setLayout(new GridBagLayout());
        frame.setSize(1000,750);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //Show Array

        String[] shows = {"Flash","Green Arrow", "Supergirl", "Legends of Tomorrow", "Batgirl"};


        box= new JComboBox(shows);
        box.setEditable(true);
        frame.add(box);
        box.addActionListener(this);

        //JLabel

        t =new JLabel("On Demand");
        t.setVisible(true);
        frame.add(t);
    }

    public static void main(String[] args) {

        JTVDownload2 tv = new JTVDownload2();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String value= box.getSelectedItem().toString();

        if(value.equals("Flash"))
        {
            t.setText("Flash is on demand");
        }
        else if(value.equals("Green Arrow"))
        {
            t.setText("Green Arrow is on demand");
        }
        else if(value.equals("Supergirl"))
        {
            t.setText("Supergirl is on demand");
        }
        else if(value.equals("Legends of Tomorrow"))
        {
            t.setText("Legends of Tomorrow is on demand");
        }
        else if(value.equals("Batgirl"))
        {
            t.setText("Batgirl iss on demand");
        }
        else
        {
            t.setText(value + " is not on demand");
        }
    }
}
