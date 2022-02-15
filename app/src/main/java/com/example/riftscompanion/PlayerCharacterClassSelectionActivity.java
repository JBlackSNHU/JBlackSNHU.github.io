package com.example.riftscompanion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.riftscompanion.databinding.ActivityPlayerCharacterClassSelectionBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PlayerCharacterClassSelectionActivity extends AppCompatActivity {

    PlayerCharacter character;      // PlayerCharacter object to store all the data in input on the page.
    PlayerCharacter character_temp; // Temp character for navigating to the previous screen and discarding changes.
    ArrayList<CharacterClass> availableClasses; //List of available classes for the character based on attributes
    CharacterClass selectedClass;

    ActivityPlayerCharacterClassSelectionBinding binding;
    DBHelper dbHelper;
    ExpandableListView expandableListView;
    Adapter_ClassExpandableList adapter_classExpandableList;
    List<String> expandableList_PCClassName;
    HashMap<String, List<String>> expandableList_PCClassDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dbHelper = new DBHelper(PlayerCharacterClassSelectionActivity.this);

        setContentView(R.layout.activity_player_character_class_selection);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_player_character_class_selection);


        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            character = (PlayerCharacter) intent.getSerializableExtra("character");
            character_temp = (PlayerCharacter) intent.getSerializableExtra("character");
        }
        binding.setCharacter(this.character);
        List<String> tList = new ArrayList<>();
        selectedClass = new CharacterClass(0,"No Class Selected", "","",0,0,0,0,0,0,0, "", "", "", "");
        binding.setSelectedClass(selectedClass);

        this.availableClasses = determineAvailableClasses();

        expandableListView = (ExpandableListView) findViewById(R.id.elvAvailableClasses);
        expandableList_PCClassDetails = expandableClassListDataPump();
        expandableList_PCClassName = new ArrayList<String>(expandableList_PCClassDetails.keySet());
        adapter_classExpandableList = new Adapter_ClassExpandableList(this, expandableList_PCClassName, expandableList_PCClassDetails);
        expandableListView.setAdapter(adapter_classExpandableList);

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                String className = expandableList_PCClassName.get(groupPosition);
                character.setPcClass(className);

                Toast.makeText(getApplicationContext(),
                        expandableList_PCClassName.get(groupPosition) + " List Expanded.",
                        Toast.LENGTH_SHORT).show();
            }
        });
        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expandableList_PCClassName.get(groupPosition) + " List Collapsed.",
                Toast.LENGTH_SHORT).show();
            }
        });
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition, long id) {
                // Logic to set and unset colors for
                Drawable background = view.getBackground();
                if (background instanceof ColorDrawable) {
                    view.setBackgroundColor(Color.parseColor("#00000000"));
                }
                else {
                    view.setBackgroundColor(Color.parseColor("#AAB5B0"));
                }
                Toast.makeText(getApplicationContext(),
                        expandableList_PCClassName.get(groupPosition)
                                + " -> "
                                + expandableList_PCClassDetails.get(expandableList_PCClassName.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int groupPosition, long id) {
                for (CharacterClass cClass : availableClasses) {
                    if (cClass.getClassName().equals(expandableList_PCClassName.get(groupPosition))) {
                        selectedClass = cClass;
                    }
                }
                return false;
            }
        });

    }

    /* Checks the attributes of the character against the attribute requirements of each class
     * to determine which classes are available to the player during character creation.
     */
    private ArrayList<CharacterClass> determineAvailableClasses() {
        ArrayList<CharacterClass> characterClasses = dbHelper.getDBCharacterClassList();
        ArrayList<CharacterClass> availableClasses = new ArrayList<>();
        int pcIQ, pcME, pcMA, pcPS, pcPP, pcPE, pcPB;
        pcIQ = Integer.parseInt(character.getPcIntelligenceQuotient());
        pcME = Integer.parseInt(character.getPcMentalEndurance());
        pcMA = Integer.parseInt(character.getPcMentalAffinity());
        pcPS = Integer.parseInt(character.getPcPhysicalStrength());
        pcPP = Integer.parseInt(character.getPcPhysicalProwess());
        pcPE = Integer.parseInt(character.getPcPhysicalEndurance());
        pcPB = Integer.parseInt(character.getPcPhysicalBeauty());

        for (CharacterClass pcClass : characterClasses) {
            if (pcClass.getClassRequiredIQ() > pcIQ)
                break;
            else if (pcClass.getClassRequiredME() > pcME)
                break;
            else if (pcClass.getClassRequiredMA() > pcMA)
                break;
            else if (pcClass.getClassRequiredPS() > pcPS)
                break;
            else if (pcClass.getClassRequiredPP() > pcPP)
                break;
            else if (pcClass.getClassRequiredPE() > pcPE)
                break;
            else if (pcClass.getClassRequiredPB() > pcPB)
                break;
            else
                availableClasses.add(pcClass);
        }

        return characterClasses;
    }

    private void setSelectedClass(String className) {
        for (CharacterClass cClass : this.availableClasses) {
            if (cClass.getClassName().equals(className)) {
                this.selectedClass = cClass;
            }
        }
    }

    public View getGroupView(ExpandableListView listView, int groupPosition) {
        long packedPosition = ExpandableListView.getPackedPositionGroup(groupPosition);
        int flatPosition = listView.getFlatListPosition(packedPosition);
        int first = listView.getFirstVisiblePosition();
        return listView.getChildAt(flatPosition - first);
    }

    private HashMap<String, List<String>> expandableClassListDataPump() {
        HashMap<String, List<String>> classListDetail = new HashMap<String, List<String>>();
        List<String> occSkills;
        for (CharacterClass cClass : this.availableClasses) {

            occSkills = cClass.getClassSkills();
            for (int i = 0; i < occSkills.size(); i++) {
                String temp = occSkills.get(i);
            }
            classListDetail.put(cClass.getClassName(), occSkills);
        }

        return classListDetail;
    }
}