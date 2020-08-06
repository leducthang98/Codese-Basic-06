public class PhanSo {
    int tu;
    int mau;

    public PhanSo() {
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    void congPhanSoVoiMotSo(int x) {
        this.tu = this.tu + this.mau * x;
    }

    void congPhanSoVoiMotPhanSo(PhanSo p) {
        this.tu = this.tu * p.mau + p.tu * this.mau;
        this.mau = this.mau * p.mau;
    }

    PhanSo congHaiPhanSo(PhanSo p1, PhanSo p2) {
        PhanSo returnValue = new PhanSo();
        returnValue.tu = p1.tu * p2.mau + p1.mau * p2.tu;
        returnValue.mau = p1.mau * p2.mau;
        return returnValue;
    }

    public void show() {
        System.out.println(this.tu + "/" + this.mau);
    }

    void rutGonPhanSo() {
        int smaller = this.tu;
        if (this.tu > this.mau) {
            smaller = this.mau;
        }
        int UCLN = 1;
        for (int i = smaller; i > 0; i--) {
            if (this.tu % i == 0 && this.mau % i == 0) {
                UCLN = i;
                break;
            }
        }
        this.tu /= UCLN; // tu = tu / UCLN
        this.mau /= UCLN;
    }
}
