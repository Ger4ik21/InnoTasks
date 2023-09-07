package com.javawork.designapptasks.bottomnav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import com.javawork.designapptasks.R;
import com.javawork.designapptasks.databinding.ActivityBotTabsBinding;


public class BotTabsActivity extends AppCompatActivity {

    ActivityBotTabsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bot_tabs);
        binding = ActivityBotTabsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new FavoritesFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            if (item.getItemId() == R.id.favorites)
                replaceFragment(new FavoritesFragment());
            else if (item.getItemId() == R.id.music)
                replaceFragment(new MusicFragment());
            else if (item.getItemId() == R.id.places)
                replaceFragment(new PlacesFragment());
            else if (item.getItemId() == R.id.news)
                replaceFragment(new NewsFragment());

            return true;
        });
    }

    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }

}