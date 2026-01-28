public class carta {
    //atributo

    private String valor;
    private String palo;

    //constantes
    public static final String[] Palos={"ESPADAS", "COPAS", "OROS", "BASTOS"};
    public static final String[] Valores = {"As, 2, 3, 4, 5, 6, 7, Sota, Caballo, Rey"};
    //constructor

    public carta (String valor, String palo){
        this.valor = valor;
        this.palo = palo;
    }

    @Override
    public String toString(){
        return "[" + valor + " de " + palo + " ]";
    }
}
