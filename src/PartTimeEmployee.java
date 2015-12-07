
public class PartTimeEmployee extends Employee {
    
    public PartTimeEmployee() {
        super();
    }

    @Override
    double getPay() {
        pay = rate*hours;
        return pay;
    }
    
}
