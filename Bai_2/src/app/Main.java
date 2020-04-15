package app;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ThanhToanOnline thanhToanOnline =new ThanhToanOnline();
        ThanhToanCOD thanhToanCOD = new ThanhToanCOD();

        HangHoa hh = new HangHoa("BABOO", 2000000, "Chinese bamboo");

        ArrayList<HangHoa> ds1 = new ArrayList<>();
        ds1.add(hh);
        ArrayList<HangHoa> ds2 = new ArrayList<>();
        ds2.add(hh);

        System.out.println("\nList "); 

        GioHang gh = new GioHang();

        GioHang gh1 = gh;
        gh1.setHinhThucThanhToan(thanhToanCOD);
        gh1.setHH(ds1);
        System.out.println("Thanh toan COD: " + gh1.thanhToan());  

        GioHang gh2 = gh;
        gh2.setHinhThucThanhToan(thanhToanOnline);
        gh2.setHH(ds2);
        System.out.println("Thanh toan online: " + gh2.thanhToan());
     
    }
}