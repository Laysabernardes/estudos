import java.awt.*;
import javax.swing.*;

public class Ex09 extends JFrame {
    private JButton okJButton;
    private JComboBox colorJComboBox;
    private JPanel panell;

    public Ex09() {
        super("Caixa de Seleção");

        setLayout(new BorderLayout());

        colorJComboBox = new JComboBox();
        colorJComboBox.addItem("ITEM 1");
        colorJComboBox.addItem("ITEM 2");
        colorJComboBox.addItem("ITEM 3");
        add(colorJComboBox, BorderLayout.NORTH);

        okJButton = new JButton("OK");
        panell = new JPanel();
        panell.add(okJButton);
        add(colorJComboBox, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Ex09 exJComboBox = new Ex09();
        exJComboBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        exJComboBox.setSize(200, 100);
        exJComboBox.setVisible(true);
    }
}
