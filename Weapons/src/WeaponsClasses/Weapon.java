package WeaponsClasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Weapon {
    /**
     * Item basic attributes
     */
    protected String weaponName;
    protected int weaponDamage;
    protected double weaponAccuracy;
    protected double weaponFireRate;
    protected double weaponReloadSpeed;
    protected int weaponMagSize;
    protected String weaponType;
    protected List<Attachment> attachments = new ArrayList<>();

    /**
     * Generates random attachments for the weapon, ensuring no duplicates.
     */
    public void generateAttachments() {
        String[] attachmentNames = {"4xScope", "Grip", "Laser", "Extended Mag", "Suppressor", "Flashlight", "Stock", "Incendiary Rounds","Piercing Rounds" };
        Set<String> uniqueAttachmentNames = new HashSet<>();

        while (attachments.size() < 3) {
            String randomName = attachmentNames[(int) (Math.random() * attachmentNames.length)];

            // Only add if not already in the set
            if (uniqueAttachmentNames.add(randomName)) {
                attachments.add(new Attachment(randomName)); // Add to attachments list
            }
        }
    }

    /**
     * Default constructor with no variables.
     * Assigns values to variables using Math.random() without user input
     */
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
    Weapon(String name, int damage, double accuracy, double fireRate, double reloadSpeed, int clip, String type)
    {
        weaponName = name;
        weaponDamage = damage;
        weaponAccuracy = accuracy;
        weaponFireRate = fireRate;
        weaponReloadSpeed = reloadSpeed;
        weaponMagSize = clip;
        weaponType = type;

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
    public void setWeaponType(String type) 
    { 
        weaponType = type; 
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
    public String getWeaponType() 
    { 
        return weaponType; 
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
    public String toString() {
        StringBuilder result = new StringBuilder("Weapon Type: " + weaponType + "\n" +
                weaponName + "\nDamage: " + weaponDamage + "\nAccuracy: " + weaponAccuracy +
                "\nFire Rate: " + weaponFireRate + "\nReload Speed: " + weaponReloadSpeed +
                "\nMagazine: " + weaponMagSize + "\nAttachments:\n");
    
        for (Attachment attachment : attachments) {
            result.append("  - ").append(attachment).append("\n");
        }
    
        return result.toString();
    }
}
