/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lesson14;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author akatkar
 */
public class SwingGridFrame extends JFrame implements ActionListener {

    public SwingGridFrame(String caption) {
        super(caption);
        Container myPane = getContentPane();
        myPane.setLayout(new GridLayout(2, 3));
        JButton mybut1 = new JButton("first");
        mybut1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello world");
            }
        }
        );

        JButton mybut2 = new JButton("second");
        mybut2.addActionListener(new ActionForButton2());
        
        JButton mybut3 = new JButton("third");
        
        mybut3.addActionListener(this);
        
        JButton mybut4 = new JButton("forth");
        JButton mybut5 = new JButton("fifth");
        myPane.add(mybut1);
        myPane.add(mybut2);
        myPane.add(mybut3);
        myPane.add(mybut4);
        myPane.add(mybut5);
        setSize(500, 300);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button 3");
    }

    private class ActionForButton2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button 2");
        }

    }
}
