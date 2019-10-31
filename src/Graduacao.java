
public class Graduacao extends AlunoEspecial{
    
    private String graduacao;
    
    public Graduacao(String n, int m, String t,String g){
        super(n,m,t);
        this.setGraduacao(g);
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String g) {
        this.graduacao = g;
    }
    
}

