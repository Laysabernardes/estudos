import java.awt.*;

public class DemogridLayout extends Frame {
    public static void main (String[] args){
        Frame f = new Frame("FlowLayout");
        f.setSize(500, 400);
        f.setLayout(new GridLayout(5,2));
        f.addWindowListener(new FechaJanela());

        for(int i=1; i<=10;i++){
            f.add(new Button("Botão " + (i+1)));
            f.setVisible(true);

            f.setLayout(new BorderLayout(10,10));

            f.add(new Button("Botão CENTRO"), BorderLayout.CENTER);
            f.add(new Button("Botão BAIXO"), BorderLayout.SOUTH);
            f.add(new Button("Botão ALTO"), BorderLayout.NORTH);
            f.add(new Button("Botão ESQUERDA"), BorderLayout.WEST);
            f.add(new Button("Botão DIREITA"), BorderLayout.EAST);
        }
    }
}
