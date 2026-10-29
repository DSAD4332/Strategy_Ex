import concreteStrategies.AttackStrategy;

public class Mech {
    private AttackStrategy strategy;

    public Mech(AttackStrategy strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void attack(String target) {
        if (strategy == null) {
            throw new IllegalStateException("Attack strategy is not set");
        }
        strategy.executeAttack(target);
    }
}
