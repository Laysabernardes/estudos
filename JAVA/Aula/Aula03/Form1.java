package Aula3;
import java.awt.*;

class Form1 extends Frame{
  Form1 (String titulo, int largura, int altura, int colinic, int linic){
    super(titulo);
    setSize(largura, altura);
    setLocation(colinic, linic);
  }

  public static void main(String[] args){
    Form1 f = new Form1("Meu Primeiro Forms", 300, 150, 50, 50);
    f.setVisible(true);
  }
}


