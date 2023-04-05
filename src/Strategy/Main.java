package Strategy;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultadoSuma = calculadora.calcular(5, 3, new Suma());
        int resultadoResta = calculadora.calcular(5, 3, new Resta());
        int resultadoMultiplicacion = calculadora.calcular(5, 3, new Multiplicacion());
        int resultadoDivision = calculadora.calcular(6, 3, new Division());

        System.out.println("5 + 3 = " + resultadoSuma);
        System.out.println("5 - 3 = " + resultadoResta);
        System.out.println("5 * 3 = " + resultadoMultiplicacion);
        System.out.println("6 / 3 = " + resultadoDivision);
    }
}
