package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class BorderLayoutWindow extends JFrame {
    public BorderLayoutWindow() {
        setTitle("BorderLayoutWindow");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(900, 100, 400, 400);
        JButton button = new JButton("Открыть GridLayoutWindow");
        add(button, BorderLayout.PAGE_START);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GridLayoutWindow myWindow = new GridLayoutWindow();;
            }
        });

        button = new JButton("CENTER");
        button.setPreferredSize(new Dimension(200, 100));
        add(button, BorderLayout.CENTER);
        button = new JButton("LINE_START");
        add(button, BorderLayout.LINE_START);
        button = new JButton("PAGE_END");
        add(button, BorderLayout.PAGE_END);
        button = new JButton("LINE_END");
        add(button, BorderLayout.LINE_END);
        setVisible(true);
    }
}