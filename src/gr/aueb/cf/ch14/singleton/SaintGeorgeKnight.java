package gr.aueb.cf.ch14.singleton;

/**
 * Singleton class {@link SaintGeorgeKnight}.
 */
public class SaintGeorgeKnight {
    private static final SaintGeorgeKnight INSTANCE = new SaintGeorgeKnight();

    private SaintGeorgeKnight() {
    }
    public static SaintGeorgeKnight getInstance() {
        return INSTANCE;
    }
    public void embarkOnMission() {
        System.out.println("Knight of the Mission is: " + INSTANCE);
    }
}
