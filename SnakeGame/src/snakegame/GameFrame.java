package snakegame;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame(){
        Gamepanel panel = new Gamepanel();
        this.add(panel);
        this.setTitle("snakegame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}