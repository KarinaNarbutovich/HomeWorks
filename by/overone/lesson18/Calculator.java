package by.overone.lesson18;

public class Calculator<T, V,S> {
    private T firstNum;
    private V secondNum;

    public Calculator(T first, V second) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public Calculator() {
    }
    public<T,V,S extends Number> double sum(){
        double sum=(Double)firstNum+(Double) secondNum ;
        return sum;
    }
}
