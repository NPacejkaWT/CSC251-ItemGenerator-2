package WeaponsClasses;

public class SubMachine extends Weapon
{
    /**
     * 2 string arrays to hold titles and prefixes to be assigned to object
     */
    private final String[] titles = {"SMG", "Anarchy", "Bruiser", "Thumper", "Stinger"};
    private final String[] prefixes = {"Double", "Relentless", "Ruthless", "Twisted"};
     /**
     *Constructor with arguments to be assigned by user
     */
    SubMachine(String name, int damage, double accuracy, double fireRate, double reloadSpeed, int clip)
    {
        super(name, damage, accuracy, fireRate, reloadSpeed,clip, "Submachine gun");
    }

    /**
     * Default constructor with no arguments
     */
    SubMachine()
    {
        super();
        /**
         * Call assignInt and assignName methods.
         * assignInt methods accept 2 integers based on subclass
         */
        weaponName = assignName();
        weaponDamage = assignInt(5,16);
        weaponAccuracy = assignInt(50,51);
        weaponFireRate = assignInt(5,10);
        weaponReloadSpeed = assignInt(2,5);
        weaponMagSize = assignInt(6,21);
        weaponType = "Submachine Gun";
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
}
