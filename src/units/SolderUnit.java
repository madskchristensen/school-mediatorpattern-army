package units;

import mediator.Commander;

public class SolderUnit implements ArmedUnit {
    private final Commander commander;

    public SolderUnit(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void attack() {
        if(commander.canAttack()) {
            System.out.println("SoldierUnit: Attacking...");
            commander.setAttackInProgress(false);
        } else {
            System.out.println("SoldierUnit: Cannot attack now. Other units attacking...");
        }
    }

    @Override
    public void stopAttack() {
        System.out.println("SoldierUnit: Stopped attacking...");
        commander.setAttackInProgress(true);
    }
}
