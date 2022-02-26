import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;

public class KeyCounter {
    JFrame frame;
    JButton button1;
    JTextField field1, field2;
    int totalKeyPresses = 0;
    public KeyCounter() {
        // Set up the frame
        frame = new JFrame("Key Counter");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Need to create this before button ActionListener code
        field1 = new JTextField();
        field2 = new JTextField();
        button1 = new JButton("Calculate Total Presses");


        frame.add(field1);
        frame.add(button1);
        frame.add(field2);

        field1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                totalKeyPresses ++;
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field2.setText(totalKeyPresses + "");
                totalKeyPresses = 0;
            }
        });

        // pack and show
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        KeyCounter s = new KeyCounter();
    }
}
