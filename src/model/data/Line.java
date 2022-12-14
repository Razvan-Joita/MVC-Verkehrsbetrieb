package model.data;

import java.util.ArrayList;
import java.util.List;

public class Line {

    private String lineNumber;

    private String type;

    private String specialRequirement;

    private List<Ticket> usedTickets;



    private List<Station> stationsList;

    public Line(String lineNumber, String type, String specialRequirement, List<Station> stationsList) {
        this.lineNumber = lineNumber;
        this.type = type;
        this.specialRequirement = specialRequirement;
        this.stationsList = stationsList;
        this.usedTickets= new ArrayList<>();

    }

    public List<Station> getStationsList() {
        return stationsList;
    }

    public List<Ticket> getUsedTickets() {
        return usedTickets;
    }

    public void setUsedTickets(List<Ticket> usedTickets) {
        this.usedTickets = usedTickets;
    }

    public void setStationsList(List<Station> stationsList) {
        this.stationsList = stationsList;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpecialRequirement() {
        return specialRequirement;
    }

    public void setSpecialRequirement(String specialRequirement) {
        this.specialRequirement = specialRequirement;
    }

    @Override
    public String toString() {
        return "Line{" +
                "lineNumber='" + lineNumber + '\'' +
                ", type='" + type + '\'' +
                ", specialRequirement='" + specialRequirement + '\'' +
                '}';
    }

}
