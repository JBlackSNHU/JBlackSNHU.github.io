package com.example.riftscompanion.DataBank;

import com.example.riftscompanion.Bionics;

import java.util.ArrayList;

public class BionicsData {
    private final ArrayList<Bionics> bionicsList;
    public ArrayList<Bionics> getBionicsList() { return bionicsList; }

    public BionicsData() {
        this.bionicsList = CreateBionicsList();
    }


    private ArrayList<Bionics> CreateBionicsList() {
        ArrayList<Bionics> bionicsList = new ArrayList<>();

        bionicsList.add( new Bionics(
                0,
                "Bionic Booster Jets",
                "Usually built into the feet and legs to help rocket the cyborg to greater heights and distances when he leaps. Can leap 20 feet (6.1m) high and 30 feet (9.1m) across.",
                "20,000 credits"
        ));

        bionicsList.add( new Bionics(
                0,
                "Bionic Lung with Gas Filter & Oxygen Storage Cel l :",
                "An artificial lung implanted to provide for the special needs of the ' Borg. A chemical cell, controlled by microprocessors, stores oxygen from the character's normal breathing. Then, when oxygen is low, the oxygen is released back into the lungs. The net effect is to give the character the ability to go without breathing for up to two hours. Note that the character must breathe normally for about three hours to fully recharge the cell between uses. The lung also has a gas filtration system designed to filter most toxic gases out of the system before they can do damage. The filter is effective against all types of tear gas, smoke, and purely chemical fumes. There is a 94% likelihood that it will also work against nerve gases and poison gases.",
                "250,000 credits"
        ));

        bionicsList.add( new Bionics(
                0,
                "Built-In Loudspeaker",
                "The 'Borg can amplifY the loudness of his voice, like a bullhorn, to about 80 decibels.",
                "6,000 credits"
        ));

        bionicsList.add( new Bionics(
                0,
                "Built-In Radio Receiver & Transmitter Headjack",
                "A fully operational radio is built inside the head. Channels are switched by working the jaw and transmissions are received directly in the ear identical to the cybernetic Headjack. The cyborg can send transmissions by a mental command and quietly talking out loud. A microphone is built into the jaw. Range: 20 miles (32 km).",
                "22,000 credits; add 10,000 for scrambling radio messages and decoding"
        ));

        bionicsList.add( new Bionics(
                0,
                "Climb Cord",
                "Similar to the cybernetic garrote wire, this is a 20 foot (6.1m) length of 1,500 lb (675 kg) test cord, no thicker than string, that can be pulled out of an artificial wrist or arm. The cord is primarily used for espionage. A weight can be attached and used as a chain-type weapon (1D6 S.D.C. damage), or a small grappling hook can be attached for climbing.",
                "1,500 credits; grappling hook and other attachments extra (can be made our bought for under 30 credits)."
        ));

        bionicsList.add( new Bionics(
                0,
                "Clock Calendar",
                "A device that can be implanted almost anywhere on the body. It continuously keeps track of the exact time, down to a 100th of a second, as well as the calendar date. Data can be transmitted as an audio report through an ear implant or to a wristwatch-like receiver, cybernetic eye, and/or computer screen, but the latter requires a Fingerjack or Headjack.",
                "200 credits"
        ));

        bionicsList.add( new Bionics(
                0,
                "Computer & Calculator built into the Arm",
                "A miniature computer, similar to the tiny hand-held model, built into the forearm, upper arm or even inner side of the thigh. The cyborg needs the Computer Operation skill and literacy to utilize it.",
                "1,200 credits"
        ));

        bionicsList.add( new Bionics(
                0,
                "Customized Paint Job",
                "Basically the same as customizing body armor with special colors, designs, insignias, and so forth.",
                "1,000-5,000 credits"
        ));

        bionicsList.add( new Bionics(
                0,
                "Customized Face or Armored Face Plate",
                "Handsome, beautiful, monstrous, robotic, ornate, or whatever the purchaser may desire.",
                "2,000 to 20,000 credits, depending on the complexity"
        ));

        bionicsList.add( new Bionics(
                0,
                "Cyber-Nano-Robot Repair System s (CNRRS)",
                "Similar to the RMK and IRMSS medical repair systems used by humans, these nano-bots can be released when needed most to make minor repairs. They use available spare materials to effect mechanical and armor repairs, but can also reroute, patch, and secure internal circuits and repair internal organs - at least to some degree. As much as 40 M.D.C. can be restored to armor or any one single limb, the head or main body - or any one optic system (eye), sensor, implant, weapon or internal organ can be repaired completely (or close to it). Time required varies with the task. Something small and simple (10 M.D.C. or less) : 3D6 minutes. Something medium-sized (15-25 M.D.C.): 1D6xl0+30 minutes, and large or complicated, like an entire hand and arm, leg, major organ, maj or weapon, main body, etc. (40 M.D.C. maximum): 2D6xl0+90 minutes. Payload: Good for two repair jobs before used up.",
                "250,000 credits"
        ));

        bionicsList.add( new Bionics(
                0,
                "Depth Gauge and Alarm",
                "An internal implant that can calculate underwater depth. A digital counter can indicate the exact depth via internal audio or HUD system and make warning sounds when the character is within 100 feet (30.5 m) of his maximum depth tolerance.",
                "3,000 credits"
        ));

        bionicsList.add( new Bionics(
                0,
                "E-Clip Port",
                "A standard E-Clip port very similar to the connector unit found on most energy weapons. While such ports are often intended to power a built-in weapon or as a power backup for weapons, E-Clips can also be used to power independent modular units and non-weapon systems like special sensors, cameras and such.",
                "3,000 credit"
        ));

        bionicsList.add( new Bionics(
                0,
                "Finger Camera",
                "A tiny still camera fits inside the tip of one finger. The camera can shoot 48 photos on microfilm and is designed to automatically adj ust for low light and bright light exposures. The camera shoots a picture each time a concealed stud in the finger is pressed.",
                "1,200 credit. Film costs about 40 credits per micro roll and takes about 30 seconds to reload."
        ));

        bionicsList.add( new Bionics(
                0,
                "Fingerjack",
                "The artificial finger can plug directly into communication systems, radios, sensory equipment, and robots, to receive direct data transmissions. Note: Needs amplified hearing or other cybernetic/bionic ear augmentation to receive the transmitted data.",
                "2,400 credits"
        ));

        bionicsList.add( new Bionics(
                0,
                "Gyro-Compass",
                "A device that can be implanted almost anywhere on the body. It enables the user to always locate North and the other directions, as well as up and down. Ideal for pilots of aircraft and power armor as well as underwater operations. Data can be transmitted as an audio report through an ear implant or to a wristwatch-like receiver, cybernetic eye, and/or computer screen, but the latter requires a Fingerjack or Headjack.",
                "600 credits"
        ));

        bionicsList.add( new Bionics(
                0,
                "Internal Comp-Calculator",
                "A tiny computerized calculator usually connected to a Headjack, ear implant or artificial eye. The computer responds to spoken, radio or computer transmitted mathematical equations. The answer is transmitted through the Headj ack, ear or eye implant. Cost: Basic math (addition, subtraction, multiplication, division and fractions)",
                "1,000 credits. Advance math (algebra, geometry, and calculus): 5,000 credit"
        ));

        bionicsList.add( new Bionics(
                0,
                "Language Translator",
                "A miniaturized language translator placed right inside the body to facilitate easy communication with the multitude of nonhuman life forms on Rifts Earth. Characters who already have a Headj ack or some other type of audio ear implant can have the cyber-translator implant installed at half cost because it is integrated into that pre-existing system. Starts with 1 0 different languages to begin with, and eight additional languages can be added. Level of accuracy is 98.7% when listening to only one or two speakers and languages at a time. Drops to 70% with a six second delay when trying to translate 3-6 speakers simultaneously, 22% if more than that.",
                "16,000 credits for the full entire system (requires an ear implant if none exists yet), half if another implant pre-exists"
        ));

        bionicsList.add( new Bionics(
                0,
                "Modulating Voice Synthesizer",
                "Enables the character to change and disguise his voice by altering tone, bass, pitch, etc. Can also speak in a sound frequency inaudible to normal humans, but audible to normal canines, bats and mutant dogs, as well as other 'Borgs, and characters with a cybernetic Ultra-Ear. Base skill at imitating voices is 10% plus 5% per each additional level of experience.",
                "25,000 credits. Add 12,000 credits to get a voice disguise program with over 200 different human and D-Bee accents and inflections"
        ));

        bionicsList.add( new Bionics(
                0,
                "Molecular Analyzer",
                "This microchip based sensor is used for testing and analyzing impurities in the air. It can specifically identify any chemical, or strange and dangerous molecules, like the presence of gas, oil, pollution, or other chemicals in the air. Data can be transmitted as an audio report through one of the ear or computer implants. It does not enable one to track.",
                "50,000 credits"
        ));

        bionicsList.add( new Bionics(
                0,
                "Monitor Jack/Connector Plug",
                "This is a simple connector that enables Cyber-Docs and technicians to plug in diagnostic readers and monitors to access bio-comp readings and basic sensor and communications/ video data.",
                "1,000 credits each"
        ));

        bionicsList.add( new Bionics(
                0,
                "Secret Compartments",
                "Hollow compartments can be built into the legs and chest of a cyborg. The largest possible is approximately 12 inches long (0.3m) and four to six inches (1.6 to 2.3 6 cm) deep, but are usually half that size or smaller. The smallest are about the size of a change purse, just big enough to conceal a few credit cards, coins, lock picking tools, electronic bugs or components/chips, and so on. The larger compartments are ideal for storing supplies, tools, hand-size equipment, hand grenades, and small handguns. Game Masters and players should use common sense regarding the number of compartments. Generally speaking, each leg and chest can accommodate two medium-size or one large compartment, or as many as six small each. The arms can only accommodate one small compartment on the forearm and upper arm, but only if no weapon systems are built into/on the arms.",
                "1,000 credits for each small, 2,500 for each medium, and 4,000 for each large"
        ));

        bionicsList.add( new Bionics(
                0,
                "Amplified Hearing",
                "A system of tiny sound amplifiers, microphones and receivers are built into the ear canal, enabling the character to hear almost inaudible sounds at up to 360 feet (110m) away. At 75 feet (22.9 m), sounds as quiet as one decibel, softer than a whisper, can be heard. At 150 feet (45.7 m), sounds as quiet as 10 decibels, a whisper, can be heard clearly. At 360 feet (110 m), sounds in the normal conversation range of 30 decibels can b e heard a s if the character was standing only a few feet (one meter) away. This is the maximum range for eavesdropping on conversations. Only sounds of 70 decibels (e.g., the sound of heavy traffic) or louder can be accurately heard and the location pinpointed from 500 to 1,000 feet away (152.4m to 305m). The Amplified Hearing also enables the character to accurately estimate the distance and location of the sound source, and recognize specific sounds and voices at a base skill of 35% plus 5% per level of experience. Background noise, such as other conversations, traffic, machine noise, etc., as well as barriers like closed doors and walls, will decrease the range and clarity of what can be heard. G.M.s should use their discretion and common sense. Bonuses: +1 to parry, +2 to dodge, and +3 on initiative.",
                "20,000 credits"
        ));

        bionicsList.add( new Bionics(
                0,
                "Eye: Cyber-Camera Eye",
                "Looks like an ordinary cybernetic eye and provides 20/20 sight, but is also a digital (or video) camera that records and/or transmits everything the characters sees. Transmission range is 20 miles (32 km) in the city, 60 miles (96 km) in the wilderness, unless hampered by some sort of interference. Live feed is most common, but up to one hour of filming can be recorded and stored on a memory chip.",
                "30,000 credits for a single basic color and sound system. 50,000 for a pair of camera eyes. Add 20,000 for synchronized digital audio recording and transmission. Add 40,0000 credits for broadband capabilities (and double the transmission range). Note: sometimes illegal for the average citizen. Illegal in the CS."
        ));

        bionicsList.add( new Bionics(
                0,
                "Eye: Infrared",
                "This type of optical enhancement relies on a source of infrared light, a pencil thin beam of light projected from the eye to the target. The narrowness of the beam limits the viewing area to a small area of about seven feet (2.1m). Range: 1,200 feet (366 m). The eye also simulates normal human vision.",
                "6,000 credits; 9,000 credits for a pair"
        ));

        bionicsList.add( new Bionics(
                0,
                "Eye: Macro",
                "A robot-looking eye that enables the character to magnify tiny objects or areas at close range (within three feet/0.9 m) like a magnifying glass to microscope ranges of magnification! It also comes equipped with a variety of filters to block out glare and dust. Microscopic magnification ranges from 2x to 50x. The artificial eye is extremely popular among medics, doctors, forgers and engineers (great for spotting defects and cracks).",
                "20,000 credits per single eye. A photographic camera (still or video) feature can be added for the additional cost of 10,000 credits."
        ));

        bionicsList.add( new Bionics(
                0,
                "Eye: Multi-Optics",
                "A mechanical optic system that includes the following impressive optic systems built into a single cyber-eye:\n Telescopic : 4-8x3 0 magnification, range : 6000 feet ( 1 829 m).\nMacro Lens: 2x to 20x magnification, range : 3 feet (0.9 m).\nPassive Nightvision: 2000 foot (6 1 0 m) range.\nThermal-Imaging: 2000 foot (6 1 0 m) range.\nLight Filters : Reduces glare.\nTargeting Display : Imposes cross-hairs on a target, adding a bonus of +1 to strike with any ranged weapon. Same bonus whether one or two Multi-Optic eyes.",
                "55,000-60,000 credits per single eye; 100,000 for a pair installed at the same time."
        ));

        bionicsList.add( new Bionics(
                0,
                "",
                "",
                ""
        ));

        bionicsList.add( new Bionics(
                0,
                "",
                "",
                ""
        ));


        return bionicsList;
    }

}
