import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;


public class HotAndColdGame {
    JFrame frame;
    JPanel panel1;
    JTextField field1;
    int[] winCoords = new int[]{randNumber(0, 500),randNumber(0, 500)};
    int[] prevClick = new int[]{-1, -1};

    public HotAndColdGame() {
        // Set up the frame
        frame = new JFrame("Mouse Listener Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up components/panels
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(500,500));
        frame.add(panel1, BorderLayout.NORTH);

        field1 = new JTextField();
        frame.add(field1, BorderLayout.SOUTH);
        field1.setText(Arrays.toString(winCoords));

        // Set up MouseListener
        panel1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                int distToWin = calcDistance(new int[]{e.getX(), e.getY()}, winCoords);
                if(distToWin > 70){
                    field1.setText("Icy Cold!");
                }
                else if (distToWin > 40){
                    field1.setText("Cold!");
                }
                else if (distToWin > 30){
                    field1.setText("Room Temp!");
                }
                else if (distToWin > 20){
                    field1.setText("Luke warm!");
                }
                else if (distToWin > 15){
                    field1.setText("Warm!");
                }
                else if (distToWin > 7){
                    field1.setText("Hot!");
                }
                else if (distToWin > 3){
                    field1.setText("Extremely Hot!");
                }
                else if (distToWin > 0){
                    field1.setText("Scaldingly Hot!");
                }
                else{
                    field1.setText("Perfect!");
                }


                if(prevClick[0] == -1){
                    //This becomes last click
                    prevClick[0] = e.getX();
                    prevClick[1] = e.getY();
                }
                else{
                    //We already have a previous click
                    int prevDist = calcDistance(prevClick, winCoords);
                    int curDist = calcDistance(new int[]{e.getX(), e.getY()}, winCoords);
                    if(curDist < prevDist){
                        field1.setText(field1.getText() + "  Warmer than before!");
                    }
                    else{
                        field1.setText(field1.getText() + "  Colder than before!");
                    }
                    prevClick[0] = e.getX();
                    prevClick[1] = e.getY();
                }

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
        HotAndColdGame s = new HotAndColdGame();
    }

    public static int randNumber(int start, int end){
        return (int)((Math.random() * end - start) + start);
    }
    public static int calcDistance(int[] a, int[] b){
        int absY = Math.abs(b[1] - a[1]);
        int absX = Math.abs(b[0] - a[0]);
        return (int) Math.sqrt((absY * absY) + (absX * absX));
    }
}
