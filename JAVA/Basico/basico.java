package Basico;
import java.util.Scanner; // para receber as informações

public class basico {
    public static void main (String [] args){
        System.out.println("Hello Word!");

        int idade = 25;
        double altura = 1.70;
        float porcentagem = 1.4F;
        System.out.println("Idade: " + idade + "\n Altura: " + altura + "\n Porcentagem: " + porcentagem); 

        Scanner ler = new Scanner(System.in);
        System.out.println("Insira seu Nome: ");
        String nome = ler.nextLine();

        System.out.println(nome + ", insira um numero 2 numeros"); 
        int num1 =  ler.nextInt();
        int num2 = ler.nextInt(); 
        System.out.println(num1+ "+" + num2 + "="+ (num1+num2) );

        // Fecha o Scanner
        ler.close();
        
    }
}