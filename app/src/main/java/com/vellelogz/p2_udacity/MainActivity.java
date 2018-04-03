package com.vellelogz.p2_udacity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0, scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initializing views
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.countermenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id){
            case R.id.home:
                Toast.makeText(this, "You Clicked Home!", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    public void threeA(View view) {
        scoreTeamA += 3;
        updateScoreA(scoreTeamA);
    }

    public void threeB(View view) {
        scoreTeamB += 3;
        updateScoreB(scoreTeamB);
    }


    public void twoA(View view) {
        scoreTeamA += 2;
        updateScoreA(scoreTeamA);
    }

    public void twoB(View view) {
        scoreTeamB += 2;
        updateScoreB(scoreTeamB);
    }

    public void freeA(View view) {
        scoreTeamA += 1;
        updateScoreA(scoreTeamA);
    }

    public void freeB(View view) {
        scoreTeamB += 1;
        updateScoreB(scoreTeamB);
    }

    public void resetMe(View view) {
        scoreTeamA = scoreTeamB = 0;
        updateScoreA(0);
        updateScoreB(0);
    }
    //private function to display Score

    private void updateScoreA(int num) {
        TextView quantityScore = findViewById(R.id.scoreA);
        quantityScore.setText(String.valueOf(num));
    }

    private void updateScoreB(int num) {
        TextView quantityScore = findViewById(R.id.scoreB);
        quantityScore.setText(String.valueOf(num));
    }

}
