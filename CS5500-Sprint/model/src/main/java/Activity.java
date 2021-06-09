import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Activity {
    @SerializedName("activity")
    private String name;
    private String group;
    private int duration;
    private int distance;
    private int steps;
    private int calories;
    private boolean manual;
    private String startTime;
    private String endTime;
    private int[] trackPoints;

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setTrackPoints(int[] trackPoints) {
        this.trackPoints = trackPoints;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getDuration() {
        return duration;
    }

    public int getDistance() {
        return distance;
    }

    public int getSteps() {
        return steps;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isManual() {
        return manual;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public int[] getTrackPoints() {
        return trackPoints;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", duration=" + duration +
                ", distance=" + distance +
                ", steps=" + steps +
                ", calories=" + calories +
                ", manual=" + manual +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", trackPoints=" + Arrays.toString(trackPoints) +
                '}';
    }
}
