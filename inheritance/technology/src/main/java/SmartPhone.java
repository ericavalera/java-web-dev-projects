public class SmartPhone extends Laptop {
    private boolean isFlipPhone = true;

    // constructors
    public SmartPhone(String processor, String name, String model,
                      int releaseDate, int memory, int serialNum) {
        super(processor, name, model, releaseDate, memory, serialNum);
    }

    // getters & setters
    public boolean isFlipPhone() {
        return isFlipPhone;
    }

    public void setFlipPhone(boolean flipPhone) {
        isFlipPhone = flipPhone;
    }

    //    methods
    public String replace() {
        if (!isFlipPhone) {
            return "is not a flip phone";
        } else {
            return "is a flip phone";
        }


    }
}
