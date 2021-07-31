import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import static com.mongodb.client.model.Filters.eq;


public class ConnectToDatabase {
    private static Day day;

    public ConnectToDatabase(String date) {
        String url = "mongodb+srv://yimanliu:yimanliu@cluster.eya5x.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
        MongoClientURI uri = new MongoClientURI(url);
        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("storyline");
        MongoCollection<Document> collection = database.getCollection("storyline");

        Document myDoc = collection.find(eq("date", date)).first();
        String data = myDoc.toJson();

        Gson gson = new Gson();
        this.day = gson.fromJson(data, Day.class);
    }

    public static int getTotalTime(String activity) {
        int totalTime = 0;
        for (Activity act : day.getActivities()) {
            if (act.getName().equals(activity)) {
                totalTime = act.getDuration();
                break;
            }
        }
        return totalTime;
    }

    public static int getTotalCalories(String activity) {
        int totalCalories = 0;
        for (Activity act : day.getActivities()) {
            if (act.getName().equals(activity)) {
                totalCalories = act.getCalories();
                break;
            }
        }
        return totalCalories;
    }
}
