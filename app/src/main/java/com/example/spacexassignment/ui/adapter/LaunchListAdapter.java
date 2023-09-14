package com.example.spacexassignment.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.spacexassignment.R;
import com.example.spacexassignment.data.model.Launch;
import com.example.spacexassignment.databinding.LaunchListItemBinding;
import com.example.spacexassignment.util.CommonUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LaunchListAdapter extends RecyclerView.Adapter<LaunchListAdapter.LaunchViewHolder> {

    ArrayList<Launch> launches = new ArrayList<>();
    ArrayList<Launch> favoriteLaunches = new ArrayList<>();
    private LaunchItemCLickListener launchItemCLickListener;
    private final Context context;

    public LaunchListAdapter(Context context, LaunchItemCLickListener launchItemCLickListener) {
        this.launchItemCLickListener = launchItemCLickListener;
        this.context = context;
    }

    @NonNull
    @Override
    public LaunchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LaunchViewHolder(LaunchListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LaunchViewHolder holder, int position) {
        Launch launch = launches.get(position);
        holder.itemBinding.tvMissionName.setText(launch.getMissionName());
        holder.itemBinding.launchDate.setText(CommonUtils.convertUTCDateTimeToNormal(launch.getLaunchDateUtc()));
        Glide
                .with(context)
                .load(launch.getMissionPatchSmall())
                .placeholder(R.drawable.spacex_placeholder)
                .into(holder.itemBinding.ivLaunchImage);

        holder.itemBinding.rocketName.setText("Rocket Name : " + launch.getRocketName());

        if (CommonUtils.isActive(launch.getLaunchDateUtc())) {
            holder.itemBinding.launchStatus.setText("Active");
            holder.itemBinding.launchStatus.setTextColor(ContextCompat.getColor(context, android.R.color.holo_green_light));
        } else {
            holder.itemBinding.launchStatus.setText("Inactive");
            holder.itemBinding.launchStatus.setTextColor(ContextCompat.getColor(context, android.R.color.holo_red_light));
        }

        if (favoriteLaunches.contains(launch)) {
            holder.itemBinding.ivFavorite.setImageResource(android.R.drawable.btn_star_big_on);
        } else {
            holder.itemBinding.ivFavorite.setImageResource(android.R.drawable.btn_star_big_off);
        }

        holder.itemBinding.ivFavorite.setOnClickListener(v -> {
            if (favoriteLaunches.contains(launch)) {
                launchItemCLickListener.setFavoriteItemClick(launch, false);
            } else {
                launchItemCLickListener.setFavoriteItemClick(launch, true);
            }
        });
        holder.itemBinding.cardView.setOnClickListener(v -> {
            launchItemCLickListener.onLaunchItemClick(launch);
        });
    }

    public void updateLaunchesList(List<Launch> launches) {
        this.launches.clear();
        this.launches.addAll(launches);
        notifyDataSetChanged();
    }

    public void updateFavoriteList(List<Launch> favoriteLaunches) {
        this.favoriteLaunches.clear();
        this.favoriteLaunches.addAll(favoriteLaunches);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return launches != null ? launches.size() : 0;
    }

    public static class LaunchViewHolder extends RecyclerView.ViewHolder {

        private LaunchListItemBinding itemBinding;

        public LaunchViewHolder(LaunchListItemBinding itemBinding) {
            super(itemBinding.getRoot());
            this.itemBinding = itemBinding;
        }

    }

    public interface LaunchItemCLickListener {
        void onLaunchItemClick(Launch launchItem);

        void setFavoriteItemClick(Launch launchItem, boolean alreadyAdded);
    }

}
