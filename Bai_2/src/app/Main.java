package app;

import java.util.ArrayList;

public class Main {
    private static void inDanhSach(ArrayList<HangHoa> ds){
        int s = 0;
        for (int i = 0; i < ds.size(); i++) {
            System.out.println(i+1 + ". Ten hang: " + ds.get(i).getTenHH()+" -- Gia: " + ds.get(i).getGia() 
                                + " -- Mota: " + ds.get(i).getMota());
            s += ds.get(i).getGia();
        }
        System.out.println("-----------------Tien hang: " + s);
    }
    public static void main(String[] args) throws Exception {
        ThanhToanOnline thanhToanOnline =new ThanhToanOnline();
        ThanhToanCOD thanhToanCOD = new ThanhToanCOD();

        HangHoa hh1 = new HangHoa("BABOOC", 2000000, "Chinese bamboo");
        HangHoa hh2 = new HangHoa("BABOOV", 1500000, "Vietnam bamboo");
        HangHoa hh3 = new HangHoa("BABOOJ", 2500000, "Japanese bamboo");

        ArrayList<HangHoa> ds1 = new ArrayList<>();
        ds1.add(hh1);
        ds1.add(hh2);
        ArrayList<HangHoa> ds2 = new ArrayList<>();
        ds2.add(hh1);
        ds2.add(hh3);

        GioHang gh = new GioHang();

        GioHang gh1 = gh;
        gh1.setHinhThucThanhToan(thanhToanCOD);
        System.out.println("\n----Danh sach san pham----"); 
        gh1.setHH(ds1);
        inDanhSach(ds1);
        System.out.println("Thanh toan COD - So tien phai tra: " + gh1.thanhToan() + "\n");  

        GioHang gh2 = gh;
        gh2.setHinhThucThanhToan(thanhToanOnline);
        System.out.println("\n----Danh sach san pham----"); 
        gh2.setHH(ds2);
        inDanhSach(ds2);
        System.out.println("Thanh toan online - So tien phai tra: " + gh2.thanhToan());
     
    }
}