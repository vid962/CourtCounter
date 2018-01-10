package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yelowCardsA = 0;
    int yelowCardsB = 0;
    int redCardsA = 0;
    int redCardsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Increase yellow cards for team A
     */
    public void yelowCardA(View v) {
        yelowCardsA = yelowCardsA + 1;
        displayYelowCardA(yelowCardsA);
    }


    /**
     * Display yellow cards for team A
     */
    public void displayYelowCardA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yelowCardAtext);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase red cards for team A
     */
    public void redCardA(View v) {
        redCardsA = redCardsA + 1;
        displayRedCardA(redCardsA);
    }


    /**
     * Display red cards for team A
     */
    public void displayRedCardA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redcardAtext);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase yellow cards for team B
     */
    public void yelowCardB(View v) {
        yelowCardsB = yelowCardsB + 1;
        displayYelowCardB(yelowCardsB);
    }


    /**
     * Display yellow cards for team B
     */
    public void displayYelowCardB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yelowcardBtext);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase red cards for team B
     */
    public void redCardB(View v) {
        redCardsB = redCardsB + 1;
        displayRedCardB(redCardsB);
    }


    /**
     * Display red cards for team B
     */
    public void displayRedCardB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redcardBtext);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_bb_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets scored points for both teams
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Yellow cards reset for team A
     */
    public void resetYelowCardsA(View v) {
        yelowCardsA = 0;
        displayYelowCardA(yelowCardsA);

    }


    /**
     * Red cards reset for team A
     */
    public void resetRedCardsA(View v) {
        redCardsA = 0;
        displayRedCardA(redCardsA);

    }

    /**
     * Yellow cards reset for team B
     */
    public void resetYelowCardsB(View v) {
        yelowCardsB = 0;
        displayYelowCardB(yelowCardsB);

    }


    /**
     * Red cards reset for team B
     */
    public void resetRedCardsB(View v) {
        redCardsB = 0;
        displayRedCardB(redCardsB);

    }


    /**
     * Reset score for team A
     */
    public void resetScoreA(View v) {
        scoreTeamA = 0;

        displayForTeamA(scoreTeamA);


    }


    /**
     * Reset scores for team B
     */
    public void resetScoreB(View v) {
        scoreTeamB = 0;

        displayForTeamB(scoreTeamB);


    }


}