
public class PosGraduacao extends AlunoEspecial{
    
    private int cpf;
    
    public PosGraduacao(String n, int m,String t, int cpf){
        super(n,m,t);
        this.setCpf(cpf);
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    
}

