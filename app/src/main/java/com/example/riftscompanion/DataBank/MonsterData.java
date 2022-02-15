package com.example.riftscompanion.DataBank;

import com.example.riftscompanion.Monster;

import java.util.ArrayList;

public class MonsterData {
    private ArrayList<Monster> monstersList;
    public ArrayList<Monster> getMonstersList() { return monstersList; }
    public MonsterData() {
        this.monstersList = CreateMonstersList();
    }

    private ArrayList<Monster> CreateMonstersList() {
        ArrayList<Monster> monsters = new ArrayList<>();

        monsters.addAll(VampireKingdomMonsters());
        monsters.addAll(AtlantisMonsters());
        monsters.addAll(EnglandMonsters());
        monsters.addAll(SpiritWestMonsters());

        return monsters;
    }

    private ArrayList<Monster> VampireKingdomMonsters() {
        ArrayList<Monster> monsters = new ArrayList<>();

        return monsters;
    }

    private ArrayList<Monster> AtlantisMonsters() {
        ArrayList<Monster> monsters = new ArrayList<>();

        return monsters;
    }

    private ArrayList<Monster> EnglandMonsters() {
        ArrayList<Monster> monsters = new ArrayList<>();

        return monsters;
    }

    private ArrayList<Monster> SpiritWestMonsters() {
        ArrayList<Monster> monsters = new ArrayList<>();

        //region Desert Sleeper
        monsters.add(new Monster(
                0,
                "Desert Sleeper",
                "Low animal intelligence",
                "4 (1D6)",
                "6 (2D6)",
                "24 (20+1D6)",
                "19 (15+1D6)",
                "22 (18+1D6)",
                "9 (2D6+3)",
                "46 (34+4D6)",
                "10 to 11 (3 to 3.3m) feet from head to tail, about 6 feet (1.8m) at the shoulders",
                null,
                null,
                "Plated Head - 100; Arms 15 each; Legs 50 each; Underbelly 80; Main Body: Spine/Back or when curled into a ball - 100+2D6x10 MDC",
                "6 (2D6)",
                "None",
                null,
                null,
                "Excellent speed, can run without pause and without exhaustion for six hours, and leap up to 20 ft (6m) lengthwise and 1 2 ft (3.6m) high. Can go without food or water for eight weeks without ill effect (lives off the fat and water stored in their tail), eats small animals and carrion, and can track the scent of decay 55%",
                "Four",
                "Clawed Hind Legs: 2D4 M.D.; Bite 2D6 S.D.C; Tail Slash 2D6 S.D.C + P.S. bonus; Head Butt: 2D6 S.D.C/running head butt 1D6x10 S.D.C plus human-sized opponents are knocked 2D8 yards",
                "+2 on initiative, +1 to strike, +2 to dodge, +4 leaping dodge, +3 to roll with impact or fall, +6 to save vs disease and poison, +2 to save vs horror factor. ",
                null,
                "",
                "Deserts and Grasslands. West of Rocky Mountains: Nevada, Utah, Arizona, Northern Mexico, West Texas/Lone Star, deserts of California",
                "300-600 credits per animal. The meat of Desert Sleepers is good tasting and their natural armor plating can be used to make (non-environmental) body armor. They make poor riding animals (-20% to riding skill) and only Simvan and PsiStalkers can ride them.",
                "Rifts Worldbook 14: New West. pg 138",
                "The Desert Sleepers get their name from the fact that they bury themselves under the sand at night and when hiding from predators. They are two-legged, warm-blooded, theropod dinosaur-like creatures about twice the size of a human with powerful ostrich-like legs for running and leaping, small arms and two-fingered claws for picking up and carrying eggs and scraps of meat, as well as to help dig in the sand. The tops of their heads are armor plated as is their entire spine. This armor plating offers additional protection while sleeping and, if they cannot escape a foe by outrunning him, the Desert Sleeper will curl up in a ball like an armadillo and hope that his attacker will grow frustrated and leave when it cannot penetrate its armor. This defense tactic is effective against most animal predators, but makes it easy for humanoids to hunt and kill them. The animal's skin is sand colored, with the top body plates being a darker shade of brown or grayish brown. Desert Sleepers prey on small animals, including snakes, lizards, rodents and birds, as well as reptile and birds' eggs and carrion. Although they may eat the carcass of a dead humanoid, they never attack them, even when humanoids attack them first. The animals try to run away and fight only to escape."
        ));
        //endregion

        //region Devil Unicorn
        monsters.add(new Monster(
                0,
                "Devil Unicorn",
                "6 (1D4+4)",
                "22 (18+1D6)",
                "4",
                "40 (30+3D6); supernatural",
                "22 (18+1D6)",
                "26 (20+2D6); supernatural",
                "2 (1D4)",
                "26 (14+4D6) minimum 22",
                "5 feet (1.5m) at the shoulders, 12-14 feet (3.6 to 4.3m) long from the point of its muzzle to its hindquarters, plus another 10-12 feet (3 to 3.6m) for its tail.",
                "",
                "",
                "Horn: 100; Head: 100; Front Legs: 140 each; Rear Legs: 190 each; Tail: 220; Main Body: 200 + 1D6x100",
                "6D6",
                "15",
                null,
                null,
                "Fair speed, can run without pause and without exhaustion for two hours, leap up to 30 ft (9m) lengthwise and 20 ft (6m) high, loves to swim (swim skill equivalent 90%), can hold its breath for 6+1D6 minutes, survive depths of up to 400 feet (122m), climb 90%/80%, prowl 60% , track humanoids (using sense of smell and vision) 78% (60% to track animals), land navigation 80% , and wilderness survival 95%.",
                "5",
                "Tiny Mandibles: 1D6 to 4D6 S.D.C. depending on desired damage; Biting Nip: 6D6 S.D.C to 1D4 M.D; Bite: 2D4 M.D; Restrained Strike: 5D6 S.D.C.; Clawed Strike 4D6 M.D.; Power Strike 1D4x10 M.D.; Horn Stab 3D6 M.D.; Pounce Attack: 2D4 M.D. plus 01-74% likelihood of prey being pinned and helpless. After a successful pounce attack, the Devil Unicorn can claw with all four legs, inflicting 2D4x10M.D.",
                "+3 on initiative, +3 to strike, +1 to parry, +3 to dodge, +6 to pull punch, +4 to roll with impact or fall, +3 to save vs psionic attack and possession, +12 to save vs horror factor.",
                null,
                null,
                "Only a few hundred to a thousand are believed to exist on the American continents but can be found in any environment. They prefer wooded areas with lakes and waterways near a people they can torment, and enjoy mountains. Devil Unicorns are most commonly reported in the Canadian Southwest, the American Northwest, Wyoming, Colorado, Wisconsin, Michigan and the Magic Zone.",
                "None",
                "Rifts Worldbook 14: New West. pg 140.",
                "Many consider it a demon, but whether o r not i t is a true demon or a powerful, vicious and cruel animal is unclear. The abomination gets its name from its long, single hom, demonic looks and hellish laugh. Devil Unicorns have a deep , rasping and maniacal laugh that is often heard in the distance as the fiend stalks his prey, as well as during combat (as long as it thinks it can win) and when it tortures captives. The hom is used to butt and stab and is especially lethal against large prey, but the monster' s wicked claws and slashing tail are what humanoids have to worry about. The Devil Unicorn is a hideous and terrifying supernatural monster from the Rifts. Its body is thick with muscles, and the top of its head, its spine and tail are protected by thick ridges of bone. The Devil Unicorn has a low human intelligence and can actually speak broken American in a low, guttural voice and rasping whisper - usually accompanied by raspy growls, heavy breathing and its demonic laugh. As a predator, it is incredibly cunning, tricky and kills for pleasure as well as for food. In fact, a Devil Unicorn looks to maim and hold I D6 prey captive in its lair where it engages in mental and physical torture. Mental torture includes intimidation, pretense to torture or kill, pretending to let a captive escape (only to be pounced upon or hunted down and returned), and similar. Physical torture includes being pricked, stabbed and lacerated by its mandibles or claw, nips and bites, battery, broken bones ,and maiming. Devil Unicorns love to abduct and torture their captives, slaughter cattle, and torment people (often terrorizing an entire town or region), almost as much as they love to fight and kill. Black hearted in the extreme, these Devilish beasts will deliberately slaughter animals, from pets to livestock, without taking a bite to eat; kidnap women and children, kill children, women, preachers and so-called protectors and leave them gutted and displayed for all to see (spread-eagle, impaled on a tree or fence, or hung from a pole, tree or rafters), and steal or destroy things people hold of value, including shrines, churches, hospitals, generators, important vehicles and equipment, etc. Fortunately, Devil Unicorns usually live and hunt alone or in small groups of 2-4; they don't care for their own kind, see each other as rivals and constantly fight amongst themselves."
        ));
        //endregion


        monsters.add(new Monster(
                0,
                "Duckbilled Honkers",
                "Low animal intelligence",
                "4 (1D6)",
                "7 (2D6)",
                "24 (20+1D6)",
                "18 (14+1D6)",
                "22 (18+1D6)",
                "10 (3+2D6)",
                "45 (34+3D6); a minimum speed of 38 (26 mph/41.6km), most have a speed of 40 to 44 (about 30 mph/48km).",
                "20-30 feet (6 to 9m) from head to tail, about 18-20 feet (5.4 to 6m) standing erect. Weighs 2-3.2 tons",
                "",
                "",
                "Head: 100; Arms: 20; Legs: 130; Underbelly: 120; Main Body: 300 (100 + 1D4x100)",
                "14 (4D6)",
                "None",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "Rifts Worldbook 14: New West. pg 141.",
                "Whether these are Duckbilled (Hypacrosaurus?) dinosaurs from Earth's past or similar creatures from another world is unknown. They are large, herbivores with a large flat, bill-like muzzle with large, flat teeth in the lower jaw for grinding and chewing vegetation; namely the conifer trees, pine cones, acorns, oak tree leaves, berries, ferns and various other plants found in mixed forests. The Duckbills travel in herds of 20-80 to 100-600 animals. They are preyed upon by large predators of all kinds and have come to be herded like cattle by some Indians and ranchers in the west. Duckbills rarely fight unless panicked, backed into a comer and attacked, or to defend its nest or young. Generally they ignore small, unmounted humanoids , and run away from danger whenever they can. They are called \"honkers\" because they make loud honking sounds like geese with a loudspeaker."
        ));

        return monsters;
    }

