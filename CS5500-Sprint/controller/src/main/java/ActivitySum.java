public class ActivitySum {
    public static void main(String[] args) {
        ConnectToDatabase connection = new ConnectToDatabase("20130209");
        System.out.println("Activity total time: " + connection.getTotalTime("walking"));
        System.out.println("Activity total calories: " + connection.getTotalCalories("walking"));
    }
}
