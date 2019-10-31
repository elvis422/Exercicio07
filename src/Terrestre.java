
public class Terrestre extends Transporte{
    
    private int Nrodas;
    private String cor;
    private int Nportas;
    private String placa;
    
    public Terrestre (int cp, int nr,String c,int np,String p){
        super(cp);
        this.setNrodas(nr);
        this.setCor(c);
        this.setNportas(np);
        this.setPlaca(p);
    }

    public int getNrodas() {
        return Nrodas;
    }

    public String getCor() {
        return cor;
    }

    public int getNportas() {
        return Nportas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setNrodas(int nr) {
        this.Nrodas = nr;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public void setNportas(int np) {
        this.Nportas = np;
    }

    public void setPlaca(String p) {
        this.placa = p;
    }
    
    
}
