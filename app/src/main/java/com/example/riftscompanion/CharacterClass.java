package com.example.riftscompanion;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class CharacterClass extends BaseObservable implements Serializable {

    private final int classId;
    private final String className;
    private final String classType;
    private final String classCategory;
    private final int classRequiredIQ;
    private final int classRequiredME;
    private final int classRequiredMA;
    private final int classRequiredPS;
    private final int classRequiredPP;
    private final int classRequiredPE;
    private final int classRequiredPB;
    private final ArrayList<String> classSkillsDescription;
    private final ArrayList<String> classRelatedSkillsDescription;
    private final String classSecondarySkillsDescription;
    private final String classStartingMoney;


    private DBHelper dbHelper;

    @Bindable
    public int getClassId() { return classId; }
    @Bindable
    public String getClassName() { return className; }
    @Bindable
    public String getClassType() { return classType; }
    @Bindable
    public String getClassCategory() { return classCategory; }
    @Bindable
    public int getClassRequiredIQ() { return classRequiredIQ; }
    @Bindable
    public int getClassRequiredMA() { return classRequiredMA; }
    @Bindable
    public int getClassRequiredME() { return classRequiredME; }
    @Bindable
    public int getClassRequiredPS() { return classRequiredPS; }
    @Bindable
    public int getClassRequiredPP() { return classRequiredPP; }
    @Bindable
    public int getClassRequiredPE() { return classRequiredPE; }
    @Bindable
    public int getClassRequiredPB() { return classRequiredPB; }

    public ArrayList<String> getClassSkills() {
        return classSkillsDescription;
    }
    public ArrayList<String> getClassRelatedSkills() { return classRelatedSkillsDescription; }
    public String getClassSecondarySkills() { return classSecondarySkillsDescription; }
    public String getClassStartingMoney() { return classStartingMoney; }

    public CharacterClass(int classId, String className, String classType, String classCategory, int classRequiredIQ, int classRequiredME,
                          int classRequiredMA, int classRequiredPS, int classRequiredPP, int classRequiredPE, int classRequiredPB,
                          String strClassSkills, String strClassRelatedSkills, String strClassSecondarySkills, String classStartingMoney) {

        this.classId = classId;
        this.className = className;
        this.classType = classType;
        this.classCategory = classCategory;
        this.classRequiredIQ = classRequiredIQ;
        this.classRequiredME = classRequiredME;
        this.classRequiredMA = classRequiredMA;
        this.classRequiredPS = classRequiredPS;
        this.classRequiredPP = classRequiredPP;
        this.classRequiredPE = classRequiredPE;
        this.classRequiredPB = classRequiredPB;

        this.classSkillsDescription = new ArrayList(Arrays.asList(strClassSkills.split(";")));
        this.classRelatedSkillsDescription = new ArrayList(Arrays.asList(strClassRelatedSkills.split(";")));
        this.classSecondarySkillsDescription = strClassSecondarySkills;
        this.classStartingMoney = classStartingMoney;

    }


}
