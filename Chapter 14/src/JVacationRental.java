import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JVacationRental extends Frame implements ActionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        int price=0;

        frame.setTitle("Vacation Rental's");
        frame.setSize(1000,750);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout());

        //Location Button

        ButtonGroup location = new ButtonGroup();
        JPanel locationP = new JPanel();

        JRadioButton parkside = new JRadioButton("Parkside >>> $600");
        JRadioButton poolside = new JRadioButton("Poolside >>> $750");
        JRadioButton lakeside = new JRadioButton("Lakeside >>> $825");

        location.add(parkside);
        location.add(poolside);
        location.add(lakeside);
        locationP.add(parkside);
        locationP.add(poolside);
        locationP.add(lakeside);
        parkside.addActionListener(e -> parkside.isSelected());
        poolside.addActionListener(e -> poolside.isSelected());
        lakeside.addActionListener(e -> lakeside.isSelected());

        frame.add(locationP);

        ///Bedroom Numbers

        ButtonGroup beds = new ButtonGroup();
        JPanel bedsP = new JPanel();

        JRadioButton one = new JRadioButton("One Bedroom");
        JRadioButton two = new JRadioButton("Two Bedrooms >>> + $75");
        JRadioButton three = new JRadioButton("Three Bedrooms >>> + $150");

        beds.add(one);
        beds.add(two);
        beds.add(three);
        bedsP.add(one);
        bedsP.add(two);
        bedsP.add(three);
        one.addActionListener(e -> one.isSelected());
        two.addActionListener(e -> two.isSelected());
        three.addActionListener(e -> three.isSelected());


        frame.add(bedsP);


        //Meals

        ButtonGroup meals = new ButtonGroup();
        JPanel mealsP = new JPanel();

        JRadioButton mealsYes = new JRadioButton("No Meals");
        JRadioButton mealsNo = new JRadioButton("Yes Meals >>> + $200");

        meals.add(mealsYes);
        meals.add(mealsNo);
        mealsP.add(mealsYes);
        mealsP.add(mealsNo);
        mealsYes.addActionListener(e -> mealsYes.isSelected());
        mealsNo.addActionListener(e -> mealsNo.isSelected());

        frame.add(mealsP);

        //Calculate button

        JButton calc = new JButton("Calculate Price");

        frame.add(calc);
        frame.add(new TextField("Price = "));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
