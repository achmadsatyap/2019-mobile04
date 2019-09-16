package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;
import id.ac.polinema.intent.Model.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ParcelableActivity extends AppCompatActivity {

    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;

    private String username;
    private String name;
    private int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);
        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);

    }
    public void handleSubmit(View view) {
        username = usernameInput.getText().toString();
        name = nameInput.getText().toString();
         age = Integer.parseInt(ageInput.getText().toString());

        User user = new User(username,name,age);

        Intent intent = new Intent(this, ProfileParcelableActivity.class);
        intent.putExtra("user", user);

        startActivity(intent);
    }
}
