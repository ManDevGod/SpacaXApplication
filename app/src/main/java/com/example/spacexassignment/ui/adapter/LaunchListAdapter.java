package com.example.spacexassignment.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.example.spacexassignment.R;
import com.example.spacexassignment.data.model.Launch;
import com.example.spacexassignment.databinding.LaunchLiteItemBinding;

import java.util.ArrayList;
import java.util.List;

public class LaunchListAdapter extends RecyclerView.Adapter<LaunchListAdapter.LaunchViewHolder> {

    ArrayList<Launch> launches = new ArrayList<>();
    private LaunchItemCLickListener launchItemCLickListener;
    private Context context;

    public LaunchListAdapter(Context context, LaunchItemCLickListener launchItemCLickListener) {
        this.launchItemCLickListener = launchItemCLickListener;
        this.context = context;
    }

    @NonNull
    @Override
    public LaunchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LaunchViewHolder(LaunchLiteItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LaunchViewHolder holder, int position) {
        Launch launch = launches.get(position);
        holder.itemBinding.tvMissionName.setText(launch.getMissionName());
        holder.itemBinding.launchDate.setText(launch.getLaunchDateSource());
        Glide
                .with(context)
                .load(launch.getMissionPatchSmall())
                .placeholder(R.drawable.spacex_placeholder)
                .into(holder.itemBinding.ivLaunchImage);

        holder.itemBinding.cardView.setOnClickListener(v -> {
            launchItemCLickListener.onLaunchItemClick(launches.get(position));
        });
    }

    public void updateLaunchesList(List<Launch> launches) {
        this.launches.clear();
        this.launches.addAll(launches);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return launches != null ? launches.size() : 0;
    }

    public class LaunchViewHolder extends RecyclerView.ViewHolder {

        private LaunchLiteItemBinding itemBinding;

        public LaunchViewHolder(LaunchLiteItemBinding itemBinding) {
            super(itemBinding.getRoot());
            this.itemBinding = itemBinding;

        }

    }

    public interface LaunchItemCLickListener {
        void onLaunchItemClick(Launch launchItem);
    }

}
