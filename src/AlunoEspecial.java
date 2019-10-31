
public class AlunoEspecial extends AlunoPosGraduacao{
    
   private String tipo;
   
   public AlunoEspecial(String n,int m, String t){
       super(n,m);
       this.setTipo(t);
   }
   
   public String getTipo(){
    return tipo;
    
}   
    public void setTipo(String t){
        this.tipo=t;
    }
}
