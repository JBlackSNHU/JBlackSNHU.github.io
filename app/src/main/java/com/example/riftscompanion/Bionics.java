package com.example.riftscompanion;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.io.Serializable;

public class Bionics extends BaseObservable implements Serializable {

    private int bionicId;
    private String bionicName;
    private String bionicDescription;
    private String bionicCost;

    @Bindable
    public String getBionicName() { return bionicName; }
    @Bindable
    public String getBionicDescription() { return bionicDescription; }
    @Bindable
    public String getBionicCost() { return bionicCost; }

    public Bionics(int bionicId, String bionicName, String bionicDescription, String bionicCost) {
        this.bionicId = bionicId;
        this.bionicName = bionicName;
        this.bionicDescription = bionicDescription;
        this.bionicCost = bionicCost;
    }
}
