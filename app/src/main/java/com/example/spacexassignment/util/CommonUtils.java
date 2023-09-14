package com.example.spacexassignment.util;

import com.example.spacexassignment.data.model.Launch;
import com.example.spacexassignment.data.model.LaunchItem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
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

    public static String convertUTCDateTimeToNormal(String utcDateTime) {
        String time = "";
        if (utcDateTime != null) {
            SimpleDateFormat utcFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            utcFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date utcDate = null;
            try {
                utcDate = utcFormatter.parse(utcDateTime);
            } catch (ParseException parseException) {
                parseException.printStackTrace();
            }
            SimpleDateFormat localFormatter = new SimpleDateFormat("dd MMMM yyyy", Locale.US);
            localFormatter.setTimeZone(TimeZone.getDefault());
            if (utcDate != null) {
                time = localFormatter.format(utcDate.getTime());
            }
        }
        return time;
    }

    public static boolean isActive(String dateTime) {
        Calendar currentTime = Calendar.getInstance();

        Calendar specificDateTime = Calendar.getInstance();

        SimpleDateFormat utcFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        utcFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date utcDate = null;
        try {
            utcDate = utcFormatter.parse(dateTime);
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        if (utcDate != null) {
            specificDateTime.setTime(utcDate);
            if (currentTime.compareTo(specificDateTime) < 0) {
                return true;
            }
        }
        return false;
    }

}
