package lesson7;

import javax.swing.*;
import java.awt.*;

public class Playground extends JPanel {

    public static final int GAME_M_HVH = 1;
    public static final int GAME_M_HVC = 0;
    private Settings settings;


    Playground() {
        setBackground(new Color(110,90,200));

    }

    static void startNewGameSet(int gMode, int X_SIZE, int Y_SIZE, int TO_WIN_SEQ) {
        System.out.println("Starting new game with field: "+X_SIZE+"x"+Y_SIZE+". Win sequence: "+TO_WIN_SEQ+". Game mode: "+gMode);

    }
}
