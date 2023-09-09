package com.javawork.designapptasks.bottomnav;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.javawork.designapptasks.R;
import com.javawork.designapptasks.javaclasses.User;
import com.javawork.designapptasks.javaclasses.UserListAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FavoritesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FavoritesFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_USER_LIST = "ARG_USER_LIST";
    private static final String ARG_PARAM2 = "param2";

    private RecyclerView recyclerView;
    private UserListAdapter adapter;
    private List<User> userList;

    // TODO: Rename and change types of parameters

    public FavoritesFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static FavoritesFragment newInstance(List<User> userList) {
        FavoritesFragment fragment = new FavoritesFragment();
        Bundle args = new Bundle();
        args.putParcelableArrayList(ARG_USER_LIST, new ArrayList<>());
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            getArguments().getParcelableArrayList(ARG_USER_LIST);
            //userList = getArguments().lis(ARG_USER_LIST)
        }
        adapter = new UserListAdapter(userList);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorites_blank, container, false);
        recyclerView = view.findViewById(R.id.users_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return view;
    }
}