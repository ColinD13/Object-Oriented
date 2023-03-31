import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LastManStanding implements ActionListener {

    private JPanel panel;
    private JButton submit;
    private JOptionPane message;
    private JCheckBox[] boxes = new JCheckBox[10];
    LastManStanding()
    {
        //Frame
        JFrame frame = new JFrame("Dorm");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setSize(1000, 750);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


        //Adding Checkboxes
        panel = new JPanel();
        for(int x=0;x<10;x++)
        {
            boxes[x]= new JCheckBox(String.valueOf(x+1));
            boxes[x].addActionListener(this);
            panel.add(boxes[x]);
        }

        //Adding Button

        submit = new JButton("Submit");
        submit.addActionListener(this);
        panel.add(submit);

        frame.add(panel);
    }

    public static void main(String[] args) {
        new LastManStanding();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int counter =0;
        JCheckBox checkbox;
        ArrayList<JCheckBox> unchecked = new ArrayList<>();
        int rand;

        for (int i = 0; i < 10; ++i)
        {
            if (boxes[i].isSelected())
            {
                ++counter;
            }
        }
        if (counter > 3)
        {
            checkbox = (JCheckBox) e.getSource();
            checkbox.setSelected(false);
            JOptionPane.showMessageDialog(null, "Only select 3 numbers.");
        }

        if(e.getSource()==submit) {
            for (int x = 0; x < boxes.length; x++) {
                if (!boxes[x].isSelected())
                    unchecked.add(boxes[x]);
            }
        }


    }
}
