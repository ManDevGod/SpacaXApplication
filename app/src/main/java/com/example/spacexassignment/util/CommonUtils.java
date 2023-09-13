package com.example.spacexassignment.util;

import com.example.spacexassignment.data.model.Launch;
import com.example.spacexassignment.data.model.LaunchItem;

import java.util.List;
import java.util.stream.Collectors;

public class CommonUtils {


    public static List<Launch> mapLaunchItemToLaunch(List<LaunchItem> launchItems) {
        return launchItems.stream().map(launchItem -> {
            Launch launch = new Launch();
            launch.setFlightNumber(launchItem.getFlightNumber());
            launch.setMissionName(launchItem.getMissionName());
            launch.setLaunchDateUtc(launchItem.getLaunchDateUtc());
            launch.setLastLlLaunchDate(launchItem.getLastLlLaunchDate());
            launch.setTentative(launchItem.isIsTentative());
            launch.setDetails(launchItem.getDetails());
            launch.setLaunchSuccess(launchItem.isLaunchSuccess());
            launch.setLaunchWindow(launchItem.getLaunchWindow());
            launch.setLaunchDateSource(launchItem.getLaunchDateSource());
            launch.setLaunchYear(launchItem.getLaunchYear());
            launch.setRocketId(launchItem.getRocket().getRocketId());
            launch.setRocketName(launchItem.getRocket().getRocketName());
            launch.setRocketType(launchItem.getRocket().getRocketType());
            launch.setMissionPatch(launchItem.getLinks().getMissionPatch());
            launch.setMissionPatchSmall(launchItem.getLinks().getMissionPatchSmall());
            launch.setVideoLink(launchItem.getLinks().getVideoLink());
            launch.setRedditRecovery(launchItem.getLinks().getRedditRecovery());
            launch.setRedditLaunch(launchItem.getLinks().getRedditLaunch());
            launch.setArticleLink(launchItem.getLinks().getArticleLink());
            launch.setReason(launch.getReason());
            launch.setUpcoming(launchItem.isUpcoming());
            return launch;
        }).collect(Collectors.toList());
    }

}
