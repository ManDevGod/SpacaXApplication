package com.example.spacexassignment.data.model;

import androidx.annotation.Nullable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

@Entity(tableName = "launch")
public class Launch {

    @PrimaryKey
    @NotNull
    private int flightNumber;

    private String missionName;

    private String launchYear;

    private String launchDateUtc;

    private String lastLlLaunchDate;

    private boolean isTentative;

    private int launchWindow;

    private boolean launchSuccess;

    private String launchDateSource;

    private String details;

    private boolean upcoming;

    private String rocketType;

    private String rocketName;

    private String rocketId;

    private String missionPatchSmall;

    private String missionPatch;

    private String videoLink;

    private String redditRecovery;

    private String redditMedia;

    private String redditCampaign;

    private String wikipedia;

    private String redditLaunch;

    private String youtubeId;

    private String presskit;

    private String articleLink;

    private String siteName;

    private String siteId;

    private String siteNameLong;

    private String reason;

    public String getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(String launchYear) {
        this.launchYear = launchYear;
    }

    public String getLaunchDateUtc() {
        return launchDateUtc;
    }

    public void setLaunchDateUtc(String launchDateUtc) {
        this.launchDateUtc = launchDateUtc;
    }

    public String getLastLlLaunchDate() {
        return lastLlLaunchDate;
    }

    public void setLastLlLaunchDate(String lastLlLaunchDate) {
        this.lastLlLaunchDate = lastLlLaunchDate;
    }

    public boolean isTentative() {
        return isTentative;
    }

    public void setTentative(boolean tentative) {
        isTentative = tentative;
    }

    public int getLaunchWindow() {
        return launchWindow;
    }

    public void setLaunchWindow(int launchWindow) {
        this.launchWindow = launchWindow;
    }

    public boolean isLaunchSuccess() {
        return launchSuccess;
    }

    public void setLaunchSuccess(boolean launchSuccess) {
        this.launchSuccess = launchSuccess;
    }

    public String getLaunchDateSource() {
        return launchDateSource;
    }

    public void setLaunchDateSource(String launchDateSource) {
        this.launchDateSource = launchDateSource;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isUpcoming() {
        return upcoming;
    }

    public void setUpcoming(boolean upcoming) {
        this.upcoming = upcoming;
    }

    public String getRocketType() {
        return rocketType;
    }

    public void setRocketType(String rocketType) {
        this.rocketType = rocketType;
    }

    public String getRocketName() {
        return rocketName;
    }

    public void setRocketName(String rocketName) {
        this.rocketName = rocketName;
    }

    public String getRocketId() {
        return rocketId;
    }

    public void setRocketId(String rocketId) {
        this.rocketId = rocketId;
    }

    public String getMissionPatchSmall() {
        return missionPatchSmall;
    }

    public void setMissionPatchSmall(String missionPatchSmall) {
        this.missionPatchSmall = missionPatchSmall;
    }

    public String getMissionPatch() {
        return missionPatch;
    }

    public void setMissionPatch(String missionPatch) {
        this.missionPatch = missionPatch;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getRedditRecovery() {
        return redditRecovery;
    }

    public void setRedditRecovery(String redditRecovery) {
        this.redditRecovery = redditRecovery;
    }

    public String getRedditMedia() {
        return redditMedia;
    }

    public void setRedditMedia(String redditMedia) {
        this.redditMedia = redditMedia;
    }

    public String getRedditCampaign() {
        return redditCampaign;
    }

    public void setRedditCampaign(String redditCampaign) {
        this.redditCampaign = redditCampaign;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public String getRedditLaunch() {
        return redditLaunch;
    }

    public void setRedditLaunch(String redditLaunch) {
        this.redditLaunch = redditLaunch;
    }

    public String getYoutubeId() {
        return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public String getPresskit() {
        return presskit;
    }

    public void setPresskit(String presskit) {
        this.presskit = presskit;
    }

    public String getArticleLink() {
        return articleLink;
    }

    public void setArticleLink(String articleLink) {
        this.articleLink = articleLink;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteNameLong() {
        return siteNameLong;
    }

    public void setSiteNameLong(String siteNameLong) {
        this.siteNameLong = siteNameLong;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == null || obj == this) {
            return true;
        }
        if (!(obj instanceof Launch)) {
            return false;
        }

        Launch launch = (Launch) obj;
        return Integer.compare(flightNumber, launch.flightNumber) == 0;
    }
}