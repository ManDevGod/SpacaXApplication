package com.example.spacexassignment.data.model;

import androidx.room.PrimaryKey;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

public class LaunchItem {

    @PrimaryKey
    @SerializedName("flight_number")
    @NotNull
    private int flightNumber;

    @SerializedName("mission_name")
    private String missionName;

    @SerializedName("launch_year")
    private String launchYear;

    @SerializedName("launch_date_utc")
    private String launchDateUtc;

    @SerializedName("last_ll_launch_date")
    private String lastLlLaunchDate;

    @SerializedName("is_tentative")
    private boolean isTentative;

    @SerializedName("rocket")
    private Rocket rocket;

    @SerializedName("links")
    private Links links;

    @SerializedName("launch_window")
    private int launchWindow;

    @SerializedName("launch_success")
    private boolean launchSuccess;

    @SerializedName("launch_site")
    private LaunchSite launchSite;

    @SerializedName("launch_failure_details")
    private LaunchFailureDetails launchFailureDetails;

    @SerializedName("mission_id")
    private List<Object> missionId;

    @SerializedName("launch_date_source")
    private String launchDateSource;

    @SerializedName("details")
    private String details;

    @SerializedName("upcoming")
    private boolean upcoming;

    public void setLaunchYear(String launchYear) {
        this.launchYear = launchYear;
    }

    public String getLaunchYear() {
        return launchYear;
    }

    public void setLaunchDateUtc(String launchDateUtc) {
        this.launchDateUtc = launchDateUtc;
    }

    public String getLaunchDateUtc() {
        return launchDateUtc;
    }

    public void setLastLlLaunchDate(String lastLlLaunchDate) {
        this.lastLlLaunchDate = lastLlLaunchDate;
    }

    public String getLastLlLaunchDate() {
        return lastLlLaunchDate;
    }

    public void setIsTentative(boolean isTentative) {
        this.isTentative = isTentative;
    }

    public boolean isIsTentative() {
        return isTentative;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setMissionId(List<Object> missionId) {
        this.missionId = missionId;
    }

    public List<Object> getMissionId() {
        return missionId;
    }

    public void setLaunchDateSource(String launchDateSource) {
        this.launchDateSource = launchDateSource;
    }

    public String getLaunchDateSource() {
        return launchDateSource;
    }

    public void setLaunchSuccess(boolean launchSuccess) {
        this.launchSuccess = launchSuccess;
    }

    public boolean isLaunchSuccess() {
        return launchSuccess;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Links getLinks() {
        return links;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setLaunchSite(LaunchSite launchSite) {
        this.launchSite = launchSite;
    }

    public LaunchSite getLaunchSite() {
        return launchSite;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setLaunchWindow(int launchWindow) {
        this.launchWindow = launchWindow;
    }

    public int getLaunchWindow() {
        return launchWindow;
    }

    public void setUpcoming(boolean upcoming) {
        this.upcoming = upcoming;
    }

    public boolean isUpcoming() {
        return upcoming;
    }

    public void setLaunchFailureDetails(LaunchFailureDetails launchFailureDetails) {
        this.launchFailureDetails = launchFailureDetails;
    }

    public LaunchFailureDetails getLaunchFailureDetails() {
        return launchFailureDetails;
    }

    @Override
    public String toString() {
        return
                "LaunchItem{" +
                        "launch_year = '" + launchYear + '\'' +
                        ",launch_date_utc = '" + launchDateUtc + '\'' +
                        ",last_ll_launch_date = '" + lastLlLaunchDate + '\'' +
                        ",is_tentative = '" + isTentative + '\'' +
                        ",rocket = '" + rocket + '\'' +
                        ",mission_id = '" + missionId + '\'' +
                        ",launch_date_source = '" + launchDateSource + '\'' +
                        ",launch_success = '" + launchSuccess + '\'' +
                        ",links = '" + links + '\'' +
                        ",details = '" + details + '\'' +
                        ",launch_site = '" + launchSite + '\'' +
                        ",mission_name = '" + missionName + '\'' +
                        ",flight_number = '" + flightNumber + '\'' +
                        ",launch_window = '" + launchWindow + '\'' +
                        ",upcoming = '" + upcoming + '\'' +
                        ",launch_failure_details = '" + launchFailureDetails + '\'' +
                        "}";
    }
}