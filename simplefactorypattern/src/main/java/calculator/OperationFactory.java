package calculator;

/**
 * Created by huangWei on 2020/2/23.
 */
public class OperationFactory {

    public static Operation getOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
        }
        return operation;
    }
}
