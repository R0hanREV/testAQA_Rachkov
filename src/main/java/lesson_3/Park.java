package lesson_3;

public class Park {
    private String parkTitle;
    private String location;
    private Attraction attraction;

    public void setParkTitle(String parkTitle) {
        this.parkTitle = parkTitle;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    @Override
    public String toString() {
        return "Park{" +
                "parkTitle='" + parkTitle + '\'' +
                ", location='" + location + '\'' +
                ", attraction=" + attraction +
                '}';
    }

    public Park(String parkTitle, String location) {
        this.parkTitle = parkTitle;
        this.location = location;
        this.attraction = attraction;
    }


    public class Attraction {
        private String titleAttraction;
        private String workTime;
        private Double cost;

        public void setTitleAttraction(String titleAttraction) {
            this.titleAttraction = titleAttraction;
        }

        public void setWorkTime(String workTime) {
            this.workTime = workTime;
        }

        public void setCost(Double cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "titleAttraction='" + titleAttraction + '\'' +
                    ", workTime='" + workTime + '\'' +
                    ", cost=" + cost +
                    '}';
        }

        public Attraction(String titleAttraction, String workTime, Double cost) {
            this.titleAttraction = titleAttraction;
            this.workTime = workTime;
            this.cost = cost;
        }
    }
}
