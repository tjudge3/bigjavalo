import javax.swing.*;

public class StrInput {
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Enter Price:");
        double price = Double.parseDouble(input);
        final double TAX_RATE = 8.5;
        price = price * (1 + TAX_RATE / 100);
        JOptionPane.showMessageDialog(null, "Price: " + price);
    }
}
