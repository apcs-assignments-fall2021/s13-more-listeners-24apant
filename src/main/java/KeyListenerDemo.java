import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.awt.event.KeyEvent.*;


public class KeyListenerDemo {
    JFrame frame;
    JButton button1;
    JTextField field1;

    public KeyListenerDemo() {
        // Set up the frame
        frame = new JFrame("Key Listener Example");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Need to create this before button ActionListener code
        field1 = new JTextField();
        button1 = new JButton("Click me, then type");

        frame.add(button1);
        frame.add(field1);

        button1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                field1.setText(e.getKeyCode() + "");
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        // pack and show
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        KeyListenerDemo s = new KeyListenerDemo();
    }
}
