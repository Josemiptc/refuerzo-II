import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Escribe el número que quieras: ");
        numero = sc.nextInt();
        System.out.println(esHyperpar(numero));
    }
    public static boolean esHyperpar(int numero){
        boolean Hyper = true;
        String numerostring = String.valueOf(numero);
        int[] numeros = new int[numerostring.length()];
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = Character.getNumericValue(numerostring.charAt(i));
        }
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 != 0){
                Hyper = false;
                break;
            }
        }
        return Hyper;
    }
}
