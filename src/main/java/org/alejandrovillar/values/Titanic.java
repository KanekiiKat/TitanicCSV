package org.alejandrovillar.values;

public class Titanic {

    String passenger_id;
    String pclass;
    String name;
    String sex;
    String age;
    String sibsp;
    String parch;
    String ticket;
    String fare;
    String cabin;
    String embarked;
    String boat;
    String body;
    String homeDest;
    String survived;

    public Titanic(String passenger_id,
                   String pclass,
                   String name,
                   String sex,
                   String age,
                   String sibsp,
                   String parch,
                   String ticket,
                   String fare,
                   String cabin,
                   String embarked,
                   String boat,
                   String body,
                   String homeDest,
                   String survived) {
        this.passenger_id = passenger_id;
        this.pclass = pclass;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sibsp = sibsp;
        this.parch = parch;
        this.ticket = ticket;
        this.fare = fare;
        this.cabin = cabin;
        this.embarked = embarked;
        this.boat = boat;
        this.body = body;
        this.homeDest = homeDest;
        this.survived = survived;
    }

    public String getPassenger_id() {
        return passenger_id;
    }

    public String getPclass() {
        return pclass;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public String getSibsp() {
        return sibsp;
    }

    public String getParch() {
        return parch;
    }

    public String getTicket() {
        return ticket;
    }

    public String getFare() {
        return fare;
    }

    public String getCabin() {
        return cabin;
    }

    public String getEmbarked() {
        return embarked;
    }

    public String getBoat() {
        return boat;
    }

    public String getBody() {
        return body;
    }

    public String getHomeDest() {
        return homeDest;
    }

    public String getSurvived() {
        return survived;
    }

    @Override
    public String toString() {
        return getPassenger_id() + " | " +
                getPclass() + " | " +
                getName() + " | " +
                getSex() + " | " +
                getAge() + " | " +
                getSibsp() + " | " +
                getParch() + " | " +
                getTicket() + " | " +
                getFare() + " | " +
                getCabin() + " | " +
                getEmbarked() + " | " +
                getBoat() + " | " +
                getBody() + " | " +
                getHomeDest() + " | " +
                getSurvived() ;
    }
}
