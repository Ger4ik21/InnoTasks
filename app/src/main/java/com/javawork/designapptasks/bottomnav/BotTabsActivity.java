package com.javawork.designapptasks.bottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.os.Bundle;
import com.javawork.designapptasks.R;
import com.javawork.designapptasks.databinding.ActivityBotTabsBinding;
import com.javawork.designapptasks.javaclasses.User;
import com.javawork.designapptasks.javaclasses.UserGenerator;

import java.util.List;


public class BotTabsActivity extends AppCompatActivity {

    ActivityBotTabsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bot_tabs);

//        binding = ActivityBotTabsBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//        replaceFragment(new FavoritesFragment());

//        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
//
//            if (item.getItemId() == R.id.favorites)
//                replaceFragment(new FavoritesFragment());
//            else if (item.getItemId() == R.id.music)
//                replaceFragment(new MusicFragment());
//            else if (item.getItemId() == R.id.places)
//                replaceFragment(new PlacesFragment());
//            else if (item.getItemId() == R.id.news)
//                replaceFragment(new NewsFragment());
//
//            return true;
//        });
//    }
//
//    private void replaceFragment(Fragment fragment) {
//
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.frame_layout, fragment);
//        fragmentTransaction.commit();
//    }
    }
}