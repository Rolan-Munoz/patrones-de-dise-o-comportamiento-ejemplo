package Strategy;

public class Division implements Operation {


    @Override
    public int realizarOperation(int num1, int num2) {
        return num1 / num2;
    }
}