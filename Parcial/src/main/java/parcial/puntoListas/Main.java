package parcial.puntoListas;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        Game juego = new Game();
        boolean condition = false;
        int numJug = 0;
        while (!condition) {
            numJug = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de jugadores."));
            if(numJug > 1){
                condition = true;
            }
        }
        juego.añadirJugadores(numJug);
        boolean condicion = true;
        while (condicion) {            
            String eleccion = JOptionPane.showInputDialog("Ingrese: " + "\n" + "1. Repartir Cartas" + "\n" + "2.Jugar Ronda" + "\n" + "3.Elegir ganador" + "\n" + "4.Salir");
            switch (eleccion) {
                case "1":
                    juego.repartirCartas();
                    break;
                case "2":
                    juego.jugarRonda();
                    break;
                case "3":
                    juego.elegirGanador();
                    break;
                case "4":
                    condicion = false;
                    break;
                case null:
                    condicion = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
            }
        }
        
    }
    
}
