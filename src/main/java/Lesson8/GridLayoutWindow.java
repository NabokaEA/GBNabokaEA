package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutWindow extends JFrame {

    private Object source;

    public GridLayoutWindow() {
        setBounds(100, 100, 800, 600);
        setTitle("JavaForms-GridLayoutWindow");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton[] jbs = new JButton[10];
        setLayout(new GridLayout(2, 2));
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton("Кнопка " + i);
            add(jbs[i]);
            jbs[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    source = e.getSource();
                    System.out.printf("\n Нажата кнопка"+ source.toString());
                }
            });
        }
        setVisible(true);

    }
}