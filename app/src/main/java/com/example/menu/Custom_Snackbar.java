package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class Custom_Snackbar extends AppCompatActivity {

    TextView tv_snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_snackbar);

        tv_snackbar = findViewById(R.id.tv_snackbar);

        //ببعت للسناك بار اى فيو فى وهو يدور لحد م يلاقى الاب او coordinatorLayout

        //coordinatorLayout عباره عن لاى اوت زى الفريم لاى اوت بحيث لما الاسناك بار يطلع تحت فى الشاشه وفيه زرار مثلا تحت ..الزرار يطلع فوق الاسناك والاسناك ميغطيش عليه
        
//        Snackbar.make(tv_snackbar,"hello SnackBar", BaseTransientBottomBar.LENGTH_SHORT).show();

        Snackbar snackbar = Snackbar.make(tv_snackbar,"hello",BaseTransientBottomBar.LENGTH_SHORT);
        snackbar.setAction("Undo", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Undo Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        snackbar.show();
    }
}