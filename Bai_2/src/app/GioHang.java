package app;

import java.util.ArrayList;

public class GioHang {
    private IThanhToan hinhThucThanhToan;
    private ArrayList<HangHoa> hH;

    public void setHH(ArrayList<HangHoa> hH) {
        this.hH = hH;
    }

    public void setHinhThucThanhToan(IThanhToan hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }
    public double thanhToan(){
        int tong = 0;
        for(int i = 0; i < hH.size(); i++){
            tong += hH.get(i).getGia();
        }
        return hinhThucThanhToan.thanhToan(tong);
    }
}