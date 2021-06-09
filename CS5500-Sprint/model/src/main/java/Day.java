import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Day {
    private String date;
    @SerializedName("summary")
    private Activity[] activities;
    private Segment[] segments;
    private int caloriesIdle;
    private String lastUpdate;

    public void setDate(String date) {
        this.date = date;
    }

    public void setActivities(Activity[] activities) {
        this.activities = activities;
    }

    public void setSegments(Segment[] segments) {
        this.segments = segments;
    }

    public void setCaloriesIdle(int caloriesIdle) {
        this.caloriesIdle = caloriesIdle;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getDate() {
        return date;
    }

    public Activity[] getActivities() {
        return activities;
    }

    public Segment[] getSegments() {
        return segments;
    }

    public int getCaloriesIdle() {
        return caloriesIdle;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public String toString() {
        return "Day{" +
                "date='" + date + '\'' +
                ", activities=" + Arrays.toString(activities) +
                ", segments=" + Arrays.toString(segments) +
                ", caloriesIdle=" + caloriesIdle +
                ", lastUpdate='" + lastUpdate + '\'' +
                '}';
    }
}
