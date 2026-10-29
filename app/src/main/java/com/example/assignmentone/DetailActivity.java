package com.example.assignmentone;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Detail screen for one of the four CampusLife topics.
 *
 * <p>The activity receives the index of the topic through the Intent, then uses
 * that index to read the matching title, text and image name from
 * values/arrays.xml. Because the index addresses the arrays directly, no
 * if statements or switch cases are needed anywhere in this class.</p>
 *
 * @author 郑剑彬 (Student ID: 20243007052)
 */
public class DetailActivity extends AppCompatActivity {

    /** Key of the Intent extra that identifies which topic to display. */
    public static final String EXTRA_TOPIC_INDEX = "extra_topic_index";

    /** Fallback topic index, used only if the activity is started without an extra. */
    private static final int DEFAULT_TOPIC_INDEX = 0;

    @Override
    @SuppressLint("DiscouragedApi") // The drawable names only exist as strings in arrays.xml.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int topicIndex = getIntent().getIntExtra(EXTRA_TOPIC_INDEX, DEFAULT_TOPIC_INDEX);

        Resources resources = getResources();
        String[] titles = resources.getStringArray(R.array.string_array_titles);
        String[] contents = resources.getStringArray(R.array.string_array_content);
        String[] imageNames = resources.getStringArray(R.array.string_array_images);
        String[] shortTitles = resources.getStringArray(R.array.string_array_short_titles);

        // The array entries carry padding spaces around the drawable name.
        String imageName = imageNames[topicIndex].trim();
        int imageId = resources.getIdentifier(imageName, "drawable", getPackageName());

        ImageView headerIcon = findViewById(R.id.img_detail_icon);
        headerIcon.setImageResource(imageId);
        headerIcon.setContentDescription(shortTitles[topicIndex]);

        TextView headerTitle = findViewById(R.id.txt_detail_header);
        headerTitle.setText(shortTitles[topicIndex]);

        TextView topicTitle = findViewById(R.id.txt_detail_title);
        topicTitle.setText(titles[topicIndex]);

        TextView topicContent = findViewById(R.id.txt_detail_content);
        topicContent.setText(contents[topicIndex]);
    }
}
