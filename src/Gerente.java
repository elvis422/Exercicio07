
public class Gerente extends Funcionario{
    
    private String departamento;

    public Gerente(String d, String n, String m) {
        super(n, m);
        this.setDepartamento (d);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
