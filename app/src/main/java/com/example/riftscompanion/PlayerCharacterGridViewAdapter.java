package com.example.riftscompanion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import java.util.ArrayList;

public class PlayerCharacterGridViewAdapter extends ArrayAdapter<PlayerCharacter> {

    public PlayerCharacterGridViewAdapter(@NonNull Context context, ArrayList<PlayerCharacter> playerCharacterArrayList) {
        super(context, 0, playerCharacterArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listPCView = convertView;
        if (listPCView == null) {
            listPCView = LayoutInflater.from(getContext()).inflate(R.layout.pc_custom_view, parent, false);
        }
        PlayerCharacter character = getItem(position);
        TextView txtCharacterName = listPCView.findViewById(R.id.txtCharacterName);
        TextView txtCharacterLevel = listPCView.findViewById(R.id.txtCharacterLevel);
        TextView txtCharacterClass = listPCView.findViewById(R.id.txtCharacterClass);

        txtCharacterName.setText(character.getPcName());
        txtCharacterClass.setText(character.getPcClass());
        txtCharacterLevel.setText(character.getPcLevel());
        return listPCView;
    }
}
