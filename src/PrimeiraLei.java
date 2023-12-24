public class PrimeiraLei {
    private double forca;
    private double massa;
    private double aceleracao;


        public double calcularForca () {
            return forca = massa * aceleracao;
        }

        public double calcularMassa () {
            return massa = forca / aceleracao;
        }

        public double calcularAceleracao () {
            return aceleracao = forca / massa;
        }

    public PrimeiraLei() {
            this.forca = forca;
            this.massa = massa;
            this.aceleracao = aceleracao;
        }

        public double getForca () {
            return forca;
        }

        public void setForca ( double forca){
            this.forca = forca;
        }

        public double getMassa () {
            return massa;
        }

        public void setMassa ( double massa){
            this.massa = massa;
        }

        public double getAceleracao () {
            return aceleracao;
        }

        public void setAceleracao ( double aceleracao){
            this.aceleracao = aceleracao;
        }

}
