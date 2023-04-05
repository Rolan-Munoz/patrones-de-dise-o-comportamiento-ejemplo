package TemplateMethod;

public abstract class Juego {
    public void jugar() {
        inicializar();
        turnoJugador1();
        turnoJugador2();
        finalizarJuego();
    }

    public abstract void inicializar();
    public abstract void turnoJugador1();
    public abstract void turnoJugador2();

    public abstract void iniciarJuego();

    public abstract void finalizarJuego();

    public abstract void mostrarResultados();
}
