package app;

public class ThanhToanCOD implements IThanhToan {
    @Override
    public double thanhToan(int tienHang) {
        if(tienHang > 2000000)
            return 0.98*tienHang;
        else
            return tienHang;
    }
}