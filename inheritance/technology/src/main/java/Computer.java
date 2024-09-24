public class Computer {
//   TODO: condense this down
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
    public String getName(){
        return name;
    }
    public void setName(String aName){
        name = aName;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String aModel){
        model = aModel;
    }
    public String getOperatingSystem(){
        return operatingSystem;
    }
    public void setOperatingSystem(String aOperatingSystem) {
        operatingSystem = aOperatingSystem;
    };


//TODO methods

    public String noise (){
        return "no noise";
    }
}
