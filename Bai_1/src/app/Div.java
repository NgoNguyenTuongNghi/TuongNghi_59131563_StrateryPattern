package app;

public class Div implements Calculate {
    @Override
    public float calculate(float a, float b) {
        if(b==0) 
            return Float.NaN;
        else 
            return a/b;
    }
}