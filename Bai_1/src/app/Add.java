package app;

public class Add implements Calculate {
    @Override
    public float calculate(float a, float b) {
        return a+b;
    }
}