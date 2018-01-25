/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.cricketscorekeeper;

import java.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.cricketscorekeeper.R;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int inng1_scoreTeamA = 0;
    int inng1_scoreTeamB = 0;
    int inng2_scoreTeamA = 0;
    int inng2_scoreTeamB = 0;
    int inng = 1;
    int inng1_wickets_A = 0;
    int inng1_overs_A = 0;
    int inng1_wickets_B = 0;
    int inng1_overs_B = 0;
    int inng2_wickets_A = 0;
    int inng2_overs_A = 0;
    int inng2_wickets_B = 0;
    int inng2_overs_B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void addSixerForTeamA(View view){
        if (inng == 1) {
            inng1_scoreTeamA = inng1_scoreTeamA + 6;
            displayForTeamA(inng1_scoreTeamA);
        }
        else {inng2_scoreTeamA = inng2_scoreTeamA + 6;
        displayForTeamA(inng2_scoreTeamA);
        }
    }

    public void addSixerForTeamB(View view){
        if (inng == 1) {
            inng1_scoreTeamB = inng1_scoreTeamB + 6;
            displayForTeamB(inng1_scoreTeamB);
        }
        else {inng2_scoreTeamB = inng2_scoreTeamB + 6;
            displayForTeamB(inng2_scoreTeamB);
        }
    }


    public void displayForTeamA(int score) {
        if (inng == 0){
            TextView scoreView = (TextView) findViewById(R.id.team_A_inning2_score_text_view);
            scoreView.setText(String.valueOf(score));
            TextView scoreView1 = (TextView) findViewById(R.id.team_A_inning1_score_text_view);
            scoreView1.setText(String.valueOf(score));

        }

        else if (inng == 1) {
            TextView scoreView = (TextView) findViewById(R.id.team_A_inning1_score_text_view);
            scoreView.setText(String.valueOf(score));
        }
        else if (inng == 2){
            TextView scoreView = (TextView) findViewById(R.id.team_A_inning2_score_text_view);
            scoreView.setText(String.valueOf(score));
        }
    }
    public void displayForTeamB(int score) {
        if (inng == 0){
            TextView scoreView = (TextView) findViewById(R.id.team_B_inning2_score_text_view);
            scoreView.setText(String.valueOf(score));
            TextView scoreView1 = (TextView) findViewById(R.id.team_B_inning1_score_text_view);
            scoreView1.setText(String.valueOf(score));
        }

        else if (inng == 1) {
            TextView scoreView = (TextView) findViewById(R.id.team_B_inning1_score_text_view);
            scoreView.setText(String.valueOf(score));
        }
        else if (inng == 2){
            TextView scoreView = (TextView) findViewById(R.id.team_B_inning2_score_text_view);
            scoreView.setText(String.valueOf(score));
        }
    }


    public void addFourForTeamA(View view){
        if (inng == 1) {
            inng1_scoreTeamA = inng1_scoreTeamA + 4;
            displayForTeamA(inng1_scoreTeamA);
        }
        else {inng2_scoreTeamA = inng2_scoreTeamA + 4;
            displayForTeamA(inng2_scoreTeamA);
        }
    }
    public void addFourForTeamB(View view){
        if (inng == 1) {
            inng1_scoreTeamB = inng1_scoreTeamB + 4;
            displayForTeamB(inng1_scoreTeamB);
        }
        else {inng2_scoreTeamB = inng2_scoreTeamB + 4;
            displayForTeamB(inng2_scoreTeamB);
        }
    }


    public void addExtraForTeamA(View view){
        if (inng == 1) {
            inng1_scoreTeamA = inng1_scoreTeamA + 1;
            displayForTeamA(inng1_scoreTeamA);
        }
        else {inng2_scoreTeamA = inng2_scoreTeamA + 1;
            displayForTeamA(inng2_scoreTeamA);
        }
    }
    public void addExtraForTeamB(View view){
        if (inng == 1) {
            inng1_scoreTeamB = inng1_scoreTeamB + 1;
            displayForTeamB(inng1_scoreTeamB);
        }
        else {inng2_scoreTeamB = inng2_scoreTeamB + 1;
            displayForTeamB(inng2_scoreTeamB);
        }
    }

    public void addtwoForTeamA(View view) {
        if (inng == 1) {
            inng1_scoreTeamA = inng1_scoreTeamA + 2;
            displayForTeamA(inng1_scoreTeamA);
        } else {
            inng2_scoreTeamA = inng2_scoreTeamA + 2;
            displayForTeamA(inng2_scoreTeamA);
        }
    }
    public void addtwoForTeamB(View view) {
        if (inng == 1) {
            inng1_scoreTeamB = inng1_scoreTeamB + 2;
            displayForTeamB(inng1_scoreTeamB);
        } else {
            inng2_scoreTeamB = inng2_scoreTeamB + 2;
            displayForTeamB(inng2_scoreTeamB);
        }
    }
    public void change_inningForTeamA(View view){
        if (inng == 0){inng = 1;}
        else if (inng ==1){ inng = 2;}
        else inng = 1;

    }

    public void change_inningForTeamB(View view){
        if (inng == 0){inng = 1;}
        else if (inng ==1){ inng = 2;}
        else inng = 1;

    }
    /****    if (inng == 1) {
        TextView inningView = (TextView) findViewById(R.id.team_A_inning1_text_view);
        inningView.setHighlightColor(500);
        TextView inningView1 = (TextView) findViewById(R.id.team_B_inning1_text_view);
        inningView.setHighlightColor(500);
    } else if (inng == 2) {
        TextView inningView = (TextView) findViewById(R.id.team_A_inning2_text_view);
        inningView.setHighlightColor(500);
        TextView inningView1 = (TextView) findViewById(R.id.team_B_inning2_text_view);
        inningView.setHighlightColor(500);

    }
     *****/
    public void addwicketsForTeamA(View view) {
            if (inng == 1) {
                inng1_wickets_A = inng1_wickets_A + 1;
                display_wickets_ForTeamA(inng1_wickets_A);
            } else {
                inng2_wickets_A = inng2_wickets_A + 1;
                display_wickets_ForTeamA(inng2_wickets_A);
            }
        }
    public void display_wickets_ForTeamA(int score) {
        if (inng == 0){
                TextView scoreView = (TextView) findViewById(R.id.wicketsA_score_text_view);
                scoreView.setText(String.valueOf(score));
        }
        else if (inng == 1) {
            TextView scoreView = (TextView) findViewById(R.id.wicketsA_score_text_view);
            scoreView.setText(String.valueOf(score));
        }
        else if (inng == 2){
            TextView scoreView = (TextView) findViewById(R.id.wicketsA_score_text_view);
            scoreView.setText(String.valueOf(score));
        }
    }
    public void display_wickets_ForTeamB(int score) {
        if (inng == 0){
            TextView scoreView = (TextView) findViewById(R.id.wicketsB_score_text_view);
            scoreView.setText(String.valueOf(score));
        }
        else if (inng == 1) {
            TextView scoreView = (TextView) findViewById(R.id.wicketsB_score_text_view);
            scoreView.setText(String.valueOf(score));
        }
        else if (inng == 2){
            TextView scoreView = (TextView) findViewById(R.id.wicketsB_score_text_view);
            scoreView.setText(String.valueOf(score));
        }
    }
    public void addwicketsForTeamB(View view) {
        if (inng == 1) {
            inng1_wickets_B = inng1_wickets_B + 1;
            display_wickets_ForTeamB(inng1_wickets_B);
        } else {
            inng2_wickets_B = inng2_wickets_B + 1;
            display_wickets_ForTeamB(inng2_wickets_B);
        }
    }

    public void addoversForTeamA(View view) {
        if (inng == 1) {
            inng1_overs_A = inng1_overs_A + 1;
            display_overs_ForTeamA(inng1_overs_A);
        } else {
            inng2_overs_A = inng2_overs_A + 1;
            display_overs_ForTeamA(inng2_overs_A);
        }
    }

    public void addoversForTeamB(View view) {
        if (inng == 1) {
            inng1_overs_B = inng1_overs_B + 1;
            display_overs_ForTeamB(inng1_overs_B);
        } else {
            inng2_overs_B = inng2_overs_B + 1;
            display_overs_ForTeamB(inng2_overs_B);
        }
    }

    public void display_overs_ForTeamA(int score) {
        if (inng == 0) {
            TextView scoreView = (TextView) findViewById(R.id.oversA_score_text_view);
            scoreView.setText(String.valueOf(score));
        }

        if (inng == 1) {
            TextView scoreView = (TextView) findViewById(R.id.oversA_score_text_view);
            scoreView.setText(String.valueOf(score));
        }
        if (inng == 2){
            TextView scoreView = (TextView) findViewById(R.id.oversA_score_text_view);
            scoreView.setText(String.valueOf(score));
        }
    }
    public void display_overs_ForTeamB(int score) {
        if (inng == 0) {
            TextView scoreView = (TextView) findViewById(R.id.oversB_score_text_view);
            scoreView.setText(String.valueOf(score));
        }

        else if (inng == 1) {
            TextView scoreView = (TextView) findViewById(R.id.oversB_score_text_view);
            scoreView.setText(String.valueOf(score));
        }
        else if (inng == 2){
            TextView scoreView = (TextView) findViewById(R.id.oversB_score_text_view);
            scoreView.setText(String.valueOf(score));
        }
    }


    public void resetScore(View v){
        inng1_scoreTeamA = 0;
        inng1_scoreTeamB = 0;
        inng2_scoreTeamA = 0;
        inng2_scoreTeamB = 0;
        inng2_wickets_A = 0;
        inng2_wickets_B = 0;
        inng1_wickets_A = 0;
        inng1_wickets_B = 0;
        inng1_overs_A = 0;
        inng2_overs_A = 0;
        inng1_overs_B = 0;
        inng2_overs_B = 0;
        inng = 0;


        displayForTeamA(inng1_scoreTeamA);
        displayForTeamA(inng2_scoreTeamA);
        displayForTeamB(inng1_scoreTeamB);
        displayForTeamB(inng2_scoreTeamB);

        display_overs_ForTeamA(inng1_overs_A);
        display_overs_ForTeamA(inng2_overs_A);
        display_overs_ForTeamB(inng1_overs_B);
        display_overs_ForTeamB(inng2_overs_B);

        display_wickets_ForTeamA(inng1_wickets_A);
        display_wickets_ForTeamA(inng2_wickets_A);
        display_wickets_ForTeamB(inng1_wickets_B);
        display_wickets_ForTeamB(inng2_wickets_B);

        inng = 1;
    }

}
