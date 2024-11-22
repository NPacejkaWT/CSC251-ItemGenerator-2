package WeaponsClasses;

public class Sniper extends Weapon
{
    /**
     * 2 string arrays to hold titles and prefixes to be assigned to object
     */
    private final String[] titles = {"Sniper", "Gamble", "Hawkeye", "Thunder", "Lance", "Wrath", "Harpoon"};
    private final String[] prefixes = {"Distant", "Heavy", "Long", "Rolling", "Brisk", "Deep", "Sober", "Vicious", "Liquid"};

    /**
     *Constructor with arguments to be assigned by user
     */
    Sniper(String name, int damage, double accuracy, double fireRate, double reloadSpeed, int clip)
    {
        super(name,damage,accuracy,fireRate,reloadSpeed,clip, "Sniper");
    }

    /**
     * Default constructor with no arguments
     */
    Sniper()
    {
        super();
        /**
         * Call assignInt and assignName methods.
         * assignInt methods accept 2 integers based on subclass
         */
        weaponName = assignName();
        weaponDamage = assignInt(90, 100);
        weaponAccuracy = assignInt(20,81);
        weaponFireRate = assignInt(2,5);
        weaponReloadSpeed = assignInt(5,6);
        weaponMagSize = assignInt(4,10);
        weaponType = "Sniper";
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
