import javax.swing.*;

public class Java47 {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Hello");
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        JOptionPane.showMessageDialog(frame,
                "Problem writing to backup directory:",
                "Backup problem",
                JOptionPane.WARNING_MESSAGE);
    }
}
