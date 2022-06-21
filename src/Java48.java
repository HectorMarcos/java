import javax.swing.*;

public class Java48 {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Hello");
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        JOptionPane.showMessageDialog(frame,
                "El total es:\n      120€(IVA 10% no incl.)\n      132€(con IVA incl.)");
    }
}
