import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class LMS extends JFrame implements ActionListener {
    private ArrayList<JCheckBox> checkBoxList;
    private JButton button;
    private JLabel statusLabel;
    private int totalBoxes;
    private int remainingBoxes;

    public LMS() {
        super("Last Man Standing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 5, 10, 10));

        checkBoxList = new ArrayList<>();
        totalBoxes = 10;
        remainingBoxes = totalBoxes;

        for (int i = 0; i < totalBoxes; i++) {
            JCheckBox box = new JCheckBox();
            box.setName(String.valueOf(i));
            checkBoxList.add(box);
            add(box);
        }

        button = new JButton("Next Turn");
        button.addActionListener(this);
        add(button);

        statusLabel = new JLabel("Remaining boxes: " + remainingBoxes);
        add(statusLabel);

        setSize(500, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int playerSelection = getPlayerSelection();
        int computerSelection = getComputerSelection();
        removeSelectedBoxes(playerSelection + computerSelection);

        if (remainingBoxes == 1) {
            statusLabel.setText("You win!");
            button.setEnabled(false);
        } else {
            statusLabel.setText("Remaining boxes: " + remainingBoxes);
        }
    }

    private int getPlayerSelection() {
        int selectedBoxes = 0;

        for (JCheckBox box : checkBoxList) {
            if (box.isSelected()) {
                selectedBoxes++;
            }
        }

        return selectedBoxes;
    }

    private int getComputerSelection() {
        Random random = new Random();
        int maxBoxes = Math.min(3, remainingBoxes - 1);
        return random.nextInt(maxBoxes) + 1;
    }

    private void removeSelectedBoxes(int count) {
        int removedBoxes = 0;

        for (JCheckBox box : checkBoxList) {
            if (box.isSelected() && removedBoxes < count) {
                box.setSelected(false);
                box.setEnabled(false);
                remainingBoxes--;
                removedBoxes++;
            }
        }
    }

    public static void main(String[] args) {
        LMS game = new LMS();
    }
}
