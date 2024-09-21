import java.awt.*;
import javax.swing.*;

public class Ex08 extends JFrame {
    private JCheckBox jCheckBox1, jCheckBox2;
    private JButton jButton_OK;
    private JPanel checkJPanel, buttonJPnael;
    private JPanel fieldJPanel;

    public Ex08(){
        super("Eexmplo JCcheckBox");
        //construção de chckJPanel 
        jCheckBox1 =  new JCheckBox ("ITEM1");
        jCheckBox2 =  new JCheckBox("ITEM2");

        checkJPanel = new JPanel(); // CRIA UM PAINEL DE CHECKBOX
        checkJPanel.setLayout(new GridLayout(2,1)); //DEFINI O LAYOUT
        checkJPanel.add(jCheckBox1);
        checkJPanel.add(jCheckBox2);

        //contrução de fieldPanel 
        fieldJPanel = new JPanel();
        fieldJPanel.setLayout( new BorderLayout()); //definição de layout

        jButton_OK = new JButton("OK");
        buttonJPnael = new JPanel();

        buttonJPnael.setLayout( new FlowLayout(FlowLayout.CENTER, 10, 5));
        buttonJPnael.add(jButton_OK);

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
        add(checkJPanel);
        add(buttonJPnael);
    }

    public static void main(String[] args){
        Ex08 teste = new Ex08();
        teste.setDefaultCloseOperation(EXIT_ON_CLOSE);
        teste.setSize(350,150);
        teste.setVisible(true);
    }
}
