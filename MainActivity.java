
package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayAScore(scoreA);
        displayBScore(scoreB);
    }

    public void addThreeForTeamA(View view){
        scoreA +=3;
        displayAScore(scoreA);
    }

    public void addTwoForTeamA(View view){
        scoreA +=2;
        displayAScore(scoreA);
    }

    public void freeThrowForTeamA(View view){
        scoreA +=1;
        displayAScore(scoreA);
    }

    public void addThreeForTeamB(View view){
        scoreB +=3;
        displayBScore(scoreB);
    }

    public void addTwoForTeamB(View view){
        scoreB +=2;
        displayBScore(scoreB);
    }

    public void freeThrowForTeamB(View view){
        scoreB +=1;
        displayBScore(scoreB);
    }

    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayAScore(scoreA);
        displayBScore(scoreB);
    }

    private void displayAScore(int number){
        TextView teamAScoreTextView = (TextView) findViewById(R.id.team_a_text);
        teamAScoreTextView.setText("" + number);
    }

    private void displayBScore(int number){
        TextView teamBScoreTextView = (TextView) findViewById(R.id.team_b_text);
        teamBScoreTextView.setText("" + number);
    }
}