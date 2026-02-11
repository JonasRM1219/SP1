public class SP1 {
    public static void main(String[] args) {
        System.out.println("BATTLE!");


        Hero egor = new Hero("Egor", "Warrior");
        Hero thor = new Hero("Thor", "Mage");
        egor.visInfo();
        thor.visInfo();

        System.out.println("\nKAMP START");

        thor.tagSkade(40);
        egor.tagSkade(35);
        egor.heal(15);
        thor.heal(10);
        thor.tagSkade(50);
        System.out.println("\nKAMP SLUT");
        egor.visStatus();
        thor.visStatus();

        System.out.println("\nBELØNNING");
        egor.addXP(1500);

        egor.setNavn("Novice Warrior");
        System.out.println("\nEGOR'S Inventory:");
        egor.visInventory();
    }
}

class Hero {
    String navn;
    String klasse;
    int health;
    int maxHealth;
    int level;
    int xp;
    String[] tasker;

    public Hero(String navn, String klasse) {
        this.navn = navn;
        this.klasse = klasse;
        this.level = 1;
        this.maxHealth = 100;
        this.health = maxHealth;
        this.xp = 0;
        this.tasker = new String[]{"Sværd", "Skjold", "Healing potion"};

        if (klasse.equals("Mage")) {
            this.maxHealth = 60;
            this.health = 60;
        }
    }

    public void visInfo() {
        System.out.println("\n" + navn + " (" + klasse + ")");
        System.out.println("Level: " + level + " | Health: " + health + "/" + maxHealth);
    }

    public void visStatus() {
        String status = erILive() ? "LEVENDE" : "DØD";
        System.out.println(navn + ": " + health + "/" + maxHealth + " HP - " + status);
    }

    public void tagSkade(int skade) {
        System.out.println(navn + " tager " + skade + " skade");
        health -= skade;

        if (health <= 0) {
            health = 0;
            System.out.println(navn + " dør");
        }
    }

    public void heal(int helbredelse) {
        int gammelHealth = health;
        health += helbredelse;

        if (health > maxHealth) {
            health = maxHealth;
        }

        System.out.println(navn + " heler " + (health - gammelHealth) + " HP");
    }

    public void addXP(int xpBeløb) {
        if (!erILive()) {}

        System.out.println(navn + " får " + xpBeløb + " XP!");
        xp += xpBeløb;

        while (xp >= level * 1000) {
            levelUp();
        }
    }

    private void levelUp() {
        level++;
        maxHealth += 20;
        health = maxHealth;
        xp -= (level - 1) * 1000;

        System.out.println("LEVEL UP! Nu level " + level);
        String nytNavn = "Novice Warrior";{
            String gammeltNavn = this.navn;
            this.navn = nytNavn;
            System.out.println( gammeltNavn + " Ny rank: " + this.navn);
        }
        System.out.println("+20 Health");
        System.out.println("Ny max health: " + maxHealth);
        System.out.println("+10 Coins");
    }

    public boolean erILive() {
        return health > 0;
    }

    public void visInventory() {
        System.out.println("Mønter: 10");
        for (int i = 0; i < tasker.length; i++) {
            System.out.println("  " + (i + 1) + ". " + tasker[i]);

        }
    }
    public void setNavn(String noviceWarrior) {
    }
}
