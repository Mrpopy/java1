import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double N = n.nextDouble();
        double ant = N - 1;
        double suc = N + 1;
        System.out.printf("O resultado do antecessor é de %,.0f e o sucessor é %,.0" +
                "f ",ant , suc);
    }
}
