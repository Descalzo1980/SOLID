public class Computer {
    String name;
    int memorySize;

    public Computer(String name, int memorySize) {
        this.name = name;
        this.memorySize = memorySize;
    }

    /*для нарушения третьего принципа*/
    public void setData(String name){
        this.name = name;
    }
}
