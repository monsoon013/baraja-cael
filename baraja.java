import java.util.ArrayList;
import java.util.Random;



public class baraja {
    
    //atributos

    private ArrayList<carta> cartas; //un array de cartas
    private Random rand;
    //private int pos_siguiente (posición)

    //constante
    public static final int num_cartas=40; //constantes

    //constructor

    public baraja(){
        this.cartas = new ArrayList<>();
        this.rand = new Random();
        crearBaraja();
    }

    private void crearBaraja() {
        
    }



}
