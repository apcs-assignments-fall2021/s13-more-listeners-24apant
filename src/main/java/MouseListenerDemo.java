import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerDemo {
    JFrame frame;
    JPanel panel1;
    JTextField field1;

    public MouseListenerDemo() {
        // Set up the frame
        frame = new JFrame("Mouse Listener Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up components/panels
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(500,500));
        frame.add(panel1, BorderLayout.NORTH);

        field1 = new JTextField();
        frame.add(field1, BorderLayout.SOUTH);

        // Set up MouseListener
        panel1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                field1.setText("X: " + e.getX() + ", Y: " + e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                field1.setText("X: " + e.getX() + ", Y: " + e.getY());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                field1.setText("Hi!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                field1.setText("Bye!");
            }
        });

        // pack and show
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MouseListenerDemo s = new MouseListenerDemo();
    }
}
