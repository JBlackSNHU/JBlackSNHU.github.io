package com.example.riftscompanion;

import androidx.databinding.BaseObservable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Monster extends BaseObservable implements Serializable {

    private final int monsterID;
    private final String monsterName;
    private final String monsterIQ;
    private final String monsterME;
    private final String monsterMA;
    private final String monsterPS;
    private final String monsterPP;
    private final String monsterPE;
    private final String monsterPB;
    private final String monsterSpd;
    private final String monsterSize;
    private final String monsterHitPoints;
    private final String monsterSDC;
    private final String monsterMDC;
    private final String monsterPPE;
    private final String monsterHorrorFactor;
    private final String monsterMagic;
    private final String monsterPsionics;
    private final ArrayList<String> monsterNaturalAbilities;
    private final String monsterAttacksPerMelee;
    private final ArrayList<String> monsterAttacks;
    private final String monsterBonuses;
    private final String monsterPenalties;
    private final String monsterVulnerabilities;
    private final String monsterHabitat;
    private final String monsterValue;
    private final String monsterSource;
    private final String monsterSourceDescription;

    public int getMonsterID() { return monsterID; }
    public String getMonsterName() { return monsterName; }
    public String getMonsterIQ() { return monsterIQ; }
    public String getMonsterME() { return monsterME; }
    public String getMonsterMA() { return monsterMA; }
    public String getMonsterPS() { return monsterPS; }
    public String getMonsterPP() { return monsterPP; }
    public String getMonsterPE() { return monsterPE; }
    public String getMonsterPB() { return monsterPB; }
    public String getMonsterSpd() { return monsterSpd; }
    public String getMonsterSize() { return monsterSize; }
    public String getMonsterHitPoints() { return monsterHitPoints; }
    public String getMonsterSDC() { return monsterSDC; }
    public String getMonsterMDC() { return monsterMDC; }
    public String getMonsterPPE() { return monsterPPE; }
    public String getMonsterHorrorFactor() { return monsterHorrorFactor; }
    public String getMonsterMagic() { return monsterMagic; }
    public String getMonsterPsionics() { return monsterPsionics; }
    public ArrayList<String> getMonsterNaturalAbilities() { return  monsterNaturalAbilities; }
    public String getMonsterAttacksPerMelee() { return monsterAttacksPerMelee; }
    public ArrayList<String> getMonsterAttacks() { return  monsterAttacks; }
    public String getMonsterBonuses() { return monsterBonuses; }
    public String getMonsterPenalties() { return monsterPenalties; }
    public String getMonsterVulnerabilities() { return monsterVulnerabilities; }
    public String getMonsterHabitat() { return monsterHabitat; }
    public String getMonsterValue() { return monsterValue; }
    public String getMonsterSource() { return monsterSource; }
    public String getMonsterSourceDescription() { return monsterSourceDescription; }

    public Monster(int monsterID, String monsterName, String monsterIQ, String monsterME, String monsterMA,
                   String monsterPS, String monsterPP, String monsterPE, String monsterPB, String monsterSpd,
                   String monsterSize, String monsterHitPoints, String monsterSDC, String monsterMDC, String monsterPPE,
                   String monsterHorrorFactor, String monsterMagic, String monsterPsionics, String monsterNaturalAbilities,
                   String monsterAttacksPerMelee, String monsterAttacks, String monsterBonuses, String monsterPenalties,
                   String monsterVulnerabilities, String monsterHabitat, String monsterValue, String monsterSource, String monsterSourceDescription) {
        this.monsterID = monsterID;
        this.monsterName = monsterName;
        this.monsterIQ = monsterIQ;
        this.monsterME = monsterME;
        this.monsterMA = monsterMA;
        this.monsterPS = monsterPS;
        this.monsterPP = monsterPP;
        this.monsterPE = monsterPE;
        this.monsterPB = monsterPB;
        this.monsterSpd = monsterSpd;
        this.monsterSize = monsterSize;
        this.monsterHitPoints = monsterHitPoints;
        this.monsterSDC = monsterSDC;
        this.monsterMDC = monsterMDC;
        this.monsterPPE = monsterPPE;
        this.monsterHorrorFactor = monsterHorrorFactor;
        this.monsterMagic = monsterMagic;
        this.monsterPsionics = monsterPsionics;
        this.monsterNaturalAbilities = new ArrayList<>(Arrays.asList(monsterNaturalAbilities.split(",")));
        this.monsterAttacksPerMelee = monsterAttacksPerMelee;
        this.monsterAttacks = new ArrayList<>(Arrays.asList(monsterAttacks.split(";")));
        this.monsterBonuses = monsterBonuses;
        this.monsterPenalties = monsterPenalties;
        this.monsterVulnerabilities = monsterVulnerabilities;
        this.monsterHabitat = monsterHabitat;
        this.monsterValue = monsterValue;
        this.monsterSource = monsterSource;
        this.monsterSourceDescription = monsterSourceDescription;
    }
}
