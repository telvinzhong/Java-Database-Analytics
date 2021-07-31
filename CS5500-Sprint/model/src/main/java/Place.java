import java.util.Arrays;

public class Place {
    private long id;
    private String name;
    private String type;
    private Location location;
    private String foursquareId;
    private String[] foursquareCategoryIds;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
    }

    public void setFoursquareCategoryIds(String[] foursquareCategoryIds) {
        this.foursquareCategoryIds = foursquareCategoryIds;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Location getLocation() {
        return location;
    }

    public String getFoursquareId() {
        return foursquareId;
    }

    public String[] getFoursquareCategoryIds() {
        return foursquareCategoryIds;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location=" + location +
                ", foursquareId='" + foursquareId + '\'' +
                ", foursquareCategoryIds=" + Arrays.toString(foursquareCategoryIds) +
                '}';
    }
}
