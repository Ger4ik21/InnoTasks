package com.javawork.designapptasks.javaclasses;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.javawork.designapptasks.R;

import java.util.List;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserViewHolder> {
    private List<User> userList;

    public UserListAdapter(List<User> userList) {
        this.userList = userList;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        public ImageView iconImageView;
        public TextView firstNameTextView;
        public TextView ageTextView;

        public UserViewHolder(View itemView) {
            super(itemView);
            iconImageView = itemView.findViewById(R.id.iconImageView);
            firstNameTextView = itemView.findViewById(R.id.firstNameTextView);
            ageTextView = itemView.findViewById(R.id.ageTextView);
        }
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout, parent, false);
        return new UserViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        User currentUser = userList.get(position);
        holder.iconImageView.setActivated(currentUser.getGender().equals("male"));
        holder.firstNameTextView.setText(currentUser.getFirstName() + " " + currentUser.getLastName());
        holder.ageTextView.setText("Age: " + currentUser.getAge());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}
