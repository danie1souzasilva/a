public class Muv {
    double v;
    double vO;
    double a;
    double t;
    public double calcularVelocidade(){
        return v = vO + a * t;
    }
    public double calcularVinicial(){
        return vO = v/(a * t);
    }
    public double calcularAceleracaoMuv(){
        return a = v-vO/t;
    }
    public double calcularTempoMuv(){
        return t = v-vO/a;
    }

    public Muv() {
        this.v = v;
        this.vO = vO;
        this.a = a;
        this.t = t;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getvO() {
        return vO;
    }

    public void setvO(double vO) {
        this.vO = vO;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
}
