import java.util.Scanner;


public class app {
    public static void main (String[] args){
        /*Prueba de scanner pues porque sí 
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        String nombre = s.nextLine();

        System.out.println ("Tu nombre es " + nombre);*/

        Scanner sc = new Scanner(System.in);
        baraja baraja = new baraja();
        int op = 0;

        do { //si no metes un do antes dificilmente va a funcionar, genio
            System.out.println("###Elige una opción:\n");
            System.out.println("1.Barajar");
            System.out.println("2.Pedir siguiente carta");
            System.out.println("3.Pedir un grupo de cartas");
            System.out.println("4.Mostrar cartas disponibles");
            System.out.println("5.Mostrar cartas que ya han salido");
            System.out.println("6.Mostrar cartas que quedan en el mazo");
            System.out.println("7.Salir");

            while(!sc.hasNextInt()){
                System.out.println("Introduce un número válido");
                sc.next();
            }

            op = sc.nextInt();

            switch(op){
                case 1: {
                    baraja.barajar();
                    break;
                }
                case 2: {
                    carta c = baraja.siguienteCarta();
                    if(c != null) System.out.println("Se ha entregado la siguiente carta: " + c);
                    break;
                }
                case 3: {
                    System.out.println("¿Cuántas cartas quieres?");
                    int num = sc.nextInt();
                    baraja.darCartas(num);
                    break;
                }
                case 4: {
                    System.out.println("Quedan " + baraja.cartasDisponibles());
                    break;
                }
                case 5: {
                    baraja.cartasMonton();
                    break;
                }
                case 6: {
                    baraja.mostrarBaraja();
                    break;
                }
                case 7: {
                    System.out.println("Has salido");
                    break;
                }
                default:
                    System.out.println("Opción no válida.");
            }
        }while(op != 7);
        
        sc.close();
    }
}