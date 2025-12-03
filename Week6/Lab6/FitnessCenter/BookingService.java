public abstract class BookingService {
    String className;
    String cId;
    protected MemberShip member;

    public BookingService(String cId, String className){
        this.className = className;
        this.cId = cId;
        this.member = member;
    }

    public abstract double getFee();
    public abstract String getDescription();
}
