import java.util.Arrays;

public class Segment {
    private String type;
    private String startTime;
    private String endTime;
    private Place place;
    private String lastUpdate;
    private Activity[] activities;

    public void setType(String type) {
        this.type = type;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setActivities(Activity[] activities) {
        this.activities = activities;
    }

    public String getType() {
        return type;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public Place getPlace() {
        return place;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public Activity[] getActivities() {
        return activities;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "type='" + type + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", place=" + place +
                ", lastUpdate='" + lastUpdate + '\'' +
                ", activities=" + Arrays.toString(activities) +
                '}';
    }
}
