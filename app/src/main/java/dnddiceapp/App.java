/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package dnddiceapp;
import java.awt.*; 
import javax.swing.*;

import org.checkerframework.checker.units.qual.radians;

public class App {
    private static void printWindow() {
        JFrame window = new JFrame("First Window");
        JLabel text = new JLabel("WOW! A Label!", SwingConstants.CENTER);
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        JButton roll = new JButton("ROLL");
        JButton clear = new JButton("CLEAR");
        JTextField input = new JTextField();
        JTextArea recentRoll = new JTextArea();
        JTextArea pastRolls = new JTextArea();

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setVerticalGroup(layout.createSequentialGroup()
            .addComponent(input)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(recentRoll)
                .addComponent(pastRolls))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(roll)
                .addComponent(clear)
            )
        );
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(input)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(recentRoll)
                        .addComponent(roll))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(pastRolls)
                        .addComponent(clear)))
        );
        panel.setLayout(layout);
        panel.setPreferredSize(new Dimension(300, 100));


        window.getContentPane().add(panel, BorderLayout.CENTER);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.pack();
        window.setVisible(true);
    }
    public static void main(String[] args) {
        printWindow();
    }

}

