package by.overone.lesson13;

import java.math.BigDecimal;

public class ArithOperation {
  private  double argument1 = 112.043;
    private int argument2 = 11;

    @Override
    public String toString() {
        System.out.println("ArithOperation{" +
                ", argument1=" + argument1 +
                ", argument2=" + argument2 +
                '}');
        return "ArithOperation{" +
                ", argument1=" + argument1 +
                ", argument2=" + argument2 +
                '}';
    }


    public BigDecimal sum(BigDecimal argument3) {
        BigDecimal argument1B = BigDecimal.valueOf(argument1);
        BigDecimal sum1 = argument3.add(argument1B);
        System.out.println("Sum of argument1 and argument3 = " + sum1.setScale(3,BigDecimal.ROUND_HALF_UP));
        return sum1;
    }

    public BigDecimal sum(double argument4) {
        BigDecimal argument1B = BigDecimal.valueOf(argument1);
        BigDecimal argument3B = BigDecimal.valueOf(argument4);
        BigDecimal sum2 = argument3B.add(argument1B);
        System.out.println("Sum of argument1 and argument4 = " + sum2.setScale(3,BigDecimal.ROUND_HALF_UP));
        return sum2;
    }

    public BigDecimal sum(BigDecimal argument3, BigDecimal argument4) {
        BigDecimal argument1B = BigDecimal.valueOf(argument1);
        BigDecimal argument2B = BigDecimal.valueOf(argument2);
        BigDecimal sum3 = argument2B.add(argument4.add(argument3.add(argument1B)));
        System.out.println("Sum of argument1, argument2, argument3 and argument4 = " + sum3.setScale(3,BigDecimal.ROUND_HALF_UP));
        return sum3;
    }

    public BigDecimal subtract(BigDecimal argument4) {
        BigDecimal argument2B = BigDecimal.valueOf(argument2);
        BigDecimal subtract1 = argument4.subtract(argument2B);
        System.out.println("Subtract of argument2 and argument4 = " + subtract1.setScale(3,BigDecimal.ROUND_HALF_UP));
        return subtract1;
    }

    public double subtract(double argument4) {
        BigDecimal argument4B = BigDecimal.valueOf(argument4);
        BigDecimal argument2B = BigDecimal.valueOf(argument2);
        BigDecimal subtract2 = argument4B.subtract(argument2B);
        double subtract2D = subtract2.doubleValue();
        System.out.println("Subtract of argument4 and argument2 = " + subtract2D);
        return subtract2D;
    }

    public BigDecimal subtract(BigDecimal argument4,double argument3) {
        BigDecimal argument2B = BigDecimal.valueOf(argument2);
        BigDecimal argument1B = BigDecimal.valueOf(argument1);
        BigDecimal argument3B = BigDecimal.valueOf(argument3);
        BigDecimal subtract3 = argument4.subtract(argument3B.add(argument2B.add(argument1B)));
        System.out.println("Subtract of argument4 and argument1,2,3 = " + subtract3.setScale(3,BigDecimal.ROUND_HALF_UP));
        return subtract3;
    }
    public BigDecimal multiply(BigDecimal argument3,BigDecimal argument4){
        BigDecimal argument2B = BigDecimal.valueOf(argument2);
        BigDecimal argument1B = BigDecimal.valueOf(argument1);
        BigDecimal multiply1=argument1B.multiply(argument2B.multiply(argument3.multiply(argument4)));
        System.out.println("Multiply of argument1,2,3,4: "+multiply1.setScale(3,BigDecimal.ROUND_HALF_UP));
        return multiply1;
    }
    public BigDecimal multiply(BigDecimal argument3){
        BigDecimal argument1B = BigDecimal.valueOf(argument1);
        BigDecimal multiply2=argument1B.multiply(argument3);
        System.out.println("Multiply of argument1 and argument3: "+multiply2.setScale(3,BigDecimal.ROUND_HALF_UP));
        return multiply2;
    }
    public BigDecimal divide(BigDecimal argument3){
        BigDecimal argument1B = BigDecimal.valueOf(argument1);
        BigDecimal divide2=argument1B.multiply(argument3);
        System.out.println("Divide of argument1 and argument3: "+divide2.setScale(3,BigDecimal.ROUND_HALF_UP));
        return divide2;}

    public BigDecimal divide(BigDecimal argument3, BigDecimal argument4){
        BigDecimal divide1=argument4.multiply(argument3);
        System.out.println("Divide of argument4 and argument3: "+divide1.setScale(3,BigDecimal.ROUND_HALF_UP));
        return divide1;}
}
