package factory;
import superhero.*;

public class Factory {
    public BatMan createBatMan() {
        BatMan batMan = new BatMan();
        batMan.setName("Брюс Уэйн");
        batMan.setLabel(Label.DC);
        batMan.setForce(5);
        batMan.useSuperPower();
        batMan.fly();

        return batMan;
    }

    public SpiderMan createSpiderMan() {
        SpiderMan spiderMan = new SpiderMan();
        spiderMan.setName("Питер Паркер");
        spiderMan.setLabel(Label.MARVEL);
        spiderMan.setForce(6);
        spiderMan.useSuperPower();

        return spiderMan;

    }

    public AquaMan createAquaMan() {
        AquaMan aquaMan = new AquaMan();
        aquaMan.setName("Артур Карри");
        aquaMan.setLabel(Label.DC);
        aquaMan.setForce(7);
        aquaMan.useSuperPower();

        return aquaMan;
    }

    public Hulk createHulk() {
        Hulk hulk = new Hulk();
        hulk.setName("Брюс Беннер");
        hulk.setLabel(Label.MARVEL);
        hulk.setForce(9);
        hulk.useSuperPower();

        return hulk;
    }

    public SuperMan createSuperMan() {
        SuperMan superMan = new SuperMan();
        superMan.setName("Кларк Кент");
        superMan.setLabel(Label.DC);
        superMan.setForce(10);
        superMan.useSuperPower();
        superMan.fly();

        return superMan;
    }

    public Wolverine createWolverine() {
        Wolverine wolverine = new Wolverine();
        wolverine.setName("Логан");
        wolverine.setLabel(Label.MARVEL);
        wolverine.setForce(8);
        wolverine.useSuperPower();

        return wolverine;
    }

}
