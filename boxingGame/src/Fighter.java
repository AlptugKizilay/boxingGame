public class Fighter {
    String name;
    int age;
    int weight;
    int health;
    int damage;
    double dodge;

    Fighter(String name, int age, int weight, int health, int damage, double dodge) {
        this.name = name;
        this.health = health;
        this.weight = weight;
        this.age = age;
        this.dodge = dodge;
        this.damage = damage;

    }

    int hit(Fighter foe) {

        System.out.println(this.name + " => " + foe.name + " " + this.damage + " damage!");
        if (foe.dodge()) {
            System.out.println(foe.name + " block!");
            return foe.health;

        }

        if (foe.health < 0) {
            return 0;
        }
        return foe.health - this.damage;

    }

    boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;

    }


}


