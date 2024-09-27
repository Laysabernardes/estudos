import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExemploCardLayout extends JFrame implements ActionListener 
{

    CardLayout cardLayout = new CardLayout();
    JPanel panelCards = new JPanel(cardLayout);

    public ExemploCardLayout(){
        JButton btn1 = new JButton("Mostrar Card 1");
        JButton btn2 = new JButton("Mostrar Card 2");
        JButton btn3 = new JButton("Mostrar Card 3");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        JPanel card1 = new JPanel();
        card1.add(new JLabel("Este eh o Card 1"));

        JPanel card2 = new JPanel();
        card2.add(new JLabel("Este eh o Card 2"));

        JPanel card3 = new JPanel();
        card3.add(new JLabel("Este eh o Card 3"));

        panelCards.add(card1, "Card1");
        panelCards.add(card2, "Card2");
        panelCards.add(card3, "Card3");

        JPanel panelButtons = new JPanel();
        panelButtons.add(btn1);
        panelButtons.add(btn2);
        panelButtons.add(btn3);

        add(panelButtons, BorderLayout.NORTH);
        add(panelCards, BorderLayout.CENTER);

        setTitle("Exemplo de CardLayout");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Mostrar Card 1":
                cardLayout.show(panelCards, "Card1");
                break;
            case "Mostrar Card 2":
                cardLayout.show(panelCards, "Card2");
                break;
            case "Mostrar Card 3":
                cardLayout.show(panelCards, "Card3");
                break;
        }
    }

    public static void main(String[] args) {
        new ExemploCardLayout();
    }
}