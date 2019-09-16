package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;
import id.ac.polinema.intent.Model.User;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileParcelableActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);
        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        Intent intent = getIntent();
        User parcel = intent.getParcelableExtra("user");

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            usernameText.setText(parcel.getUsername());
            nameText.setText(parcel.getName());
            ageText.setText(String.valueOf(parcel.getAge()));
        }

    }
}