    private ArrayList<Monster> BestiaryMonsters() {
        ArrayList<Monster> monsters = new ArrayList<>();

        monsters.add(new Monster(
                0,
                "Ee-Bee Gee-Bee",
                "1D6+8 (high animal intelligence and a cunning social predator).",
                "18 (1D4+14)",
                "26 (1D6+22)",
                "23 (1D6+19) (Supernatural)",
                "22 (1D6+18)",
                "20 (1D6+16)",
                "20 (1D6+16) (cute, fluffy and cuddly)",
                "28 (1d6+24) 20 mph on flat ground, walls, ceilings or webbing. Can maintain for up to three hours straight, 10 mph for up to eight hours. Poor swimmer and avoids water.",
                "3-4 feet tall in arachnid centaur form; 1.5-2 feet in low profile stalking mode. Females are 10-20% larger than males",
                "",
                "",
                "Arms: 20 M.D.C.; Head Mandibles: 12 M.D.C.; Legs: 28 M.D.C.; Head: 64 (1D6+60) M.D.C.; Main Body: 80 (1D4x10+60) M.D.C.",
                "5D6",
                "13 but only when they are threatening, attacking or eating people alive",
                "",
                "",
                "",
                "Four. The creation of a web rope or streamers count as one melee attack. Ee-Bee Gee-Bees are able to lower themselves ona web line from a position high up to drop down on prey from above or silently lower itself behind a potential target for a surprise attack.",
                "Restrained Bite: 4D6 S.D.C.; Bite: 2D6+1 M.D.C.; Bite, Venom: 1D6 S.D.C/1 M.D. but poison paralyzes its victim; Restrained Punch: 4D6 S.D.C.; Punch 2D6 M.D.C.; Pounce: 2D6 M.D.C. and 50% chance to knock target prone. Pounce attacks can be a leap attack on the ground or dropping/leaping from above.; Leg Claw Strike: 2D6+3 M.D.C.; Use Webbing (Special): Entangle, lasso, and capture target. ",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
        ));

        return monsters;
    }
}
