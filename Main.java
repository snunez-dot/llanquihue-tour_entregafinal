package cl.llanquihuetour.app;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("LlanquihueTour");

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setContentPane(new MainPanel());

        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setVisible(true);

    }

}