package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        //بجيب الايتم الى جوا المنيو وبعدين اجيب الفيو ثم اجيب التيكست الى على الفيو

        MenuItem item = menu.findItem(R.id.menu_notification);
        View v =item.getActionView();

      TextView  textView = v.findViewById(R.id.num_of_notification);

        textView.setText("8");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.menu_notification:
                Toast.makeText(getBaseContext(), "Notifications", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_setting:
                Toast.makeText(getBaseContext(), "Setting", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}


// ------------------ Context Menu --------------------
//
//     TextView tv ;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        tv = findViewById(R.id.tv);
//
//        registerForContextMenu(tv);
//
//    }
//
//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.main_menu, menu);
//    }
//
//    @Override
//    public boolean onContextItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//
//            case R.id.notification:
//                Toast.makeText(getBaseContext(), "Notifications", Toast.LENGTH_SHORT).show();
//                return true;
//
//            case R.id.setting:
//                Toast.makeText(getBaseContext(), "Setting", Toast.LENGTH_SHORT).show();
//                return true;
//        }
//        return false;
//    }/


//-------------------------- Option Menu --------------------
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater =getMenuInflater();
//        inflater.inflate(R.menu.main_menu,menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//
//            switch (item.getItemId()){
//
//                case R.id.notification:
//                    Toast.makeText(getBaseContext(), "Notifications", Toast.LENGTH_SHORT).show();
//                    return true;
//
//                case R.id.setting:
//                    Toast.makeText(getBaseContext(), "Setting", Toast.LENGTH_SHORT).show();
//                    return true;
//            }
//            return false;
//    }/




