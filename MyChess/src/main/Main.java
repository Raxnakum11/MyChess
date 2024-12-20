package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create the main window (JFrame)
        JFrame window = new JFrame("Simple Chess");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        // Create and add GamePanel (ensure GamePanel is a subclass of JPanel)
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack(); // Adjust the window size to fit its components

        // Center the window on the screen
        window.setLocationRelativeTo(null);
        window.setVisible(true); // Show the window

        gp.launchGame();
    }
}
