package Strategy;

public class Calculadora {
    public int calcular(int num1, int num2, Operation operacion) {
        return operacion.realizarOperation(num1, num2);
    }
}