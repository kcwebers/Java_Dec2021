import java.util.ArrayList;

public class Human {
    // attributes
    private String name;
    private int age;

    private int health = 100;

    private int wisdom = 3;
    private int strength = 3;
    private int dexterity = 3;

    private static int allHumans = 0;

    // contructors
    public Human() {
        allHumans ++;
    }

    public Human(String name) {
        this.name = name;
        allHumans ++;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        allHumans ++;
    }

    // instance methods
    // public void eat() {
    //     System.out.println(this.name + " is eating an apple! om nom nom!");
    //     this.health += 5;
    // }

    public void eat(int foodCalories) {
        System.out.println(this.name + " is eating an apple! om nom nom!");
        this.health += foodCalories;
    }

    public Human getPoisoned() {
        System.out.println(this.name + " is poisoned! Oh no!");
        this.health -= 3;
        return this;
    }

    public void pastaAndCreamSauce() {
        System.out.println(this.name + " was fully regenerated!!");
        this.health = 100;
    }

    public void attack(Human attackee) {
        attackee.health -= this.strength;
        // attackee.setHealth(attackee.getHealth() - this.strength);
    }

    // getters & setters
    public static int getAllHumans() {
        return allHumans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }


}
