package Aula03;
import java.awt.*;
  public class Form{
  public static void main(String [] args){
    Frame TesteFrame = new Frame();

    TesteFrame.setTitle("Exemplo de Frame.");
    TesteFrame.setLocation(150,150);
    TesteFrame.setSize(300,300);
    TesteFrame.setBackground(Color.BLUE);

    TesteFrame.setVisible(true);
  }
}