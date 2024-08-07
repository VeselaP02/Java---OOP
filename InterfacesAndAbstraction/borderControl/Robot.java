package InterfacesAndAbstraction.borderControl;

public class Robot implements Identifiable{

    private final String model;
    private final String id;

    public Robot(String model, String id) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public String getModel() {
        return model;
    }
}
