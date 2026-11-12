import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {5,7,4,3,1,6};
        System.out.println(mediana(numeros)); //{5, 7, 4, 3, 1, 6} 1 3 4 5 6 7
    }
    public static double mediana (int[] numeros){
        double mediana = 0;
        Arrays.sort(numeros);
        if (numeros.length % 2 == 0){
            int numero1 = numeros[numeros.length / 2];
            int numero2 = numeros[(numeros.length / 2) - 1 ];
            mediana = (numero1 + numero2) / 2.0;
        }else {
            mediana = numeros[numeros.length / 2 ];
        }
        return mediana;
    }
}
