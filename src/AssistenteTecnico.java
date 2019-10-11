
public class AssistenteTecnico extends Assistente{

    private double bonus;
    
    public AssistenteTecnico(double b, Gerente s, String n, String m) {
        super(s, n , m);
        this.setBonus(b);
    }
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double b) {
        this.bonus = b;
    }
}
