package com.example.riftscompanion;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.io.Serializable;
import java.util.ArrayList;

public class PlayerCharacter extends BaseObservable implements Serializable {

    //region Class Variables
    private int pcID;
    private String pcPlayerName;
    private String pcName;
    private String pcClass;
    private String pcAlignment;
    private String pcLevel;
    private String pcExperience;
    private String pcIntelligenceQuotient;
    private String pcMentalEndurance;
    private String pcMentalAffinity;
    private String pcPhysicalStrength;
    private String pcPhysicalProwess;
    private String pcPhysicalEndurance;
    private String pcPhysicalBeauty;
    private String pcSpeed;
    private String pcInnerStrengthPoints;
    private String pcPotentialPsychicEnergy;
    private ArrayList<Skill> pcSkills;
    /* JBLACK - Commented for now to assist in limiting project scope. */
    //private ArrayList<String> pcItems;
    private ArrayList<Armor> pcArmor;
    private ArrayList<Weapon> pcWeapons;
    private ArrayList<Spell> pcSpells;
    private ArrayList<Bionics> pcBionics;
    private int pcMoney;
    private String pcProfileImage;
    //endregion

    //region Class Accessors
    @Bindable
    public String getPcIntelligenceQuotient() { return pcIntelligenceQuotient; }
    public void setPcIntelligenceQuotient(String val) { this.pcIntelligenceQuotient = val; notifyPropertyChanged(BR.pcIntelligenceQuotient); }

    @Bindable
    public String getPcMentalEndurance() { return pcMentalEndurance; }
    public void setPcMentalEndurance(String val) { this.pcMentalEndurance = val; notifyPropertyChanged(BR.pcMentalEndurance); }

    @Bindable
    public String getPcMentalAffinity() { return pcMentalAffinity; }
    public void setPcMentalAffinity(String val) { this.pcMentalAffinity = val; notifyPropertyChanged(BR.pcMentalAffinity); }

    @Bindable
    public String getPcPhysicalStrength() { return pcPhysicalStrength; }
    public void setPcPhysicalStrength(String val) { this.pcPhysicalStrength = val; notifyPropertyChanged(BR.pcPhysicalStrength); }

    @Bindable
    public String getPcPhysicalProwess() { return pcPhysicalProwess; }
    public void setPcPhysicalProwess(String val) { this.pcPhysicalProwess = val; notifyPropertyChanged(BR.pcPhysicalProwess); }

    @Bindable
    public String getPcPhysicalEndurance() { return pcPhysicalEndurance; }
    public void setPcPhysicalEndurance(String val) { this.pcPhysicalEndurance = val; notifyPropertyChanged(BR.pcPhysicalEndurance); }

    @Bindable
    public String getPcPhysicalBeauty() { return pcPhysicalBeauty; }
    public void setPcPhysicalBeauty(String val) { this.pcPhysicalBeauty = val; notifyPropertyChanged(BR.pcPhysicalBeauty); }

    @Bindable
    public String getPcSpeed() { return pcSpeed; }
    public void setPcSpeed(String val) { this.pcSpeed = val; notifyPropertyChanged(BR.pcSpeed); }

    @Bindable
    public String getPcInnerStrengthPoints() { return pcInnerStrengthPoints; }
    public void setPcInnerStrengthPoints(String val) { this.pcInnerStrengthPoints = val; notifyPropertyChanged(BR.pcInnerStrengthPoints); }

    @Bindable
    public String getPcPotentialPsychicEnergy() { return pcPotentialPsychicEnergy; }
    public void setPcPotentialPsychicEnergy(String val) { this.pcPotentialPsychicEnergy = val; notifyPropertyChanged(BR.pcPotentialPsychicEnergy); }

    @Bindable
    public String getPcPlayerName() { return pcPlayerName; }
    public void setPcPlayerName(String val) { this.pcPlayerName = val; notifyPropertyChanged(BR.pcPlayerName); }

    @Bindable
    public String getPcName() { return pcName; }
    public void setPcName(String val) { this.pcName = val; notifyPropertyChanged(BR.pcName); }

    @Bindable
    public String getPcClass() { return pcClass; }
    public void setPcClass(String val) { this.pcClass = val; notifyPropertyChanged(BR.pcClass); }

    @Bindable
    public String getPcAlignment() { return pcAlignment; }
    public void setPcAlignment(String val) { this.pcAlignment = val; notifyPropertyChanged(BR.pcAlignment); }

