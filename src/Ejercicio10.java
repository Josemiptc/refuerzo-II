import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nº de compartimentos: ");
        int compartimentos = sc.nextInt();
        System.out.println("Escribe cuantos litros máximos entran: ");
        int maxLitros = sc.nextInt();
        System.out.println("Escribe la diferencia:: ");
        int diferencia = sc.nextInt();

        System.out.println(litros(compartimentos , maxLitros , diferencia));
    }
    public static int litros(int compartimentos, int maxLitros, int diferencia) {
        int total = 0;
        int capacidadActual = maxLitros;

        for (int i = 0; i < compartimentos; i++) {
            total += capacidadActual;
            capacidadActual -= diferencia;
        }

        return total;
    }
}
