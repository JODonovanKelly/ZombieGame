public class Weapons {

    private String name;
    private int range;
    private int damage;

    Weapons(String name, int range, int damage){
        setName(name);
        setRange(range);
        setDamage(damage);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getRange() {
        return range;
    }

    public int getDamage() {
        return damage;
    }

    public String toString(){
        return "Name: " + getName() + "  Range: " + getRange() + "  Damage: " + getDamage() + "\n";
    }
}