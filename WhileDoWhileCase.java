//Examen
//Karol y Alonso: Ejemplos de While y 2 ejercicios mas practicos (reales)
//Gael, Jackson: Ejemplo de Do while y 2 ejercicios practicos (reales)
//Bernanardo 
// lo mio: Ejemplo de uso de BigDecimal para datos exactos
//Conversion de dolares a peso mxn, hacer compracion contra double
//o float.

 import java.math.BigDecimal;
import java.util.Scanner;

public class WhileDoWhileCase {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa la cantidad en dólares: ");
            BigDecimal dolares = scanner.nextBigDecimal();
            
            // Tipo de cambio exacto
            BigDecimal tipoCambio = new BigDecimal("17.45678");
            
            // Conversión a pesos mexicanos
            BigDecimal pesos = dolares.multiply(tipoCambio);
            System.out.println(dolares + " dólares son " + pesos + " pesos mexicanos.");
            
            // Comparación de BigDecimal con double
            double tipoCambioDouble = 17.45678;
            if (tipoCambio.compareTo(BigDecimal.valueOf(tipoCambioDouble)) == 0) {
                System.out.println("El tipo de cambio en BigDecimal es igual al de double.");
            } else {
                System.out.println("El tipo de cambio en BigDecimal es diferente al de double.");
            }
            
            // Comparación de BigDecimal con float
            float tipoCambioFloat = 17.45678f;
            if (tipoCambio.compareTo(BigDecimal.valueOf(tipoCambioFloat)) == 0) {
                System.out.println("El tipo de cambio en BigDecimal es igual al de float.");
            } else {
                System.out.println("El tipo de cambio en BigDecimal es diferente al de float.");
            }
        }
    }
}