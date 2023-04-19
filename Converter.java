package sampleApp1;

import javax.swing.*;//need for SWING class
import java.awt.*;
import java.awt.event.*;//need for ActionListener Interface

public class Converter extends JFrame {
    final int WIDTH = 350;
    final int HEIGHT = 250;
    JPanel panel;
    JLabel messageLabel;
    JTextField usdTextField;
    JButton submitButton;
    JButton redBackground;
    JButton greenBackground;
    JButton blueBackground;


    public Converter() {
        setTitle("Convert USD to VND");
        setSize(WIDTH, HEIGHT);
        buildPanel();
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        panel.setBackground(Color.magenta);
        submitButton.setBackground(Color.ORANGE);
        submitButton.setForeground(Color.BLACK);
    }

    private void buildPanel() {
        messageLabel = new JLabel("enter the USD currency");
        usdTextField = new JTextField(10);
        submitButton = new JButton("Submit");
        redBackground = new JButton("red");
        redBackground.addActionListener(new redBackgroundListener());
        greenBackground = new JButton("green");
        greenBackground.addActionListener(new greenBackgroundListener());
        blueBackground = new JButton("blue");
        blueBackground.addActionListener(new blueBackgroundListener());
        submitButton.addActionListener(new submitButtonListener());
        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(usdTextField);
        panel.add(submitButton);
        panel.add(redBackground);
        panel.add(greenBackground);
        panel.add(blueBackground);
    }

    private class submitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            final double exchangeRate = 23500;
            String input;
            double vnd;
            input = usdTextField.getText();
            vnd = Double.parseDouble(input) * exchangeRate;//convert string value to double
            JOptionPane.showMessageDialog(null, input + "usd = " + vnd + "vnd");
        }

    }

    //set background color for panel
    private class redBackgroundListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.red);
        }
    }

    private class greenBackgroundListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.green);
        }
    }

    private class blueBackgroundListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.blue);
        }
    }
}
