package com.jackelliott.jacksandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);


        Project[] projects = {
                new Project("Getting Started App", "Our very first project, the default 'Hello World' app!", R.drawable.getting_started),
                new Project("Vin Quote", "Making a simple change to the layout, with my own personal motivational quote", R.drawable.quote),
                new Project("BMI Calculator", "A real life working BMI calculator", R.drawable.calculator),
                new Project("Inches Converter", "A basic converter to convert inches to meters", R.drawable.tape),
                new Project("The Hungry Developer", "A menu app for a fictional restaurant", R.drawable.hungry_developer)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);
    }
}