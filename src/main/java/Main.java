
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nomef;
        double salario, vendas, total;
        
        nomef = leia.nextLine();
        salario = leia.nextDouble();
        vendas = leia.nextDouble();
        
        total = salario + (vendas * 0.15);
        
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
