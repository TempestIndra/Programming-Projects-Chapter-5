public class PP5_8Flight {
    public String airlineName, flightNumber, flightOrigin, flightDestination;

    public PP5_8Flight(String an,String fn, String fo, String fd){
        airlineName = an;
        flightNumber = fn;
        flightOrigin = fo;
        flightDestination = fd;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setFlightOrigin(String flightOrigin) {
        this.flightOrigin = flightOrigin;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public String getFlightNumber(){
        return flightNumber;
    }

    public String getFlightOrigin() {
        return flightOrigin;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public String toString() {
        return "Flight number " + flightNumber + " from " + flightOrigin  + " to " + flightOrigin;
    }
}
