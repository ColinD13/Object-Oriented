import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JSandwich implements ListSelectionListener {

    private final String[] meat = {"Chicken","Turkey","Steak"};
    private final String[] bread = {"Rye","Wheat","White"};
    private JList meats,breads;
    private JLabel t;

    JSandwich()
    {

        //Frame

        JFrame frame = new JFrame("On Demand");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setSize(1000,750);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //Lists

        meats = new JList(meat);
        breads = new JList(bread);

        meats.addListSelectionListener(this);
        breads.addListSelectionListener(this);

        frame.add(meats);
        frame.add(breads);

        //JLabel

        t= new JLabel("Price: $0");
        frame.add(t);


    }

    public static void main(String[] args) {

    new JSandwich();
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int price =0;

        if(meats.getSelectedValue()=="Chicken")
        {
            price+=3;
        }
        else if(meats.getSelectedValue()=="Turkey")
        {
            price+=4;
        }
        else if(meats.getSelectedValue()=="Steak")
        {
            price+=5;
        }

        if(breads.getSelectedValue()=="Rye")
        {
            price+=5;
        }
        else if(breads.getSelectedValue()=="Wheat")
        {
            price+=4;
        }
        else if(breads.getSelectedValue()=="White")
        {
            price+=3;
        }

        t.setText("Price: $"+ price);

    }
}
