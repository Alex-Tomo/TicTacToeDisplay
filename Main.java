import javax.swing.*;

public class Main extends JFrame {

    private static Main main = new Main();
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;

    public static void main(String[] args) {
        Screen screen = new Screen();

        main.setTitle("Tic-Tac-Toe");
        main.setSize(WIDTH, HEIGHT);
        main.setLocationRelativeTo(null);
        main.setResizable(false);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        main.add(screen);

        main.setVisible(true);
    }
}
