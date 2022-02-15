package com.example.riftscompanion.DataBank;

import com.example.riftscompanion.Spell;

import java.util.ArrayList;

public class SpellData {

    private final ArrayList<Spell> spellsList;
    public ArrayList<Spell> getSpellsList() { return spellsList; }
    public SpellData() {
        this.spellsList = CreateSpellsList();
    }

    private ArrayList<Spell> CreateSpellsList() {
        ArrayList<Spell> spells = new ArrayList<>();

        //region Level One Invocations
        spells.add(new Spell(
                0,
                "Blinding Flash",
                "10 foot (3m) radius; up to 60 feet (18.3m) away.",
                "Instant",
                "Standard; -1 if 3 P.P.E. points are pumped into this spell",
                "One",
                "This invocation creates a sudden burst of intense, white light, temporarily blinding everyone in its ten foot (3 m) radius. Victims are blinded for one to four melee rounds, and are -10 to strike, parry and dodge. The chance of failing is 01-50% every 10 feet (3 m). The magic can be cast up to 60 feet (18.3m) away. Saving throw is standard; those who successfully save vs magic are not blinded. Note: Does not affect robotic, bionic or cybernetic eyes."
        ));

        spells.add(new Spell(
                0,
                "Cloud of Smoke",
                "90 feet (27.4m)",
                "Four melees (one minute) per level of experience.",
                "None",
                "Two",
                "This magic enables the mage to create a cloud of dense, black smoke (30x30x30 feet/9x9x9 meter maximum size) up to ninety feet (27.4m) away. Victims caught in the cloud will be unable to see anything beyond the cloud, and their impaired vision allows them to see no more than three feet (0.9m) within the cloud, and even then that means only blurry shapes. While in the cloud, victims are -5 to strike, parry, dodge, disarm and entangle."
        ));

        spells.add(new Spell(
                0,
                "Death Trance",
                "Self only",
                "10 melee rounds (two and a half minutes) per level of experience",
                "None",
                "One",
                "A magically induced trance which makes the spell caster appear to be dead. There is no breathing, pulse, heartbeat, or any other signs of life. While in the trance, the mage is quite helpless, unable to speak, move or invoke magic. Only minor physical sensations felt by the character are recognizable, like being jostled, carried or hearing voices, but no specific identification or memories are possible. The magic can be canceled at will at any time."
        ));

        spells.add(new Spell(
                0,
                "Globe of Daylight",
                "Near self or up to 30 feet (9.1m) away.",
                "12 melees (3 minutes) per level of experience.",
                "None",
                "Two",
                "A small globe or sphere of true daylight is magically created. The light is bright enough to light up a 12 foot (3.6m) area per each level of its creator's experience. Because it is daylight, it can ward off vampires and most other types of undead and demons who fear or are hurt by sunl ight, keeping them at bay j ust beyond the edge of the light. The creator of the globe can mentally move it along with himself, or send it up to thirty feet (9.1m) ahead. The maximum speed at which the globe can travel is equal to a speed attribute of 12."
        ));

        spells.add(new Spell(
                0,
                "Lantern Light",
                "10 feet (3m); can light up a room.",
                "30 minutes per level of the spell caster",
                "None",
                "One",
                "The Lantern Light spell creates a small sphere of light that is less brilliant but longer lasting than the Globe of Daylight. It floats within 10 feet (3 m) of the spell caster and can be mentally moved to hover at different angles and positions as the mage desires. This magic light may be thought of as a magical floating lantern or light bulb with a dimmer switch. The intensity of the light can be mentally adj usted to the equivalent of a 50 to 300 watt light bulb, whatever suits its creator. Note: This is not sunlight, so it will not damage vampires nor keep them at bay."
        ));

        spells.add(new Spell(
                0,
                "See Aura",
                "100 feet (30.5m)",
                "One Melee",
                "None. Only the psychic powers of Mind Block or Alter Aura will mask the presence of psychic abilities, the level of P.P.E., or possession.",
                "Six",
                "All things, organic and inorganic, have an aura. The aura has many features and distinctions, and can be used to see or sense things invisible to the eye. Seeing an aura will indicate the following:\n" +
                        "Estimate the general level of experience. Low (1-3), medium (4-7), high (8th and up).\n" +
                        "The presence of magic (no indication of what, or power level).\n" +
                        "The presence of psychic abilities. Low (Minor) or high (Major or Master).\n" +
                        "High or low base P.P.E.\n" +
                        "The presence of a possessing entity (does not indicate Psychic Possession or mind control).\n" +
                        "Health: Sick, injured or completely well.\n" +
                        "The presence of an unusual human aberration which indicates a serious illness or that the character is not human and may be a mutant, D-Bee, or demon, but does not reveal which. Note: One can not use this spell to determine another character's alignment."
        ));

        spells.add(new Spell(
                0,
                "See the Invisible",
                "200 feet (61m)",
                "One minute (4 melee rounds) per each level of experience.",
                "None",
                "Four",
                "The character can see Astral beings, entities, Elementals, ghosts, objects, forces and creatures that can turn invisible or are naturally invisible. Even if the creature has no form per se, the mystic will be able to discern the vaporous image or energy sphere that is the being."
        ));

        spells.add(new Spell(
                0,
                "Sense Evil",
                "90 foot (27.4m) area",
                "Two minutes (8 melees) per level of experience",
                "None, except a psychic Mind Block, Alter Aura or a Protection from Magic circle which will prevent the spell from working on anyone in the circle. The psychic's equivalent power of Sense Evil is not blocked by magic circles.",
                "Two",
                "The Sense Evil invocation enables the spell caster to feel or sense the presence of evil, and especially supernatural evil (demons, Deevils, etc.). It will indicate approximately how many supernatural evil presences are within the 90 foot (27.4 m) area; one, a few (2-6), several (7-14), or many (more than 15). It can also register the intensity of the evil and pinpoint the general location of the source(s) to a particular room(s), possessed object, or person, or an approximate distance (very close, near, far, etc.). Evil emanations from human beings, D-Bees and other mortals are much less distinct and can not be sensed as easily or broadly as above. In this case, the spell caster must see a particular individual and cast the spell on that one character. The mage can then detect if the character is Diabolic or not, otherwise he can only sense any immediate evil intention on the part of the targeted individual."
        ));

        spells.add(new Spell(
                0,
                "Sense Magic",
                "120 foot (36m) area.",
                "Two minutes (8 melees) per level of experience",
                "None",
                "Four",
                "This magic ability enables the character to sense or feel the presence of magic. Like a Geiger counter, the individual can tell if he is near (within 20 feet/6 m) or far (toward the limit of the range). The ability can also indicate whether a person or obj ect is enchanted/under a magic spell, is in the process of invoking magic, or if magic is being used in the range area. Note: Men of Magic and most supernatural beings do NOT register as magic except when they are actually casting a spell/using magic. Psychic powers can not be detected with this spell."
        ));

        spells.add(new Spell(
                0,
                "Thunderclap",
                "Directly affects the immediate area (30 feet/9.1m) around the magic weaver, but can be heard up to one mile (1.6 km) away.",
                "Instant",
                "Save vs Horror Factor.",
                "Four",
                "The invocation produces a booming clap of thunder that is so loud that it seems to make the air vibrate. A thunderclap is an excellent means of alerting or signaling allies, as well as a means of intimidation. As an intimidation device, it will momentarily startle and distract everyone other than the spell caster. This provides the creator of the thunder with a bonus of +5 on his initiative, +1 to strike, parry and dodge, and creates a Horror Factor of 8 (all characters within 30 feet/9.1m must roll to save vs Horror Factor, except the mage who made the thunder)."
        ));
        //endregion

        return spells;
    }

}
