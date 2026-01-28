import java.util.Scanner;


public class app {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        String nombre = s.nextLine();

        System.out.println ("Tu nombre es " + nombre);
    }
}