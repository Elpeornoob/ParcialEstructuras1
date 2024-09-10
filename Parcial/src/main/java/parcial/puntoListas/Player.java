package parcial.puntoListas;

public class Player {
    private int cartas;
    private String identificadorJugador;
    
    public Player(){
        
    }
    
    public Player(int n){
        cartas = 0;
        identificadorJugador = "Jugador " + n;
    }
    
    public void addCarta(int carta){
        cartas += carta;
    }
    
    public void removeCarta(){
        cartas -= 1;
    }
    
    public int cantidadCartas(){
        return cartas;
    }
    
    public String idJugador(){
        return identificadorJugador;
    }
}
