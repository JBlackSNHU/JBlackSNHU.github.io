package com.example.riftscompanion.DataBank;

import com.example.riftscompanion.Weapon;

import java.util.ArrayList;

public class WeaponData {
    private final ArrayList<Weapon> weaponsList;
    public ArrayList<Weapon> getWeaponsList() { return weaponsList; }

    public WeaponData() {
        this.weaponsList = CreateWeaponsList();
    }


    private ArrayList<Weapon> CreateWeaponsList() {
        ArrayList<Weapon> weapons = new ArrayList<>();

        weapons.add( new Weapon(
                0,
                "Wilk's 320 Laser Pistol",
                "Wilk's",
                "An excellent laser pistol known for its durability, range, accuracy and light weight. It is a sleek, black plastic and ceramic weapon popular among most mercenaries and adventurers; Headhunters and City Rats are especially fond of the Wilk's series of laser weapons.",
                "2 lbs (0.9kg)",
                "1000 feet (305 m)",
                "Each blast counts as one melee attack",
                "20 shots",
                "1D6 M.D.",
                null,
                "11,000 credits"
        ));

        weapons.add( new Weapon(
                0,
                "Wilk's Portable Laser Torch",
                "Wilk's",
                "A wonderful tool for cutting and welding. The laser welding gun is the familiar Wilk's black, lightweight plastic and ceramic construction. A power cord connects the gun to its portable power pack that can be hooked to a belt or fit in a backpack, tool case, or duffle bag. The power pack is charged by two standard weapon E-Clips. It is designed to be a tool, not a weapon. The torch can cut through an S.D.C. structure like butter. Remember, one M.D. point is about one hundred S.D.C., thus the torch can slice through 600 S.D.C. points of metal in 15 seconds on the 1D6 M.D. setting.",
                "1 lb (0.45kg)",
                "10 feet (3m)",
                "Each cut or weld counts as one melee attack",
                "100 shots or about two hours of continuous user per pair of E-Clips",
                "1D4, 1D6, 2D4, 3D6, and 4D6 M.D.",
                "1D6, 3D6, 6D6, 1D6x10 S.D.",
                "7,000 credits"
        ));

        weapons.add( new Weapon(
                0,
                "Wilk's 447 Laser Rifle",
                "Wilk's",
                "A rifle version of the handgun that is a sleek, black plastic and ceramic weapon with all the usual features of a Wilk's product.",
                "5 lbs (2.25kg)",
                "2000 feet (610m)",
                "Each blast counts as one melee attack",
                "20 shots per standard clip, can not user a Long E-Clip",
                "3D6 M.D.",
                null,
                "18,000 credits"
        ));

        weapons.add( new Weapon(
                0,
                "Wilk's Laser Wand",
                "Wilk's",
                "A small pen or pocket flashlight size item, about 6 inches (15.2cm) long. It is designed for detail laser work on electronics. The handy little device has one Mega-Damage setting and four S.D.C. settings. It is designed for close work, 1 -3 feet (0.3 to 0.9 m), and not meant to be a weapon.",
                "2 oz (56.7g)",
                "10 feet (3m)",
                "Each cut or weld counts as one melee attack",
                "50 shots",
                "1 M.D.",
                "1D4, 1D6, 2D6, 3D6 S.D.",
                "2,000 credits. Mini-E-Clip 200 credits"
        ));

        weapons.add( new Weapon(
                0,
                "NG-57 Northern Gun Heavy-Duty Ion Blaster",
                "Northern Gun",
                "Northern Gun, located in the northern peninsula of Michigan (see World Overview, page 29), is one of the largest manufacturers of non-Coalition arms on the continent. The NG-57 is a sturdy pistol that packs a wallop, but is comparatively heavy. A variety of scopes can be attached. The scope in the illustration is a standard telescopic sight for pistol or rifle.",
                "5 lbs (2.25kg)",
                "500 feet (152m)",
                "Each blast counts as one melee attack",
                "10 shots",
                "Two settings, 2D4 or 3D6 M.D.",
                null,
                "8,000 credits"
        ));

        weapons.add( new Weapon(
                0,
                "NG-Super Laser Pistol and Grenade Launcher",
                "Northern Gun",
                "A powerful short-range weapon with the dual functions of laser gun and grenade launcher. The weapon resembles a submachine-gun or a sawed-off shotgun more than a pistol. The kick from the grenade launcher is tremendous and the weapon ' s weight is a problem for the average adventurer. Characters with a strength of 19 or less are -3 to strike firing one handed, and -1 to strike when bracing it with both hands or on something, whether firing it as a laser or a launcher. This is why the gun is not popular among most humans, but extremely popular among Combat Cyborgs, Headhunters, Juicers, and other exceptionally strong characters.",
                "13 lbs (5.8kg)",
                "Laser is 800 feet (243m), Grenade Launcher is 500 feet (152m)",
                "Each laser blast or grenade fired counts as one melee attack.",
                "Laser is 20 blasts, Grenade Launcher is a standard six hand loaded into the gun plus an additional eight in a top feeding grenade clip.",
                "Laser 2D4 M.D., grenade launcher 4D6 M.D. to a blast area of six feet (1.8m)",
                null,
                "21,000 credits. Grenades cost 400 credits apiece or 3,800 a dozen."
        ));

        weapons.add( new Weapon(
                0,
                "NG-L5 Northern Gun Laser Rifle",
                "Northern Gun",
                "A durable, heavy-duty laser rifle that suffers from the usual problem of weight, but can endure a massive amount of abuse and keep on working.",
                "14 lbs (6.3kg)",
                "1,600 feet (488m)",
                "Each blast counts as one melee attack",
                "10 shots standard clip or 20 shots Long E-Clip",
                "3D6 M.D.",
                null,
                "16,000 credits"
        ));

        weapons.add( new Weapon(
                0,
                "NG-33 Northern Gun Laser Pistol",
                "Northern Gun",
                "Looks like a sleeker ion blaster with a pointed nose.",
                "4 lbs (1.8kg)",
                "800 feet (244m)",
                "Each blast counts as one melee attack",
                "20 shots",
                "1D6 M.D.",
                null,
                "6,500 credits"
        ));

        weapons.add( new Weapon(
                0,
                "NG-P7 Northern Gun Particle Beam Rifle",
                "Northern Gun",
                "Another heavy-duty weapon that is a bit heavy and awkward, but sturdy and dependable in combat.",
                "21 lbs (9.45kg)",
                "1200 feet (365m)",
                "Each blast counts as one melee attack.",
                "8 shots",
                "1d4x10 M.D.",
                null,
                "22,000 credits"
        ));

        weapons.add( new Weapon(
                0,
                "L-20 Pulse Rifle",
                "Black Market",
                "A common frontier weapon is the L-20 pulse laser rifle manufactured by the Black Market and several kingdoms across the land. It is a dependable, lightweight weapon with the added feature of multiple laser bursts.",
                "7 lbs (3kg)",
                "1600 feet (488m)",
                "Each blast counts as one melee attack.",
                "40 shots short E-Clip or 50 shots Long E-Clip",
                "2d6 M.D. single shot or 6D6 multiple pulse burst (three simultaneous shots).",
                null,
                "25,000 credits"
        ));

        weapons.add( new Weapon(
                0,
                "JA-9 Juicer Assassin Variable Laser Rifle",
                "Triax",
                "Another German Pre-Rifts design for the Juicer. A variable light frequency laser to overcome laser resistant armors, like that of the Glitter Boy. The Juicer can adjust the frequency of the laser to blast through a Glitter Boy's defenses (or anybody else; same as the CV-212, pg. 258). Greatly resembles the JA-11, complete with laser targeting and scope.",
                "6 lbs (2.7kg)",
                "4000 feet (1219m)",
                "Each blast counts as one melee attack",
                "10 shot with a short E-Clip or 30 with a long E-Clip",
                "2D6 M.D.",
                null,
                "20,000 credits"
        ));

        weapons.add( new Weapon(
                0,
                "NG-101 Rail Gun",
                "Northern Gun",
                "",
                "Gun: 128 lbs (57.6kg), Power Pack: 80lbs (36kg), One Ammo-Belt: 25lbs (11kg), Case of six belts: 160lbs (72kg)",
                "4000 feet (1219m)",
                "Each burst counts as one melee attack",
                "300 or 1200 round belt",
                "A burst is 30 rounds and inflicts 6D6 M.D., one round does 1D4 M.D.",
                null,
                "55,000 credits. Good availability"
        ));

        weapons.add( new Weapon(
                0,
                "NG-202 Rail Gun",
                "Northern Gun",
                "",
                "Gun : 198 Ibs (89 kg), Power Pack: 100 Ibs (45 kg), One Ammo-Belt: 35 1bs (16 kg), Case of six belts: 210 Ibs (94.5 kg).",
                "4000 feet (1219m)",
                "Each blast counts as one melee attack",
                "300 or 1200 round belt",
                "A Burst is 40 rounds and inflicts 1D4x1O M.D. One round does 1D4 M.D.",
                null,
                "70,000 credits. Good availability"
        ));

        weapons.add( new Weapon(
                0,
                "Vibro-Knife",
                null,
                null,
                null,
                "Melee",
                "Melee attack",
                null,
                "1D6 M.D.",
                null,
                "7,000 credits"
        ));

        weapons.add( new Weapon(
                0,
                "Vibro-Bayonet",
                null,
                null,
                null,
                "Melee",
                "Melee attack",
                null,
                "1D6+1 M.D., designed for attachment to a variety of rifles, but rarely used by the CS",
                null,
                "7,500 credits"
        ));
        weapons.add( new Weapon(
                0,
                "Vibro-Saber (short sword)",
                null,
                null,
                null,
                "Melee",
                "Melee attack",
                null,
                "2D4 M.D.",
                null,
                "9,000 credits"
        ));
        weapons.add( new Weapon(
                0,
                "Vibro-Sword (large, one-handed sword)",
                null,
                null,
                null,
                "Melee",
                "Melee attack",
                null,
                "2D6 M.D.",
                null,
                "11,000 credits"
        ));
        weapons.add( new Weapon(
                0,
                "Giant-Sized Vibro-Sword",
                null,
                null,
                null,
                "Melee",
                "Melee attack",
                null,
                "3D6 M.D., usually used by oversized power armor suits or by giant robot vehicles. Rarely used by the CS",
                null,
                "18,000 credits"
        ));
        weapons.add( new Weapon(
                0,
                "Vibro-Forearm Claws",
                null,
                null,
                null,
                "Melee",
                "Melee attack",
                null,
                "2D6 M.D., usually three hooked blades attacked to a forearm gauntlet or protective plate. Greaty for parrying (+1 bonus) and slashing.",
                null,
                "11,000 credits"
        ));

        return weapons;
    }

}
