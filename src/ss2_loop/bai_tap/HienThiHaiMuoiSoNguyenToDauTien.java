package ss2_loop.bai_tap;

public class HienThiHaiMuoiSoNguyenToDauTien {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên ");
        int demSoNT=0;
        int soTN=2;
        while(demSoNT<20){
            int count=0;
            if (demSoNT<soTN){
            for (int i=1;i<=soTN;i++) {
                if (soTN % i == 0) {
                    count++;
                }
            }
                if (count == 2) {
                    System.out.println(soTN);
                    demSoNT++;
                }
            }
            soTN++;
        }
    }
}
