package concreteStrategies;

public class PushAttack implements AttackStrategy {
    @Override
    public void executeAttack(String target) {
        System.out.println("Mech pushes " + target + " to another tile!");
    }
}
