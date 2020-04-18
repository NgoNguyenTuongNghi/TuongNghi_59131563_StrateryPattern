package app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {
    public static void main(final String[] args) throws Exception {
        final SoSanhTheoDiem soSanhTheoDiem = new SoSanhTheoDiem();
        final SoSanhTheoTen soSanhTheoTen = new SoSanhTheoTen();

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        SinhVien sv1 = new SinhVien("Ngo Nguyen Tuong Nghi", df.parse("19/05/1995"), 8.8f);
        SinhVien sv2 = new SinhVien("Diep Tu Dat", df.parse("19/09/1999"), 9.9f);
        SinhVien sv3 = new SinhVien("Tran Thanh Thi", df.parse("19/08/1998"), 10.0f);

        ArrayList<SinhVien> sv = new ArrayList<>();
        sv.add(sv1);
        sv.add(sv2);
        sv.add(sv3);

        QLSV qlsv = new QLSV();
        qlsv.setDs(sv);
        qlsv.setiSoSanh(soSanhTheoTen);
        qlsv.sapXep();
        System.out.println("\nDanh sach sap xep theo ho ten: ");
        qlsv.inDS();

        qlsv.setiSoSanh(soSanhTheoDiem);
        qlsv.sapXep();
        System.out.println("\nDanh sach sap xep theo diem: ");
        qlsv.inDS();

    }

}
