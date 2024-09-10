
package Basico;
import java.util.Scanner; 

public class condicionais {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira sua idade: ");
        int idade = ler.nextInt();

        if(idade>=18){
            System.out.println("Voce é maior de idade");
        } else{
            System.out.println("Voce é menor de idade");
        }

        ler.close();
    }
}
