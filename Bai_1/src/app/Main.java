package app;

public class Main{
    public static void main(String[] args) {
        Tinh cong = new Cong();
        Tinh tru = new Tru();
    
        Context context = new Context();
        System.out.println("\nAnswer: ");

        context.setTinhToan(cong);
        System.out.println("75 + 12 = " + context.tinh(75, 12));
    
        context.setTinhToan(tru);
        System.out.println("54 - 78 = " + context.tinh(54, 78));
    }
}