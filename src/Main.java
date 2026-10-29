import concreteStrategies.*;

public class Main {
    public static void main(String[] args) {
        Mech mech= new Mech(new DirectAttack());
        mech.attack("Vek");

        mech.setStrategy(new PushAttack());
        mech.attack("Vek");

        mech.setStrategy(new ArtilleryAttack());
        mech.attack("Vek");
    }
}
