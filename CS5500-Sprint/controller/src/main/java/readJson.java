import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class readJson {
    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();
        String data = new String(Files.readAllBytes(Paths.get("controller/src/main/resources/storyline.json")));
        Day[] days = gson.fromJson(data, Day[].class);
        System.out.println(days.length);
//        for (Day day : days) {
//            System.out.println(day);
//        }
    }
}
