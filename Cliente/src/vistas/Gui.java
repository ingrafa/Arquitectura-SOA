/*
 * (c) 2019 Ronald Berdúo (v1.0).
 */

package vistas;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Ronald Berdúo - 201504420
 */
public class Gui extends JFrame {

    public Gui() throws HeadlessException {
        setBounds(600,300,280,350);
        add(new Panel());        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
