public interface ISQL {
    default void save(IForm iForm){
        System.out.println("Запись в базу данных");
    }
}
