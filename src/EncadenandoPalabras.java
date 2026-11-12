import java.util.Scanner;

public class EncadenandoPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe algo: ");
        String linea = sc.nextLine().trim();
        System.out.println(jugar(linea));
    }
    public static boolean jugar(String linea) {
        linea = linea.trim();
        if (linea.length() > 0) {
            String[] palabras = linea.toLowerCase().split("\\s+");

            for (int i = 0; i < palabras.length - 1; i++) {
                String palabraActual = palabras[i];
                String palabraSiguiente = palabras[i + 1];

                String sufijo = palabraActual.substring(palabraActual.length() - 2);
                String prefijo = palabraSiguiente.substring(0, 2);

                if (!sufijo.equals(prefijo)) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }
}