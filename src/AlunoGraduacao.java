
public class AlunoGraduacao extends AlunoEspecial{
    
    private String curso;
    
    public AlunoGraduacao(String n,int m,String t, String c){
        super(n,m,t);
        this.setCurso(c);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String c) {
        this.curso = c;
    }
}
