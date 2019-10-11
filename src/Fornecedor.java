
public class Fornecedor extends Pessoa{
    
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(double vc, double vd, String n, String end, int tel) {
        super(n, end, tel);
        this.setValorCredito (vc);
        this.setValorDivida (vd);
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double vc) {
        this.valorCredito = vc;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double vd) {
        this.valorDivida = vd;
    }
    
    public double obterSaldo(){
       return valorCredito - valorDivida; 
    }
}
