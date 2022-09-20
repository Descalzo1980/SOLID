public class SaveComputerToDB implements SaveInterface{
    public void save(String path,Computer computer){
        System.out.println("Файл сохранен в базу данных " + path + ", " + computer);
    }
}

