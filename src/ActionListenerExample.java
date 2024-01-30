import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerExample extends JFrame implements ActionListener {

    public ActionListenerExample() {
        setTitle("ActionListener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        // Creating buttons for it can you see the change

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");

        // Adding ActionListener to each button
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);

        // Adding buttons to different Border layouts
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        add(button3, BorderLayout.WEST);
        add(button4, BorderLayout.EAST);
        add(button5, BorderLayout.CENTER);
    }

    // ActionPerformed method for button clicks
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        JOptionPane.showMessageDialog(this, "Button " + command + " Clicked!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ActionListenerExample().setVisible(true);
        });
    }
}
