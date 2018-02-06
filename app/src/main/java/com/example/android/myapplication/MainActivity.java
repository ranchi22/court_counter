package com.example.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA3 = 0;
    int scoreTeamB3 = 0;

    int scoreTeamA2 = 0;
    int scoreTeamB2 = 0;

    int scoreTeamA1 = 0;
    int scoreTeamB1 = 0;

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    int oneA = 0;
    int twoA = 0;
    int threeA = 0;

    int oneB = 0;
    int twoB = 0;
    int threeB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String jamesbond = "hi";
        String jamesBond = "hello";
        String s = jamesBond + jamesbond;
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        oneA++;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        twoA++;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        threeA++;
        displayForTeamA(scoreTeamA);
        scoreTeamA3++;
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        oneB++;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        twoB++;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {

        scoreTeamB = scoreTeamB + 3;
        threeB++;
        displayForTeamB(scoreTeamB);
        scoreTeamB3++;

    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void mvp(View v) {
        List<String> players = new ArrayList<>();
        players.add("Derrick Lanorris Sharp");
        players.add("Nikola Vujčić");
        players.add("Anthony Michael Parker");
        players.add("Nate Thomas Huffman");


        Toast.makeText(this, players.get(new Random().nextInt(players.size())), Toast.LENGTH_LONG).show();

    }


    public void state(View v) {

        Toast.makeText(this, " For team A: There was " + oneA + " of 1 points," + twoA + " of 2 points and" + threeA + " shots of 3 points"
                + "\n"+" For team B: There was " + oneB + " of 1 points," + twoB + " of 2 points and" + threeB + " shots of 3 points", Toast.LENGTH_LONG).show();
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
