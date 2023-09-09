package com.javawork.designapptasks.javaclasses;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.javawork.designapptasks.bottomnav.FavoritesFragment;
import com.javawork.designapptasks.bottomnav.MusicFragment;
import com.javawork.designapptasks.bottomnav.NewsFragment;
import com.javawork.designapptasks.bottomnav.PlacesFragment;

import java.util.List;

public class BottomTabsPagerAdapter extends FragmentStateAdapter {
    private static final String[] TAB_TITLES = {"Favorites", "Music", "Places", "News"};

    private List<User> userList;

    public BottomTabsPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        userList = UserGenerator.generateUsers();
    }

    public Fragment getItem(int position) {
        return FavoritesFragment.newInstance(userList, position);
    }

    public CharSequence getPageTitle(int position) {
        return TAB_TITLES[position];
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FavoritesFragment();
            case 1:
                return new MusicFragment();
            case 2:
                return new PlacesFragment();
            case 3:
                return new NewsFragment();
        }
        return new FavoritesFragment();
    }

    @Override
    public int getItemCount() {
        return TAB_TITLES.length;
    }
}
