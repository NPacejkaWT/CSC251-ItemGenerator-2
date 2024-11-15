package WeaponsClasses;

public class Weapon
{
    /**
     * Item basic attributes
     */
    protected String weaponName;
    protected int weaponDamage;
    protected double weaponAccuracy;
    protected double weaponFireRate;
    protected double weaponReloadSpeed;
    protected int weaponMagSize;

    /**
     * Default constructor with no variables.
     * Assigns values to variables using Math.random() without user input
     */
    public Weapon()
    {

    }

    /**
     *Constructor that takes input
     */
    Weapon(String name, int damage, double accuracy, double fireRate, double reloadSpeed, int clip)
    {
        weaponName = name;
        weaponDamage = damage;
        weaponAccuracy = accuracy;
        weaponFireRate = fireRate;
        weaponReloadSpeed = reloadSpeed;
        weaponMagSize = clip;

    }

    /**
     *Setter Functions
     */
    public void setWeaponName(String name)
    {
        weaponName = name;
    }

    public void setWeaponDamage(int damage)
    {
        weaponDamage = damage;
    }

    public void setWeaponAccuracy(double accuracy)
    {
        weaponAccuracy = accuracy;
    }

    public void setWeaponFireRate(double fireRate)
    {
        weaponFireRate = fireRate;
    }

    public void setWeaponReloadSpeed(double reloadSpeed)
    {
        weaponReloadSpeed = reloadSpeed;
    }

    public void setWeaponMagSize(int clip)
    {
        weaponMagSize = clip;
    }

    /**
     *Getter functions
     */
    public String getWeaponName()
    {
        return weaponName;
    }

    public int getWeaponDamage()
    {
        return weaponDamage;
    }

    public double getWeaponAccuracy()
    {
        return weaponAccuracy;
    }

    public double getWeaponFireRate()
    {
        return weaponFireRate;
    }

    public double getWeaponReloadSpeed()
    {
        return weaponReloadSpeed;
    }

    public int getWeaponMagSize()
    {
        return weaponMagSize;
    }

    /**
     *When called assign random integer based on arguments from subclass.
     */
    public int assignInt(int num1, int num2)
    {
        return num1 + (int) (Math.random() * num2);
    }

    /**
     *When called assign random double based on arguments from subclass.
     * Currently, not in use.
     */
    public double assignDouble(double d1, double d2)
    {
        return d1 + (Math.random() * d2);
    }

    /**
     *When called returns random integer based on passed array's length.
     */
    public String assignPrefix(String[] prefixes)
    {
        int index = (int)(Math.random()*prefixes.length);
        return prefixes[index];
    }

    /**
     *When called returns random integer based on passed array's length.
     */
    public String assignTitle(String[] titles)
    {
        int index = (int)(Math.random()*titles.length);
        return titles[index];
    }

    /**
     *
     * @return string that displays item information
     */
    public String toString()
    {
        return  weaponName + "\nDamage: " + weaponDamage + "\nAccuracy: " + weaponAccuracy +
                "\nFire Rate: " + weaponFireRate + "\nReload Speed: " + weaponReloadSpeed +
                "\nMagazine: " + weaponMagSize + "\n";
    }
}
