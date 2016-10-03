package com.croworc.android.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    /**
     * The escaped double quotation mark
     */
    private static final String QUOTE = "\"";

    /**
     * The sports list view
     */
    private ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a reference on our ListView and attach an OnClickListener, so that we can
        // respond to any item being clicked.
        mListView = (ListView) findViewById(R.id.sports_listview);
        mListView.setOnItemClickListener(this);
    } // close onCreate()


    /**
     * Handles OnItemClick events for the passed-in ListView's TextView that was clicked
     *
     * @param parent    The ListView where the click event has happened
     * @param view      The View (row item) that was clicked (a TextView in our case)
     * @param position  The row (position) within the ListView that was clicked upon
     * @param id        The row id within the backing adapter's data
     *                  (may differ from the "position" argument, for layout reasons)
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // Fetch the text of the clicked item's TextView and
        // build a string which we'll use within a toast.
        String toastMessage = "You've clicked on "
                + QUOTE + ((TextView) view).getText() + QUOTE;

        // Display a toast, showing the selected sport item's text.
        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT ).show();
    } // close onItemClick()


} // close class MainActivity
