
public class Operario extends Empregado{
    
    private double valorProducao;
    private double comissao;

    public Operario(double vp, double com, int cs, double sb, double imp, String n, String end, int tel) {
        super(cs, sb, imp, n, end, tel);
        this.setValorProducao (vp);
        this.setComissao (com);
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double vp) {
        this.valorProducao = vp;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double com) {
        this.comissao = com;
    }
    
    public double calcularSalario(){
        return ((valorProducao * comissao) + getSalarioBase()) - (getSalarioBase() * getImposto());
    }
}
