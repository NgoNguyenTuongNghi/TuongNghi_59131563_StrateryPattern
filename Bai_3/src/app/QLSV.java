package app;

import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class QLSV {
    private ArrayList<SinhVien> ds;
    private ISoSanh<SinhVien> iSoSanh;

    public void setiSoSanh(ISoSanh<SinhVien> iSoSanh) {
        this.iSoSanh = iSoSanh;
    }

    public void setDs(ArrayList<SinhVien> ds) {
        this.ds = ds;
    }
    public void sapXep(){
        SinhVien tam ;
        for(int i = 0; i < ds.size(); i++){
            for(int j = i + 1; j <= ds.size()-1; j++)
                if(iSoSanh.soSanh(ds.get(i),ds.get(j)) == 1){
                    tam = ds.get(i);
                    ds.set(i,ds.get(j));
                    ds.set(j,tam);
                }
        }
    }
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public void inDS(){
        for (int i = 0; i < ds.size(); i++){
            SinhVien sv = ds.get(i);
            System.out.println(i+1 + ". Ho ten: " + sv.getHoTen() + " -- Ngay sinh: " + sdf.format(sv.getNgaySinh()) + 
                                " -- Diem trung binh: " + sv.getDiemTB());
        }
    }
}