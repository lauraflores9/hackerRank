package examples.day19;

public class Hero implements Character{

    public String weapon = "the force";

    @Override
    public void attack() {
        System.out.println("The hero attacks the enemy");
    }

    @Override
    public void heal() {
        System.out.println("The enemy heals YOU");
    }

    @Override
    public String getWeapon() {
        return weapon;
    }
}
