package app;

public class SoSanhTheoTen implements ISoSanh<SinhVien> {
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if(o1.getHoTen().compareTo(o2.getHoTen()) == 0) 
            return 0;
        else 
            if(o1.getHoTen().compareTo(o2.getHoTen()) >0) 
                return 1;
            else 
                return -1;
    }
}