
public class Laptop extends Computer{
    private static final String operatingSystem = "Mac OSX" ;
    private String processor;
    private int releaseDate;
    private int memory;
    private int serialNum;

//TODO fix constructor
    public Laptop(String processor, String name, String model, int releaseDate, int memory, int serialNum) {
        super(name, model, operatingSystem);
        this.processor = processor;
        this.releaseDate = releaseDate;
        this.memory = memory;
        this.serialNum = serialNum;

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



    //    methods
    public String old() {
        if (releaseDate > 3) {
            return "computer should be updated";
        } else {
            return "computer is up to date";
        }
    }
        public String replaceMem(){
            if(memory < 1){
                return "Need to add memory to hardisk";
            }else{
                return "memory is fine!";
            }
        }
    }
