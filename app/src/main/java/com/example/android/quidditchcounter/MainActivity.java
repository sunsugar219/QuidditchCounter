package com.example.android.quidditchcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * adds 10 points to A
     */

    public void tenPointsA (View view){
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }
    /**
     * adds 30 points to A
     */

    public void thirtyPointsA (View view){
        scoreTeamA = scoreTeamA + 30;
        displayForTeamA(scoreTeamA);
    }


    /**
     * adds 10 points to B
     */

    public void tenPointsB (View view){
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }
    /**
     * adds 2 points to B
     */

    public void thirtyPointsB (View view){
        scoreTeamB = scoreTeamB + 30;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays Team A score
     */
    public void  displayForTeamA (int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays Team B score
     */
    public void  displayForTeamB (int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
