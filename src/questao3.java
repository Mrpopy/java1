import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite seu saldo: ");
        double Saldo = s.nextDouble();
        double SaldoRj = Saldo*1.01;
        System.out.printf("O saldo com reajuste é: %,.1f",SaldoRj);
    }
}
