import javax.swing.*;

public class SudokuBoard {
    // Swing instance variables
    JFrame frame;
    JPanel[] rows;
    SudokuButton[][] buttons;

    public SudokuBoard() {
        // 1. Create the frame (the window that will pop up)
        frame = new JFrame("Sudoku");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame
        // Create an array of 9 JPanels, representing each row
        rows = new JPanel[9];

        // Create a 2D array of JButtons, representing each button
        buttons = new SudokuButton[9][9];

        for (int row = 0; row < 3; row++) {

            JPanel rowPanel = new JPanel();

            for (int col = 0; col < 3; col++) {
                SudokuButton currentButton = new SudokuButton();
                rowPanel.add(currentButton);
                buttons[row][col] = currentButton;
            }

            rows[row] = rowPanel;
            frame.add(rowPanel);
        }

        // 4. Size the frame
        frame.pack();

        // 5. Show the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SudokuBoard sb = new SudokuBoard();
    }
}
