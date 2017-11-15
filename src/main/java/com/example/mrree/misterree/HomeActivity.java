package com.example.mrree.misterree;

import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,
        PuzzleListFragment.OnFragmentInteractionListener,
        ScoreFragment.OnFragmentInteractionListener{

    @Override
    public void onFragmentInteraction(Uri uri){

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.action_settings:
                    setTitle("Settings");
                    SettingsFragment settingsFrag = new SettingsFragment();
                    FragmentTransaction fragmentTransactionSettings = getSupportFragmentManager().beginTransaction();
                    fragmentTransactionSettings.replace(R.id.frame_layout, settingsFrag);
                    fragmentTransactionSettings.commit();
                    return true;

                case R.id.action_puzzles:
                    setTitle("Puzzles");
                    PuzzleListFragment puzzleFrag = new PuzzleListFragment();
                    FragmentTransaction fragmentTransactionPuzzle = getSupportFragmentManager().beginTransaction();
                    fragmentTransactionPuzzle.replace(R.id.frame_layout, puzzleFrag);
                    fragmentTransactionPuzzle.commit();
                    return true;

                case R.id.action_scores:
                    setTitle("Scores");
                    ScoreFragment scoreFrag = new ScoreFragment();
                    FragmentTransaction fragmentTransactionScore = getSupportFragmentManager().beginTransaction();
                    fragmentTransactionScore.replace(R.id.frame_layout, scoreFrag);
                    fragmentTransactionScore.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //Main Fragment to show at start
        setTitle("Puzzles");
        PuzzleListFragment puzzleFrag = new PuzzleListFragment();
        FragmentTransaction fragmentTransactionPuzzle = getSupportFragmentManager().beginTransaction();
        fragmentTransactionPuzzle.replace(R.id.frame_layout, puzzleFrag);
        fragmentTransactionPuzzle.commit();

    }


}
