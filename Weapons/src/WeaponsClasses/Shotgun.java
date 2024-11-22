package WeaponsClasses;

public class Shotgun extends Weapon
{
    /**
     * 2 string arrays to hold titles and prefixes to be assigned to object
     */
    private final String[] titles = {"Shotgun", "Matador", "Shredder", "Carnage", "Scattergun", "Brute",
            "Death", "Sweeper"};
    private final String[] prefixes = {"Riot", "Angry","Painful","Raging", "Spiked", "Frenzied", "Jagged", "Hunter's"};
    /**
     * set pellet count unique to this subclass
     */
    private int pellets = 4;

    /**
     *Constructor with arguments to be assigned by user
     */
    public Shotgun(String name, int damage, double accuracy, double fireRate, double reloadSpeed, int clip, int pellets)
    {
        super(name, damage, accuracy, fireRate, reloadSpeed, clip, "Shotgun");
        this.pellets = pellets;
    }

    /**
     * Default constructor with no arguments
     */
    public Shotgun()
    {
        super();
        /**
         * Call assignInt and assignName methods.
         * assignInt methods accept 2 integers based on subclass
         */
        weaponName = assignName();
        weaponDamage =assignInt(20,51);
        weaponAccuracy = assignInt(30,31);
        weaponFireRate = assignInt(5,10);
        weaponReloadSpeed = assignInt(2,5);
        weaponMagSize = assignInt(2,10);
        weaponType = "Shotgun";
    }

    public int getPellets()
    {
        return this.pellets;
    }

    /**
     *
     * @return concat string consisting of selected title and prefix and assigns it to item name variable
     */
    public String assignName()
    {
        String title = assignTitle(titles);
        String prefix = assignPrefix(prefixes);

        return prefix.concat(" " + title);
    }

    /**
     *
     * @return override toString method in Weapon class to include pellets variable
     */
    public String toString()
    {
        return  weaponName + "\nDamage: " + weaponDamage + "x" + pellets + "\nAccuracy: " +
                weaponAccuracy + "\nFire Rate: " + weaponFireRate + "\nReload Speed: " +
                weaponReloadSpeed + "\nMagazine: " + weaponMagSize + "\n";
    }
}
