import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HedgeYourBet implements ActionListener {

    private JCheckBox q1_1,q1_2,q1_3,q2_1,q2_2,q2_3,q3_1,q3_2,q3_3,q4_1,q4_2,q4_3,q5_1,q5_2,q5_3;
    private JPanel one,two,three,four,five,six;
    private JButton check;
    private JLabel q1,q2,q3,q4,q5,score;
    HedgeYourBet()
    {
        //Frame

        JFrame frame = new JFrame("On Demand");
        frame.setLayout(new FlowLayout());
        frame.setSize(500,750);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(350,225,800,400);

        //Q1
        q1_1 = new JCheckBox("Sidney Crosby");
        q1_2 = new JCheckBox("Kris Letang");
        q1_3 = new JCheckBox("Evgeni Malkin");
        q1 = new JLabel("Who has the most career points?");

        one = new JPanel();

        one.add(q1);
        one.add(q1_1);
        one.add(q1_2);
        one.add(q1_3);

        one.setLayout(new BoxLayout(one,BoxLayout.X_AXIS));

        //Q2

        q2_1 = new JCheckBox("Sidney Crosby");
        q2_2 = new JCheckBox("Kris Letang");
        q2_3 = new JCheckBox("Evgeni Malkin");
        q2 = new JLabel("Who is from Russia?");

        two = new JPanel();

        two.add(q2);
        two.add(q2_1);
        two.add(q2_2);
        two.add(q2_3);

        two.setLayout(new BoxLayout(two,BoxLayout.X_AXIS));

        //Q3

        q3_1 = new JCheckBox("Sidney Crosby");
        q3_2 = new JCheckBox("Kris Letang");
        q3_3 = new JCheckBox("Evgeni Malkin");
        q3 = new JLabel("Who scored the golden goal?");

        three = new JPanel();

        three.add(q3);
        three.add(q3_1);
        three.add(q3_2);
        three.add(q3_3);

        three.setLayout(new BoxLayout(three,BoxLayout.X_AXIS));

        //Q4

        q4_1 = new JCheckBox("Sidney Crosby");
        q4_2 = new JCheckBox("Kris Letang");
        q4_3 = new JCheckBox("Evgeni Malkin");
        q4 = new JLabel("Who is a Defenseman?");

        four = new JPanel();

        four.add(q4);
        four.add(q4_1);
        four.add(q4_2);
        four.add(q4_3);

        four.setLayout(new BoxLayout(four,BoxLayout.X_AXIS));

        //Q5

        q5_1 = new JCheckBox("Sidney Crosby");
        q5_2 = new JCheckBox("Kris Letang");
        q5_3 = new JCheckBox("Evgeni Malkin");
        q5 = new JLabel("Who wears number 58?");

        five = new JPanel();

        five.add(q5);
        five.add(q5_1);
        five.add(q5_2);
        five.add(q5_3);

        five.setLayout(new BoxLayout(five,BoxLayout.X_AXIS));

        //Score and Submit

        score = new JLabel("");

        six = new JPanel();
        check = new JButton("Submit");
        check.addActionListener(this);

        six.add(check);
        six.add(score);

        six.setLayout(new BoxLayout(six,BoxLayout.X_AXIS));

        //Adding

        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);
        frame.add(five);
        frame.add(six);


    }

    public static void main(String[] args) {
        new HedgeYourBet();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int points = 0;

        //Q1
        if(q1_1.isSelected() && q1_2.isSelected() && q1_3.isSelected())
            points++;
        else if(q1_1.isSelected() && q1_2.isSelected())
            points+=2;
        else if(q1_1.isSelected() && q1_3.isSelected())
            points+=2;
        else if(q1_1.isSelected())
            points+=5;
        else
            points+=0;

        //Q2
        if(q2_1.isSelected() && q2_2.isSelected() && q2_3.isSelected())
            points++;
        else if(q2_3.isSelected() && q2_1.isSelected())
            points+=2;
        else if(q2_3.isSelected() && q2_2.isSelected())
            points+=2;
        else if(q2_3.isSelected())
            points+=5;
        else
            points+=0;

        //Q3
        if(q3_1.isSelected() && q3_2.isSelected() && q3_3.isSelected())
            points++;
        else if(q3_1.isSelected() && q3_2.isSelected())
            points+=2;
        else if(q3_1.isSelected() && q3_3.isSelected())
            points+=2;
        else if(q3_1.isSelected())
            points+=5;
        else
            points+=0;

        //Q4
        if(q4_1.isSelected() && q4_2.isSelected() && q4_3.isSelected())
            points++;
        else if(q4_2.isSelected() && q4_1.isSelected())
            points+=2;
        else if(q4_2.isSelected() && q4_3.isSelected())
            points+=2;
        else if(q4_2.isSelected())
            points+=5;
        else
            points+=0;

        //Q5
        if(q5_1.isSelected() && q5_2.isSelected() && q5_3.isSelected())
            points++;
        else if(q5_2.isSelected() && q5_1.isSelected())
            points+=2;
        else if(q5_2.isSelected() && q5_3.isSelected())
            points+=2;
        else if(q5_2.isSelected())
            points+=5;
        else
            points+=0;

        //Message

        if(points>21)
            score.setText("Fantastic");
        else if(points>15)
            score.setText("Very Good");
        else
            score.setText("Just OK");
    }
}
