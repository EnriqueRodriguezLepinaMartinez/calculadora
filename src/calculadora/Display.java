/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Display extends JFrame {

    public Display() {
        super("Calculadora");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Panel1 (pantalla)
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(new JTextField("0",30));
        
        //Panel2 (botones)
        JPanel panel2 = new JPanel();
        GridLayout gl = new GridLayout(4,4);
        panel2.setLayout(gl);
        JButton bt1 = new JButton("1");
        bt1.addActionListener(new Botones());
        panel2.add(bt1);
        JButton bt2 = new JButton("2");
        bt2.addActionListener(new Botones());
        panel2.add(bt2);
        JButton bt3 = new JButton("3");
        bt3.addActionListener(new Botones());
        panel2.add(bt3);
        JButton btsum = new JButton("+");
        btsum.addActionListener(new Botones());
        panel2.add(btsum);
        JButton bt4 = new JButton("4");
        bt4.addActionListener(new Botones());
        panel2.add(bt4);
        JButton bt5 = new JButton("5");
        bt5.addActionListener(new Botones());
        panel2.add(bt5);
        JButton bt6 = new JButton("6");
        bt6.addActionListener(new Botones());
        panel2.add(bt6);
        JButton btmns = new JButton("-");
        btmns.addActionListener(new Botones());
        panel2.add(btmns);
        JButton bt7 = new JButton("7");
        bt7.addActionListener(new Botones());
        panel2.add(bt7);
        JButton bt8 = new JButton("8");
        bt8.addActionListener(new Botones());
        panel2.add(bt8);
        JButton bt9 = new JButton("9");
        bt9.addActionListener(new Botones());
        panel2.add(bt9);
        JButton btmlpcr = new JButton("*");
        btmlpcr.addActionListener(new Botones());
        panel2.add(btmlpcr);
        JButton btc = new JButton("C");
        btc.addActionListener(new Botones());
        panel2.add(btc);
        JButton bt0 = new JButton("0");
        bt0.addActionListener(new Botones());
        panel2.add(bt0);
        JButton btdvdr = new JButton("/");
        btdvdr.addActionListener(new Botones());
        panel2.add(btdvdr);
        JButton btigual = new JButton("=");
        btigual.addActionListener(new Botones());
        panel2.add(btigual);
        
        //AÑADIR LOS PANELES AL CONTENEDOR(CAJA).
        Container cp = getContentPane();
        cp.add(panel1, BorderLayout.NORTH);
        cp.add(panel2, BorderLayout.CENTER);
    }
    
}
