
public class Administrador extends Empregado{
    
    private double ajudaDeCusto;

    public Administrador(double ajdc, int cs, double sb, double imp, String n, String end, int tel) {
        super(cs, sb, imp, n, end, tel);
        this.setAjudaDeCusto (ajdc);
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajdc) {
        this.ajudaDeCusto = ajdc;
    }
    
    public double calcularSalario(){
        return getSalarioBase() - (ajudaDeCusto + (getSalarioBase() * getImposto()));
    }
}
