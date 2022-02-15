package com.example.riftscompanion;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.riftscompanion.DataBank.BionicsData;
import com.example.riftscompanion.DataBank.CharacterClassesData;
import com.example.riftscompanion.DataBank.SkillsData;
import com.example.riftscompanion.DataBank.SpellData;
import com.example.riftscompanion.DataBank.WeaponData;

public class DBHelper extends SQLiteOpenHelper {
    /* DB NAME AND VERSION */
    private static final String DB_NAME="RiftsCompanionDatabase";
    private static final int DB_VERSION = 14;

    /* TABLE NAMES */
    private static final String PLAYER_CHARACTER_TABLE_NAME = "tbPlayerCharacters";
    private static final String SKILL_TABLE_NAME = "tbSkills";
    private static final String WEAPONS_TABLE_NAME = "tbWeapons";
    private static final String ARMORS_TABLE_NAME = "tbArmors";
    private static final String SPELLS_TABLE_NAME = "tbSpells";
    private static final String BIONICS_TABLE_NAME = "tbBionics";
    private static final String CHARACTER_CLASS_TABLE_NAME = "tbCharacterClasses";


    /* PLAYER CHARACTER TABLE COLUMN NAMES */
    /* JBLACK: Player Character shortened to PC for brevity */
    private static final String PC_ID_COL = "pcID";
    private static final String PC_NAME_COL = "pcName";

    //region SKILLS TABLE COLUMN NAMES
    private static final String SKILL_ID_COL = "skillId";
    private static final String SKILL_NAME_COL = "skillName";
    private static final String SKILL_DESCRIPTION_COL = "skillDescription";
    private static final String SKILL_CATEGORY_COL = "skillCategory";
    private static final String SKILL_PROFICIENCY_COL = "skillBaseProficiency";
    private static final String SKILL_PROFICIENCY_PER_LEVEL_COL = "skillProficiencyPerLevel";
    private static final String SKILL_SECONDARY_PROFICIENCY_COL = "skillSecondaryBaseProficiency";
    private static final String SKILL_SECONDARY_PROFICIENCY_PER_LEVEL_COL = "skillSecondaryProficiencyPerLevel";
    private static final String SKILL_PREREQUISITES_COL = "skillPrerequisites";
    private static final String SKILL_MODIFIER_COL = "skillModifier";
    private static final String SKILL_MODIFIER_VALUE_COL = "skillModifierValue";
    //endregion

    //region CHARACTER CLASS TABLE COLUMN NAMES
    /* JBLACK - Character Class shortened to class for brevity */
    private static final String CLASS_ID_COL = "classId";
    private static final String CLASS_NAME_COL = "className";
    private static final String CLASS_TYPE_COL = "classType";
    private static final String CLASS_CATEGORY_COL = "classCategory";
    private static final String CLASS_REQUIRED_IQ_COL = "classRequiredIQ";
    private static final String CLASS_REQUIRED_ME_COL = "classRequiredME";
    private static final String CLASS_REQUIRED_MA_COL = "classRequiredMA";
    private static final String CLASS_REQUIRED_PS_COL = "classRequiredPS";
    private static final String CLASS_REQUIRED_PP_COL = "classRequiredPP";
    private static final String CLASS_REQUIRED_PE_COL = "classRequiredPE";
    private static final String CLASS_REQUIRED_PB_COL = "classRequiredPB";
    private static final String CLASS_SKILLS_COL = "classSkills";
    private static final String CLASS_RELATED_SKILLS_COL = "classRelatedSkills";
    private static final String CLASS_SECONDARY_SKILLS_COL = "classSecondarySkills";
    private static final String CLASS_STARTING_MONEY_COL = "classStartingMoney";
    //endregion

    //region WEAPONS TABLE COLUMN NAMES
    private static final String WEAPON_ID_COL = "weaponId";
    private static final String WEAPON_NAME_COL = "weaponName";
    private static final String WEAPON_MANUFACTURER_COL = "weaponManufacturer";
    private static final String WEAPON_DESCRIPTION_COL = "weaponDescription";
    private static final String WEAPON_WEIGHT_COL = "weaponWeight";
    private static final String WEAPON_RANGE_COL = "weaponRange";
    private static final String WEAPON_RATE_OF_FIRE_COL = "weaponRateOfFire";
    private static final String WEAPON_PAYLOAD_COL = "weaponPayload";
    private static final String WEAPON_DAMAGE_MDC_COL = "weaponDamageMDC";
    private static final String WEAPON_DAMAGE_SDC_COL = "weaponDamageSDC";
    private static final String WEAPON_MARKET_COST_COL = "weaponMarketCost";
    //endregion

