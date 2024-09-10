package parcial.puntoListas;

import java.util.Random;
import javax.swing.JOptionPane;

import bryan_estructuras.linkedlist.doubly.circular.LinkedList;
import bryan_estructuras.util.iterator.Iterator;

public class Game {
    private LinkedList<Player> jugadores;
    private Random random;
    
    public Game(){
        jugadores = new LinkedList<>();
        random = new Random();
    }
    
    public void añadirJugadores(int n){
        for (int i = 1; i <= n; i++) {
            jugadores.add(new Player(i));
        }
    }
    
    public void repartirCartas(){
        Iterator<Player> it = jugadores.iterator();
        while (it.hasNext()) {
            Player pl = it.next();
            pl.addCarta(random.nextInt(1,6));
        }
        JOptionPane.showMessageDialog(null, "+1 Carta a cada jugador.");
    }
    
    public void jugarRonda(){
        if(jugadores.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay jugadores.");
            return;
        }
        if(jugadores.size() == 1){
            Player jd = jugadores.peek();
            JOptionPane.showMessageDialog(null, jd.idJugador() + " es el ganador con " + jd.cantidadCartas());
            return;
        }
        String jugElim = "Jugadores eliminados: " + "\n";
        Iterator<Player> it = jugadores.iterator();
        while (it.hasNext()) {
            Player pl = it.next();
            pl.removeCarta();
            if (pl.cantidadCartas() <= 0) {
                jugElim += pl.idJugador() + " eliminado." + "\n";
                jugadores.remove(pl);
            }
        }
        JOptionPane.showMessageDialog(null, "-1 Carta a cada jugador.");
        JOptionPane.showMessageDialog(null, jugElim);
        if(jugadores.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay ganador, porque todos los jugadores se quedaron sin cartas");
        }
    }
    
    public void elegirGanador(){
        Player ganador = jugadores.peek();
        Iterator<Player> it = jugadores.iterator();
        while (it.hasNext()) {
            Player pl = it.next();
            if(ganador.cantidadCartas() < pl.cantidadCartas()){
                ganador = pl;
            }
        }
        JOptionPane.showMessageDialog(null, ganador.idJugador() + "es el ganador con " + ganador.cantidadCartas() + " cartas");
    }
    
}
