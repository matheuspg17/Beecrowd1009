
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //variaveis
        String nomef;
        double salario, vendas, total;
        
        //entrada de dados
        nomef = leia.nextLine();
        salario = leia.nextDouble();
        vendas = leia.nextDouble();
        
        //processamento
        total = salario + (vendas * 0.15);
        
        //saida de dados
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
