import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.awt.event.KeyEvent.*;


public class SudokuButton extends JButton implements KeyListener {
    public SudokuButton() {
        super(" ");
        this.addKeyListener(this);
    }
    
    public SudokuButton(String label) {
        super(label);
        this.addKeyListener(this);
    }

    // when the key goes down
    @Override
    public void keyPressed(KeyEvent e) {
        // To interact with the current SudokuButton, use: this
        // For instance, if we wanted to get the text of the
        // current button, we'd say: this.getText()
    }

    // when the key goes up
    @Override
    public void keyReleased(KeyEvent e) {

    }

    // keyTyped only works for characters that can be typed (like letters)
    // so we don't use it often
    @Override
    public void keyTyped(KeyEvent e) {

    }

    // Don't worry about this, this just changes the minimum size of a button
    @Override
    public Dimension getPreferredSize() {
        Dimension size = new Dimension();
        size.width = 50;
        size.height = 50;
        return size;
    }
}
