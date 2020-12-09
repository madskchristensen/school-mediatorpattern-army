import units.ArmedUnit;
import units.SolderUnit;
import units.TankUnit;
import mediator.Commander;
import mediator.CommanderImpl;

public class Main {

    public static void main(String[] args) {
        Commander commander = new CommanderImpl();
        ArmedUnit soldierUnit = new SolderUnit(commander);
        ArmedUnit tankUnit = new TankUnit(commander);

        commander.registerArmedUnits(soldierUnit, tankUnit);
        commander.startAttack(soldierUnit);
        commander.startAttack(tankUnit);
        commander.ceaseAttack(soldierUnit);
        commander.startAttack(tankUnit);
    }
}