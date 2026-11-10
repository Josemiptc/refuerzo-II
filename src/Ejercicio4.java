import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {1,3,5,1,5,6,8,3,1,2,1,1};
        System.out.println( moda(numeros));
    }
    public static int moda(int[] numeros){
        Map<Integer, Integer> diccionario = new HashMap<>();
        int numero = 0;
        int cantidad2 = 0;
        int maximo = 0;
        for (int i = 0; i < numeros.length; i++){
            if (diccionario.containsKey(numeros[i])){
                int cantidad = diccionario.get(numeros[i]);
                diccionario.put(numeros[i], cantidad +1 );
            }else {
                diccionario.put(numeros[i], 1 );
            }

            cantidad2 = diccionario.get(numeros[i]);
            if (cantidad2 > maximo){
                maximo  = cantidad2;
                numero = numeros[i];
            }
        }
        return numero;
    }
}
