public class SaveComputer {
    public void saveToFile(String path,Computer cmp){
        System.out.println("Файл сохранен в " + path + ", " + cmp);
    }

    public void saveToBD(String path,Computer cmp){
        System.out.println("Файл сохранен в БД" + path + ", " + cmp);
    }
}

/*
* вывели метод сохранения в отдельный класс
* */
