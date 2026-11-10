import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numero = "";
        System.out.println("Escribe un número: ");
        numero = sc.nextLine().trim();

        System.out.println(sumaDigitos(numero));
    }
    public static String sumaDigitos (String numero){
        int suma = 0;
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < numero.length(); i++){
            suma += Character.getNumericValue(numero.charAt(i));
            resultado.append(numero.charAt(i));
            if (i != numero.length() - 1){
                resultado.append(" + ");
            }else {
                resultado.append(" = ").append(suma);
            }
        }
        return resultado.toString();
    }
}
