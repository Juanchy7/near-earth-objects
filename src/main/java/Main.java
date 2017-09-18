import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Task task = new Task();
        List<NearEarthObject> nearEarthObjects = task.getNearEarthObjects("2017-09-07", "2017-09-08");
        NearEarthObject largestNEO = task.getLargestNearEarthObject(nearEarthObjects);
        NearEarthObject closestNEO = task.getClosestNearEarthObject(nearEarthObjects);
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("output.txt")));
        bw.write("Total number of NEOs: " + nearEarthObjects.size());
        bw.newLine();
        bw.newLine();
        bw.write("Largest NEO:");
        bw.newLine();
        bw.newLine();
        writeDetails(largestNEO, bw);
        bw.newLine();
        bw.write("Closest NEO:");
        bw.newLine();
        bw.newLine();
        writeDetails(closestNEO, bw);
        bw.flush();
        bw.close();
    }

    private static void writeDetails(NearEarthObject neo, BufferedWriter bw) throws IOException {
        bw.write("Name: " + neo.getName());
        bw.newLine();
        bw.write("ID: " + neo.getNeo_reference_id());
        bw.newLine();
        bw.write("Min diameter: " + neo.getEstimated_diameter().getKilometers().getEstimated_diameter_min() + " km");
        bw.newLine();
        bw.write("Max diameter: " + neo.getEstimated_diameter().getKilometers().getEstimated_diameter_max() + " km");
        bw.newLine();
        bw.write("Distance: " + neo.getClose_approach_data().get(0).getMiss_distance().getKilometers() + " km");
        bw.newLine();
        bw.write("Url: " + neo.getNasa_jpl_url());
        bw.newLine();
        bw.write("Absolute Magnitude: " + neo.getAbsolute_magnitude_h());
        bw.newLine();
        bw.write("Potentially Hazardous: " + neo.isIs_potentially_hazardous_asteroid());
        bw.newLine();
    }
}