    //region BIONICS TABLE COLUMNS NAMES
    private static final String BIONICS_ID_COL = "bionicsId";
    private static final String BIONICS_NAME_COL = "bionicsName";
    private static final String BIONICS_DESCRIPTION_COL = "bionicsDescription";
    private static final String BIONICS_COST_COL = "bionicsCost";
    //endregion

    //region ARMOR TABLE COLUMN NAMES
    /* JBLACK - Damage Capacity abbreviated to DC for readability */
    private static final String ARMOR_ID_COL = "armorId";
    private static final String ARMOR_NAME_COL = "armorName";
    private static final String ARMOR_DESCRIPTION_COL = "armorDescription";
    private static final String ARMOR_HELMET_DC_COL = "armorHelmetDC";
    private static final String ARMOR_MAIN_BODY_DC_COL = "armorMainBodyDC";
    private static final String ARMOR_ARMS_DC_COL = "armorArmsDC";
    private static final String ARMOR_LEGS_DC_COL = "armorLegsDC";
    private static final String ARMOR_WEIGHT_COL = "armorWeight";
    private static final String ARMOR_MARKET_COST_COL = "armorMarketCost";
    private static final String ARMOR_ADDITIONAL_NOTES_COL = "armorAdditionalNotes";
     //endregion

    //region SPELL TABLE COLUMN NAMES
    private static final String SPELL_ID_COL = "spellId";
    private static final String SPELL_NAME_COL = "spellName";
    private static final String SPELL_RANGE_COL  = "spellRange";
    private static final String SPELL_DURATION_COL  = "spellDuration";
    private static final String SPELL_SAVING_THROW_COL = "spellSavingThrow";
    private static final String SPELL_PPE_COST_COL = "spellPPECost";
    private static final String SPELL_DESCRIPTION_COL = "spellDescription";
    //endregion

    public DBHelper(Context context) {super(context, DB_NAME, null, DB_VERSION);}

