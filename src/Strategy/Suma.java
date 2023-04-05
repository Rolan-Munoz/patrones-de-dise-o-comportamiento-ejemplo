package Strategy;

public class Suma implements Operation{

    @Override
    public int realizarOperation(int num1, int num2) {
        return num1 + num2;
    }
}
