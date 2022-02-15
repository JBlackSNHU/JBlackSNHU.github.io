package com.example.riftscompanion;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.io.Serializable;

public class Spell extends BaseObservable implements Serializable {

    private final int spellID;
    private final String spellName;
    private final String spellRange;
    private final String spellDuration;
    private final String spellSavingThrow;
    private final String spellPPECost;
    private final String spellDescription;

    @Bindable
    public int getSpellID() { return spellID; }
    @Bindable
    public String getSpellName() { return spellName; }
    @Bindable
    public String getSpellRange() { return spellRange; }
    @Bindable
    public String getSpellDuration() { return spellDuration; }
    @Bindable
    public String getSpellSavingThrow() { return spellSavingThrow; }
    @Bindable
    public String getSpellPPECost() { return spellPPECost; }
    @Bindable
    public String getSpellDescription() { return spellDescription; }

    public Spell(int spellID, String spellName, String spellRange, String spellDuration, String spellSavingThrow,
                 String spellPPECost, String spellDescription) {
        this.spellID = spellID;
        this.spellName = spellName;
        this.spellRange = spellRange;
        this.spellDuration = spellDuration;
        this.spellSavingThrow = spellSavingThrow;
        this.spellPPECost = spellPPECost;
        this.spellDescription = spellDescription;
    }
}
