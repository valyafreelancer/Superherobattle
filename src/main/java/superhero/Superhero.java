package superhero;

import lombok.Data;

@Data
public abstract class Superhero {

    private String name;
    private int force;
    private Label label;

    public abstract void useSuperPower();

    public abstract void fly();

}
