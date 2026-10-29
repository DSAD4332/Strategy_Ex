package concreteStrategies;

public class ArtilleryAttack implements AttackStrategy {
    @Override
    public void executeAttack(String target) {
        System.out.println("Mech fires an artillery shell at " + target + "!");
    }
}
