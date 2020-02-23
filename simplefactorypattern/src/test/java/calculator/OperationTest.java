package calculator;


public class OperationTest {

    public static void main(String[] args) {
        Operation operation = OperationFactory.getOperation("-");
        operation.setNumberA(5);
        operation.setNumberB(3);
        System.out.println(operation.getResult());
    }
}
