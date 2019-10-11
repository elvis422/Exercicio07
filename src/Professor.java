
public class Professor {
    
    private String nome;
    private int idade;
    private String matricula;

    public Professor(String n, int idd, String m) {
        this.setNome (n);
        this.setIdade (idd);
        this.setMatricula (m);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idd) {
        this.idade = idd;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String m) {
        this.matricula = m;
    }
}
