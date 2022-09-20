public class SaveComputerToFile implements SaveInterface{
    public void save(String path,Computer computer){
        System.out.println("Файл сохранен в файл " + path + ", " + computer);
    }
}

/*
* вывели метод сохранения в отдельный класс
* */
