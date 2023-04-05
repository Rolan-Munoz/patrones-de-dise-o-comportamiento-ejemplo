package Observer;

public class Main {
    public static void main(String[] args) {
        Clima clima = new Clima();
        Ciudad ciudad1 = new Ciudad("Ciudad de México");
        Ciudad ciudad2 = new Ciudad("Nueva York");

        clima.agregarObservador(ciudad1);
        clima.agregarObservador(ciudad2);

        clima.setTemperatura(25);
        clima.setTemperatura(30);

        clima.eliminarObservador(ciudad2);

        clima.setTemperatura(35);
    }
}
