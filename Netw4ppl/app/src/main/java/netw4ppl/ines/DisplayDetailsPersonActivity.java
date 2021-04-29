package netw4ppl.ines;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONException;

import netw4ppl.ines.utils.Person;

public class DisplayDetailsPersonActivity extends AppCompatActivity {

    TextView mTextViewFullnameTitle;
    Button mButtonAddRelationFrom;
    Button mButtonEditPerson;
    Button mButtonDeletePerson;
    Button mButtonAddRelationTo;

    ListView mListRelationsFrom;
    ListView mDetailsPerson;
    ListView mListRelationsTo;

    public static int index_person = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_details_person);

        mTextViewFullnameTitle = (TextView) findViewById(R.id.details_title_full_name);

        mButtonAddRelationFrom = (Button) findViewById(R.id.display_person_add_relation_from);
        mButtonAddRelationTo = (Button) findViewById(R.id.display_person_add_relation_to);
        mButtonEditPerson = (Button) findViewById(R.id.display_person_edit);
        mButtonDeletePerson = (Button) findViewById(R.id.display_person_delete);

        mButtonAddRelationFrom.setOnClickListener(v -> {

        });
        mButtonEditPerson.setOnClickListener(v -> {

        });
        mButtonDeletePerson.setOnClickListener(v-> {

        });
        mButtonAddRelationTo.setOnClickListener(v -> {

        });

        if (index_person != -1) {
            Person person = ManagePersonsActivity.array_persons.get(index_person);

            try {
                mTextViewFullnameTitle.setText(person.getInfoByKey("full_name"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

    }
}