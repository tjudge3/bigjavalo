import javax.swing.*;

public class StrInput {
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Enter Price:");
        double price = Double.parseDouble(input);
        JOptionPane.showMessageDialog(null, "Price: " + price);
    }
}
