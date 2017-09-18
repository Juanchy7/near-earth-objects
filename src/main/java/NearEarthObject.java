import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NearEarthObject {

    private String neo_reference_id;
    private String name;
    private String nasa_jpl_url;
    private double absolute_magnitude_h;
    private EstimatedDiameter estimated_diameter;
    private boolean is_potentially_hazardous_asteroid;
    private List<CloseApproachData> close_approach_data;

    public String getNeo_reference_id() {
        return neo_reference_id;
    }

    public void setNeo_reference_id(String neo_reference_id) {
        this.neo_reference_id = neo_reference_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNasa_jpl_url() {
        return nasa_jpl_url;
    }

    public void setNasa_jpl_url(String nasa_jpl_url) {
        this.nasa_jpl_url = nasa_jpl_url;
    }

    public double getAbsolute_magnitude_h() {
        return absolute_magnitude_h;
    }

    public void setAbsolute_magnitude_h(double absolute_magnitude_h) {
        this.absolute_magnitude_h = absolute_magnitude_h;
    }

    public EstimatedDiameter getEstimated_diameter() {
        return estimated_diameter;
    }

    public void setEstimated_diameter(EstimatedDiameter estimated_diameter) {
        this.estimated_diameter = estimated_diameter;
    }

    public boolean isIs_potentially_hazardous_asteroid() {
        return is_potentially_hazardous_asteroid;
    }

    public void setIs_potentially_hazardous_asteroid(boolean is_potentially_hazardous_asteroid) {
        this.is_potentially_hazardous_asteroid = is_potentially_hazardous_asteroid;
    }

    public List<CloseApproachData> getClose_approach_data() {
        return close_approach_data;
    }

    public void setClose_approach_data(List<CloseApproachData> close_approach_data) {
        this.close_approach_data = close_approach_data;
    }

    public static class EstimatedDiameter {

        private Length kilometers;
        private Length meters;
        private Length miles;
        private Length feet;

        public Length getKilometers() {
            return kilometers;
        }

        public void setKilometers(Length kilometers) {
            this.kilometers = kilometers;
        }

        public Length getMeters() {
            return meters;
        }

        public void setMeters(Length meters) {
            this.meters = meters;
        }

        public Length getMiles() {
            return miles;
        }

        public void setMiles(Length miles) {
            this.miles = miles;
        }

        public Length getFeet() {
            return feet;
        }

        public void setFeet(Length feet) {
            this.feet = feet;
        }

        public static class Length {

            private double estimated_diameter_min;
            private double estimated_diameter_max;

            public double getEstimated_diameter_min() {
                return estimated_diameter_min;
            }

            public void setEstimated_diameter_min(double estimated_diameter_min) {
                this.estimated_diameter_min = estimated_diameter_min;
            }

            public double getEstimated_diameter_max() {
                return estimated_diameter_max;
            }

            public void setEstimated_diameter_max(double estimated_diameter_max) {
                this.estimated_diameter_max = estimated_diameter_max;
            }

            @Override
            public String toString() {
                return "Length{" +
                        "estimated_diameter_min=" + estimated_diameter_min +
                        ", estimated_diameter_max=" + estimated_diameter_max +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "EstimatedDiameter{" +
                    "kilometers=" + kilometers +
                    ", meters=" + meters +
                    ", miles=" + miles +
                    ", feet=" + feet +
                    '}';
        }
    }

    public static class CloseApproachData {

        private String close_approach_date;
        private long epoch_date_close_approach;
        private RelativeVelocity relative_velocity;
        private MissDistance miss_distance;
        private String orbiting_body;

        public String getClose_approach_date() {
            return close_approach_date;
        }

        public void setClose_approach_date(String close_approach_date) {
            this.close_approach_date = close_approach_date;
        }

        public long getEpoch_date_close_approach() {
            return epoch_date_close_approach;
        }

        public void setEpoch_date_close_approach(long epoch_date_close_approach) {
            this.epoch_date_close_approach = epoch_date_close_approach;
        }

        public RelativeVelocity getRelative_velocity() {
            return relative_velocity;
        }

        public void setRelative_velocity(RelativeVelocity relative_velocity) {
            this.relative_velocity = relative_velocity;
        }

        public MissDistance getMiss_distance() {
            return miss_distance;
        }

        public void setMiss_distance(MissDistance miss_distance) {
            this.miss_distance = miss_distance;
        }

        public String getOrbiting_body() {
            return orbiting_body;
        }

        public void setOrbiting_body(String orbiting_body) {
            this.orbiting_body = orbiting_body;
        }

        public static class RelativeVelocity {

            private String kilometers_per_second;
            private String kilometers_per_hour;
            private String miles_per_hour;

            public String getKilometers_per_second() {
                return kilometers_per_second;
            }

            public void setKilometers_per_second(String kilometers_per_second) {
                this.kilometers_per_second = kilometers_per_second;
            }

            public String getKilometers_per_hour() {
                return kilometers_per_hour;
            }

            public void setKilometers_per_hour(String kilometers_per_hour) {
                this.kilometers_per_hour = kilometers_per_hour;
            }

            public String getMiles_per_hour() {
                return miles_per_hour;
            }

            public void setMiles_per_hour(String miles_per_hour) {
                this.miles_per_hour = miles_per_hour;
            }

            @Override
            public String toString() {
                return "RelativeVelocity{" +
                        "kilometers_per_second='" + kilometers_per_second + '\'' +
                        ", kilometers_per_hour='" + kilometers_per_hour + '\'' +
                        ", miles_per_hour='" + miles_per_hour + '\'' +
                        '}';
            }
        }

        public static class MissDistance {

            private String astronomical;
            private String lunar;
            private String kilometers;
            private String miles;

            public String getAstronomical() {
                return astronomical;
            }

            public void setAstronomical(String astronomical) {
                this.astronomical = astronomical;
            }

            public String getLunar() {
                return lunar;
            }

            public void setLunar(String lunar) {
                this.lunar = lunar;
            }

            public String getKilometers() {
                return kilometers;
            }

            public void setKilometers(String kilometers) {
                this.kilometers = kilometers;
            }

            public String getMiles() {
                return miles;
            }

            public void setMiles(String miles) {
                this.miles = miles;
            }

            @Override
            public String toString() {
                return "MissDistance{" +
                        "astronomical='" + astronomical + '\'' +
                        ", lunar='" + lunar + '\'' +
                        ", kilometers='" + kilometers + '\'' +
                        ", miles='" + miles + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "CloseApproachData{" +
                    "close_approach_date='" + close_approach_date + '\'' +
                    ", epoch_date_close_approach=" + epoch_date_close_approach +
                    ", relative_velocity=" + relative_velocity +
                    ", miss_distance=" + miss_distance +
                    ", orbiting_body='" + orbiting_body + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "NearEarthObject{" +
                "neo_reference_id='" + neo_reference_id + '\'' +
                ", name='" + name + '\'' +
                ", nasa_jpl_url='" + nasa_jpl_url + '\'' +
                ", absolute_magnitude_h=" + absolute_magnitude_h +
                ", estimated_diameter=" + estimated_diameter +
                ", is_potentially_hazardous_asteroid=" + is_potentially_hazardous_asteroid +
                ", close_approach_data=" + close_approach_data +
                '}';
    }
}
