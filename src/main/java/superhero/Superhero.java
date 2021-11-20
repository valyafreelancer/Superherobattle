package superhero;

import arena.Flyable;
import lombok.Data;

@Data
public abstract class Superhero implements Flyable {

    private String name;
    private int force;
    private Label label;

    public abstract void useSuperPower();

}