    /* Required to extend SQLiteOpenHelper */
    @Override
    public void onCreate(SQLiteDatabase db) {

        /* TABLE CREATION */
        /* Creating the SQL query that will create the CharacterSkills table if it does not already exist */
        //region Skill Table Create Query
        String skillTableCreateQuery = "CREATE TABLE IF NOT EXISTS " + SKILL_TABLE_NAME + " ("
                + SKILL_ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + SKILL_NAME_COL + " TEXT DEFAULT NULL, "
                + SKILL_DESCRIPTION_COL + " TEXT DEFAULT NULL, "
                + SKILL_CATEGORY_COL + " TEXT DEFAULT NULL,"
                + SKILL_PROFICIENCY_COL + " INT, "
                + SKILL_PROFICIENCY_PER_LEVEL_COL + " INT, "
                + SKILL_SECONDARY_PROFICIENCY_COL + " INT, "
                + SKILL_SECONDARY_PROFICIENCY_PER_LEVEL_COL + " INT, "
                + SKILL_PREREQUISITES_COL + " TEXT DEFAULT NULL, "
                + SKILL_MODIFIER_COL + " TEXT DEFAULT NULL, "
                + SKILL_MODIFIER_VALUE_COL + " INT)";
        //endregion

        //region Character Class Table Create Query
        String characterClassTableCreateQuery = "CREATE TABLE IF NOT EXISTS " + CHARACTER_CLASS_TABLE_NAME + " ("
                + CLASS_ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + CLASS_NAME_COL + " TEXT, "
                + CLASS_TYPE_COL + " TEXT, "
                + CLASS_CATEGORY_COL + " TEXT,"
                + CLASS_REQUIRED_IQ_COL + " INT, "
                + CLASS_REQUIRED_ME_COL + " INT, "
                + CLASS_REQUIRED_MA_COL + " INT, "
                + CLASS_REQUIRED_PS_COL + " INT, "
                + CLASS_REQUIRED_PP_COL + " INT, "
                + CLASS_REQUIRED_PE_COL + " INT, "
                + CLASS_REQUIRED_PB_COL + " INT, "
                + CLASS_SKILLS_COL + " TEXT, "
                + CLASS_RELATED_SKILLS_COL + " TEXT, "
                + CLASS_SECONDARY_SKILLS_COL + " TEXT,"
                + CLASS_STARTING_MONEY_COL + " TEXT)";
        //endregion

        //region Weapon Table Create Query
        String weaponTableCreateQuery = "CREATE TABLE IF NOT EXISTS " + WEAPONS_TABLE_NAME + " ("
                + WEAPON_ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + WEAPON_NAME_COL + " TEXT, "
                + WEAPON_MANUFACTURER_COL + " TEXT, "
                + WEAPON_DESCRIPTION_COL + " TEXT, "
                + WEAPON_WEIGHT_COL + " TEXT, "
                + WEAPON_RANGE_COL + " TEXT, "
                + WEAPON_RATE_OF_FIRE_COL + " TEXT, "
                + WEAPON_PAYLOAD_COL + " TEXT, "
                + WEAPON_DAMAGE_MDC_COL + " TEXT, "
                + WEAPON_DAMAGE_SDC_COL + " TEXT, "
                + WEAPON_MARKET_COST_COL + " TEXT)";
        //endregion

        //region Bionics Table Create Query
        String bionicsTableCreateQuery = "CREATE TABLE IF NOT EXISTS " + BIONICS_TABLE_NAME + " ("
                + BIONICS_ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + BIONICS_NAME_COL + " TEXT, "
                + BIONICS_DESCRIPTION_COL + " TEXT, "
                + BIONICS_COST_COL + " TEXT)";
        //endregion

        //region Armor Table Create Query
        String armorsTableCreateQuery = "CREATE TABLE IF NOT EXISTS " + ARMORS_TABLE_NAME + " ("
                + ARMOR_ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + ARMOR_NAME_COL + " TEXT, "
                + ARMOR_DESCRIPTION_COL + " TEXT, "
                + ARMOR_HELMET_DC_COL + " TEXT, "
                + ARMOR_MAIN_BODY_DC_COL + " TEXT, "
                + ARMOR_ARMS_DC_COL + " TEXT, "
                + ARMOR_LEGS_DC_COL + " TEXT, "
                + ARMOR_WEIGHT_COL + " TEXT, "
                + ARMOR_MARKET_COST_COL + " TEXT, "
                + ARMOR_ADDITIONAL_NOTES_COL + " TEXT)";
        //endregion

        //region Spell Table Create Query
        String spellsTableCreateQuery = "CREATE TABLE IF NOT EXISTS " + SPELLS_TABLE_NAME + " ("
                + SPELL_ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + SPELL_NAME_COL + " TEXT, "
                + SPELL_RANGE_COL + " TEXT, "
                + SPELL_DURATION_COL + " TEXT, "
                + SPELL_SAVING_THROW_COL + " TEXT, "
                + SPELL_PPE_COST_COL + " TEXT, "
                + SPELL_DESCRIPTION_COL + " TEXT)";
        //endregion
        db.execSQL(skillTableCreateQuery);
        db.execSQL(characterClassTableCreateQuery);
        db.execSQL(weaponTableCreateQuery);
        db.execSQL(bionicsTableCreateQuery);
        db.execSQL(armorsTableCreateQuery);
        db.execSQL(spellsTableCreateQuery);

    }

