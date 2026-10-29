package com.example.assignmentone;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Detail screen for one of the four CampusLife topics.
 *
 * <p>Created in Part F with placeholder text; from Part H on it is populated from
 * the arrays in values/arrays.xml.</p>
 *
 * @author 郑剑彬 (Student ID: 20243007052)
 */
public class DetailActivity extends AppCompatActivity {

    /** Key of the Intent extra that identifies which topic to display. */
    public static final String EXTRA_TOPIC_INDEX = "extra_topic_index";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
