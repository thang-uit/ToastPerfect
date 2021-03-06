package vn.thanguit.toastperfect;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import vn.thanguit.toastperfect.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.btnToast.setOnClickListener(view -> ToastPerfect.makeText(MainActivity.this, ToastPerfect.SUCCESS, "Today is a beautiful day!", ToastPerfect.BOTTOM, ToastPerfect.LENGTH_SHORT).show());
    }
}