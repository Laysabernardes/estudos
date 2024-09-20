package Aula3;
import javax.swing.*;

class Form1swing extends JFrame{
    Form1swing(String titulo, int largura, int altura, int colinic, int linic){
      super(titulo);
      setSize(largura, altura);
      setLocation(colinic, linic);
    }
  public static void main(String[] args){
    Form1swing f = new Form1swing("Meu Primeiro Forms", 300,150,50,50);
    f.setVisible(true);
  }
}
