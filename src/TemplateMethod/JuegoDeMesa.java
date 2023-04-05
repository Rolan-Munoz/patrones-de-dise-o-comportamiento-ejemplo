package TemplateMethod;

public class JuegoDeMesa extends Juego {
    private String nombreJuego;
    private int numJugadores;

    public JuegoDeMesa(String nombreJuego, int numJugadores) {
        this.nombreJuego = nombreJuego;
        this.numJugadores = numJugadores;
    }

    @Override
    public void inicializar() {
        System.out.println("Bienvenido al juego de mesa " + nombreJuego + " para " + numJugadores + " jugadores.");
    }

    @Override
    public void turnoJugador1() {

    }

    @Override
    public void turnoJugador2() {

    }

    @Override
    public void iniciarJuego() {
        System.out.println("¡Que comience el juego de mesa!");
        // Implementación específica del juego de mesa
    }

    @Override
    public void finalizarJuego() {
        System.out.println("Fin del juego de mesa.");
    }

    @Override
    public void mostrarResultados() {
        System.out.println("Mostrando resultados del juego de mesa...");
        // Implementación específica del juego de mesa
    }
}
