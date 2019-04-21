package com.example.rent_bike;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.rent_bike.fragment.HomeFragment;
import com.example.rent_bike.fragment.NotificationFragment;
import com.example.rent_bike.fragment.UploadFragment;
import com.example.rent_bike.fragment.UserFragment;


public class MainActivity extends AppCompatActivity implements HomeFragment.OnFragmentInteractionListener, UploadFragment.OnFragmentInteractionListener, NotificationFragment.OnFragmentInteractionListener, UserFragment.OnFragmentInteractionListener{

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selected = null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    selected = HomeFragment.newInstance();
                    break;
                case R.id.navigation_upload:
                    selected = UploadFragment.newInstance();
                    break;
                case R.id.navigation_notifications:
                    selected = NotificationFragment.newInstance();
                    break;
                case R.id.navigation_user:
                    selected = UserFragment.newInstance();
                    break;
            }
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_layout,selected);
            transaction.commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_layout,HomeFragment.newInstance());
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
