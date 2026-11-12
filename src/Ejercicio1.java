public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 6, 8};
        System.out.println(orden(numeros));
    }
    public static String orden(int[] numeros) {
        if (numeros == null || numeros.length <= 1) {
            return "Iguales";
        }

        boolean ascendente = false;
        boolean descendente = false;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] < numeros[i + 1]) {
                ascendente = true;
            } else if (numeros[i] > numeros[i + 1]) {
                descendente = true;
            }
        }

        if (ascendente && descendente) {
            return "Desordenado";
        } else if (ascendente) {
            return "Ascendente";
        } else if (descendente) {
            return "Descendente";
        } else {
            return "Iguales";
        }
    }
}
