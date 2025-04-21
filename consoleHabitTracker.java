package Console_habit;
import java.util.*;

class Habit{
    int sn;
    String habitName;
    String status;
    int streaks=0; 

    public Habit(int sn, String habitName, String status){
        this.sn=sn;
        this.habitName=habitName;
        this.status=status;
    }
    
    void updateStatus(String ans) {
        if (ans.equalsIgnoreCase("yes")|| ans.startsWith("y")) {
            System.out.println("Status updated to completed");
            if (!status.equalsIgnoreCase("completed")) {
                streaks++; // Increment streak only if status changes
            }
            status = "completed";
        } else {
            System.out.println("Status remains incomplete");
        }
    }
    int getStreaks(String status){
        return streaks;
    }
}

public class consoleHabitTracker {
    public static void main(String[] args) throws Exception {
        int n=1;
    String habitName,s="incomplete";

    Scanner scan= new Scanner(System.in);
    
    System.out.println("Enter the habit:");
    habitName = scan.nextLine();
    
    Habit h= new Habit(n, habitName, s);
    
    System.out.println("Did you finish your task?");
    String ans= scan.next();

    h.updateStatus(ans);

    System.out.println("View your Streaks? y/n");
    String a=scan.next();

    if(a.equalsIgnoreCase("y")){
        System.out.println("Your Streaks is on going for "+ h.getStreaks(h.status));
    }
    scan.close();
    }
    
    
}


