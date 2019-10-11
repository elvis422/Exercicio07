
public class AssistenteAdministrativo extends Assistente{
    
    private double adicional;

    public AssistenteAdministrativo(double a, Gerente s, String n, String m) {
        super(s, n, m);
        this.setAdicional (a);
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double a) {
        this.adicional = a;
    }
}
