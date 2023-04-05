package Observer;

public class Ciudad implements Observador {
    private String nombre;

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(Clima clima) {
        System.out.println("La temperatura en " + nombre + " es " + clima.getTemperatura() + " grados Celsius.");
    }
}