    /* Required onUpgrade() method to extend SQLiteOpenHelper */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + SKILL_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + ARMORS_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + WEAPONS_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + SPELLS_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + BIONICS_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + CHARACTER_CLASS_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS tbCharacterSkills");
        onCreate(db);
    }

    public void PopulateDatabase() {
        String[] tables = {SKILL_TABLE_NAME, WEAPONS_TABLE_NAME, ARMORS_TABLE_NAME, SPELLS_TABLE_NAME,
                BIONICS_TABLE_NAME, CHARACTER_CLASS_TABLE_NAME};

        for (int i = 0; i < tables.length; i++) {

            if (isTableEmpty(tables[i])) {
                if (tables[i].equals(SKILL_TABLE_NAME))
                    PopulateSkillsTable();
                else if (tables[i].equals(WEAPONS_TABLE_NAME))
                    PopulateWeaponsTable();
                else if (tables[i].equals(ARMORS_TABLE_NAME))
                    PopulateArmorTable();
                else if (tables[i].equals(SPELLS_TABLE_NAME))
                    PopulateSpellsTable();
                else if (tables[i].equals(BIONICS_TABLE_NAME))
                    PopulateBionicsTable();
                else if (tables[i].equals(CHARACTER_CLASS_TABLE_NAME))
                    PopulateCharacterClassTable();
            }
        }
    }

    // Method to determine if any given table is empty of rows. Returns true if empty, false if not.
    private boolean isTableEmpty(String tableName) {
        SQLiteDatabase db = this.getReadableDatabase();
        boolean retval;
        Cursor cursor = db.rawQuery(String.format("SELECT COUNT(*) FROM %s",tableName), null);
        cursor.moveToFirst();
        if (cursor.getInt(0) == 0)
            retval = true;
        else
            retval = false;

        cursor.close();
        return retval;
    }

    //region Skills Table Methods
    public void PopulateSkillsTable() {
        SQLiteDatabase db = this.getWritableDatabase();
        SkillsData sd = new SkillsData();

        for (Skill skill : sd.getSkillsList()) {
            ContentValues values = new ContentValues();

            values.put(SKILL_NAME_COL, skill.getSkillName());
            values.put(SKILL_DESCRIPTION_COL, skill.getSkillDescription());
            values.put(SKILL_CATEGORY_COL, skill.getSkillCategory());
            values.put(SKILL_PROFICIENCY_COL, skill.getSkillProficiency());
            values.put(SKILL_PROFICIENCY_PER_LEVEL_COL, skill.getSkillProficiencyPerLevel());
            values.put(SKILL_SECONDARY_PROFICIENCY_COL, skill.getSkillSecondaryProficiency());
            values.put(SKILL_SECONDARY_PROFICIENCY_PER_LEVEL_COL, skill.getSkillSecondaryProficiencyPerLevel());
            values.put(SKILL_PREREQUISITES_COL, skill.getSkillPrerequisites());
            values.put(SKILL_MODIFIER_COL, skill.getSkillModifier());
            values.put(SKILL_MODIFIER_VALUE_COL, skill.getSkillModifierValue());

            db.insert(SKILL_TABLE_NAME, null, values);
        }
    }

    public ArrayList<Skill> getDBSkillsList() {
        SQLiteDatabase db = this.getWritableDatabase();
        ArrayList<Skill> skillsList = new ArrayList<>();

        Cursor cursor = db.rawQuery("SELECT * FROM " + SKILL_TABLE_NAME, null);
        int rowCount = cursor.getCount();
        if (cursor.moveToFirst()) {
            do {
                skillsList.add(
                        new Skill(
                                cursor.getInt(0),       // Skill ID
                                cursor.getString(1),    // Skill Name
                                cursor.getString(2),    // Skill Description
                                cursor.getString(3),    // Skill Category
                                cursor.getInt(4),       // Skill Base Proficiency
                                cursor.getInt(5),       // Skill Proficiency Per Level
                                cursor.getInt(6),       // Skill Secondary Base Proficiency
                                cursor.getInt(7),       // Skill Secondary Proficiency Per Level
                                cursor.getString(8),    // Skill Prerequisites (comma delim)
                                cursor.getString(9),    // Skill Modifier
                                cursor.getInt(10)       // Skill Modifier value
                        )
                );
            } while (cursor.moveToNext());
        }
        cursor.close();
        return skillsList;
    }

    /* JBLACK
     * Method to retrieve a partial list of skills from the database using a
     * comma delimited string of skill names.
     */
    public ArrayList<Skill> getPartialDBSkillsList(String skillNames) {
        SQLiteDatabase db = this.getWritableDatabase();
        ArrayList<Skill> skillsList = new ArrayList<>();

        // Reformat the skillNames string to support the IN function of SQL
        String skillNamesFormatted = skillNames.replace(",","','");
        String getSkillsQuery = "SELECT * FROM " + SKILL_TABLE_NAME + " WHERE " + SKILL_NAME_COL + " IN ('" + skillNamesFormatted + "')";
        Cursor cursor = db.rawQuery(getSkillsQuery, null);
        if (cursor.moveToFirst()) {
            do  {
                skillsList.add(
                        new Skill(
                                cursor.getInt(0),       // Skill ID
                                cursor.getString(1),    // Skill Name
                                cursor.getString(2),    // Skill Description
                                cursor.getString(3),    // Skill Category
                                cursor.getInt(4),       // Skill Base Proficiency
                                cursor.getInt(5),       // Skill Proficiency Per Level
                                cursor.getInt(6),       // Skill Secondary Base Proficiency
                                cursor.getInt(7),       // Skill Secondary Proficiency Per Level
                                cursor.getString(8),    // Skill Prerequisites (comma delim)
                                cursor.getString(9),    // Skill Modifier
                                cursor.getInt(10)       // Skill Modifier value
                        )
                );
            } while (cursor.moveToNext());
        }
        cursor.close();
        return skillsList;
    }

    /* JBLACK
     * Method to retrieve a single skill from the database using either the skillId or the skillName
     */
    public Skill getDBSkill(int skillId, String skillName) {
        SQLiteDatabase db = this.getWritableDatabase();
        String getSkillQuery = "";
        if (skillId != 9999) {
            getSkillQuery = "SELECT * FROM " + SKILL_TABLE_NAME + " WHERE " + SKILL_ID_COL + " = " + skillId;
        }
        else if (skillName != null) {
            getSkillQuery = "SELECT * FROM " + SKILL_TABLE_NAME + " WHERE " + SKILL_NAME_COL + " = '" + skillName + "'";
        }
        else {
            return null;
        }

        Cursor cursor = db.rawQuery(getSkillQuery, null);
        cursor.moveToFirst();
        Skill skill = new Skill(
                cursor.getInt(0),       // Skill ID
                cursor.getString(1),    // Skill Name
                cursor.getString(2),    // Skill Description
                cursor.getString(3),    // Skill Category
                cursor.getInt(4),       // Skill Proficiency
                cursor.getInt(5),       // Skill Proficiency Per Level
                cursor.getInt(6),       // Skill Secondary Proficiency
                cursor.getInt(7),       // Skill Secondary Proficiency Per Level
                cursor.getString(8),    // Skill Prerequisites (comma delim)
                cursor.getString(9),    // Skill Modifier
                cursor.getInt(10)       // Skill Modifier value
        );
        cursor.close();
        return skill;
    }
    //endregion

    //region Character Class Table Methods
    public void PopulateCharacterClassTable() {
        SQLiteDatabase db = this.getWritableDatabase();
        CharacterClassesData cClassData = new CharacterClassesData();

        for (CharacterClass pcClass : cClassData.getCharacterClassList()) {
            ContentValues values = new ContentValues();

            values.put(CLASS_NAME_COL, pcClass.getClassName());
            values.put(CLASS_TYPE_COL, pcClass.getClassType());
            values.put(CLASS_CATEGORY_COL, pcClass.getClassCategory());
            values.put(CLASS_REQUIRED_IQ_COL, pcClass.getClassRequiredIQ());
            values.put(CLASS_REQUIRED_ME_COL, pcClass.getClassRequiredME());
            values.put(CLASS_REQUIRED_MA_COL, pcClass.getClassRequiredMA());
            values.put(CLASS_REQUIRED_PS_COL, pcClass.getClassRequiredPS());
            values.put(CLASS_REQUIRED_PP_COL, pcClass.getClassRequiredPP());
            values.put(CLASS_REQUIRED_PE_COL, pcClass.getClassRequiredPE());
            values.put(CLASS_REQUIRED_PB_COL, pcClass.getClassRequiredPB());
            values.put(CLASS_SKILLS_COL, TextUtils.join(";", pcClass.getClassSkills()));
            values.put(CLASS_RELATED_SKILLS_COL, TextUtils.join(";", pcClass.getClassRelatedSkills()));
            values.put(CLASS_SECONDARY_SKILLS_COL, pcClass.getClassSecondarySkills());
            values.put(CLASS_STARTING_MONEY_COL, pcClass.getClassStartingMoney());

            db.insert(CHARACTER_CLASS_TABLE_NAME, null, values);
        }

    }

    public ArrayList<CharacterClass> getDBCharacterClassList() {
        SQLiteDatabase db = this.getWritableDatabase();
        ArrayList<CharacterClass> classList = new ArrayList<>();

        Cursor cursor = db.rawQuery("SELECT * FROM " + CHARACTER_CLASS_TABLE_NAME, null);
        if (cursor.moveToFirst()) {
            do {
                classList.add(
                        new CharacterClass(
                                cursor.getInt(0),       // Class ID
                                cursor.getString(1),    // Class Name
                                cursor.getString(2),    // Class Type
                                cursor.getString(3),    // Class Category
                                cursor.getInt(4),       // Class Required IQ
                                cursor.getInt(5),       // Class Required ME
                                cursor.getInt(6),       // Class Required MA
                                cursor.getInt(7),       // Class Required PS
                                cursor.getInt(8),       // Class Required PP
                                cursor.getInt(9),       // Class Required PE
                                cursor.getInt(10),      // Class Required PB
                                cursor.getString(11),   // Class Skills Description
                                cursor.getString(12),   // Class Related Skills Description
                                cursor.getString(13),   // Class Secondary Skills Description
                                cursor.getString(14)    // classStartingMoney
                        )
                );
            } while (cursor.moveToNext());
        }
        cursor.close();
        return classList;
    }

    public CharacterClass getCharacterClass(int id, String className) {
        SQLiteDatabase db = this.getWritableDatabase();
        String getSkillQuery = "";
        if (id != 9999) {
            getSkillQuery = "SELECT * FROM " + SKILL_TABLE_NAME + " WHERE " + SKILL_ID_COL + " = " + id;
        }
        else if (className != null) {
            getSkillQuery = "SELECT * FROM " + SKILL_TABLE_NAME + " WHERE " + SKILL_NAME_COL + " = '" + className + "'";
        }
        else {
            return null;
        }
        Cursor cursor = db.rawQuery(getSkillQuery, null);
        cursor.moveToFirst();
        CharacterClass charClass = new CharacterClass(
                cursor.getInt(0),       // classId
                cursor.getString(1),    // className
                cursor.getString(2),    // classType
                cursor.getString(3),    // classCategory
                cursor.getInt(4),       // classRequiredIQ
                cursor.getInt(5),       // classRequiredME
                cursor.getInt(6),       // classRequiredMA
                cursor.getInt(7),       // classRequiredPS
                cursor.getInt(8),       // classRequiredPP
                cursor.getInt(9),       // classRequiredPE
                cursor.getInt(10),      // classRequiredPB
                cursor.getString(11),   // classSkills
                cursor.getString(12),   // classRelatedSkills
                cursor.getString(13),   // classSecondarySkills
                cursor.getString(14)    // classStartingMoney
        );
        cursor.close();
        return charClass;
    }

    //endregion

    //region Weapons Table Methods
    public void PopulateWeaponsTable() {
        SQLiteDatabase db = this.getWritableDatabase();
        WeaponData wd = new WeaponData();

        for (Weapon weapon : wd.getWeaponsList()) {
            ContentValues values = new ContentValues();

            values.put(WEAPON_NAME_COL, weapon.getWeaponName());
            values.put(WEAPON_MANUFACTURER_COL, weapon.getWeaponManufacturer());
            values.put(WEAPON_DESCRIPTION_COL, weapon.getWeaponDescription());
            values.put(WEAPON_WEIGHT_COL, weapon.getWeaponWeight());
            values.put(WEAPON_RANGE_COL, weapon.getWeaponRange());
            values.put(WEAPON_RATE_OF_FIRE_COL, weapon.getWeaponRateOfFire());
            values.put(WEAPON_PAYLOAD_COL, weapon.getWeaponPayload());
            values.put(WEAPON_DAMAGE_MDC_COL, weapon.getWeaponDamageMDC());
            values.put(WEAPON_DAMAGE_SDC_COL, weapon.getWeaponDamageSDC());
            values.put(WEAPON_MARKET_COST_COL, weapon.getWeaponMarketCost());

            db.insert(WEAPONS_TABLE_NAME, null, values);
        }

    }

    public ArrayList<Weapon> getWeaponsListFromDB() {
        SQLiteDatabase db = this.getWritableDatabase();
        ArrayList<Weapon> weaponsList = new ArrayList<>();
        String getWeaponsQuery = "SELECT * FROM " + WEAPONS_TABLE_NAME;
        Cursor cursor = db.rawQuery(getWeaponsQuery, null);

        if (cursor.moveToFirst()) {
            do {
                weaponsList.add(
                        new Weapon (
                        cursor.getInt(0),      // Weapon ID
                        cursor.getString(1),   // Weapon Name
                        cursor.getString(2),   // Weapon Manufacturer
                        cursor.getString(3),   // Weapon Description
                        cursor.getString(4),   // Weapon Weight
                        cursor.getString(5),   // Weapon Range
                        cursor.getString(6),   // Weapon Rate Of Fire
                        cursor.getString(7),   // Weapon Payload
                        cursor.getString(8),   // Weapon Damage MDC
                        cursor.getString(9),   // Weapon Damage SDC
                        cursor.getString(10)
                        )
                );
            } while (cursor.moveToNext());
        }
        cursor.close();

        return weaponsList;
    }

    public Weapon getWeaponFromDB(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        String getWeaponQuery = "SELECT * FROM " + WEAPONS_TABLE_NAME + " WHERE " + WEAPON_ID_COL + " = " + id + "";

        Cursor cursor = db.rawQuery(getWeaponQuery, null);
        cursor.moveToFirst();

        Weapon weapon = new Weapon(
                cursor.getInt(0),      // Weapon ID
                cursor.getString(1),   // Weapon Name
                cursor.getString(2),   // Weapon Manufacturer
                cursor.getString(3),   // Weapon Description
                cursor.getString(4),   // Weapon Weight
                cursor.getString(5),   // Weapon Range
                cursor.getString(6),   // Weapon Rate Of Fire
                cursor.getString(7),   // Weapon Payload
                cursor.getString(8),   // Weapon Damage MDC
                cursor.getString(9),   // Weapon Damage SDC
                cursor.getString(10)); // Weapon Market Cost
        cursor.close();

        return weapon;
    }

    public Weapon getWeaponFromDB(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        String getWeaponQuery = "SELECT * FROM " + WEAPONS_TABLE_NAME + " WHERE " + WEAPON_ID_COL + " = '" + name + "'";

        Cursor cursor = db.rawQuery(getWeaponQuery, null);
        cursor.moveToFirst();

        Weapon weapon = new Weapon(
                cursor.getInt(0),      // Weapon ID
                cursor.getString(1),   // Weapon Name
                cursor.getString(2),   // Weapon Manufacturer
                cursor.getString(3),   // Weapon Description
                cursor.getString(4),   // Weapon Weight
                cursor.getString(5),   // Weapon Range
                cursor.getString(6),   // Weapon Rate Of Fire
                cursor.getString(7),   // Weapon Payload
                cursor.getString(8),   // Weapon Damage MDC
                cursor.getString(9),   // Weapon Damage SDC
                cursor.getString(10)); // Weapon Market Cost
        cursor.close();

        return weapon;
    }
    //endregion

    //region Bionics Table Methods
    public void PopulateBionicsTable() {
        SQLiteDatabase db = this.getWritableDatabase();
        BionicsData bd = new BionicsData();

        for (Bionics bionic : bd.getBionicsList()) {
            ContentValues values = new ContentValues();

            values.put(BIONICS_NAME_COL, bionic.getBionicName());
            values.put(BIONICS_DESCRIPTION_COL, bionic.getBionicDescription());
            values.put(BIONICS_COST_COL, bionic.getBionicCost());

            db.insert(BIONICS_TABLE_NAME, null, values);
        }
    }

    public ArrayList<Bionics> getBionics() {
        SQLiteDatabase db = this.getWritableDatabase();
        ArrayList<Bionics> bionics = new ArrayList<>();

        Cursor cursor = db.rawQuery("SELECT * FROM " + BIONICS_TABLE_NAME, null);
        if (cursor.moveToFirst()) {
            do {
                bionics.add(new Bionics(
                   cursor.getInt(0),        // Bionic ID
                   cursor.getString(1),     // Bionic Name
                   cursor.getString(2),     // Bionic Description
                   cursor.getString(3)      // Bionic Cost
                ));
            } while (cursor.moveToNext());
        }
        return bionics;
    }
    /* JBLACK
     * Overloaded method to return list or single bionics value.
     */
    public ArrayList<Bionics> getBionics(String bionicsName) {
        ArrayList<Bionics> bionics = new ArrayList<>();

        return bionics;
    }
    //endregion

    //region Armor Table Methods
    public void PopulateArmorTable() {

    }

    private ArrayList<Armor> GenerateArmorTableEntry() {
        ArrayList<Armor> armorList = new ArrayList<>();

        return armorList;
    }

    public ArrayList<Armor> getArmors() {
        ArrayList<Armor> armorsList = new ArrayList<>();

        return armorsList;
    }

    public ArrayList<Armor> getArmors(String armorNames) {
        ArrayList<Armor> armorsList = new ArrayList<>();

        return armorsList;
    }
    //endregion

    //region Spells Table Methods
    public void PopulateSpellsTable() {
        SQLiteDatabase db = this.getWritableDatabase();
        SpellData sd = new SpellData();

        for (Spell spell : sd.getSpellsList()) {
            ContentValues values = new ContentValues();

            values.put(SPELL_NAME_COL, spell.getSpellName());
            values.put(SPELL_RANGE_COL, spell.getSpellRange());
            values.put(SPELL_DURATION_COL, spell.getSpellDuration());
            values.put(SPELL_SAVING_THROW_COL, spell.getSpellSavingThrow());
            values.put(SPELL_PPE_COST_COL, spell.getSpellPPECost());
            values.put(SPELL_DESCRIPTION_COL, spell.getSpellDescription());

            db.insert(SPELLS_TABLE_NAME, null, values);
        }

    }

    // Returns all spell entries from the Spells table in the database as an ArrayList.
    public ArrayList<Spell> getSpellsListFromDB() {
        SQLiteDatabase db = getWritableDatabase();
        ArrayList<Spell> spells = new ArrayList<>();
        String getSpellsQuery = "SELECT * FROM " + SPELLS_TABLE_NAME;

        Cursor cursor = db.rawQuery(getSpellsQuery, null);
        if (cursor.moveToFirst()) {
            do {
                spells.add(new Spell(
                        cursor.getInt(0),   // Spell ID
                        cursor.getString(1),// Spell Name
                        cursor.getString(2),// Spell Range
                        cursor.getString(3),// Spell Duration
                        cursor.getString(4),// Spell Saving Throw
                        cursor.getString(5),// Spell PPE Cost
                        cursor.getString(6) // Spell Description
                ));
            } while (cursor.moveToNext());
        }

        return spells;
    }

    // Return one or more spells from the database as an ArrayList.
    public ArrayList<Spell> getSpells(String spellNames) {
        SQLiteDatabase db = getWritableDatabase();
        ArrayList<Spell> spells = new ArrayList<>();
        //create a comma delimited apostrophe wrapped string for query selection
        spellNames = spellNames.replace(",","','");

        String getSpellsQuery = "SELECT * FROM " + SPELLS_TABLE_NAME + " WHERE " + SPELL_NAME_COL + " IN ('"+ spellNames +"')";
        Cursor cursor = db.rawQuery(getSpellsQuery, null);
        if (cursor.getCount() > 0) {
            do {
                spells.add(new Spell(
                        cursor.getInt(0),   // Spell ID
                        cursor.getString(1),// Spell Name
                        cursor.getString(2),// Spell Range
                        cursor.getString(3),// Spell Duration
                        cursor.getString(4),// Spell Saving Throw
                        cursor.getString(5),// Spell PPE Cost
                        cursor.getString(6) // Spell Description
                ));
            } while (cursor.moveToNext());
        }

        return spells;
    }
    //endregion
}
