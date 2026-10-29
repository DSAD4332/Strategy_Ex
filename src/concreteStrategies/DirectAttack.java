package concreteStrategies;

public class DirectAttack implements AttackStrategy {
    @Override
    public void executeAttack(String target) {
        System.out.println("Mech punches " + target + " at close range!");
    }
}
