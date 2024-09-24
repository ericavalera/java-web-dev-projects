
public class Laptop extends Computer{
    private String processor;
    private int releaseDate;
    private int memory;
    private int serialNum;
    private boolean isMac;

//TODO fix constructor
    public Laptop(String name, String model, int releaseDate, int memory, int serialNum) {
        super(name, model, operatingSystem );
        this.processor = processor;
        this.releaseDate = releaseDate;
        this.memory = memory;
        this.serialNum = serialNum;
        this.isMac = isMac;

    }


    //    getters and setters
    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String aProcessor) {
        processor = aProcessor;
    }
    public int getReleaseDate(){
        return releaseDate;
    }
    public void setReleaseDate(int aReleaseDate){
        releaseDate = aReleaseDate;
    }
    public int getMemory(){
        return memory;
    }
    public void setMemory(int aMemory){
        memory = aMemory;
    }
    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int aSerialNum) {
        serialNum = aSerialNum;
    }

    public boolean isMac() {
        return isMac;
    }
    public void setMac(boolean mac) {
        isMac = mac;
    }

    //    methods
    public String old(){
        if( releaseDate > 5){
            return "computer should be updated";
        } else {
            return "computer is up to date";
        }
    }
}