

import java.awt.event.*;
import javax.swing.*;

public class Main {
  static JFrame frame;
  static Puzzle puzzle;

  public static void main(String[] args) {
    // Create a jframe
    frame = new JFrame("Puzzlegame");
    frame.setSize(327, 327);

    puzzle = new Puzzle(new ImageIcon(Main.class.getResource("picture 2.png")).getImage());

    frame.add(puzzle);

    frame.setLocationRelativeTo(null);

    frame.setResizable(false);
    frame.setVisible(true);

    frame.addMouseListener(
        new MouseAdapter() {
          public void mousePressed(MouseEvent e) {
            if (!puzzle.started) puzzle.start();
            else if (puzzle.mixing) puzzle.mixing = false;
            else puzzle.onClick(e);
          }
        });
  }
}
