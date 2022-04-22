package vn.thanguit.toastperfect;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import vn.thanguit.toastperfect.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastPerfect.makeText(MainActivity.this, new Random().nextInt(4) + 1, getString(R.string.app_name), ToastPerfect.LENGTH_LONG).show();
            }
        });
    }
}