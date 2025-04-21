package Console_habit;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HomePage extends JFrame implements ActionListener{
   
        JButton addHabit = new JButton("Add Habit");
        JButton deleteHabit = new JButton("Delete Habit");
        JButton viewStreak = new JButton("View Streak");
        JButton updateStatus= new JButton("Update Status");
        JButton viewHabbit= new JButton("View Habits");
        
        public HomePage() {
        setSize(500, 600);

        JLabel title = new JLabel("Welcome to Habit Tracker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setAlignmentX(Component.CENTER_ALIGNMENT); 

        // Set layout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Add title
        add(title);
        add(Box.createVerticalStrut(20)); // Add space after the title

        // Add buttons with gaps
        add(addHabit);
        add(Box.createVerticalStrut(15)); // Add space between buttons
        add(deleteHabit);
        add(Box.createVerticalStrut(15)); // Add space between buttons
        add(viewStreak);
        add(Box.createVerticalStrut(15));
        add(updateStatus);
        add(Box.createVerticalStrut(15));
        add(viewHabbit);
        add(Box.createVerticalStrut(15));

        // Center-align buttons
        addHabit.setAlignmentX(Component.CENTER_ALIGNMENT);
        deleteHabit.setAlignmentX(Component.CENTER_ALIGNMENT);
        viewStreak.setAlignmentX(Component.CENTER_ALIGNMENT);
        updateStatus.setAlignmentX(Component.CENTER_ALIGNMENT);
        viewHabbit.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        setVisible(true);

        addHabit.addActionListener(this);
        deleteHabit.addActionListener(this);
    }
    @Override

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==addHabit){
            String habit= JOptionPane.showInputDialog(getContentPane(), "Write a habit");
            if(habit != null && !habit.trim().isEmpty()){
                JOptionPane.showMessageDialog(getContentPane(), "Habit entered ="+habit);
                 AddHabit ad= new AddHabit();
                 ad.insert(habit,"incomplete",0);
            }else{
                JOptionPane.showMessageDialog(getContentPane(), "No habit entred");
            }

        }
        if(e.getSource()==deleteHabit){
            int r=0;
            String delHabit= JOptionPane.showInputDialog(getContentPane(), "Delete a habit");
            if(delHabit != null && !delHabit.trim().isEmpty()){
                DeleteHabit dh= new DeleteHabit();
                 r=dh.delete(delHabit);
            }
            if(r == 1){
                JOptionPane.showMessageDialog(getContentPane(), "Habit Deleted ="+delHabit);
            }else{
                JOptionPane.showMessageDialog(getContentPane(), "No such habit found");
            }
         
    }
}
}
