public class OmenHP extends Computer{
    public OmenHP(String name, int memorySize) {
        super(name, memorySize);
    }

    @Override
    public void setData(String name) {
        this.name = name;
        this.memorySize = 8000;
        /*это ошибка так делать*/
    }
}
