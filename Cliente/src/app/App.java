/*
 * (c) 2019 Ronald Berdúo (v1.0).
 */

package app;

import vistas.Gui;

/**
 *
 * @author Ronald Berdúo - 201504420
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Gui().setVisible(true);
        });
    }

}
