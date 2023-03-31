import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class JCapitals implements MouseListener {

    private JList jlist;
    private JPanel panel;
    private JLabel label;

    public JCapitals() {

        //Frame
        JFrame frame = new JFrame("Countries");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setSize(1000, 750);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //Array List

        ArrayList<String> list = new ArrayList<>();

        list.add("USA");
        list.add("Canada");
        list.add("Mexico");
        list.add("Germany");
        list.add("France");
        list.add("Spain");
        list.add("Russia");


        //Adding components
        jlist = new JList(list.toArray());
        jlist.addMouseListener(this);
        label = new JLabel("Capital >>> ");
        panel = new JPanel();
        panel.add(jlist);
        panel.add(label);
        frame.add(panel);

    }

    public static void main(String[] args) {
        new JCapitals();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {


        if (jlist.getSelectedValue() == "USA") {
            label.setText("Capital >>> Washington D.C.");
        } else if (jlist.getSelectedValue() == "Canada") {
            label.setText("Capital >>> Ottowa");
        } else if (jlist.getSelectedValue() == "Mexico") {
            label.setText("Capital >>> Mexico City");
        } else if (jlist.getSelectedValue() =="Germany") {
            label.setText("Capital >>> Berlin");
        } else if (jlist.getSelectedValue() == "France") {
            label.setText("Capital >>> Paris");
        } else if (jlist.getSelectedValue() == "Spain") {
            label.setText("Capital >>> Madrid");
        } else if (jlist.getSelectedValue() == "Russia") {
            label.setText("Capital >>> Moscow");
        }


    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
