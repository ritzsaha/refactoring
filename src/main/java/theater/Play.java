package theater;

/**
 * Represents a play performed in the theater system.
 * Each play has a name and a type (for example, tragedy or comedy).
 */
public class Play {

    private final String name;
    private final String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
