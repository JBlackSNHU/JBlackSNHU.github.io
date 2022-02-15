package com.example.riftscompanion;

import java.io.Serializable;

public class Armor implements Serializable {


    //region Armor Class Variables
    private final int armorID;
    private final String armorName;
    private final String armorDescription;
    private final String armorHelmetDamageCapacity;
    private final String armorMainBodyDamageCapacity;
    private final String armorArmsDamageCapacity;
    private final String armorLegsDamageCapacity;
    private final String armorWeight;
    private final String armorMarketCost;
    private final String armorAdditionalNotes;
    //endregion

    //region Armor Class Accessors
    public int getArmorID() { return armorID; }
    public String getArmorName() { return armorName; }
    public String getArmorDescription() { return armorDescription; }
    public String getArmorHelmetDamageCapacity() { return armorHelmetDamageCapacity; }
    public String getArmorMainBodyDamageCapacity() { return armorMainBodyDamageCapacity; }
    public String getArmorArmsDamageCapacity() { return armorArmsDamageCapacity; }
    public String getArmorLegsDamageCapacity() { return armorLegsDamageCapacity; }
    public String getArmorWeight() {return armorWeight; }
    public String getArmorMarketCost() { return armorMarketCost; }
    public String getArmorAdditionalNotes() { return armorAdditionalNotes; }


    //endregion

    public Armor (int armorID, String armorName, String armorHelmetDamageCapacity, String armorMainBodyDamageCapacity,
                  String armorDescription, String armorArmsDamageCapacity, String armorLegsDamageCapacity,
                  String armorWeight, String armorMarketCost, String armorAdditionalNotes) {
        this.armorID = armorID;
        this.armorName = armorName;
        this.armorDescription = armorDescription;
        this.armorHelmetDamageCapacity = armorHelmetDamageCapacity;
        this.armorMainBodyDamageCapacity = armorMainBodyDamageCapacity;
        this.armorArmsDamageCapacity = armorArmsDamageCapacity;
        this.armorLegsDamageCapacity = armorLegsDamageCapacity;
        this.armorWeight = armorWeight;
        this.armorMarketCost = armorMarketCost;
        this.armorAdditionalNotes = armorAdditionalNotes;
    }
}
