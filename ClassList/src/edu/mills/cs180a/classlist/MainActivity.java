
package edu.mills.cs180a.classlist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * An {@code Activity} that displays a list of the names and pictures of people in CS 180A.
 * If a name is clicked on, a box pops up asking what app the user would like to use to 
 * send an email, and creates an email with that person's email address in the to send field.
 * 
 * @author ellen.spertus@gmail.com (Ellen Spertus)
 * @author ctaymor@gmail.com (Caroline Taymor)
 * 
 * @see Person
 */
public class MainActivity extends Activity implements ListView.OnItemClickListener  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IconicAdapter adapter = new IconicAdapter();
        ListView listView = (ListView) findViewById(R.id.listView1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        String name = Person.everyone[position].toString();
        Toast.makeText(this, "Clicked on: " + name, Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        String [] emails = {Person.everyone[position].getEmail()};
        intent.putExtra(Intent.EXTRA_EMAIL, emails);
        startActivity(Intent.createChooser(intent, "Send Email"));
    }
    /**
     * A class which extends ArrayAdapter<Person> to handle a name(text) and icon.
     * @author ctaymor@gmail.com (Caroline Taymor)
     *
     */
    class IconicAdapter extends ArrayAdapter<Person> {
        IconicAdapter() {
            super(MainActivity.this, R.layout.row, R.id.name, Person.everyone);
        }
        
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = super.getView(position, convertView, parent);
            ImageView icon = (ImageView) row.findViewById(R.id.icon);
            icon.setImageResource(Person.everyone[position].getImage());
            
            return row;
        }
    }
}
