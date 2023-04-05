package TemplateMethod;

public class JuegoDeCartas extends Juego {
    private String nombreJuego;
    private int numJugadores;

    public JuegoDeCartas(String nombreJuego, int numJugadores) {
        this.nombreJuego = nombreJuego;
        this.numJugadores = numJugadores;
    }

    @Override
    public void inicializar() {
        System.out.println("Bienvenido al juego de cartas " + nombreJuego + " para " + numJugadores + " jugadores.");
    }

    @Override
    public void turnoJugador1() {

    }

    @Override
    public void turnoJugador2() {

    }

    @Override
    public void iniciarJuego() {
        System.out.println("¡Que comience el juego de cartas!");
        // Implementación específica del juego de cartas
    }

    @Override
    public void finalizarJuego() {
        System.out.println("Fin del juego de cartas.");
    }

    @Override
    public void mostrarResultados() {
        System.out.println("Mostrando resultados del juego de cartas...");
        // Implementación específica del juego de cartas
    }
}
