import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI2 implements ActionListener {
    private JLabel d1,d2,d3,gallons,cost;
    private JPanel panel;
    private JSpinner s1,s2,s3;
    private JButton button;

    GUI2() {

        //Frame
        JFrame frame = new JFrame("On Demand");
        frame.setLayout(new FlowLayout());
        frame.setSize(500,750);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(350,225,800,400);

        //Labels
        d1 = new JLabel("Length");
        d2 = new JLabel("Width");
        d3= new JLabel("Depth");
        gallons = new JLabel("Gallons Needed >>> ");
        cost = new JLabel("Cost >>> $");

        //Spinners
        s1 = new JSpinner();
        s1.setPreferredSize(new Dimension(50,30));
        s2 = new JSpinner();
        s2.setPreferredSize(new Dimension(50,30));
        s3 = new JSpinner();
        s3.setPreferredSize(new Dimension(50,30));

        //Button
        button = new JButton("Calculate");
        button.addActionListener(this);

        //Panel
        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(d1);
        panel.add(s1);
        panel.add(d2);
        panel.add(s2);
        panel.add(d3);
        panel.add(s3);
        panel.add(button);
        panel.add(gallons);
        panel.add(cost);
        frame.add(panel);
    }

    public static void main(String[] args) {
        new GUI2();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        double g,c =0;

        g=(int)(s1.getValue())*(int)(s2.getValue())*(int)(s3.getValue());

        gallons.setText("Gallons Needed >>> "+ g);

        c=g*.0015;

        cost.setText("Cost >>> $"+ c);
    }
}