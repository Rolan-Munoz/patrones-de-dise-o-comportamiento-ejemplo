package Visitor;

interface Figura {
    void aceptar(Visitante visitante);
}

class Cuadrado implements Figura {
    double lado;
    Cuadrado(double lado) {
        this.lado = lado;
    }
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }
}

class Circulo implements Figura {
    double radio;
    Circulo(double radio) {
        this.radio = radio;
    }
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }
}

interface Visitante {
    void visitar(Cuadrado cuadrado);
    void visitar(Circulo circulo);
}

class CalculadoraEstadisticas implements Visitante {
    double areaTotal = 0;
    double perimetroTotal = 0;
    public void visitar(Cuadrado cuadrado) {
        areaTotal += cuadrado.lado * cuadrado.lado;
        perimetroTotal += 4 * cuadrado.lado;
    }
    public void visitar(Circulo circulo) {
        areaTotal += Math.PI * circulo.radio * circulo.radio;
        perimetroTotal += 2 * Math.PI * circulo.radio;
    }
}

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = {
                new Cuadrado(5),
                new Circulo(3),
                new Cuadrado(2),
                new Circulo(7),
        };
        CalculadoraEstadisticas calculadora = new CalculadoraEstadisticas();
        for (Figura figura : figuras) {
            figura.aceptar(calculadora);
        }
        System.out.println("Area total: " + calculadora.areaTotal);
        System.out.println("Perimetro total: " + calculadora.perimetroTotal);
    }
}
