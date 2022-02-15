package com.example.riftscompanion;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.io.Serializable;

public class Weapon extends BaseObservable implements Serializable {

    private final int weaponID;
    private final String weaponName;
    private final String weaponManufacturer;
    private final String weaponDescription;
    private final String weaponWeight;
    private final String weaponRange;
    private final String weaponRateOfFire;
    private final String weaponPayload;
    private final String weaponDamageMDC;
    private final String weaponDamageSDC;
    private final String weaponMarketCost;

    @Bindable
    public int getWeaponID() {return weaponID;}
    @Bindable
    public String getWeaponName() {return weaponName;}
    @Bindable
    public String getWeaponManufacturer() {return weaponManufacturer;}
    @Bindable
    public String getWeaponDescription() {return weaponDescription;}
    @Bindable
    public String getWeaponWeight() {return weaponWeight;}
    @Bindable
    public String getWeaponRange() {return weaponRange;}
    @Bindable
    public String getWeaponRateOfFire() {return weaponRateOfFire;}
    @Bindable
    public String getWeaponPayload() {return weaponPayload;}
    @Bindable
    public String getWeaponDamageMDC() {return weaponDamageMDC;}
    @Bindable
    public String getWeaponDamageSDC() {return weaponDamageSDC;}
    @Bindable
    public String getWeaponMarketCost() {return weaponMarketCost;}


    public Weapon(int weaponID, String weaponName, String weaponManufacturer, String weaponDescription, String weaponWeight, String weaponRange,
                  String weaponRateOfFire, String weaponPayload, String weaponDamageMDC, String weaponDamageSDC, String weaponMarketCost) {
        this.weaponID = weaponID;
        this.weaponName = weaponName;
        this.weaponManufacturer = weaponManufacturer;
        this.weaponDescription = weaponDescription;
        this.weaponWeight = weaponWeight;
        this.weaponRange = weaponRange;
        this.weaponRateOfFire = weaponRateOfFire;
        this.weaponPayload = weaponPayload;
        this.weaponDamageMDC = weaponDamageMDC;
        this.weaponDamageSDC = weaponDamageSDC;
        this.weaponMarketCost = weaponMarketCost;
    }
}
