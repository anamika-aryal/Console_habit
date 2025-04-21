package Console_habit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GuiHabitTracker extends JFrame implements ActionListener {

    public GuiHabitTracker() {
        // Set JFrame properties
        setTitle("Habit Tracker");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        JLabel userNameLabel = new JLabel("Username:");
        JTextField userNameField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);

        JButton loginButton = new JButton("Login");

        // Add components to the JFrame
        add(userNameLabel);
        add(userNameField);
        setLayout(new FlowLayout());
        
        add(passwordLabel);
        add(passwordField);

        add(loginButton);
        loginButton.addActionListener(this);

        // Make the frame visible
        setVisible(true);
    }

    @Override

    public void actionPerformed(ActionEvent e){
         new HomePage();
         this.dispose();
    }

    public static void main(String[] args) {
        new GuiHabitTracker();
    }
}
