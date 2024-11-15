package WeaponsClasses;

public class Rifle extends Weapon
{
    /**
     * 2 string arrays to hold titles and prefixes to be assigned to object
     */
    private final String[] titles = {"Rifle", "Cobra", "Pounder", "Stomper", "Machine Gun", "Havoc", "Mauler", "Massacre"};
    private final String[] prefixes = {"Deathly", "Intense", "Punishing", "Short", "Frantic", "Glorious", "Rowdy", "Shattering", "Support"};

    /**
     *Constructor with arguments to be assigned by user
     */
    Rifle(String name, int damage, double accuracy, double fireRate, double reloadSpeed, int clip)
    {
        super(name, damage, accuracy, fireRate, reloadSpeed, clip);
    }

    /**
     * Default constructor with no arguments
     */
    Rifle()
    {
        super();
        /**
         * Call assignInt and assignName methods.
         * assignInt methods accept 2 integers based on subclass
         */
        weaponName = assignName();
        weaponDamage = assignInt(10,16);
        weaponAccuracy = assignInt(50,51);
        weaponFireRate = assignInt(5,10);
        weaponReloadSpeed = assignInt(3,7);
        weaponMagSize = assignInt(30,91);
    }

    /**
     *
     * @return concat string consisting of selected title and prefix and assigns it to item name variable
     */
    public String assignName()
    {
        String title = assignTitle(titles);
        String prefix = assignPrefix(prefixes);

        return prefix.concat(" "+title);
    }

}
