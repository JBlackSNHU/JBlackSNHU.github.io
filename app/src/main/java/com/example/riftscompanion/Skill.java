package com.example.riftscompanion;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.io.Serializable;

public class Skill extends BaseObservable implements Serializable {

    /* Class Variables */
    private int skillID;
    private String skillName;
    private String skillDescription;
    private String skillCategory;
    private int skillProficiency;
    private int skillProficiencyPerLevel;
    private int skillSecondaryProficiency;
    private int skillSecondaryProficiencyPerLevel;
    private String skillPrerequisites;
    private String skillModifier;
    private int skillModifierValue;
    //private static String[] languages = {"American", "Techno-Can", "Spanish", "Japanese", "Chinese", "Euro","Dragonese/Elven", "Gobblely", "Faerie Speak"};

    /* Class access functions */
    @Bindable
    public int getSkillID() { return skillID; }
    @Bindable
    public String getSkillName() { return skillName; }
    @Bindable
    public String getSkillDescription() { return skillDescription; }
    @Bindable
    public String getSkillCategory() { return skillCategory; }
    @Bindable
    public int getSkillProficiency() { return skillProficiency; }
    public void setSkillProficiency(int val) { skillProficiency = val; notifyPropertyChanged(BR.skillProficiency);}
    @Bindable
    public int getSkillProficiencyPerLevel() { return skillProficiencyPerLevel; }
    @Bindable
    public int getSkillSecondaryProficiency() { return skillSecondaryProficiency; }
    public void setSkillSecondaryProficiency(int val) { skillSecondaryProficiency = val; notifyPropertyChanged(BR.skillSecondaryProficiency); }
    @Bindable
    public int getSkillSecondaryProficiencyPerLevel() { return skillSecondaryProficiencyPerLevel; }
    @Bindable
    public String getSkillPrerequisites() { return skillPrerequisites; }
    @Bindable
    public String getSkillModifier() { return skillModifier; }
    @Bindable
    public int getSkillModifierValue() { return skillModifierValue; }
    //@Bindable
    //public String[] getLanguages() { return languages; }


    /* Constructor for the Skill class */
    public Skill(int skillID, String skillName, String skillDescription, String skillCategory, int skillBaseProficiency, int skillProficiencyPerLevel,
                 int skillSecondaryBaseProficiency, int skillSecondaryProficiencyPerLevel, String skillPrerequisites, String skillModifier,
                 int skillModifierValue) {
            this.skillID = skillID;
            this.skillName = skillName;
            this.skillDescription = skillDescription;
            this.skillCategory = skillCategory;
            this.skillProficiency = skillBaseProficiency;
            this.skillProficiencyPerLevel = skillProficiencyPerLevel;
            this.skillSecondaryProficiency = skillSecondaryBaseProficiency;
            this.skillSecondaryProficiencyPerLevel = skillSecondaryProficiencyPerLevel;
            this.skillPrerequisites = skillPrerequisites;
            this.skillModifier = skillModifier;
            this.skillModifierValue = skillModifierValue;
    }


}
