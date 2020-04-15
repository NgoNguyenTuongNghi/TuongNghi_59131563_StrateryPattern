package app;

public class Chia implements Tinh {
    @Override
    public float tinh(float a, float b) {
        if(b==0) 
            return Float.NaN;
        else 
            return a/b;
    }
}