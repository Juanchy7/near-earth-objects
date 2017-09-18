import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Task {

    public List<NearEarthObject> getNearEarthObjects(String startDate, String endDate) {
        final Response response = ClientBuilder.newClient()
                .target("https://api.nasa.gov/neo/rest/v1/feed")
                .queryParam("start_date", startDate)
                .queryParam("end_date", endDate)
                .queryParam("api_key", "DEMO_KEY")
                .request()
                .get();
        JsonNode json = response.readEntity(ObjectNode.class);
        ObjectMapper mapper = new ObjectMapper();
        List<NearEarthObject> nearEarthObjects = new ArrayList<>();
        Iterator<JsonNode> iterator = json.get("near_earth_objects").elements();
        while (iterator.hasNext()) {
            for (JsonNode jsonNode : iterator.next()) {
                NearEarthObject neo = mapper.convertValue(jsonNode, NearEarthObject.class);
                nearEarthObjects.add(neo);
            }
        }
        return nearEarthObjects;
    }

    public NearEarthObject getLargestNearEarthObject(List<NearEarthObject> nearEarthObjects) {
        nearEarthObjects.sort((n1, n2) -> Double.compare(n2.getEstimated_diameter().getKilometers().getEstimated_diameter_max(),
                n1.getEstimated_diameter().getKilometers().getEstimated_diameter_max()));
        return nearEarthObjects.get(0);
    }

    public NearEarthObject getClosestNearEarthObject(List<NearEarthObject> nearEarthObjects) {
        nearEarthObjects.sort(Comparator.comparingLong(n -> Long.parseLong(n.getClose_approach_data().get(0).getMiss_distance().getKilometers())));
        return nearEarthObjects.get(0);
    }
}
