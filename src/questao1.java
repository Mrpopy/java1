import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Digite a sua idade em ano");
        double ano = n.nextDouble();
        double ra = ano*365;
        System.out.print("Digite a sua idade em mes");
        double mes = n.nextDouble();
        double rm = mes*30;
        System.out.println("Digite a sua idade em dias");
        double dia = n.nextDouble();
        double tudo = ra+rm+dia;
        System.out.printf("A soma de tudo é :%,.0f",tudo);
    }
}
