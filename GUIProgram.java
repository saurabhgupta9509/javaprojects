import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIProgram extends JFrame {

    private JButton button;
    private JLabel label;

    public GUIProgram() {
        super("GUI Program");

        button = new JButton("Click me!");
        label = new JLabel("Hello, world!");

        add(button);
        add(label);

        button.addActionListener((ActionListener) new ActionListener() {
        
            public void actionPerformed(ActionEvent e) {
                label.setText("You clicked the button!");
            }
        });

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUIProgram();
    }
}