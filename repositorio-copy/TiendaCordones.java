
/**
 * Write a description of class TiendaCordones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class TiendaCordones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Tienda de Cordones ===");
            System.out.println("1. Ver catálogo de cordones");
            System.out.println("2. Comprar cordones");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    verCatalogoCordones();
                    break;
                case 2:
                    comprarCordones();
                    break;
                case 3:
                    System.out.println("Gracias por visitar la tienda. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 3);
    }

    public static void verCatalogoCordones() {
        System.out.println("=== Catálogo de Cordones ===");
        System.out.println("1. Cordones Negros");
        System.out.println("2. Cordones Blancos");
        System.out.println("3. Cordones Rojos");
    }

    public static void comprarCordones() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("=== Comprar Cordones ===");
        System.out.println("1. Cordones Negros - $10");
        System.out.println("2. Cordones Blancos - $12");
        System.out.println("3. Cordones Rojos - $15");
        System.out.print("Ingrese el número de cordones que desea comprar: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ha comprado Cordones Negros por $10. ¡Gracias por su compra!");
                break;
            case 2:
                System.out.println("Ha comprado Cordones Blancos por $12. ¡Gracias por su compra!");
                break;
            case 3:
                System.out.println("Ha comprado Cordones Rojos por $15. ¡Gracias por su compra!");
                break;
            default:
                System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                break;
        }
    }
}

