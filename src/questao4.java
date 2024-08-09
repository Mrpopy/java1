import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o ipi do produto: ");
        double ipi = s.nextDouble();
        System.out.println("Digite o código da peça: ");
        int cd = s.nextInt();
        System.out.println("Digite o valor unitário da peça: ");
        int vu = s.nextInt();
        System.out.println("Digite a quantidade da peça: ");
        int qu = s.nextInt();
        System.out.println("Digite o código da peça2: ");
        int cd2 = s.nextInt();
        System.out.println("Digite o valor unitário da peça2: ");
        int vu2 = s.nextInt();
        System.out.println("Digite a quantidade da peça2: ");
        int qu2 = s.nextInt();

        double somaTudo = (vu+qu+vu2+qu2)+(ipi/100+1);
        System.out.printf("O valor total a ser pago é %,.2f",somaTudo);

    }
}
