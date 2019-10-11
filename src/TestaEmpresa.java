
public class TestaEmpresa {
    
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Mato a pau","Emss","121");
        Gerente g2 = new Gerente("Supera","Madara","999");
        
        AssistenteAdministrativo aadm1 = new AssistenteAdministrativo(0.1,g1,"Thaliss","00024");
        AssistenteTecnico atec1 = new AssistenteTecnico(500, g2,"Elvis","00365");
        
    }
    
}
