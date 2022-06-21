import javax.swing.*;

public class Java49 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        String name = "";
        name = JOptionPane.showInputDialog(frame, "What's ur name?");
        if(name == null || name.equals("")){
            JOptionPane.showMessageDialog(frame,
                    "Name error",
                    "Name error",
                    JOptionPane.WARNING_MESSAGE);
            main(args);
        }else {
            JOptionPane.showMessageDialog(frame,"Hello "+name+"", "Hello", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}