
public class Pessoa {
  
    private String nome;
    private String endereco;
    private int telefone;

    public Pessoa(String n, String end, int tel) {
        this.setNome (n);
        this.setEndereco (end);
        this.setTelefone (tel);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String end) {
        this.endereco = end;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int tel) {
        this.telefone = tel;
    }
}
