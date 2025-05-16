package anonymous_functions;

public class Calculator {
    public int compute(int x, int y, MathOperation op){
        return op.operate(x, y);
    }
}
