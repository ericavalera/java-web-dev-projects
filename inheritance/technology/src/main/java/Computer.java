public class Computer {
    private String model;
    private String operatingSystem;
    private String category = "Technology";
    private boolean isDesktop;
    private boolean heavy = false;

    // constructor
    public Computer(String model, String operatingSystem, String category, boolean isDesktop, boolean heavy){
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.category = category;
        this.isDesktop = isDesktop;
        this.heavy = heavy;
    }
//    getters & setters

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
    public String getCategory(){
        return category;
    }
    public boolean getIsDesktop(){
        return isDesktop;

    }
    public void setIsDesktop(boolean aIsDesktop){
        isDesktop = aIsDesktop;
    }
    public boolean getHeavy(){
        return heavy;
    }
    public void setHeavy(boolean aHeavy){
        heavy = aHeavy;
    }

// methods

    public boolean isHeavy(){
        if (isDesktop = true){
            heavy = true;
        }
        return heavy = false;
    }

    public String noise (){
        return "no noise";
    }
}
