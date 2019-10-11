
public class ProfessorIntegral extends Professor{
    
    private double salarioFX;

    public ProfessorIntegral(double sfx, String n, int idd, String m) {
        super(n, idd, m);
        this.setSalarioFX (sfx);
    }


    public double getSalarioFX() {
        return salarioFX;
    }

    public void setSalarioFX(double sfx) {
        this.salarioFX = sfx;
    }
}
