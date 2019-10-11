
public class Empregado extends Pessoa{
    
    private int codSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(int cs, double sb, double imp, String n, String end, int tel) {
        super(n, end, tel);
        this.setCodSetor (cs);
        this.setSalarioBase (sb);
        this.setImposto (imp);
    }

    public int getCodSetor() {
        return codSetor;
    }

    public void setCodSetor(int cs) {
        this.codSetor = cs;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double sb) {
        this.salarioBase = sb;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imp) {
        this.imposto = imp;
    }
    
    public double calcularSalario(){
        return salarioBase - (salarioBase * imposto);
    }
}
