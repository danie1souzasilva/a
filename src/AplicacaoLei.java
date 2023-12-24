import java.util.Scanner;


public class AplicacaoLei {

    public static void main(String[] args) {
        Scanner principal = new Scanner(System.in);

        Formulas geral = new Formulas();
        System.out.println("Se vc quiser sair digite sair ou digite qualquer coisa pra continuar");
        String formula = principal.nextLine();
        geral.setFormula(formula);
        while (!geral.formula.equalsIgnoreCase("sair")) {
            System.out.println("qual formula vc quer aprender hoje?");
            formula = principal.nextLine();
            geral.setFormula(formula);
            System.out.println("Então vamo lá, vc escolheu a fórmula: " + geral.formula);
            if (formula.equalsIgnoreCase("primeira lei de newton")) {
                PrimeiraLei leiUm = new PrimeiraLei();
                System.out.println
                        ("Com esse sisteminha vc poderá calcular questões sobre primeira lei de Newton");
                System.out.println("Vamo la. Oq vc quer descobrir? força, massa ou aceleração?");
                String calcular = principal.next();
                if (calcular.equalsIgnoreCase("força")) {
                    System.out.println("Digite a massa ");
                    double massa = principal.nextDouble();
                    leiUm.setMassa(massa);
                    System.out.println("Agora a aceleração");
                    double aceleracao = principal.nextDouble();
                    leiUm.setAceleracao(aceleracao);
                    System.out.println("A força resultante é: " + leiUm.calcularForca());

                } else if (calcular.equalsIgnoreCase("massa")) {
                    System.out.println("Digite a força");
                    double forca = principal.nextDouble();
                    leiUm.setForca(forca);
                    System.out.println("Agora a aceleração");
                    double aceleracao = principal.nextDouble();
                    leiUm.setAceleracao(aceleracao);
                    System.out.println("A massa resultante é: " + leiUm.calcularMassa());

                } else if (calcular.equalsIgnoreCase("aceleração")) {
                    System.out.println("Digite força");
                    double forca = principal.nextDouble();
                    leiUm.setForca(forca);
                    System.out.println("Agora a massa");
                    double massa = principal.nextDouble();
                    leiUm.setMassa(massa);
                    System.out.println("A aceleração resultante é: " + leiUm.calcularAceleracao());

                } else {
                    System.out.println("Tu digitou errado meu parceiro!!!");
                    break;
                }
            }
            else if (formula.equalsIgnoreCase("movimento uniforme variado")) {
                Muv muv = new Muv();
                System.out.println("Com essa formula voce será capaz de resolver questões onde o objeto esta em movimento inconstante com aceleração");
                System.out.println("Tudo bem, qual variável vc quer calcular? velocidade, velocidade inicial, aceleração ou tempo");
                String calcular = principal.nextLine();
                if (calcular.equalsIgnoreCase("velocidade")) {
                    System.out.println("Então vamos descobrir a velocidade");
                    System.out.println("digite a velocidade inicial ");
                    double vO = principal.nextDouble();
                    muv.setvO(vO);
                    System.out.println("Agora a aceleração");
                    double a = principal.nextDouble();
                    muv.setA(a);
                    System.out.println("Por fim a variação do tempo");
                    double t = principal.nextDouble();
                    muv.setT(t);
                    System.out.println("a velocidade é: " + muv.calcularVelocidade());
                } else if (calcular.equalsIgnoreCase("velocidade inicial")) {
                    System.out.println("Então vamos descobrir a velocidade inicial");
                    System.out.println("digite a velocidade  ");
                    double v = principal.nextDouble();
                    muv.setV(v);
                    System.out.println("Agora a aceleração");
                    double a = principal.nextDouble();
                    muv.setA(a);
                    System.out.println("Por fim a variação do tempo");
                    double t = principal.nextDouble();
                    muv.setT(t);
                    System.out.println("a velocidade inicial é: " + muv.calcularVinicial());
                } else if (calcular.equalsIgnoreCase("aceleração")) {
                    System.out.println("Então vamos descobrir a aceleração");
                    System.out.println("digite a velocidade  ");
                    double v = principal.nextDouble();
                    muv.setV(v);
                    System.out.println("Agora a velocidade inicial");
                    double vO = principal.nextDouble();
                    muv.setvO(vO);
                    System.out.println("Por fim a variação do tempo");
                    double t = principal.nextDouble();
                    muv.setT(t);
                    System.out.println("a aceleração é: " + muv.calcularAceleracaoMuv());
                } else if (calcular.equalsIgnoreCase("tempo")) {
                    System.out.println("Então vamos descobrir o tempo");
                    System.out.println("digite a velocidade  ");
                    double v = principal.nextDouble();
                    muv.setV(v);
                    System.out.println("Agora a velocidade inicial");
                    double vO = principal.nextDouble();
                    muv.setvO(vO);
                    System.out.println("Por fim a aceleração");
                    double a = principal.nextDouble();
                    muv.setA(a);
                    System.out.println("a variação do tempo é: " + muv.calcularTempoMuv());
                } else {
                    System.out.println("Não existe essa variável no MUV");
                }
            } else if (formula.equalsIgnoreCase("termodinamica")) {
                Termodinamica termo = new Termodinamica();
                System.out.println("Aprenda transformação de escalas");
                System.out.println("Em qual escala vc quer transformar?");
                String escala = principal.nextLine();
                if (escala.equalsIgnoreCase("fahrenheit")) {
                    System.out.println("Então vamo transformar a temperatura em Fahrenheit");
                    System.out.println("Digite a temperatura que quer transformar em Fahrenheit");
                    double tx = principal.nextDouble();
                    termo.setTx(tx);
                    System.out.println("agora digite a temperatura de fusão da escala em que a temperatura está");
                    double tf = principal.nextDouble();
                    termo.setTf(tf);
                    System.out.println("por fim digite a temperatura de ebulição da escala em que a temperatura está");
                    double te = principal.nextDouble();
                    termo.setTe(te);
                    termo.tFah = termo.transformarEmFahrenheit();
                    System.out.println("Em fahrenheit essa temperatura é: " + termo.transformarEmFahrenheit());
                }else if(escala.equalsIgnoreCase("celsius")){
                    System.out.println("então vamo transformar em celsius");
                    System.out.println("digite a temperatura que quer transformar em celsius");
                    double tx = principal.nextDouble();
                    termo.setTx(tx);
                    System.out.println("agora digite a temperatura de fusão da escala em que a temperatura está");
                    double tf = principal.nextDouble();
                    termo.setTf(tf);
                    System.out.println("por fim digite a temperatura de ebulição da escala em que a temperatura está");
                    double te = principal.nextDouble();
                    termo.setTe(te);
                    termo.tc = termo.transformarEmCelcius();
                    System.out.println("Em celsius essa temperatura é: " + termo.transformarEmCelcius());
                }
            } else {
                System.out.println("Fórmula não encontrada");
            }

        }


    }
}

