import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// This should be a simple game where players are rated on how close they are able to click to
// the major diagonal (the diagonal from the top left to the bottom right)
// Each time the player clicks, they should be rated on how close they were to the diagonal
// in terms of the distance formula. For instance:
// * > 50: Bad!
// * 20 - 50: Okay
// * 10 - 20: Good
// * 5 - 10: Great
// * 1 - 5: Excellent
// * 0: Perfect!

public class DiagonalGame {
    JFrame frame;
    JPanel panel1;
    JTextField field1;
    int[] firstClick, secondClick;


    public DiagonalGame() {
        // Set up the frame
        frame = new JFrame("Mouse Listener Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up components/panels
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(500,500));
        frame.add(panel1, BorderLayout.NORTH);
        firstClick = new int[2];
        secondClick = new int[2];
        field1 = new JTextField();
        frame.add(field1, BorderLayout.SOUTH);

        // Set up MouseListener
        panel1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                int diagDist = Math.abs(e.getX() - e.getY());
                if(diagDist > 50){
                    field1.setText("Bad!");
                }
                else if (diagDist > 20){
                    field1.setText("Okay!");
                }
                else if (diagDist > 10){
                    field1.setText("Good!");
                }
                else if (diagDist > 5){
                    field1.setText("Excellent!");
                }
                else if (diagDist > 0){
                    field1.setText("Almost Perfect!");
                }
                else{
                    field1.setText("Perfect! ");
                }
                field1.setText(field1.getText() + "  X: " + e.getX() + ", Y: " + e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        // pack and show
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        DiagonalGame s = new DiagonalGame();
    }
}
