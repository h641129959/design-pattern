package calculator;


public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        return getNumberA() / getNumberB();
    }
}
