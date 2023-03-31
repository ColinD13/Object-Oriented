import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JInsurance implements ActionListener {

    private JPanel panel,panel2;
    private ButtonGroup g1;
    private JCheckBox c1,c2,c3,c4;

    private TextField t;
    JInsurance(){

        //Frame
        JFrame frame = new JFrame("Insurance");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setSize(1000, 750);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        c1 = new JCheckBox("HMO");
        c2 = new JCheckBox("PPO");

        g1 = new ButtonGroup();
        g1.add(c1);
        g1.add(c2);

        c3 = new JCheckBox("Dental");
        c4 = new JCheckBox("Vision");
        t = new TextField();
        t.setText("Price >>> ");

        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        c4.addActionListener(this);

        panel = new JPanel();
        panel.add(c1);
        panel.add(c2);
        panel2 = new JPanel();
        panel2.add(c3);
        panel2.add(c4);
        panel2.add(t);

        panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
        panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));


        frame.add(panel);
        frame.add(panel2);

    }

    public static void main(String[] args) {
        new JInsurance();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int price =0;

        if(c1.isSelected())
            price+=200;
        else if(c2.isSelected())
            price+=600;

        if(c3.isSelected())
            price+=75;

        if(c4.isSelected())
            price+=20;

        t.setText("Price >>> " + price);
    }
}
