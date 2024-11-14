/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copiarypegar;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
import java.io.*;

public class Copiarypegar extends JFrame {

    private JLabel labelpegar = new JLabel("Texto Copiado");
    private JLabel labeltitulo = new JLabel("Texto Copiado");
    private JTextField textcopiar = new JTextField(20);
    private JButton btnCopiar = new JButton("Copiar");
    private JButton btnPegar = new JButton("Pegar");

    public Copiarypegar() {
        setTitle("Copiar Pegar");
        setSize(550, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        // Configuramos los componentes
        add(labeltitulo);
        add(textcopiar);
        add(btnCopiar);
        add(btnPegar);
        add(labelpegar);

        // Acción para el botón "Copiar"
        btnCopiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = textcopiar.getText();
                copiaraportapapeles(texto);
                labelpegar.setText("Texto Copiado: " + texto);
            }
        });

       
        btnPegar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String textoPegado = pegarportapapeles();
                textcopiar.setText(textoPegado);
            }
        });
    }

  
    private void copiaraportapapeles(String text) {
        StringSelection selection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
    }

    private String pegarportapapeles() {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contents = clipboard.getContents(null);
        if (contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            try {
                return (String) contents.getTransferData(DataFlavor.stringFlavor);
            } catch (UnsupportedFlavorException | IOException ex) {
                }
        }
        return "";
    }

    public static void main(String[] args) {
        Copiarypegar ventana = new Copiarypegar();
        ventana.setVisible(true);
    }
}