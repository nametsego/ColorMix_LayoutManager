package AntiElite.com;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

    }
}
