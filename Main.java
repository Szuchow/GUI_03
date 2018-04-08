package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class HelloWorldView extends JFrame {
    HelloWorldView() {
        super();



        setTitle("SUMATOR");
        setVisible(true);


        JLabel jLabel1 = new JLabel("a: ");
        JLabel jLabel2 = new JLabel("b: ");
        JButton jButton = new JButton("a + b");

        JTextField TextBarA = new JTextField("");
        TextBarA.setPreferredSize(new Dimension(100, 20));
        TextBarA.getText();


        JTextField TextBarB = new JTextField("");
        TextBarB.setPreferredSize(new Dimension(100, 20));
        TextBarB.getText();
        //int i = Integer.parseInt("23");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String x1 = TextBarA.getText().trim();
                String x2 = TextBarB.getText().trim();
                try {
                    double value = Double.parseDouble(x1) + Double.parseDouble(x2);
                    Double valueF = Double.valueOf(value);
                    System.out.println(valueF);
                    //int sum = Integer.parseInt(x1) + Integer.parseInt(x2);
                    System.out.println(value);
                }
                catch(java.lang.NumberFormatException e1) {
                    System.out.println("Podano błędny format!");
                }



            }
        });

        this.getContentPane().add(jLabel1);
        this.getContentPane().add(TextBarA);
        this.getContentPane().add(jLabel2);
        this.getContentPane().add(TextBarB);
        this.getContentPane().add(jButton);



        this.setLayout(new FlowLayout());

        pack();
        setSize(500, 300);
        setLocationRelativeTo(null);
    }
}

public class Main {

    public static void main(String[] args) {
        new HelloWorldView();
    }

}
//.trim()
