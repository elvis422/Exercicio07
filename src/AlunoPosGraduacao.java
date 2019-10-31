
public class AlunoPosGraduacao {
    
    private String nome;
    private int matricula;
    
    public AlunoPosGraduacao(String n,int m){
        this.setNome(n);
        this.setMatricula(m);
    }
    
    public String getNome(){
        return nome;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public void setMatricula(int m){
        this.matricula=m;
    }
}