    @Bindable
    public ArrayList<Skill> getPcSkills() { return pcSkills; }
    public void setPcSkills(ArrayList<Skill> val) { this.pcSkills = val; notifyPropertyChanged(BR.pcSkills); }

    @Bindable
    public ArrayList<Armor> getPcArmor() { return pcArmor; }
    public void setPcArmor(ArrayList<Armor> val) { this.pcArmor = val; notifyPropertyChanged(BR.pcArmor); }

    @Bindable
    public ArrayList<Weapon> getPcWeapons() { return pcWeapons; }
    public void setPcWeapons(ArrayList<Weapon> val) { this.pcWeapons = val; notifyPropertyChanged(BR.pcWeapons); }

    @Bindable
    public ArrayList<Spell> getPcSpells() { return pcSpells; }
    public void setPcSpells(ArrayList<Spell> val) { this.pcSpells = val; notifyPropertyChanged(BR.pcSpells); }

    @Bindable
    public String getPcExperience() { return pcExperience; }
    public void setPcExperience(String val) { this.pcExperience = val; notifyPropertyChanged(BR.pcExperience); }

    @Bindable
    public String getPcLevel() { return pcLevel; }
    public void setPcLevel(String val) { this.pcLevel = val; notifyPropertyChanged(BR.pcLevel); }

    @Bindable
    public String getPcProfileImage() { return pcProfileImage; }
    public void setPcProfileImage(String val) { this.pcProfileImage = val; notifyPropertyChanged(BR.pcProfileImage); }


    // The variable pcID can only be set during object creation and should not be
    // modified by the user.
    @Bindable
    public int getPcID() { return pcID; }
    //endregion

    /* PlayerCharacter class constructor */
    public PlayerCharacter(int pcID, String pcPlayerName, String pcName, String pcClass, String pcAlignment, String pcLevel, String pcExperience, String pcIntelligenceQuotient,
                           String pcMentalEndurance, String pcMentalAffinity, String pcPhysicalStrength, String pcPhysicalProwess, String pcPhysicalEndurance, String pcPhysicalBeauty,
                           String pcSpeed, String pcInnerStrengthPoints, String pcPotentialPsychicEnergy, ArrayList<Skill> pcSkills, ArrayList<Armor> pcArmor,
                           ArrayList<Weapon> pcWeapons, ArrayList<Spell> pcSpells, String pcProfileImage) {
        this.pcID = pcID;
        this.pcPlayerName = pcPlayerName;
        this.pcName = pcName;
        this.pcClass = pcClass;
        this.pcAlignment = pcAlignment;
        this.pcLevel = pcLevel;
        this.pcExperience = pcExperience;
        this.pcIntelligenceQuotient = pcIntelligenceQuotient;
        this.pcMentalEndurance = pcMentalEndurance;
        this.pcMentalAffinity = pcMentalAffinity;
        this.pcPhysicalStrength = pcPhysicalStrength;
        this.pcPhysicalProwess = pcPhysicalProwess;
        this.pcPhysicalEndurance = pcPhysicalEndurance;
        this.pcPhysicalBeauty = pcPhysicalBeauty;
        this.pcSpeed = pcSpeed;
        this.pcInnerStrengthPoints = pcInnerStrengthPoints;
        this.pcPotentialPsychicEnergy = pcPotentialPsychicEnergy;
        this.pcSkills = pcSkills;
        this.pcArmor = pcArmor;
        this.pcWeapons = pcWeapons;
        this.pcSpells = pcSpells;
        this.pcProfileImage = pcProfileImage;
    };

    public PlayerCharacter() {
        this.pcID = 999999;
        this.pcPlayerName = "";
        this.pcName = "";
        this.pcClass = "";
        this.pcAlignment = "";
        this.pcLevel = "";
        this.pcExperience = "";
        this.pcIntelligenceQuotient = "";
        this.pcMentalEndurance = "";
        this.pcMentalAffinity = "";
        this.pcPhysicalStrength = "";
        this.pcPhysicalProwess = "";
        this.pcPhysicalEndurance = "";
        this.pcPhysicalBeauty = "";
        this.pcSpeed = "";
        this.pcInnerStrengthPoints = "";
        this.pcPotentialPsychicEnergy = "";
        this.pcSkills = null;
        this.pcArmor = null;
        this.pcWeapons = null;
        this.pcSpells = null;
        this.pcProfileImage = "blank_profile";
    }
}
