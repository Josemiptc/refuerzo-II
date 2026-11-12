import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe en que canal estás: ");
        int desde = sc.nextInt();
        System.out.println("Escribe a que canal quieres ir: ");
        int hasta = sc.nextInt();

        System.out.println(canales(desde , hasta));
    }
    public static int canales(int desde , int hasta){
        int aux = desde;
        int contadorsumar = 0;
        int contadorestar = 0;
        do {
            desde = desde + 1;
            if (desde == 100){
                desde = 1;
            }
            contadorsumar = contadorsumar + 1;
        }while (desde != hasta);
        desde = aux;
        do {
            desde = desde - 1;
            if (desde == 0){
                desde = 99;
            }
            contadorestar = contadorestar + 1;
        }while (desde != hasta);
        if (contadorestar > contadorsumar){
            return contadorsumar;
        }else {
            return  contadorestar;
        }
    }
}
