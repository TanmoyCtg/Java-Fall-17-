package spaceinvaders;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;


public class Game extends Canvas {
    private BufferStrategy strategy;
    private boolean gameRunning = true;
    private ArrayList entities = new ArrayList();
    private ArrayList removeList = new ArrayList();
    private Entity ship;
    private double modeSpeed = 300;
    private long lastFire = 0;
    private long firingInterval = 500;
    private int alienCount;
    private String message = "";
    private boolean waitingForKeyPress = true;
    private boolean leftPressed = false;
    private boolean rightPressed = false;
    private boolean firePressed = false;
    private boolean logicRequiredThisLoop = false;

    // constructor and set it running
    public Game() {
        JFrame container = new JFrame("SPACE SHOOTER");
        JPanel panel =(JPanel) container.getContentPane();
        panel.setPreferredSize(new Dimension(1000,800));
        panel.setLayout(null);
        setBounds(0,0,800,600);
        panel.add(this);
        setIgnoreRepaint(true);

        container.pack();
        container.setResizable(false);
        container.setVisible(true);
        // we add a listener so user can close the window.
        // if they exit the game.
        container.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // when we keypressed it works
        addKeyListener(new KeyInputHandler());
        requestFocus();

        createBufferStrategy(2);
        strategy = getBufferStrategy();
        initEntities();
    }
    // start fresh. clear out previous data and create a new set
    private void startGame(){
        entities.clear();
        initEntities();

        leftPressed = false;
        rightPressed = false;
        firePressed = false;
    }
    // entites means here pictures ship and aliens.

    private void initEntities(){
        ship = new ShipEntity(this, "sprites/ship.gif",370,550);
        entities.add(ship);
    }


    public static void main(String[] argv) {
        Game g = new Game();
        //g.gameLoop();

    }
}
