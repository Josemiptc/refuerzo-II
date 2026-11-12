import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer número: ");
        int dividendo = sc.nextInt();
        System.out.println("Escribe el segundo número: ");
        int divisor = sc.nextInt();
        System.out.println(dividirFactoriales(dividendo , divisor));
    }
    public static int dividirFactoriales(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;
        }

        int resultado = 1;
        for (int i = divisor + 1; i <= dividendo; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
