import java.util.ArrayList;
import java.util.Collections; // ordenación de la lista

import javax.swing.text.StyledEditorKit;



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
        this.monton = new ArrayList<>()
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

    public void barajar(){
        Collections.shuffle(cartas); //Se "baraja" la lista
        System.out.println("Se han barajado las cartas");
    }

    



    


}
