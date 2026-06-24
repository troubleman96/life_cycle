package online.cameltech.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    // A Tag is like a label. It makes it easy to find our messages in Logcat.
    private static final String TAG = "LifecycleWelcome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Log.d(TAG, "onCreate: The Activity is being created (Birth!)");

        // Find the "Get Started" button by its ID from the XML
        Button btnGetStarted = findViewById(R.id.btnGetStarted);

        // Set a click listener to the button
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to go from WelcomeActivity to CreateAccountActivity
                Intent intent = new Intent(WelcomeActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: The Activity is becoming visible on the screen!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: The Activity is active and ready for user interaction (Live!)");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: The Activity is losing focus (e.g., navigating away)");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: The Activity is no longer visible (hidden in background)");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: The Activity is being destroyed (Dead)");
    }
}
