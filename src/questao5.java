import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double sm = 1582.00;

        System.out.println("digite seu sálario minimo");
        double su = s.nextDouble();
        double div = su/sm;

        System.out.printf("com seu salário %,.2f você possui %,.2f Salario mínimo",su,div);
    }
}