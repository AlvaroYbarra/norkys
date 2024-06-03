import java.util.Scanner;

public class norkis_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a Norkis");
        System.out.println("¿Qué desea comprar?");
        System.out.println("1. Rokys brasa");
        System.out.println("2. Rokys burger");
        System.out.println("3. Rokys parrillas");
        System.out.println("4. Bebidas");
        System.out.print("Seleccione una opción (1/2/3/4): ");
        int opcion = scanner.nextInt();

        double[] preciosCombos = {0.00, 30.00, 50.00, 80.00};
        double[] preciosBurgers = {0.00, 19.00, 22.00, 27.00};
        double[] preciosParrillas = {0.00, 35.00, 38.00, 44.00};
        double[] preciosBebidas = {0.00, 14.00, 14.00, 6.50};

        double totalCompra = 0.00;

        switch (opcion) {
            case 1:
                System.out.println("Combos disponibles de pollo a la brasa:");
                System.out.println("1. 1/4 de pollo + papas + ensalada - S/ 30.00");
                System.out.println("2. 1/2 de pollo + papas + ensalada - S/ 50.00");
                System.out.println("3. 1 pollo + papas + ensalada - S/ 80.00");
                System.out.print("Seleccione su pedido (1/2/3): ");
                int tipoComboBrasa = scanner.nextInt();

                if (tipoComboBrasa < 1 || tipoComboBrasa > 3) {
                    System.out.println("Opción de combo no válida");
                    return;
                }

                System.out.print("Ingrese la cantidad de combos pollo a la brasa que va comprar: ");
                int cantidadCombosBrasa = scanner.nextInt();

                for (int i = 0; i < cantidadCombosBrasa; i++) {
                    totalCompra += preciosCombos[tipoComboBrasa];
                }
                break;
            case 2:
                System.out.println("Combos disponibles de burger:");
                System.out.println("1. Burger clasica + papas - S/ 19.00");
                System.out.println("2. Burger suprema + papas - S/ 22.00");
                System.out.println("3. Burger extrema + papas - S/ 27.00");
                System.out.print("Seleccione su pedido (1/2/3): ");
                int tipoComboBurger = scanner.nextInt();

                if (tipoComboBurger < 1 || tipoComboBurger > 3) {
                    System.out.println("Opción de combo no válida");
                    return;
                }

                System.out.print("Ingrese la cantidad de combos burger que va comprar: ");
                int cantidadCombosBurger = scanner.nextInt();

                for (int i = 0; i < cantidadCombosBurger; i++) {
                    totalCompra += preciosBurgers[tipoComboBurger];
                }
                break;
            case 3:
                System.out.println("Combos disponibles de parrilla:");
                System.out.println("1. Pechuga a la parrilla - S/ 35.00");
                System.out.println("2. Churrasco a la parrilla - S/ 38.00");
                System.out.println("3. Chuleta a la parrilla - S/ 44.00");
                System.out.print("Seleccione su pedido (1/2/3): ");
                int tipoComboParrilla = scanner.nextInt();

                if (tipoComboParrilla < 1 || tipoComboParrilla > 3) {
                    System.out.println("Opción de combo no válida");
                    return;
                }

                System.out.print("Ingrese la cantidad de combos parrilla que va comprar: ");
                int cantidadCombosParrilla = scanner.nextInt();

                for (int i = 0; i < cantidadCombosParrilla; i++) {
                    totalCompra += preciosParrillas[tipoComboParrilla];
                }
                break;
            case 4:
                System.out.println("Bebidas disponibles:");
                System.out.println("1. Gaseosa Inka Cola 1.5L - S/ 14.00");
                System.out.println("2. Gaseosa Coca Cola 1.5L - S/ 14.00");
                System.out.println("3. Agua San Luis 625 mL - S/ 6.50");
                System.out.print("Seleccione su pedido (1/2/3): ");
                int tipoBebida = scanner.nextInt();

                if (tipoBebida < 1 || tipoBebida > 3) {
                    System.out.println("Opción de bebida no válida");
                    return;
                }

                System.out.print("Ingrese la cantidad de bebidas que va comprar: ");
                int cantidadBebidas = scanner.nextInt();

                for (int i = 0; i < cantidadBebidas; i++) {
                    totalCompra += preciosBebidas[tipoBebida];
                }
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        System.out.println("Total a pagar: S/ " + totalCompra);
        System.out.println("Gracias por su compra. ¡Disfrute su pedido!");
        scanner.close();
    }
}


