package com.iamliauba.checkedtextview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //Creating variables to save preferences
    public static final String SharedPref = "sharedPref";
    public static final String prefemail = "email";
    public static final String checked = "checkedBox";

    //These are the variables used to store the data we get from the preferences
    public boolean checkedBox;
    public String emailPref;


    //Creating variables from checkedBoxes and TextViews
    private CheckedTextView mCheckTView;
    private TextView email;
    private TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Setting variables to their respective views/ID's
        mCheckTView = findViewById(R.id.checkedTextView);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);



        //Creating an on click listener to handle the checkedTextView clicks
        mCheckTView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mCheckTView.isChecked()) {
                    mCheckTView.setChecked(false); //Setting the checkedBox to false (unclicked)
                    savePref(); //Saving the preference
                } else {

                    mCheckTView.toggle(); //Using toggle to change the switches state to true
                    savePref(); //Saving the preferences
                }
            }
        });

        getPrefs(); //calling this method to get the preferences saved from last session.
        loadPrefs(); // Calling this method to load the preferences to the textView and checkedTexView

    }

    //Creating a method to save user preferences
    public void savePref(){

        // creating a sharedPreferences variable used save user preferences. Set to private so no other apps can edit our preferences
        SharedPreferences sharedPreferences = getSharedPreferences(SharedPref,MODE_PRIVATE);
        //Creating an editor variable.
        SharedPreferences.Editor editor = sharedPreferences.edit();

        //Check to see if the CheckedTextView is checked. then use the editor to save preferences.
        if (mCheckTView.isChecked()) {
            editor.putString(prefemail, email.getText().toString()); // Storing the String value of email in prefemail
            editor.putBoolean(checked, mCheckTView.isChecked()); // Storing the boolean value in checked
        } else { // If the checkbox is not checked or unchecked, clear the preferences

            editor.putString(prefemail, "");
            editor.putBoolean(checked, false);

        }

        editor.apply(); // applying the values to sharedPreferences using the editor
    }

    // This method is used at the end of onCreate to retrieve the preferences saved form the last session
    public void getPrefs() {

        //Creating another sharedPreferences variable to get the saves preferences. Also in private mode
        SharedPreferences sharedPreferences = getSharedPreferences(SharedPref,MODE_PRIVATE);
        checkedBox = sharedPreferences.getBoolean(checked,false); //getting the boolean from checked and storing it in checkedBox
        emailPref = sharedPreferences.getString(prefemail,""); // Getting the string value form prefemail and storing it in emailPref.

    }

    //This method is called right after getPRefs. It is used to load the preferences we got form getPrefs method
    // and updates Textview for the email and sets the checkedbox accordingly
    public void loadPrefs() {

        email.setText(emailPref);
        mCheckTView.setChecked(checkedBox);
    }

}


























