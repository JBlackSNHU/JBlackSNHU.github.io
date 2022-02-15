package com.example.riftscompanion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.example.riftscompanion.databinding.ActivityPlayerCharacterHpsdcactivityBinding;

public class PlayerCharacterHPSDCActivity extends AppCompatActivity {

    PlayerCharacter character;
    PlayerCharacter character_temp; // temp character to hold original for use if the user navigates backwards
    ActivityPlayerCharacterHpsdcactivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_player_character_hpsdcactivity);
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            character = (PlayerCharacter) intent.getSerializableExtra("character");
            character_temp = (PlayerCharacter) intent.getSerializableExtra("character");
        }


    }


}