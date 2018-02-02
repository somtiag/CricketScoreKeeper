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

import org.w3c.dom.Text;

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

   /** String inng1_statescoreTeamA;
    String inng_state;
    **/
   private TextView scorei1TAView;
   private TextView scorei2TAView;
   private TextView scorei1TBView;
   private TextView scorei2TBView;
   private TextView wicketsAView;
   private TextView wicketsBView;
   private TextView oversAView;
   private TextView oversBView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            inng1_scoreTeamA = savedInstanceState.getInt("inng1_statescoreTeamA", 0);
            inng2_scoreTeamA = savedInstanceState.getInt("inng2_statescoreTeamA", 0);
            inng1_scoreTeamB = savedInstanceState.getInt("inng1_statescoreTeamB", 0);
            inng2_scoreTeamB = savedInstanceState.getInt("inng2_statescoreTeamB", 0);

            inng1_wickets_A = savedInstanceState.getInt("inng1_statewicketsA", 0);
            inng2_wickets_A = savedInstanceState.getInt("inng2_statewicketsA", 0);
            inng1_wickets_B = savedInstanceState.getInt("inng1_statewicketsB", 0);
            inng2_wickets_B = savedInstanceState.getInt("inng2_statewicketsB", 0);

            inng1_overs_A = savedInstanceState.getInt("inng1_stateoversA", 0);
            inng2_overs_A = savedInstanceState.getInt("inng2_stateoversA", 0);
            inng1_overs_B = savedInstanceState.getInt("inng1_stateoversB", 0);
            inng2_overs_B = savedInstanceState.getInt("inng2_stateoversB", 0);

            inng = savedInstanceState.getInt("inng_state", 0);

            scorei1TAView = (TextView) findViewById(R.id.team_A_inning1_score_text_view);
            scorei2TAView = (TextView) findViewById(R.id.team_A_inning2_score_text_view);
            scorei1TBView = (TextView) findViewById(R.id.team_B_inning1_score_text_view);
            scorei2TBView = (TextView) findViewById(R.id.team_B_inning2_score_text_view);

            wicketsAView = (TextView) findViewById(R.id.wicketsA_score_text_view);
            wicketsBView = (TextView) findViewById(R.id.wicketsB_score_text_view);
            oversAView = (TextView) findViewById(R.id.oversA_score_text_view);
            oversBView = (TextView) findViewById(R.id.oversB_score_text_view);


            try {
                scorei1TAView.setText(String.format("%s",inng1_scoreTeamA));
                scorei2TAView.setText(String.format("%s",inng2_scoreTeamA));
                scorei1TBView.setText(String.format("%s",inng1_scoreTeamB));
                scorei2TBView.setText(String.format("%s",inng2_scoreTeamB));

                if (inng == 1){
                  wicketsAView.setText(String.format("%s",inng1_wickets_A));
                  wicketsBView.setText(String.format("%s",inng1_wickets_B));
                  oversAView.setText(String.format("%s",inng1_overs_A));
                  oversBView.setText(String.format("%s",inng1_overs_B));
                }
                else if (inng == 2){
                    wicketsAView.setText(String.format("%s",inng2_wickets_A));
                    wicketsBView.setText(String.format("%s",inng2_wickets_B));
                    oversAView.setText(String.format("%s",inng2_overs_A));
                    oversBView.setText(String.format("%s",inng2_overs_B));
                }


            } catch(NullPointerException e) {

            }

        } else {
            inng1_scoreTeamA = 0;
            inng2_scoreTeamA = 0;
            inng1_scoreTeamB = 0;
            inng2_scoreTeamB = 0;
            inng = 1;
            inng1_wickets_A = 0;
            inng1_overs_A = 0;
            inng1_wickets_B = 0;
            inng1_overs_B = 0;
            inng2_wickets_A = 0;
            inng2_overs_A = 0;
            inng2_wickets_B = 0;
            inng2_overs_B = 0;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt("inng1_statescoreTeamA", inng1_scoreTeamA);
        savedInstanceState.putInt("inng2_statescoreTeamA", inng2_scoreTeamA);
        savedInstanceState.putInt("inng1_statescoreTeamB", inng1_scoreTeamB);
        savedInstanceState.putInt("inng2_statescoreTeamB", inng2_scoreTeamB);

        savedInstanceState.putInt("inng_state",inng);

        savedInstanceState.putInt("inng1_statewicketsA", inng1_wickets_A);
        savedInstanceState.putInt("inng2_statewicketsA", inng2_wickets_A);
        savedInstanceState.putInt("inng1_statewicketsB", inng1_wickets_B);
        savedInstanceState.putInt("inng2_statewicketsB", inng2_wickets_B);

        savedInstanceState.putInt("inng1_stateoversA", inng1_overs_A);
        savedInstanceState.putInt("inng2_stateoversA", inng2_overs_A);
        savedInstanceState.putInt("inng1_stateoversB", inng1_overs_B);
        savedInstanceState.putInt("inng2_stateoversB", inng2_overs_B);

    }


    public void addSixerForTeamA(View view){
        if (inng == 1) {
            inng1_scoreTeamA = inng1_scoreTeamA + 6;
            displayForTeamA(inng1_scoreTeamA);
        }
        else if (inng == 2)
        {   inng2_scoreTeamA = inng2_scoreTeamA + 6;
            displayForTeamA(inng2_scoreTeamA);
        }
    }

    public void addSixerForTeamB(View view){
        if (inng == 1) {
            inng1_scoreTeamB = inng1_scoreTeamB + 6;
            displayForTeamB(inng1_scoreTeamB);
        }
        else if (inng == 2)
        {   inng2_scoreTeamB = inng2_scoreTeamB + 6;
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
        else if (inng == 2)
        {   inng2_scoreTeamA = inng2_scoreTeamA + 4;
            displayForTeamA(inng2_scoreTeamA);
        }
    }
    public void addFourForTeamB(View view){
        if (inng == 1) {
            inng1_scoreTeamB = inng1_scoreTeamB + 4;
            displayForTeamB(inng1_scoreTeamB);
        }
        else if (inng == 2)
        {inng2_scoreTeamB = inng2_scoreTeamB + 4;
            displayForTeamB(inng2_scoreTeamB);
        }
    }


    public void addExtraForTeamA(View view){
        if (inng == 1) {
            inng1_scoreTeamA = inng1_scoreTeamA + 1;
            displayForTeamA(inng1_scoreTeamA);
        }
        else if (inng == 2)
        {inng2_scoreTeamA = inng2_scoreTeamA + 1;
            displayForTeamA(inng2_scoreTeamA);
        }
    }
    public void addExtraForTeamB(View view){
        if (inng == 1) {
            inng1_scoreTeamB = inng1_scoreTeamB + 1;
            displayForTeamB(inng1_scoreTeamB);
        }
        else if (inng == 2)
        {inng2_scoreTeamB = inng2_scoreTeamB + 1;
            displayForTeamB(inng2_scoreTeamB);
        }
    }

    public void addtwoForTeamA(View view) {
        if (inng == 1) {
            inng1_scoreTeamA = inng1_scoreTeamA + 2;
            displayForTeamA(inng1_scoreTeamA);
        } else if (inng == 2){
            inng2_scoreTeamA = inng2_scoreTeamA + 2;
            displayForTeamA(inng2_scoreTeamA);
        }
    }
    public void addtwoForTeamB(View view) {
        if (inng == 1) {
            inng1_scoreTeamB = inng1_scoreTeamB + 2;
            displayForTeamB(inng1_scoreTeamB);
        } else if (inng == 2) {
            inng2_scoreTeamB = inng2_scoreTeamB + 2;
            displayForTeamB(inng2_scoreTeamB);
        }
    }
   /*** public void change_inningForTeamA(View view){
        if (inng == 0){inng = 1;}
        else if (inng ==1){ inng = 2;}
        else inng = 1;
        change_displayForOversWickets();
    }
   ***/
    public void change_displayForOversWickets(){
        if (inng == 0){
            display_wickets_ForTeamA(inng1_wickets_A);
            display_overs_ForTeamA(inng1_overs_A);
            display_wickets_ForTeamB(inng1_wickets_B);
            display_overs_ForTeamB(inng1_overs_B);
            display_wickets_ForTeamA(inng2_wickets_A);
            display_overs_ForTeamA(inng2_overs_A);
            display_wickets_ForTeamB(inng2_wickets_B);
            display_overs_ForTeamB(inng2_overs_B);
        }

       else if (inng == 1) {
            display_wickets_ForTeamA(inng1_wickets_A);
            display_overs_ForTeamA(inng1_overs_A);
            display_wickets_ForTeamB(inng1_wickets_B);
            display_overs_ForTeamB(inng1_overs_B);
        }
       else if (inng == 2){
            display_wickets_ForTeamA(inng2_wickets_A);
            display_overs_ForTeamA(inng2_overs_A);
            display_wickets_ForTeamB(inng2_wickets_B);
            display_overs_ForTeamB(inng2_overs_B);
        }

    }

    public void change_inning(View view){
        if (inng == 0){inng = 1;}
        else if (inng ==1){ inng = 2;}
        else inng = 1;
        change_displayForOversWickets();
    }

    public void addwicketsForTeamA(View view) {
            if (inng == 1) {
                inng1_wickets_A = inng1_wickets_A + 1;
                display_wickets_ForTeamA(inng1_wickets_A);
            } else if (inng == 2) {
                inng2_wickets_A = inng2_wickets_A + 1;
                display_wickets_ForTeamA(inng2_wickets_A);
            }
        }
    public void display_wickets_ForTeamA(int score) {

            TextView scoreView = (TextView) findViewById(R.id.wicketsA_score_text_view);
            if ((inng == 1) || (inng==0)){
            scoreView.setText(String.valueOf(inng1_wickets_A));}
            else if ((inng == 2)||(inng ==0)) {scoreView.setText(String.valueOf(inng2_wickets_A));}

    }
    public void display_wickets_ForTeamB(int score) {

            TextView scoreView = (TextView) findViewById(R.id.wicketsB_score_text_view);
            if ((inng == 1) || (inng==0)){
            scoreView.setText(String.valueOf(inng1_wickets_B));}
            else if ((inng == 2)||(inng ==0)) {scoreView.setText(String.valueOf(inng2_wickets_B));}

    }
    public void addwicketsForTeamB(View view) {
        if (inng == 1) {
            inng1_wickets_B = inng1_wickets_B + 1;
            display_wickets_ForTeamB(inng1_wickets_B);
        } else if (inng == 2){
            inng2_wickets_B = inng2_wickets_B + 1;
            display_wickets_ForTeamB(inng2_wickets_B);
        }
    }

    public void addoversForTeamA(View view) {
        if (inng == 1) {
            inng1_overs_A = inng1_overs_A + 1;
            display_overs_ForTeamA(inng1_overs_A);
        } else if (inng == 2){
            inng2_overs_A = inng2_overs_A + 1;
            display_overs_ForTeamA(inng2_overs_A);
        }
    }

    public void addoversForTeamB(View view) {
        if (inng == 1) {
            inng1_overs_B = inng1_overs_B + 1;
            display_overs_ForTeamB(inng1_overs_B);
        } else if (inng == 2){
            inng2_overs_B = inng2_overs_B + 1;
            display_overs_ForTeamB(inng2_overs_B);
        }
    }

    public void display_overs_ForTeamA(int score) {

            TextView scoreView = (TextView) findViewById(R.id.oversA_score_text_view);
            if ((inng == 1) || (inng ==0)){
            scoreView.setText(String.valueOf(inng1_overs_A));}
             else if ((inng == 2)||(inng==0)) {scoreView.setText(String.valueOf(inng2_overs_A));}
    }
    public void display_overs_ForTeamB(int score) {

            TextView scoreView = (TextView) findViewById(R.id.oversB_score_text_view);
            if ((inng == 1)|| (inng == 0)){
            scoreView.setText(String.valueOf(inng1_overs_B));}
            else if ((inng == 2) || (inng == 0)) {scoreView.setText(String.valueOf(inng2_overs_B));}
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

        change_displayForOversWickets();


        inng = 1;
    }

}
