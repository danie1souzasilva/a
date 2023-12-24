public class Termodinamica {
    double tx;
    double tf;
    double te;
    double rt;
    double tFah;
    double tc;
    public void conceitosIniciais(){
        System.out.println("TEMPERATURA= Grau de agitação das moléculas \n " +
                "CALOR = Energia em transito entre corpos com diferente temperatura \n" +
                "EQUILÍBRIO TÉRMICO é quando os corpos tem a mesma temperatura \n" +
                "FUSÃO = temperatura que a água congela \n" +
               "EX: EM CELCIUS A AGUA ENTRA em fusão(gelo) em zero graus\n" +
                "EM FAHRENHEIT  32\n" +
                "KELVIN É 273\n" +
                "EBULIÇÃO = temperatura que a água evapora \n" +
                "EX: EM CELCIUS A AGUA ENTRA EM EBULIÇÃO (EVAPORA) EM 100 GRAUS\n" +
                "EM FAHRENHEIT 212\n" +
                "KELVIN É 373" +
                "LEI ZERO DA TERMODINAMICA => se TA = TB e TB = TC então TA = TC \n" +
                "EX: SE UMA temperatura de Brasilia é = a temperatura de Salvador\n" +
                " e a temperatura de salvador é = a temperatura de São Paulo,\n" +
                "então a temperatura de São Paulo também é igual a temperatura de Brasilia. ");
    }
    public double razaoTransformacao(){
        System.out.println(" Com essa fórmula vc pode descobrir quanto cada grau em uma escalas de temperatura (Celcius, Kelvin e Fohrenheit)equivale na em outra\n" +
                "rt = razão de transformação \n" +
                "tx = é a temperatura que vc quer transformar \n" +
                "tf = é a temperatura de fusão \n" +
                "te = é temperatura de ebulição \n" +
                "rt = tx - tf / te - tf \n" +
                "EX: SE VC QUER TRANSFORMAR UMA TEMPERATURA QUE ESTÁ EM FAHRENHEIT PARA CELCIUS FAZ O SEGUINTE COLOCA ESSA FÓRMULA EM CELCIUS = ESSA MSM FORMULA EM FAHRENHEIT\n" +
                "NÃO ENTENDEU NÉ?! CALMA!\n" +
                "supondo q quer descobrir quanto é 100 fahrenhreit transformados em celcius então\n" +
                "100 - 32 / 212 - 32 = txCELCIUS - 0 / 100 - 0\n" +
                "assim 68 / 180 = txCELCIUS / 100\n" +
                "6800 / 180 = txCELCIUS\n" +
                "então 100 graus fahrenheit é igual a 37.7 graus Celcius");
        return rt = tx - tf / te - tf;
    }
    public double transformarEmCelcius(){

        return tc = (tx-tf / te -tf)/1.8;
    }
    public double transformarEmFahrenheit(){

        return tFah = tx*1.8+32;
    }

    public double getTx() {
        return tx;
    }

    public void setTx(double tx) {
        this.tx = tx;
    }

    public double getTf() {
        return tf;
    }

    public void setTf(double tf) {
        this.tf = tf;
    }

    public double getTe() {
        return te;
    }
    public void setTe(double te) {
        this.te = te;
    }

    public double getRt() {
        return rt;
    }

    public void setRt(double rt) {
        this.rt = rt;
    }

    public Termodinamica() {
        this.tx = tx;
        this.tf = tf;
        this.te = te;
        this.rt = rt;
    }
}
