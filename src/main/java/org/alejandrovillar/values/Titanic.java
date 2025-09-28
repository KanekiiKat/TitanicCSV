package org.alejandrovillar.values;

public class Titanic {

    String passenger_id;
    String pclass;
    String name;
    String sex;
    String sibsp;
    String parch;
    String fare;
    String cabin;
    String embarked;
    String boat;
    String body;
    String homeDest;

    public Titanic(String passenger_id,
                   String pclass,
                   String name,
                   String sex,
                   String sibsp,
                   String parch,
                   String fare,
                   String cabin,
                   String embarked,
                   String boat,
                   String body,
                   String homeDest) {
        this.passenger_id = passenger_id;
        this.pclass = pclass;
        this.name = name;
        this.sex = sex;
        this.sibsp = sibsp;
        this.parch = parch;
        this.fare = fare;
        this.cabin = cabin;
        this.embarked = embarked;
        this.boat = boat;
        this.body = body;
        this.homeDest = homeDest;
    }

    public String getPassenger_id() { return passenger_id; }
    public String getPclass() { return pclass; }
    public String getName() { return name; }
    public String getSex() { return sex; }
    public String getSibsp() { return sibsp; }
    public String getParch() { return parch; }
    public String getFare() { return fare; }
    public String getCabin() { return cabin; }
    public String getEmbarked() { return embarked; }
    public String getBoat() { return boat; }
    public String getBody() { return body; }
    public String getHomeDest() { return homeDest; }


    @Override
    public String toString() {
        return nz(getPassenger_id()) + " | " +
                nz(getPclass()) + " | " +
                nz(getName()) + " | " +
                nz(getSex()) + " | " +
                nz(getSibsp()) + " | " +
                nz(getParch()) + " | " +
                nz(getFare()) + " | " +
                nz(getCabin()) + " | " +
                nz(getEmbarked()) + " | " +
                nz(getBoat()) + " | " +
                nz(getBody()) + " | " +
                nz(getHomeDest());
    }
    private String nz(String s) {
        return s == null ? "" : s;
    }
}












