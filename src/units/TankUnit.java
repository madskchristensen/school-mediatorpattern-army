package units;

import mediator.Commander;

public class TankUnit implements ArmedUnit {
    private final Commander commander;

    public TankUnit(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void attack() {
        if(commander.canAttack()) {
            System.out.println("TankUnit: Attacking...");
            commander.setCanAttack(false);
        } else {
            System.out.println("TankUnit: Cannot attack now. Other units attacking...");
        }
    }

    @Override
    public void stopAttack() {
        System.out.println("TankUnit: Stopped attacking...");
        commander.setCanAttack(true);
    }
}
