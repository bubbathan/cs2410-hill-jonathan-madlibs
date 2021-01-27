package com.usu.homework1_madlibs_jonathanhill;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        AppCompatTextView instructionsTextView = new AppCompatTextView(this);
        instructionsTextView.setText("Let's make a Mad Lib!\n\n");

        AppCompatTextView adjectiveOneText = new AppCompatTextView(this);
        adjectiveOneText.setText("Pick an adjective");
        AppCompatEditText adjectiveOneEdit = new AppCompatEditText(this);
        adjectiveOneEdit.setHint("Adjective");

        AppCompatTextView jobTitleText = new AppCompatTextView(this);
        jobTitleText.setText("Pick a job title");
        AppCompatEditText jobTitleEdit = new AppCompatEditText(this);
        jobTitleEdit.setHint("Job Title");

        AppCompatTextView nameOneText = new AppCompatTextView(this);
        nameOneText.setText("Pick a name");
        AppCompatEditText nameOneEdit = new AppCompatEditText(this);
        nameOneEdit.setHint("Name");

        AppCompatTextView thingText = new AppCompatTextView(this);
        thingText.setText("Pick a thing");
        AppCompatEditText thingEdit = new AppCompatEditText(this);
        thingEdit.setHint("Thing");

        AppCompatTextView adjectiveTwoText = new AppCompatTextView(this);
        adjectiveTwoText.setText("Pick an adjective");
        AppCompatEditText adjectiveTwoEdit = new AppCompatEditText(this);
        adjectiveTwoEdit.setHint("Adjective");

        AppCompatTextView nameTwoText = new AppCompatTextView(this);
        nameTwoText.setText("Pick a name");
        AppCompatEditText nameTwoEdit = new AppCompatEditText(this);
        nameTwoEdit.setHint("Name");

        AppCompatTextView adjectiveThreeText = new AppCompatTextView(this);
        adjectiveThreeText.setText("Pick and adjective");
        AppCompatEditText adjectiveThreeEdit = new AppCompatEditText(this);
        adjectiveThreeEdit.setHint("Adjective");

        AppCompatButton displayMadLibButton = new AppCompatButton(this);
        displayMadLibButton.setText("Display Mad Lib");

        displayMadLibButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // A _adj_ _job title_ named _name_ sold a _thing_ to a _adj_ person named
        // _name_. This is shaping up to be an _adj_ day for _name_.

        mainLayout.addView(instructionsTextView);
        mainLayout.addView(adjectiveOneText);
        mainLayout.addView(adjectiveOneEdit);
        mainLayout.addView(jobTitleText);
        mainLayout.addView(jobTitleEdit);
        mainLayout.addView(nameOneText);
        mainLayout.addView(nameOneEdit);
        mainLayout.addView(thingText);
        mainLayout.addView(thingEdit);
        mainLayout.addView(adjectiveTwoText);
        mainLayout.addView(adjectiveTwoEdit);
        mainLayout.addView(nameTwoText);
        mainLayout.addView(nameTwoEdit);
        mainLayout.addView(adjectiveThreeText);
        mainLayout.addView(adjectiveThreeEdit);
        mainLayout.addView(displayMadLibButton);
        setContentView(mainLayout);
    }
}