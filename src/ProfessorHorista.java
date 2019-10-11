
public class ProfessorHorista extends Professor {
    
    private double valorHora;

    public ProfessorHorista(double vh, String n, int idd, String m) {
        super(n, idd, m);
        this.setValorHora (vh);
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double vh) {
        this.valorHora = vh;
    }
}
