package com.example.assignmentone;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Main (home) screen of the CampusLife companion app.
 *
 * <p>The screen shows the campus banner and the four topic buttons. Each button
 * reports the tap with a Toast message (Part E).</p>
 *
 * @author 郑剑彬 (Student ID: 20243007052)
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Handles a tap on the Facilities button.
     *
     * @param view the ImageButton that was tapped
     */
    public void onFacilitiesClicked(View view) {
        Toast.makeText(this, R.string.toast_facilities_clicked, Toast.LENGTH_SHORT).show();
    }

    /**
     * Handles a tap on the Events button.
     *
     * @param view the ImageButton that was tapped
     */
    public void onEventsClicked(View view) {
        Toast.makeText(this, R.string.toast_events_clicked, Toast.LENGTH_SHORT).show();
    }

    /**
     * Handles a tap on the Clubs button.
     *
     * @param view the ImageButton that was tapped
     */
    public void onClubsClicked(View view) {
        Toast.makeText(this, R.string.toast_clubs_clicked, Toast.LENGTH_SHORT).show();
    }

    /**
     * Handles a tap on the Support button.
     *
     * @param view the ImageButton that was tapped
     */
    public void onSupportClicked(View view) {
        Toast.makeText(this, R.string.toast_support_clicked, Toast.LENGTH_SHORT).show();
    }
}
