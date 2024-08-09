import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        double vr = (8+9+7)/3;
        double vr2 = (4+5+6)/3;
        double tudo = vr + vr2;
        double extra = tudo/2;
        System.out.printf("A media das medias é de , %,.1f o resultado",extra);
    }
}
