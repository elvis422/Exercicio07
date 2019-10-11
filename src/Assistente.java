
public class Assistente extends Funcionario {
    
    private Gerente supervisor;

    public Assistente(Gerente s, String n, String m) {
        super(n, m);
        this.setSupervisor (s);
    }

    public Gerente getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Gerente s) {
        this.supervisor = s;
    }
}
