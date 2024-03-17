package gr.aueb.cf.ch14;


import gr.aueb.cf.ch14.singleton.SaintGeorgeKnight;

public class Main {
    public static void main(String[] args) {
        SaintGeorgeKnight saintGeorgeKnight = SaintGeorgeKnight.getInstance();
        saintGeorgeKnight.embarkOnMission();
    }
}
