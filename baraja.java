import java.util.ArrayList;
import java.util.Collections; // .sort (ordenar) .shuffle ("barajar") .swap(list, posicion1, posicion2) intercambiar puesto 
import java.util.Random;
//que. 



public class baraja {
    
    //atributos

    private ArrayList<carta> cartas; //un array de cartas
    private ArrayList<carta> monton; 
    //private int pos_siguiente (posición)

    //constante
    public static final int num_cartas=40; //constantes

    //constructor

    public baraja(){
        this.cartas = new ArrayList<>();
        this.monton = new ArrayList<>();
        crearBaraja();
    }

    private void crearBaraja() {
        for(String p: carta.Palos){ //Recorremos la constante de palos con un foreach
            for(int i = 1; i <= 12; i++){ // Recorremos una lista de números del 1 al 12 para crear el número
                if(i == 8 || i == 9){ //En el caso de que sea 8 u 9, continuar
                    continue;
                }
                cartas.add(new carta(i, p)); //Creamos la carta 
            }
        }
    }

    //solución fácil sin romperme la cabeza
    /*public void barajar(){
        Collections.shuffle(cartas); //Se "baraja" la lista
        System.out.println("Se han barajado las cartas");
    }*/

    //solución no tan fácil, tampoco difícil pero hay que romperse la cabeza un poco
    public void barajar(){
        Random rand = new Random();

        for(int i = cartas.size() - 1; i > 0; i--){ //Recorrer la lista desde el final hasta el principio
            int j = rand.nextInt(i + 1); //Escoger una carta entre 0 y el índica

            carta temp = cartas.get(i); //temp como auxiliar para alojar temporalmente la carta
            cartas.set(i, cartas.get(j)); //Ponemos la carta j en el hueco de i
            cartas.set(j, temp); //Ponemos la carta temporal en el hueco de j
        }

        System.out.println("Se han barajado las cartas correctamente.");
    }

    public carta siguienteCarta(){
        carta c = null; //Inicializar la carta
        if(cartas.size() == 0){
            System.out.println("No hay más cartas en la baraja."); //comprobar que la lista no está vacía
        } else {
            c = cartas.get(0);
            monton.add(c);
            cartas.remove(0);
        }
        return c;
    }

    public int cartasDisponibles(){
        return cartas.size();
    }

    public void darCartas(int numCartas){
        if(numCartas > cartasDisponibles()){
            System.out.println("No hay cartas disponibles.");
        } else {
            System.out.println("Se han repartido " + numCartas + " cartas:");
            for(int i = 0; i < numCartas; i++){
                System.out.println(siguienteCarta());
            }
        }

    }

    public void mostrarBaraja(){
        if(cartas.size() == 0){
            System.out.println("No quedan cartas en el mazo.");
        } else {
            System.out.println("Cartas disponibles en el mazo: ");
            for(carta c : cartas){
                System.out.println(c);
            }
        }
    }
    
    public void cartasMonton(){
        if(monton.size() == 0){
            System.out.println("No ha salido ninguna carta de momento.");
        } else {
            System.out.println("Cartas que ya han salido: ");
            for(carta c : monton){
                System.out.println(c);
            }
        }
    }

    



}
