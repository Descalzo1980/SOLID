public class WebFramework {
    public void save(IForm iForm){
        ISQL db = new MySQL() {
        }; // �������� ����� ���������� � ��
        db.save(iForm);
    }
}
