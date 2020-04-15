package app;

public class Main{
    public static void main(String[] args) {
        Calculate add = new Add();
        Calculate min = new Min();
        
        Cont cont = new Cont();
        System.out.println("\nAnswer: ");

        cont.setCalc(add);
        System.out.println("75 + 12 = " + cont.calculate(75, 12));
    
        cont.setCalc(min);
        System.out.println("54 - 78 = " + cont.calculate(54, 78));
    }
}