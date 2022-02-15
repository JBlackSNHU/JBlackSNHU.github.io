package com.example.riftscompanion.DataBank;

import com.example.riftscompanion.CharacterClass;

import java.util.ArrayList;

public class CharacterClassesData {
    private final ArrayList<CharacterClass> characterClassList;
    public ArrayList<CharacterClass> getCharacterClassList() { return characterClassList; }

    public CharacterClassesData() {
        this.characterClassList = CreateCharacterClassList();
    }

    private ArrayList<CharacterClass> CreateCharacterClassList() {

        ArrayList<CharacterClass> classList = new ArrayList<>();

        //region Men At Arms Classes
        classList.add( new CharacterClass(
                0,
                "Combat Cyborg",
                "Occupational",
                "Man at Arms",
                0,
                10,
                0,
                0,
                0,
                0,
                0,
                "Language: Native Language at 96%.; Language: Other: One of choice (+20%).; Basic Electronics or Basic Mechanics (+10% pick one); General Repair & Maintenance (+15%); Land Navigation (+15%); Pilot: Tanks & APCs (+5%); Pilot: One of choice (+10% excluding Robot and Power Armor; skills).; Radio: Basic (+10%); Read Sensory Equipment (+10%); Weapon Systems (+5%); Climbing (+5%); W.P. Ancient Weapons: One of choice.; W.P. Energy Rifle; W.P. Modem Weapons: Two of choice (may include W.P. Heavy Energy Weapons).; Hand to Hand: Expert. Note: This skill can be upgraded to Hand to Hand: Martial Arts (or Assassin, if an evil alignment) at the cost of two O.C.C. Related Skills, but the change can only be done, when the character is being initially created.",
                "Select five other skills at level one, +1 additional at levels 3, 7, 10, and 13 . All new skills start at level one proficiency.; Communications: Any (+10%).; Cowboy: None.; Domestic: Any.; Electrical: Basic Electronics (+5%) only.; Espionage: Intelligence and Tracking only.; Horsemanship: General only.; Mechanical: B asic Mechanics and Automotive only (+5%).; Medical: First Aid only (+5%).; Military: Any (+ 1 0%).; Physical: Any, only use those that are still appropriate.; Pilot: Any (+5%): except robots and power armor.; Pilot Related: Any.; Rogue: Gambling and Find Contraband only.; Science: Basic and Advanced Math only.; Technical: Any (+5%).; W.P.: Any.; Wilderness: None.",
                "Four Secondary Skills at level one from the Secondary Skills List in the Skill Section, +1 additional Secondary Skill at levels 4, 8 and 1 2. These are additional areas of knowledge that do not get any bonuses, other than any possible bonus for having a high IQ. All Secondary Skills start at the base skill level.",
                "1D4x1000 and 4D4x100 in Black Market items"));

        classList.add( new CharacterClass(
                0,
                "Crazies",
                "Occupational",
                "Men at Arms",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                "Language: Native Language at 95%.; Language Other: One of choice (+ 1 5%).; Climbing (+20%); Dance (+ 1 5%); Detect Ambush (+ 1 0%); Detect Concealment (+ 1 5%); Electronic Countermeasures (+ 1 0%); Escape Artist (+ 1 0%); Gymnastics (+20%); Land Navigation (+ 1 0%); Prowl (+20%); Radio: Basic (+ 1 0%); Streetwise (+ I 0%); Tailing (+ 1 5%); Swimming (+20%); W.P. Ancient Weapons: Two of choice.; W.P. Modem Weapons: Two of choice.; W.P. Energy Rifle; Hand to Hand: Martial Arts (or Assassin, if an evil alignment), can be changed to Hand to Hand: Commando at the cost of two O.C.C. Related Skills.",
                "Select seven other skills at level one, +2 additional skills at levels 3, 6, 9 and 12. All new skills start at level one proficiency.; Communications: Any (+5%).; Cowboy: None.; Domestic: Any.; Electrical: None.; Espionage: Any (+10%).; Horsemanship: General and Exotic Animals only (+5%).; Mechanical: Automotive and Locksmith only.; Medical: First Aid, Paramedic or Holistic Medicine only (+ I 0%).; Military: Any (+5%).; Physical: Any (+10% where applicable).; Pilot: Any (+5%).; Pilot Related: Any.; Rogue: Any (+5%).; Science: Math and Astronomy skills only.; Technical: Any.; W.P.: Any.; Wilderness: Any.",
                "Six Secondary Skills to start, selected from the Secondary Skills List in the Skills Section. +1 additional Secondary Skill at levels 2, 4, 8 and 1 2 . These are additional areas of knowledge that do not get any bonuses, other than any possible bonus for having a high I.Q. All Secondary Skills start at the base skill level.",
                "2D6x100 credits, 1D6x1000 in Black Market items"));

        classList.add( new CharacterClass(
                0,
                "Cyber-Knight",
                "Occupational",
                "Men at Arms",
                10,
                11,
                0,
                10,
                0,
                11,
                0,
                "Literacy in American (+20%).; Language: American and Dragonese/Elf at 96%.; Language: Other: Two of choice (+30%).; Anthropology (+15%); Body Building; Climbing (+10%); Gymnastics (+5%); Horsemanship: Cyber-Knight; Land Navigation (+12%); Lore: Demon & Monster (+20%); Paramedic (+10%); Swimming (+10%); W.P. Ancient Weapons: Two of choice.; W.P. Modem Weapons: Two of choice.; Hand to Hand: Martial Arts",
                "Select 12 other skills, but at least two must be selected from the Physical category and another three must be W.P.s. Select two additional skills at level three, three additional W.P.s at level five, two other skills at level s ix, two other skills at level nine, and one at level twelve. All new skills start at level one proficiency.; Communications: Any.; Cowboy: Breaking Horses (+10%) and Trick Riding only.; Domestic: Any.; Electrical: Basic only.; Espionage: Any (+5%).; Horsemanship: Exotic Animals (+10%) only.; Mechanical: Automotive and Basic only.; Medical: None.; Military: Any (+5%).; Physical: Any (+5% when applicable).; Pilot: Any.; Pilot Related: Any (+5%).; Rogue: Any.; Science: Any.; Technical: Any (+5%).; W.P.: Any.; Wilderness: Any (+5%).",
                "Select six Secondary Skills from the list in the Skill Section, +2 additional at levels 5, 10 and 15 . These are additional areas of knowledge that do not get any bonuses, other than any possible bonus for having a high I.Q. All Secondary Skills start at the base skill level.",
                "2D6x100, 2D6x1000 in Black Market items"));

        classList.add( new CharacterClass(
                0,
                "Glitter Boy",
                "Occupational",
                "Men at Arms",
                0,
                0,
                0,
                0,
                10,
                0,
                0,
                "Language: Native Tongue at 95%.; Language: Other: Two of choice (+20% each).; Basic Electronics (+10%) and Basic Mechanics (+15%); General Repair & Maintenance (+10%); Land Navigation (+6%); Pilot Robots & Power Armor; Pilot Robot Combat Elite: Glitter Boy; Pilot Robot Combat Basic (general); Pilot: One of choice (any).; Radio: Basic (+10%); Read Sensory Equipment (+10%); Weapon Systems (+10%); W.P. Energy Pistol; W.P. Energy Rifle; W.P. Heavy Energy Weapons; Hand to Hand: Basic, which may be changed to Hand to Hand: Expert for the cost of one O.C.C. Related Skill, or Martial Arts (or Assassin if an evil alignment) for the cost of two skill selections.",
                "Select seven other skills at level one, two additional skills at level three, and one new skill at levels 6, 9 and 12. All new skills start at level one proficiency.; Communications: Any.; Cowboy: None.; Domestic: Any.; Electrical: None.; Espionage: Detect Ambush (+10%), Detect Concealment (+5%), Intelligence (+5%), and Wilderness Survival (+5%) only.; Horsemanship: None.; Mechanical: Automotive only (+5%).; Medical: First Aid or Paramedic (pick one).; Military: Armorer/Field Armorer (+5%), Demolitions (+10%), Demolitions; Disposal (+10%), Military Etiquette (+10%), and Recognize; Weapon Quality (+10%) only.; Physical: Any, except Acrobatics or Gymnastics.; Pilot: Any.; Pilot Related: Navigation (+5%).; Rogue: Any.; Science: Any.; Technical: Any (+5% to Jury-Rig, Salvage and Lore skills only).; W.P.: Any.; Wilderness: Any (+2%).",
                "Two Secondary Skills at levels 1 , 3 , 5, 8 and 12. Make selections from the Secondary Skills list in the Skills Section. These are additional areas of knowledge that do not get any bonuses, other than any possible bonus for having a high I.Q. All Secondary Skills start at the base skill level.",
                "4D6x100 credits, 1D4x1000 in Black Market items"));

        classList.add( new CharacterClass(
                0,
                "Headhunter Techno-Warrior",
                "Occupational",
                "Men at Arms",
                0,
                0,
                0,
                0,
                12,
                12,
                0,
                "Language : Native Tongue at 94%.; Language: Other: Three of choice (+20%) or one other language and two Lore skills (+10%).; Literacy: One of choice (+10%).; Computer Operation (+10%); Detect Ambush (+10%) and Detect Concealment (+15%); Electronic Countermeasures (+10%); Land Navigation (+10%); Lore : Demons & Monsters (+10%); Pilot: Tanks & APCs (+10%); Pilot: Jet Pack (+12%) ill: Hovercycle (+10%); Pilot: Two of choice (+10%).; Radio: Basic (+15%); Read Sensory Equipment (+10%); Recognize Weapon Quality (+15%); Tracking (+10%); Weapon Systems (+10%); Wilderness Survival (+10%); W.P. : Five of choice, but at least three modern energy weapons. Hand to Hand: Expert, but can be changed to Martial Arts (or Assassin, if an evil alignment) for the cost of one O.C.C. Related Skill, or Commando for the cost of two.",
                "Select four other skills at level one and one additional skill at levels 3, 6, 9, and 1 2 . All new skills start at first level proficiency.; Communications: Any (+5%).; Cowboy : None.; Domestic : Any.; Electrical : Basic Electronics only.; Espionage : Any (+5%).; Horsemanship: General only.; Mechanical : Automotive only (+5%).; Medical : Paramedic only.; Military : Any (+15%).; Physical : Any, except Acrobatics.; Pilot: Any.; Pilot Related : Any.; Rogue: Any.; n; Science: Math skills only.; Technical : Any.; W.P. : Any.; Wilderness : Any (+5%).",
                "Six Secondary Skills from the Secondary Skills L ist in the Skills Section, +2 additional Secondary Skills at levels 3 , 6, 9 and 1 2. These are additional areas of knowledge that do not get any bonuses, other than any possible bonus for having a high l.Q. All Secondary Skills start at the base skill level.",
                "1D6x100 credits, 1D6x1000 in Black Market items"));

        classList.add( new CharacterClass(
                0,
                "Juicer",
                "Occupational",
                "Men at Arms",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                "Language: Native Tongue at 92%.; Language: Other: Two of choice (+10%).; Acrobatics (+15%); Cl imbing (+20%); Land Navigation (+5%); Pi lot: Two of choice (+10%).; Radio: Basic (+10%); Recognize Weapon Quality (+10%); Running; Swimming (+10%); W.P. Knife; W.P. Energy Pistol; Wilderness Survival (+5%); W.P. Energy Rifle; W.P.: Two of choice (any).; Hand to Hand: Expert, or may be changed to Hand to Hand: Martial Arts (or Assassin, if an evil alignment) at the cost of one O.C.C. Related Skill.",
                "Select 8 other skills. Plus select one additional skill at levels 2, 5, 7, 9 and 12 . All new skills start at level one proficiency.; Communications: Any.; Cowboy: Breaking Horse, Roping and Trick Riding only.; Domestic: Any.; Electrical: Basic only.; Espionage: Detect Ambush, Detect Concealment, Escape Artist, Intelligence,; and Sniper only (+5% where applicable).; Horsemanship: General and Exotic Animals only.; Mechanical: Automotive and Basic only.; Medical: First Aid only.; Military: Any (+10%).; Physical: Any (+10% where applicable).; Pilot: Any (+5 on all military types).; Pilot Related: Any (+5%).; Rogue: Any (+2% to most, +15% to Prowl).; Science: Math skills only.; Technical: Any.; W.P.: Any; Wilderness: Any (+5%).",
                "Two additional Secondary Skills at levels 1 , 3, 6, 8, 10, and 12, selected from the Secondary Skills List in the Skills Section. These are additional areas of knowledge that do not get any bonuses, other than any possible bonus for having a high I.Q. All start at the base skill level.",
                "4D6x100 credits, 4D6x100 in Black Market items"));

        classList.add( new CharacterClass(
                0,
                "Merc Soldier/Hired Gun",
                "Occupational",
                "Men at Arms",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                "These are in addition to MOS and reflect basic training.; Language: Native Tongue at 95%.; Language: Other: One of choice (+10%).; Climbing (+10%); General Athletics; Mathematics: Basic (+5%); Military Etiquette (+10%); Radio: Basic (+10%); Recognize Weapon Quality (+10%); Running; Sign Language (military: +5%); W.P. Knife (includes Vibro-Knives); W.P. Energy Pistol; W.P. Energy Rifle; Hand to Hand: Basic, which can be changed to Expert at the cost of one \"O.C.C. Related Skill\" or Martial Arts (or Assassin if evil) for the cost of two skill selections.",
                "Select four other skills at level one, +1 additional skill at levels 3 , 5 , 7, 10, and 13 . All new skills start at level one proficiency.; Communications: None, other than possible MOS Skills.; Cowboy: None.; Domestic: Any.; Electrical: Basic only.; Espionage: None, other than possible MOS Skills.; Horsemanship: General and Exotic only.; Mechanical: Automotive and Basic Mechanics only.; Medical: None, other than possible MOS Skills.; Military: Any (+5%) .; Physical: Any, except Acrobatics.; Pilot: Basic vehicle types only: the average grunt does not know; how to drive a tank.; Pilot Related: None, other than possible MOS Skills.; Rogue: Any .; Science: Advanced Math (+5%) and Astronomy only.; Technical: Any (+5%).; W.P.: Any .; Wilderness: Land Navigation and Wilderness Survival only.",
                "Two at levels 1, 4, 8, and 12, selected from the Secondary Skill list in the Skill Section. These are additional areas of knowledge that do not get any bonuses, other than any possible bonus for a high I.Q. All start at the base skill level.",
                "2D6x100 credits, 1D4x1000 in Black Market items"));

        classList.add( new CharacterClass(
                0,
                "Robot Pilot",
                "Occupational",
                "Men at Arms",
                0,
                0,
                0,
                10,
                12,
                12,
                0,
                "These are in addition to MOS and reflect basic training for all Robot Pilot O.C.C.s, whether they specialize in power armor or giant robots and heavy vehicles.; Language: Native Tongue at 94%.; Language: Other: One of choice (+20%).; Basic Mathematics (+20%); Body Building and Weightlifting; Climbing (+5%); Computer Operation (+10%); Military Etiquette (+15%); Pilot: Combat Driving (+15%); Pilot: One of choice (any: +15%).; Radio: Basic (+10%); Running; Sensory Equipment (+15%); W.P. Ancient: One of choice.; W.P. Modern: One of choice.; W.P. Energy Rifle; Hand to Hand: Expert, but it can be changed to Martial Arts at the cost of one \"O.C.C. Related Skill\" or Commando (or Assassin if evil) for the cost of two Related Skill selections.",
                "Select five other skills, plus select one additional skill at levels 2, 4, 6, 9 and 1 2 . All new skills start at level one proficiency.; Communications: Any (+10%).; Cowboy: None.; Domestic: Any.; Electrical: Basic only.; Espionage: Detect Concealment and Wilderness Survival only.; Horsemanship: None.; Mechanical: Automotive, Aircraft and Basic Mechanics only (+5%).; Medical: First Aid (+5%) only.; Military: Any (+10%), except Naval History and Naval Tactics.; Physical: Any.; Pilot: Any (+10%), except Ships and Warships.; Pilot Related: Any (+10%).; Rogue: Cardsharp and Seduction only.; Science: Math (+10%) and Astronomy & Navigation (+15%) only.; Technical: Any (+5%).; W.P.: Any.; Wilderness: Any.",
                "Two Secondary Skills at levels 1, 4, 8, and 12. These are additional areas of knowledge selected from the Secondary Skills List in the Skill Section. All start at the base skill level without benefit of bonuses, with the possible exception of an I.Q. bonus. Starts at first level proficiency.",
                "1D6x100 credits, 1D6x1000 in Black Market items"));

        //endregion

        //region Adventurers & Scholars
        classList.add( new CharacterClass(
                0,
                "Body Fixer",
                "Occupational",
                "Adventurer & Scholar",
                10,
                0,
                0,
                0,
                0,
                0,
                0,
                "",
                "",
                "",
                ""));

        classList.add( new CharacterClass(
                0,
                "City Rat",
                "Occupational",
                "Adventurer & Scholar",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                "",
                "",
                "",
                ""));

        classList.add( new CharacterClass(
                0,
                "Cyber-Doc",
                "Occupational",
                "Adventurer & Scholar",
                11,
                0,
                0,
                0,
                12,
                0,
                0,
                "",
                "",
                "",
                ""));

        classList.add( new CharacterClass(
                0,
                "Operator",
                "Occupational",
                "Adventurer & Scholar",
                9,
                0,
                0,
                0,
                0,
                0,
                0,
                "",
                "",
                "",
                ""));

        classList.add( new CharacterClass(
                0,
                "Rogue Scholar",
                "Occupational",
                "Adventurer & Scholar",
                10,
                0,
                10,
                0,
                0,
                0,
                0,
                "",
                "",
                "",
                ""));

        classList.add( new CharacterClass(
                0,
                "Rogue Scientist",
                "Occupational",
                "Adventurer & Scholar",
                12,
                0,
                0,
                0,
                0,
                0,
                0,
                "",
                "",
                "",
                ""));

        classList.add( new CharacterClass(
                0,
                "Vagabond",
                "Occupational",
                "Adventurer & Scholar",
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                "",
                "",
                "",
                ""));

        classList.add( new CharacterClass(
                0,
                "Wilderness Scout",
                "Occupational",
                "Adventurer & Scholar",
                8,
                0,
                0,
                0,
                0,
                12,
                0,
                "",
                "",
                "",
                ""));
        //endregion

        //region Practitioners of Magic

        classList.add( new CharacterClass(
                0,
                "Elemental Fusionist",
                "Occupational",
                "Practitioner of Magic",
                10,
                12,
                0,
                10,
                0,
                12,
                0,
                "",
                "",
                "",
                ""));

        classList.add( new CharacterClass(
                0,
                "Ley Line Walker",
                "Occupational",
                "Practitioner of Magic",
                10,
                0,
                0,
                0,
                0,
                12,
                0,
                "Language : Native Tongue at 98%.; Language : Other: Two of choice (+20%).; Climbing (+5%); Math : Basic (+ 1 0%); Land Navigation (+4%); Wilderness Survival (+ 1 0%); Pi lot: (One of choice at +5%).; Lore : Demon & Monster (+ 1 5%); Lore : Four of choice (any, + 1 0%).; Hand to Hand : Basic; can be changed to Hand to Hand : Expert at the cost of one \"O.C.C. Related Skill,\" or Martial Arts (or Assassin, if an evil alignment) for the cost of two O . C . C . Related Skills.",
                "Select seven other skills, but two must be selected from the science category and one from technical. Plus select two additional skills at level three, one at level six, one at level nine, and one at level twelve. All new skills start at level one proficiency.; Communications : Radio: Basic, Language, and Literacy only.; Cowboy : None.; Domestic : Any (+ 1 0%) .; Electrical : None.; Espionage : Intelligence only (+5%) .; Horsemanship: General and Exotic Animals only.; Mechanical : None.; Medical : First Aid or Paramedic (latter counts as two skills, +5%).; Military : None.; Physical : Any, except Gymnastics and Wrestling.; Pilot: Any (+2%).; Pilot Related: Any (+2%).; Rogue: Any.; Science: Any (+ 1 0%).; Technical : Any (+5%).; W.P. : Any.; Wilderness: Any.",
                "The character also gets to select six Secondary Skills from the Secondary Skills list, plus one additional Secondary Skill at levels 4, 8 and 1 2 . These are additional areas of knowledge that do not get any bonuses, other than any possible bonus for having a high I . Q . All Secondary Skills start at the base skill level.",
                ""));

        classList.add( new CharacterClass(
                0,
                "Mystic",
                "Occupational",
                "Practitioner of Magic",
                9,
                9,
                9,
                0,
                0,
                0,
                0,
                "",
                "",
                "",
                ""));

        classList.add( new CharacterClass(
                0,
                "Shifter",
                "Occupational",
                "Practitioner of Magic",
                12,
                12,
                0,
                0,
                0,
                0,
                0,
                "",
                "",
                "",
                ""));

        classList.add( new CharacterClass(
                0,
                "Techno-Wizard",
                "Occupational",
                "Practitioner of Magic",
                12,
                12,
                0,
                0,
                0,
                0,
                0,
                "",
                "",
                "",
                ""));


        //endregion

        //region Psychics
        classList.add( new CharacterClass(
                0,
                "Burster",
                "Occupational",
                "Psychic",
                8,
                0,
                0,
                0,
                0,
                0,
                0,
                "",
                "",
                "",
                ""));


        classList.add( new CharacterClass(
                0,
                "Mind Melter",
                "Occupational",
                "Psychic",
                10,
                10,
                0,
                0,
                0,
                0,
                0,
                "",
                "",
                "",
                ""));

        //endregion

        return classList;
    }

}

