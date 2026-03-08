import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;
        int moneda;
        int total;
        int meta;
        int totalahorro;

        int m20 = 0;
        int m50 = 0;
        int m100 = 0;
        int m200 = 0;
        int m500 = 0;
        int m1000 = 0;

        do {
            System.out.println("==================================");
            System.out.println(" Bienvenido a tu alcancia virtual ");
            System.out.println("==================================");
            System.out.println("( seleccione la opcion que desea )");
            System.out.println("__________________________________");
            System.out.println("  1  |  Ahorrar                  |");
            System.out.println("  2  |  Contar monedas           |");
            System.out.println("  3  |  Valor acumulado          |");
            System.out.println("  4  |  Total de dinero          |");
            System.out.println("  5  |  Meta de ahorro           |");
            System.out.println("__________________________________");

            opcion = teclado.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("Ingresar solo monedas de las siguientes denominaciones");

                    System.out.println("( seleccione una opcion )");
                    System.out.println("  1  | 20");
                    System.out.println("  2  | 50");
                    System.out.println("  3  | 100");
                    System.out.println("  4  | 200");
                    System.out.println("  5  | 500");
                    System.out.println("  6  | 1000");

                    moneda = teclado.nextInt();

                    switch (moneda) {
                        case 1:
                            System.out.println("Su moneda es de 20");
                            m20++;

                            break;
                        case 2:
                            System.out.println("Su moneda es de 50");
                            m50++;

                            break;
                        case 3:
                            System.out.println("Su moneda es de 100");
                            m100++;

                            break;
                        case 4:
                            System.out.println("Su moneda es de 200");
                            m200++;

                            break;
                        case 5:
                            System.out.println("Su moneda es de 500");
                            m500++;

                            break;
                        case 6:
                            System.out.println("Su moneda es de 1000");
                            m1000++;

                            break;

                        default:
                            System.out.println("Moneda no valida");

                            break;

                    }

                    break;

                case 2:
                    System.out.println("Conteo de monedas");

                    System.out.println("Monedas de 20: " + m20);
                    System.out.println("Monedas de 50: " + m50);
                    System.out.println("Monedas de 100: " + m100);
                    System.out.println("Monedas de 200: " + m200);
                    System.out.println("Monedas de 500: " + m500);
                    System.out.println("Monedas de 1000: " + m1000);

                    break;

                case 3:
                    System.out.println("valor acumulado");

                    System.out.println("20 = " + (m20 * 20));
                    System.out.println("50 = " + (m50 * 50));
                    System.out.println("100 = " + (m100 * 100));
                    System.out.println("200 = " + (m200 * 200));
                    System.out.println("500 = " + (m500 * 500));
                    System.out.println("1000 = " + (m1000 * 1000));

                    break;

                case 4:
                    System.out.println("Cantidad total");

                    total = (m20 * 20) + (m50 * 50) + (m100 * 100) + (m200 * 200) + (m500 * 500) + (m1000 * 1000);
                    System.out.println("Total ahorrado es: " + total);

                    break;

                case 5:
                    System.out.println("Ingrese su meta de ahorro");
                    meta = teclado.nextInt();

                    totalahorro = (m20 * 20) + (m50 * 50) + (m100 * 100) + (m200 * 200) + (m500 * 500) + (m1000 * 1000);
                    System.out.println("Llevas ahorrado: " + totalahorro);

                    if (totalahorro >= meta) {
                        System.out.println("Felicidades alcanzaste tu meta");

                    } else {
                        System.out.println("Te faltan: " + (meta - totalahorro));

                    }
                    break;

            }
        } while (true);

    }
}