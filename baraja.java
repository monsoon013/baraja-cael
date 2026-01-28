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
        for (String p : carta.Palos){
            for (String v : carta.Valores ){
                cartas.add(new carta(p, v));
            }
        }
    }

    
    public void barajar(){
        int n = cartas.size();
        
        for(int i = n - 1; i > 0; i--){
            int j = rand.nextInt(i + 1);

            //Realizar el cambio
            carta temp = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, temp);
        }
    }

    public void siguienteCarta {
        
    }



}
