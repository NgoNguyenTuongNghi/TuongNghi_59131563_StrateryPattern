package app;

public class HangHoa {
    private String tenHH;
    private int gia;
    private String moTa;

    public String getTenHH() {
        return tenHH;
    }

    public String getMota() {
        return moTa;
    }

    public int getGia() {
        return gia;
    }

    public HangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }
}