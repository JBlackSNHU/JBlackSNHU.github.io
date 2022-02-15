package com.example.riftscompanion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.example.riftscompanion.databinding.ActivityPlayerCharacterAttributesBinding;

import java.util.Arrays;

public class PlayerCharacterAttributesActivity extends AppCompatActivity {

    PlayerCharacter character;      // PlayerCharacter object to store all the data in input on the page.
    PlayerCharacter character_temp; // Temp character for navigating to the previous screen and discarding changes.
    ActivityPlayerCharacterAttributesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* JBLACK The binding object and the setCharacter() method set the data context of the view
         * to the character PlayerCharacter object. This allows all data in the PlayerCharacter object to
         * be surfaced in the view without manually setting the value of each UI component. */
        binding = DataBindingUtil.setContentView(this, R.layout.activity_player_character_attributes);
        binding.setCallback(this);

        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            character = (PlayerCharacter) intent.getSerializableExtra("character");
            character_temp = (PlayerCharacter) intent.getSerializableExtra("character");
        }

        /* JBLACK the setCharacter() call is set down here due to the requirement for receiving the character
         * from the previous activity. */
        binding.setCharacter(this.character);

    }

    public void NavToClassSelectionActivity() {
        Intent intent = new Intent(this, PlayerCharacterClassSelectionActivity.class);
        intent.putExtra("character", character);
        startActivity(intent);
    }

    public void NavToPrevious() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("character", character_temp);
        startActivity(intent);
    }

    /* Uses the Java Math.Random class to
     * generate the random attribute rolls for each
     * attribute that needs to be assigned to the character
     * JBLACK -
     * The process will create four random numbers between from 1 to 6
     * drop the lowest number, then sum the remaining numbers for a total
     * It will then check to see if the sum is 17 or 18 to see if an additional roll can be made.
     */
    public void GenerateAttributeRolls() {
        int[] randomRolls = new int[8];
        int min = 1;
        int max = 6;
        for (int i = 0; i < randomRolls.length; i++) {
            int[] rolls = new int[4];

            // Loop assigning random values to the rolls array
            for (int r = 0; r < rolls.length; r++) {
                rolls[r] = (int)(Math.random()*(max-min+1)+min);
            }
            // Using the Arrays.sort function to set the lowest value to index 0
            Arrays.sort(rolls);

            // Sum the three highest values from the rolls array
            // which are now indices 1-3 thanks to the Arrays.sort method.
            int totalRoll = rolls[1] + rolls[2] + rolls[3];
            // If the total is less than 17 then this value is assigned
            if (totalRoll < 17) {
                randomRolls[i] = totalRoll;
            }
            // If the total is 17, or 18 (gte 17) then we add an additional roll since the attribute is exceptional
            else {
                randomRolls[i] = totalRoll + (int)(Math.random()*(max-min+1)+min);
            }
        }

        /* JBLACK Manually set the value of the rolls to the corresponding rolls generated above */
        this.character.setPcIntelligenceQuotient(String.valueOf(randomRolls[0]));
        this.character.setPcMentalEndurance(String.valueOf(randomRolls[1]));
        this.character.setPcMentalAffinity(String.valueOf(randomRolls[2]));
        this.character.setPcPhysicalStrength(String.valueOf(randomRolls[3]));
        this.character.setPcPhysicalProwess(String.valueOf(randomRolls[4]));
        this.character.setPcPhysicalEndurance(String.valueOf(randomRolls[5]));
        this.character.setPcPhysicalBeauty(String.valueOf(randomRolls[6]));
        this.character.setPcSpeed(String.valueOf(randomRolls[7]));

    }
}