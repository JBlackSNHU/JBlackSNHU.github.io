package com.example.riftscompanion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.riftscompanion.databinding.ActivityMainBinding;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PlayerCharacter> characters;
    ArrayList<Skill> skills;
    ArrayList<Weapon> weapons;
    ArrayList<Armor> armors;
    ArrayList<Spell> spells;
    ArrayList<Bionics> bionics;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper = new DBHelper(MainActivity.this);

        dbHelper.PopulateDatabase();
    }

    public void CreateCharacter(View view) {
        String testString = "";
        Intent intent = new Intent(this, PlayerCharacterAttributesActivity.class);
        intent.putExtra("character", new PlayerCharacter());
        startActivity(intent);
    }
}