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


    public static class UserViewHolder extends RecyclerView.ViewHolder {
        private TextView nameTextView;
        private TextView ageTextView;
        private TextView sexTextView;
        private ImageView iconImageView;
        private TextView descriptionTextView;

        public UserViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.firstNameTextView);
            ageTextView = itemView.findViewById(R.id.ageTextView);
            iconImageView = itemView.findViewById(R.id.iconImageView);
        }

        public void bind(User user) {
            nameTextView.setText(user.getFirstName() + " " + user.getLastName());
            ageTextView.setText("Age: " + user.getAge());
            iconImageView.setActivated(user.getSex().equals("male"));
        }
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list_item, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        User user = userList.get(position);
        holder.bind(user);
//        holder.iconImageView.setActivated(currentUser.getSex().equals("male"));
//        holder.firstNameTextView.setText(currentUser.getFirstName() + " " + currentUser.getLastName());
//        holder.ageTextView.setText("Age: " + currentUser.getAge());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}
