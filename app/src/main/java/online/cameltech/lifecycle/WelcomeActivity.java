package online.cameltech.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Find the "Get Started" button by its ID from the XML
        Button btnGetStarted = findViewById(R.id.btnGetStarted);

        // Set a click listener to the button
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to go from WelcomeActivity to CreateAccountActivity
                Intent intent = new Intent(WelcomeActivity.this, CreateAccountActivity.class);
                startActivity(intent);
                
                // Optional: If you don't want the user to come back to this welcome screen 
                // when they press the back button, uncomment the line below:
                // finish();
            }
        });
    }
}
