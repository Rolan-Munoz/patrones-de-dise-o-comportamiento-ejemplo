package Strategy;

public class Multiplicacion implements Operation {


    @Override
    public int realizarOperation(int num1, int num2) {
        return num1 * num2;
    }
}
