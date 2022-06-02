/*
 * (c) 2019 Ronald Berdúo (v1.0).
 */
package vistas;

import controladores.Servidor;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Ronald Berdúo - 201504420
 */
public class Gui extends JFrame {

    private final JTextArea areatexto;

    public Gui() {
        setBounds(600,300, 280,350);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        areatexto = new JTextArea();
        panel.add(areatexto, BorderLayout.CENTER);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void iniciarServidor() {
        Servidor servidor = new Servidor(areatexto);
        servidor.start();
    }
}
