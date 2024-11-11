public class SuperheroRoster {

    public static void main(String[] args) {
    
        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow"};
        String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat"};
        int[] powerLevels = {85, 90, 80};

        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Hero: " + heroNames[i] + ", Ability: " + abilities[i] + ", Power Level: " + powerLevels[i]);
        }

        searchHero(heroNames, abilities, powerLevels, "Iron Man");

        double averagePower = calculateAveragePower(powerLevels);
        System.out.println("Average Power Level: " + averagePower);
    }

    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("Found Hero: " + names[i] + ", Ability: " + abilities[i] + ", Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Hero not found: " + target);
        }
    }

    public static double calculateAveragePower(int[] powerLevels) {
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }
}

class Superhero {
    private String name;
    private String ability;
    private int powerLevel;
    
    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }

    public void displayHero() {
        System.out.println("Hero: " + name + ", Ability: " + ability + ", Power Level: " + powerLevel);
    }
}
