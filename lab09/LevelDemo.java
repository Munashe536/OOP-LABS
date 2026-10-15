
enum Level { LOW, MEDIUM, HIGH }

public class LevelDemo {

    static void advice(Level level) {
    
        String text = switch (level) {
            case LOW    -> "Low risk: carry on as normal.";
            case MEDIUM -> "Medium risk: monitor the situation.";
            case HIGH   -> "High risk: act immediately!";
        };
        System.out.println(level + " -> " + text);
    }

    public static void main(String[] args) {
        for (Level l : Level.values()) {     
            advice(l);
        }
        Level parsed = Level.valueOf("HIGH");    
        System.out.println("Parsed: " + parsed + ", ordinal " + parsed.ordinal());
    }
}
