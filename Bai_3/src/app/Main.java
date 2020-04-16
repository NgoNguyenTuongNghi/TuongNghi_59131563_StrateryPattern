package app;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(final String[] args) throws Exception {
        final SoSanhTheoDiem soSanhTheoDiem = new SoSanhTheoDiem();
        final SoSanhTheoTen soSanhTheoTen = new SoSanhTheoTen();

        SinhVien sv1 = new SinhVien("Ngo Nguyen Tuong Nghi", Date("1995/05/19"), 8.8f);
        SinhVien sv2 = new SinhVien("Diep Tu Dat", Date("1999/09/19"), 9.9f);
        SinhVien sv3 = new SinhVien("Tran Thanh Thi", Date("1998/08/19"), 10.0f);

        ArrayList<SinhVien> sv = new ArrayList<>();
        sv.add(sv1);
        sv.add(sv2);
        sv.add(sv3);

        QLSV qlsv = new QLSV();
        qlsv.setDs(sv);
        qlsv.setiSoSanh(soSanhTheoTen);
        qlsv.sapXep();
        System.out.println("Danh sach sap xep theo ho ten: ");
        qlsv.inDS();

        qlsv.setiSoSanh(soSanhTheoDiem);
        qlsv.sapXep();
        System.out.println("\nDanh sach sap xep theo diem: ");
        qlsv.inDS();

    }

    private static Date Date(String string) {
        return null;
    }

}
