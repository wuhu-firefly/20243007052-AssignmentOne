package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Main (home) screen of the CampusLife companion app.
 *
 * <p>The screen shows the campus banner and the four topic buttons. Each button
 * reports the tap with a Toast message and opens the matching detail screen,
 * passing the index of the topic it represents.</p>
 *
 * @author 郑剑彬 (Student ID: 20243007052)
 */
public class MainActivity extends AppCompatActivity {

    /* Indexes match the order of the entries in values/arrays.xml. */
    private static final int TOPIC_FACILITIES = 0;
    private static final int TOPIC_EVENTS = 1;
    private static final int TOPIC_CLUBS = 2;
    private static final int TOPIC_SUPPORT = 3;

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
        openDetail(TOPIC_FACILITIES);
    }

    /**
     * Handles a tap on the Events button.
     *
     * @param view the ImageButton that was tapped
     */
    public void onEventsClicked(View view) {
        Toast.makeText(this, R.string.toast_events_clicked, Toast.LENGTH_SHORT).show();
        openDetail(TOPIC_EVENTS);
    }

    /**
     * Handles a tap on the Clubs button.
     *
     * @param view the ImageButton that was tapped
     */
    public void onClubsClicked(View view) {
        Toast.makeText(this, R.string.toast_clubs_clicked, Toast.LENGTH_SHORT).show();
        openDetail(TOPIC_CLUBS);
    }

    /**
     * Handles a tap on the Support button.
     *
     * @param view the ImageButton that was tapped
     */
    public void onSupportClicked(View view) {
        Toast.makeText(this, R.string.toast_support_clicked, Toast.LENGTH_SHORT).show();
        openDetail(TOPIC_SUPPORT);
    }

    /**
     * Starts the detail screen for the given topic.
     *
     * <p>The topic index is the unique identifier carried by the explicit Intent;
     * {@link DetailActivity} uses it to pick the matching title, text and icon.</p>
     *
     * @param topicIndex index of the topic, matching values/arrays.xml
     */
    private void openDetail(int topicIndex) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_TOPIC_INDEX, topicIndex);
        startActivity(intent);
    }
}
