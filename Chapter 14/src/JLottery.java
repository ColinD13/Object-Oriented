import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class JLottery implements ActionListener {
    private JPanel pan;
    private JCheckBox[] checkboxes = new JCheckBox[31];
    private JButton button;
    private JLabel winnings,randoms;

    JLottery()
    {
        //Frame
        JFrame frame = new JFrame("On Demand");
        frame.setLayout(new FlowLayout());
        frame.setSize(500,750);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(350,225,1000,400);

        //Checkboxes

        pan = new JPanel();
        pan.setLayout(new BoxLayout(pan,BoxLayout.X_AXIS));

        for (int i = 0; i < 31; ++i)
        {
            checkboxes[i] = new JCheckBox(String.valueOf(i), false);
            checkboxes[i].addActionListener(this);
            pan.add(checkboxes[i]);
        }

        button = new JButton("Submit");
        button.addActionListener(this);

        winnings = new JLabel();
        randoms = new JLabel();

        frame.add(pan);
        frame.add(button);
        frame.add(randoms);
        frame.add(winnings);

    }

    public static void main(String[] args) {
        new JLottery();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JCheckBox checkbox;
        int counter = 0;
        int i = 6;
        ArrayList<Integer> selected = new ArrayList<>();
        int[] winners = new int[6];
        int inCommon=0;


        // Make sure only 6 checkboxes are selected.
        if (e.getSource() != button)
        {
            for (i = 0; i < 31; ++i)
            {
                if (checkboxes[i].isSelected())
                {
                    ++counter;
                }
            }
            if (counter > 6)
            {
                checkbox = (JCheckBox) e.getSource();
                checkbox.setSelected(false);
                JOptionPane.showMessageDialog(null, "Only select 6 numbers.");
            }
        }
        //Comparing nums
        else
        {
            //Making random nums
            for(int x=0;x<6;x++)
            {
                winners[x]= (int)(Math.random()*31);
            }

            //Checking which nums are selected
            for(int x=0;x<31;x++)
            {
                if(checkboxes[x].isSelected())
                {
                    selected.add(x);
                }
            }

            //Printing random nums to screen
            String r ="";
            for(int x=0;x<6;x++)
            {
                r+=winners[x]+" ";
            }

            randoms.setText(r);
            //Comparing how many nums are in common

            for(int x=0;x<6;x++)
            {
                for(int y=0;y<6;y++)
                {
                    if(selected.get(y)==winners[x])
                        inCommon++;
                }
            }

            if(inCommon<=2)
                winnings.setText("$0");
            else if(inCommon==3)
                winnings.setText("$100");
            else if(inCommon==4)
                winnings.setText("$10000");
            else if(inCommon==5)
                winnings.setText("$50000");
            else if(inCommon==6)
                winnings.setText("$1000000");
        }


    }
}
