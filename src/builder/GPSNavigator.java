package builder;

public class GPSNavigator {
    private String route;
    private double mileage;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }


    public void go(double mileage) {
        boolean started = false;
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public double getVolume() {
        return getVolume();
    }

    public double getMileage() {
        return mileage;
    }
}
