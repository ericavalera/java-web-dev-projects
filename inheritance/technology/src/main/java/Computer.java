public class Computer {
    private String name;
    private String model;
    private String operatingSystem;


    // constructor
    public Computer(String name, String model, String operatingSystem){
        this.name = name;
        this.model = model;
        this.operatingSystem = operatingSystem;

    }

    //    getters & setters

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//TODO methods


}
