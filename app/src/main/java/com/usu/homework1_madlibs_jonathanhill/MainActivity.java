package com.usu.homework1_madlibs_jonathanhill;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);
        ScrollView scrollView = new ScrollView(this);
        LinearLayout.LayoutParams mainLayoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        mainLayoutParams.setMargins(48, 48, 48, 48);
        mainLayout.setLayoutParams(mainLayoutParams);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                Log.d("ScrollView", "I was scrolled");
            }
        });

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
        adjectiveThreeText.setText("Pick an adjective");
        AppCompatEditText adjectiveThreeEdit = new AppCompatEditText(this);
        adjectiveThreeEdit.setHint("Adjective");

        AppCompatButton displayMadLibButton = new AppCompatButton(this);
        displayMadLibButton.setText("Display Mad Lib");

        AppCompatTextView madLib = new AppCompatTextView(this);
        LinearLayout.LayoutParams madLibParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        madLibParams.setMargins(48, 48, 48, 48);
        madLib.setLayoutParams(madLibParams);

        displayMadLibButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String adjectiveOneLib = adjectiveOneEdit.getText().toString();
                String jobTitleLib = jobTitleEdit.getText().toString();
                String nameOneLib = nameOneEdit.getText().toString();
                String thingLib = thingEdit.getText().toString();
                String adjectiveTwoLib = adjectiveTwoEdit.getText().toString();
                String nameTwoLib = nameTwoEdit.getText().toString();
                String adjectiveThreeLib = adjectiveThreeEdit.getText().toString();

                madLib.setText("A(n) " + adjectiveOneLib + " " + jobTitleLib + " named " + nameOneLib +
                        " sold their " + thingLib + " to a(n) " + adjectiveTwoLib + " person named " +
                        nameTwoLib + ". This is shaping up to be a(n) " + adjectiveThreeLib +
                        " day for " + nameTwoLib + ".\n\n");
                madLib.setBackgroundColor(Color.YELLOW);
            }
        });

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
        mainLayout.addView(madLib);
        scrollView.addView(mainLayout);
        setContentView(scrollView);
    }
}