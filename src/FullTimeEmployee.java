
public class FullTimeEmployee extends Employee {

    public FullTimeEmployee() {
        super();
    }

    @Override
    double getPay() {
        if (hours > 40) {
            pay = rate * 40 + (hours - 40) * (rate * 2);
        } else {
            pay = rate * hours;
        }
        return pay;

    }

}
