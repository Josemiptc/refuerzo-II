import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int dia;
        int mes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un dia de un mes: ");
        dia = sc.nextInt();
        System.out.println("Escribe un mes en número: ");
        mes = sc.nextInt();
        System.out.println(diasHastaNochevieja(dia, mes));

    }
    public static int diasHastaNochevieja(int dia, int mes){
        int quedan = 0;
        int suma = 0;
        int[] meses = {31 , 28 , 31 , 30 , 31 ,30 ,31 ,31 ,31 ,30 ,31 ,30};
        if (mes !=12) {
            for (int i = 0; i <= mes - 2; i++) {
                suma = meses[i] + suma;
            }
            suma = suma + dia;
            quedan = 365 - suma;
        }else {
            quedan = 31 - dia;
        }
        return quedan;
    }
}
