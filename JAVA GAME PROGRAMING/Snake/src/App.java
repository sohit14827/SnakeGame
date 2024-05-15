import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        int boardwidth = 600;
        int boardHeight = boardwidth;

        JFrame f = new JFrame("Snake");
        f.setVisible(true);
        f.setSize(boardwidth,boardHeight);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snake = new SnakeGame(boardwidth, boardHeight);
        f.add(snake);
        f.pack();
        snake.requestFocus();


    }
}
 