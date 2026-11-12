import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] numeros = {4, 5, 2, 1};
        System.out.println(cualFalta(numeros));
    }

    public static int cualFalta(int[] numeros) {
        int diferencia;
        int falta = 0;
        boolean falta_alguno = false;
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length - 1; i++) {
            diferencia = numeros[i + 1] - numeros[i];
            if (diferencia != 1) {
                falta = numeros[i + 1] - 1; // You could also use numeros[i] + 1
                falta_alguno = true;
                break;
            }
        }

        if (falta_alguno) {
            return falta;
        } else {
            return -1;
        }
    }
}