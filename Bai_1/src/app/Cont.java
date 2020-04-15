package app;

public class Cont {
    private Calculate calc;

    public void setCalc(Calculate calc) {
        this.calc = calc;
    }

    public float calculate(float a, float b){
        return calc.calculate(a, b);
    }
}