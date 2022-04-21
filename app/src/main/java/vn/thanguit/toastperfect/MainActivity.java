package vn.thanguit.toastperfect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastPerfect.makeText(this, ToastPerfect.SUCCESS, "Toast Perfect", Toast.LENGTH_SHORT).show();
    }
}