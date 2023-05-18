import javax.swing.JOptionPane;
public class DialogViewer {
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        String food = JOptionPane.showInputDialog("What is your favorite food?");
        System.out.println(name + food);
    }
}
