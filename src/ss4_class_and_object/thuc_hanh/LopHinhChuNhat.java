package ss4_class_and_object.thuc_hanh;

public class LopHinhChuNhat {
    double rong, dai;
    public LopHinhChuNhat(){
    }
    public LopHinhChuNhat(double rong,double dai){
        this.rong=rong;
        this.dai=dai;
    }
    public double layDienTich(){
        return this.dai*this.rong;
    }
    public double layChuVi(){
        return (this.dai+this.rong)*2;
    }
    public String inThongSoHCN(){
        return "Hình chữ nhật có độ dài "+dai+" và "+rong;
    }
}
