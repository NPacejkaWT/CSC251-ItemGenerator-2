package WeaponsClasses;

import java.util.ArrayList;

public class WeaponMain
{
    public static void main(String[] args)
    {
        ArrayList<Weapon> weaponArrayList = new ArrayList<>();
/**
 * Unique items made by assigning values to class variables
**/
        //Pistol the_companion = new Pistol("The Companion", 1152, 53, 11.55, 1.5, 14);
        //Shotgun the_garcia = new Shotgun("The Garcia", 27, 52, 3.00,2.6,20,8);
        //Rifle dowsing_rod = new Rifle("Dowsing Rod", 500, 70, 12.13, 40, 82);

        /**
         * Create instances of weapon subclass and add to weaponArrayList
         */
        Pistol myPistol = new Pistol();
        weaponArrayList.add(myPistol);
        Rifle myRifle = new Rifle();
        weaponArrayList.add(myRifle);
        Shotgun myShotgun = new Shotgun();
        weaponArrayList.add(myShotgun);
        Sniper mySniper = new Sniper();
        weaponArrayList.add(mySniper);
        SubMachine mySubMachine = new SubMachine();
        weaponArrayList.add(mySubMachine);



        /**
         * for loop to display item information
         */
        for (int i = 0; i < weaponArrayList.size(); i++)
        {
            System.out.println(weaponArrayList.get(i));
        }

    }
}
