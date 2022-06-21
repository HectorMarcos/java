import javax.swing.*;
import java.util.Objects;

public class Java50 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        String option = null;
        option = JOptionPane.showInputDialog(frame, "Queue Operations Menu\n1.Insert\n2.Delete\n3.Display\n4.Exit\n\nEnter your option");
        if (option == null || option.equals("")) {
            JOptionPane.showMessageDialog(frame,
                    "Error",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            main(args);
        }
        if (!option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4")) {
            JOptionPane.showMessageDialog(frame,
                    "Error",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
            main(args);
        }
        if (option.equals("1")) {
            JOptionPane.showMessageDialog(frame,
                    "Insert",
                    "Insert",
                    JOptionPane.WARNING_MESSAGE);
            main(args);
        }
        if (option.equals("2")) {
            JOptionPane.showMessageDialog(frame,
                    "Delete",
                    "Delete",
                    JOptionPane.ERROR_MESSAGE);
            main(args);
        }
        if (option.equals("3")) {
            JOptionPane.showMessageDialog(frame,
                    "Display",
                    "Display",
                    JOptionPane.INFORMATION_MESSAGE);
            main(args);
        }
        if (option.equals("4")) {
            JOptionPane.showMessageDialog(frame,
                    "Bye!",
                    "Bye!",
                    JOptionPane.INFORMATION_MESSAGE);

        }
    }
}