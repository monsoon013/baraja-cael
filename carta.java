public class carta {
    //atributo

    private int numero;
    private String palo;

    //constantes
    public static final String[] Palos={"ESPADAS", "COPAS", "OROS", "BASTOS"};
    public static final int Limite_carta_palo = 12;
    //constructor

    public carta (int numero, String palo){
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString(){
        return "[" + numero + " de " + palo + " ]";
    }
}
