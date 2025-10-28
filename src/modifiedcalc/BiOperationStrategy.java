package modifiedcalc;

public interface BiOperationStrategy extends OperationStrategy{
    @Override
    default Double execute(Double... op) {
        if (op.length != 2) {
            throw new IllegalArgumentException("requires 2 op");
        }
        return calculate(op[0], op[1]);
    }
    
    Double calculate(Double num1, Double num2);
    
}
