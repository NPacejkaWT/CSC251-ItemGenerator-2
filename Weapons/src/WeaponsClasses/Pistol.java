package WeaponsClasses;

public class Pistol extends Weapon
{
    /**
     * 2 string arrays to hold titles and prefixes to be assigned to object
     */
    private final String[] titles = {"Repeater", "Lacerator", "Needler", "Swatter", "Raptor", "Machine Pistol",
            "Torment", "Fury", "Rage", "Revolver", "Razor", "Masher", "Justice", "Law", "Viper"};
    private final String[] prefixes = {"Double", "Fanged","Sighted","Nasty", "Cold", "Grim", "Bloody", "Raw", "Brutal",
            "Primal", "Savage", "Vile", "Stabilized", "Swift", "Wicked"};

    /**
     *Constructor with arguments to be assigned by user
     */
    Pistol(String name, int damage, double accuracy, double fireRate, double reloadSpeed, int clip)
    {
        super(name, damage, accuracy, fireRate, reloadSpeed,clip, "Pistol");
    }

    /**
     * Default constructor with no arguments
     */
    Pistol()
    {
        super();
        /**
         * Call assignInt and assignName methods.
         * assignInt methods accept 2 integers based on subclass
         */
        weaponName = assignName();
        weaponDamage = assignInt(10, 10);
        weaponAccuracy = assignInt(50,51);
        weaponFireRate = assignInt(5,10);
        weaponReloadSpeed = assignInt(2,5);
        weaponMagSize = assignInt(6,21);
        weaponType = "Pistol";  
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
