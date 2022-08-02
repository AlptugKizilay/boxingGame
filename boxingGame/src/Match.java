public class Match {
    int maxWeight;
    int minWeight;
    int maxAge;
    int minAge;
    Fighter f1;
    Fighter f2;
    int i = 1;

    Match(int maxWeight, int minWeight, int maxAge, int minAge, Fighter f1, Fighter f2) {
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        this.maxAge = maxAge;
        this.minAge = minAge;
        this.f1 = f1;
        this.f2 = f2;

    }

    void run() {
        if (checkAge() && checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("Round: " + i);
                i++;
                int chance = Math.round((float) Math.random());
                if (chance == 0) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                }
                if (chance == 1) {
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }
                printScore();
            }

        } else {
            System.out.println("Boxers weight doesn't match!");
        }
    }

    boolean checkWeight() {
        return this.minWeight <= f1.weight && this.maxWeight >= f1.weight && this.minWeight <= f2.weight && this.maxWeight >= f2.weight;
    }

    boolean checkAge() {
        return this.minAge <= f1.age && this.maxAge >= f1.age && this.minAge <= f2.age && this.maxAge >= f2.age;

    }

    boolean isWin() {
        if (f1.health <= 0) {
            System.out.println(f2.name + " win!");
            return true;
        }
        if (f2.health <= 0) {
            System.out.println(f1.name + " win!");
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println(f1.name + " Remaining health \t:" + f1.health);
        System.out.println(f2.name + " Remaining health \t:" + f2.health);
        System.out.println("------------");
    }


}
