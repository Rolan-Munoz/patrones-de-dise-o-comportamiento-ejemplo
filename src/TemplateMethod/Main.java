package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        Juego juego1 = new JuegoDeMesa("Monopoly", 4);
        juego1.jugar();
        Juego juego2 = new JuegoDeCartas("Monopoly", 4);
        juego2.jugar();
    }
}
