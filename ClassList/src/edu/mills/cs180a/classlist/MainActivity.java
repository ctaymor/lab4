
package edu.mills.cs180a.classlist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * An {@code Activity} that displays a list of the names of people in CS 180A.
 * If a name is clicked on, a confirmatory {@link Toast} will be displayed.
 * 
 * @author ellen.spertus@gmail.com (Ellen Spertus)
 * 
 * @see Person
 */
public class MainActivity extends Activity implements ListView.OnItemClickListener  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<Person> adapter = new ArrayAdapter<Person>(this,
                android.R.layout.simple_list_item_1, Person.everyone);
        ListView listView = (ListView) findViewById(R.id.listView1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        String name = Person.everyone[position].toString();
        Toast.makeText(this, "Clicked on: " + name, Toast.LENGTH_LONG).show();
    }
}
