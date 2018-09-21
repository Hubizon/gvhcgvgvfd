package com.example.hubert.gameoflife.House;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hubert.gameoflife.R;
import com.example.hubert.gameoflife.Shop.ShopFragment;
import com.example.hubert.gameoflife.Utils.MyDialogFragment;
import com.example.hubert.gameoflife.Utils.SharedPreferencesDefaultValues;
import com.google.gson.Gson;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Random;

public class ComputerActivity extends AppCompatActivity implements View.OnClickListener{

    SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        sharedPref = getSharedPreferences(getResources().getString(R.string.shared_preferences_key), Context.MODE_PRIVATE);
        ((TextView)(findViewById(R.id.time_computer))).setText("$ " + sharedPref.getInt(getString(R.string.saved_character_money_key), SharedPreferencesDefaultValues.DefaultMoney));

        Button playComputer = findViewById(R.id.playComputer);
        playComputer.setOnClickListener(this);

        Button TalkComputer = findViewById(R.id.talkComputer);
        TalkComputer.setOnClickListener(this);

        Button supportComputer = findViewById(R.id.supportComputer);
        supportComputer.setOnClickListener(this);

        Button makeGameComputer = findViewById(R.id.makeGameComputer);
        makeGameComputer.setOnClickListener(this);

        Button drawSomethingComputer = findViewById(R.id.drawSomethingComputer);
        drawSomethingComputer.setOnClickListener(this);

        Button writePoemComputer = findViewById(R.id.writePoemComputer);
        writePoemComputer.setOnClickListener(this);

        Button recordMoviesComputer = findViewById(R.id.recordMoviesComputer);
        recordMoviesComputer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        DialogFragment newDialog = new MyDialogFragment();
        SharedPreferences.Editor editor = sharedPref.edit();

        switch (v.getId())
        {
            case R.id.playComputer:
                newDialog.show(getSupportFragmentManager(), "MY_DIALOG");
                break;

            case R.id.talkComputer:
                newDialog.show(getSupportFragmentManager(), "MY_DIALOG");
                break;

            case  R.id.supportComputer:
                showDialog("Support a Charity Event", "Are you sure you want to support a charity event for 100$?");
                break;

            case R.id.makeGameComputer:
                newDialog.show(getSupportFragmentManager(), "MY_DIALOG");
                break;

            case R.id.drawSomethingComputer:
                newDialog.show(getSupportFragmentManager(), "MY_DIALOG");
                break;

            case R.id.writePoemComputer:
                newDialog.show(getSupportFragmentManager(), "MY_DIALOG");
                break;

            case R.id.recordMoviesComputer:
                newDialog.show(getSupportFragmentManager(), "MY_DIALOG");
                break;
        }

        editor.apply();
    }

    private void showDialog(final String title, final String message)
    {
        final SharedPreferences.Editor editor = sharedPref.edit();

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle(title)
                //.setIcon(R.drawable.ic_launcher)
                .setMessage(message)
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialoginterface, int i) {
                        dialoginterface.cancel();
                    }})
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialoginterface, int i) {
                        if(sharedPref.getInt(getResources().getString(R.string.saved_character_money_key), SharedPreferencesDefaultValues.DefaultMoney) >= 100)
                        {
                            editor.putInt(getResources().getString(R.string.saved_character_money_key), (sharedPref.getInt(getResources().getString(R.string.saved_character_money_key), SharedPreferencesDefaultValues.DefaultMoney)) - 100);
                            editor.putInt(getResources().getString(R.string.saved_karma_points_key), (sharedPref.getInt(getResources().getString(R.string.saved_karma_points_key), SharedPreferencesDefaultValues.DefaultKarmaPoints)) + 5);
                        }
                        else
                            Toast.makeText(getApplicationContext(), "You don't have enough money to do this", Toast.LENGTH_SHORT).show();

                    }
                }).show();
    }
}
