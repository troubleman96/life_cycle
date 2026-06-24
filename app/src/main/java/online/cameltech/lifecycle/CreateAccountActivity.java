package online.cameltech.lifecycle;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {

    // Declare your UI elements here
    private EditText etName, etPhone, etPassword, etConfirmPassword;
    private Button btnSignUp;
    private TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // This line connects this Java file to your XML layout!
        setContentView(R.layout.activity_create_account);

        // 1. Find the views by the IDs we gave them in the XML
        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        btnSignUp = findViewById(R.id.btnSignUp);
        tvLogin = findViewById(R.id.textView3);

        // 2. Make the button do something when clicked
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Just a simple message for now to prove it works
                Toast.makeText(CreateAccountActivity.this, "Sign Up Clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        // 3. Make the "Login" text go back to LoginActivity
        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateAccountActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Optional: close this activity
            }
        });
    }
}