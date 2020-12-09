package mediator;

import units.ArmedUnit;

public class CommanderImpl implements Commander {
    private ArmedUnit soldierUnit, tankUnit;
    private boolean attackInProgress = true;

    @Override
    public void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit) {
        this.soldierUnit = soldierUnit;
        this.tankUnit = tankUnit;
    }

    @Override
    public void setAttackInProgress(boolean attackInProgress) {
        this.attackInProgress = attackInProgress;
    }

    @Override
    public boolean canAttack() {
        return attackInProgress;
    }

    @Override
    public void startAttack(ArmedUnit armedUnit) {
        armedUnit.attack();
    }

    @Override
    public void ceaseAttack(ArmedUnit armedUnit) {
        armedUnit.stopAttack();
    }
}