package com.skxawng.swing;

import javax.swing.*;

public class Ejercicio01 {

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //Apariencia de APPS
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Velit sed ullamcorper morbi tincidunt ornare massa eget. Amet commodo nulla facilisi nullam vehicula ipsum a arcu. Odio euismod lacinia at quis risus sed vulputate odio ut. Sollicitudin tempor id eu nisl nunc mi ipsum faucibus. Tellus elementum sagittis vitae et leo duis. Neque sodales ut etiam sit amet nisl. Ridiculus mus mauris vitae ultricies leo integer malesuada nunc vel. Tortor aliquam nulla facilisi cras fermentum odio eu feugiat pretium. Feugiat pretium nibh ipsum consequat nisl vel pretium lectus. Tempor nec feugiat nisl pretium fusce id velit. In ornare quam viverra orci. Velit euismod in pellentesque massa placerat. Donec ac odio tempor orci dapibus ultrices in.";
        String miTexto = texto.strip();

        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);

        jFrame.setTitle("Mi primera ventana con Swing.");
        jFrame.setSize(600, 400);

        JLabel jLabelSaludo = new JLabel();
        jLabelSaludo.setText(texto);
        jFrame.add(jLabelSaludo);
        jLabelSaludo.setBounds(10, 10, 580, 10);

        JButton jButtonAceptar = new JButton();
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setBounds(440, 305, 140, 50);
        jFrame.add(jButtonAceptar);


        //acción al botón
        jButtonAceptar.addActionListener(
                actionEvent -> {
                   // System.out.println("Diste click en botón ACEPTAR");
                    ImprimirMensaje();
                }
        );

    //JMenu

        jFrame.setVisible(true);
    }
    public static void ImprimirMensaje() {
        System.out.println("Este es un mensaje.");
    }
}
