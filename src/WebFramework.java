public class WebFramework {
    public void save(IForm iForm){
        ISQL db = new MySQL() {
        }; // условный метод сохранения в БД
        db.save(iForm);
    }
}
