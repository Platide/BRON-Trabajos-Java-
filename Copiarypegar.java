/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copiarypegar;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Alumno
 */
public class Copiarypegar extends JFrame{

    private JLabel labelpegar = new JLabel("Texto Copiado");
    private JLabel labeltitulo = new JLabel("Texto Copiado");
    private JTextField textcopiar = new JTextField(8);
    private JButton btncopiar = new JButton("Copiar");
    private JButton btnpegar = new JButton("Pegar");
    public Copiarypegar(){
        
        setTitle("Copiar Pegar");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Copiarypegar ventana= new Copiarypegar();
        ventana.setVisible(true);
    }
    
}
