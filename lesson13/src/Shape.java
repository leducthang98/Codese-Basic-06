public class Shape {
    int canh = 0;
    double chuVi = 0;
    double dienTich = 0;

    public void tinhChuVi() {
        System.out.println("Chu vi");
    }

    public void tinhDienTich() {
        System.out.println("Dien tich");
    }

    public void info() {
        System.out.println("chu vi :" + chuVi + ", dien tich:" + dienTich);
    }

    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(5, 4);
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.info();
    }
}

class HinhChuNhat extends Shape {
    double CD, CR;

    public HinhChuNhat(double CD, double CR) {
        canh = 4;
        this.CD = CD;
        this.CR = CR;
    }


    public void tinhChuVi() {
        super.tinhChuVi();
        chuVi = (CD + CR) * 2;
    }


    public void tinhDienTich() {
        super.tinhDienTich();
        dienTich = CD * CR;
    }


}

