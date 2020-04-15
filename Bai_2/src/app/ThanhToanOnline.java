package app;

public class ThanhToanOnline implements IThanhToan {
    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000)
            return 0.95*tienHang;
        else 
            return 0.93*tienHang;
    }
}