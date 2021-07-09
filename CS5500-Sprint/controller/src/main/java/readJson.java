import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class readJson {
    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();
        String data = new String(Files.readAllBytes(Paths.get("controller/src/main/resources/storyline.json")));
        Day[] days = gson.fromJson(data, Day[].class);
        System.out.println(days.length);
        Set<String> uniqueActivity = new HashSet<>();
        for (Day day : days) {
            Activity[] activities = day.getActivities();
//            for (Activity activity : activities) {
//                uniqueActivity.add(activity.getName());
//            }
        }
        for (String s : uniqueActivity) {
            System.out.println(s);
        }
    }
}
