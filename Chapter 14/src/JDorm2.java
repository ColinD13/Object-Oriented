import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDorm2 implements ActionListener {
    private JPanel panel;
    private JCheckBox c1,c2,c3,c4,c5;
    private JTextArea t;
    JDorm2()
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
        t = new JTextArea("None Selected");
        panel.add(t);

        //Adding panel
        frame.add(panel);
    }

    public static void main(String[] args) {
        new JDorm2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String word ="";

        if(c1.isSelected())
            word+="Private Room is selcted, ";
        else if(!c1.isSelected())
            word+="Private Room is not selcted, ";

        if(c2.isSelected())
            word+="Internet Connection is selcted, ";
        else if(!c2.isSelected())
            word+="Internet Connection is not selcted, ";

        if(c3.isSelected())
            word+="Cable TV is selcted, ";
        else if(!c3.isSelected())
            word+="Cable TV is not selcted, ";

        if(c4.isSelected())
            word+="Microwave is selcted, ";
        else if(!c4.isSelected())
            word+="Microwave is not selcted, ";

        if(c5.isSelected())
            word+="Refrigerator is selcted, ";
        else if(!c5.isSelected())
            word+="Refrigerator is not selcted, ";

        t.setText(word);
    }
}
