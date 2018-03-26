package com.example.antonio.brainyapp.Models;

import android.widget.LinearLayout;

/**
 * Created by Antonio on 25/12/2017.
 */

public class Section {
    public String name;
    private String description;

    public Section(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
