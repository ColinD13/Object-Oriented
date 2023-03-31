import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;

public class JDorm implements ActionListener {
    private JPanel panel;
    private JCheckBox c1,c2,c3,c4,c5;
    private TextArea t;
    JDorm()
    {
        //Frame
        JFrame frame = new JFrame("Dorm");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setSize(1000, 750);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //Checkboxes

        c1 = new JCheckBox("Private Room");
        c2 = new JCheckBox("Internet Connection");
        c3 = new JCheckBox("Cable TV");
        c4 = new JCheckBox("Microwave");
        c5 = new JCheckBox("Refrigerator");
        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        c4.addActionListener(this);
        c5.addActionListener(this);


        //Panel
        panel = new JPanel();
        panel.add(c1);
        panel.add(c2);
        panel.add(c3);
        panel.add(c4);
        panel.add(c5);


        //Text Area
        t = new TextArea();
        t.setText("Not selected >>> Private Room, Internet Connection, Cable TV, Microwave, Refrigerator");
        panel.add(t);

        //Adding panel
        frame.add(panel);
    }

    public static void main(String[] args) {
        new JDorm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(c1.isSelected())
            t.append("\nPrivate Room was selected");
        else if(!c1.isSelected())
            t.append("\nPrivate Room was deselected");

        if(c2.isSelected())
            t.append("\nInternet Connection was selected");
        else if(!c2.isSelected())
            t.append("\nInternet Connection was deselected");

        if(c3.isSelected())
            t.append("\nCable TV was selected");
        else if(!c3.isSelected())
            t.append("\nCable TV was deselected");

        if(c4.isSelected())
            t.append("\nMicrowave was selected");
        else if(!c4.isSelected())
            t.append("\nMicrowave was deselected");

        if(c5.isSelected())
            t.append("\nRefrigerator was selected");
        else if(!c5.isSelected())
            t.append("\nRefrigerator was deselected");
    }
}
