import java.time.LocalDate;

public abstract class TransportPass {
    private String passId;
    private String ownerName;
    private LocalDate validUntil;

    public TransportPass(String passId, String ownerName, LocalDate validUntil) {
        this.passId = passId;
        this.ownerName = ownerName;
        this.validUntil = validUntil;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void setPassId(String newPassId) {
        this.passId = newPassId;
    }
    public String getPassId() {
        return passId ;
    }

    public void setOwnerName(String newName) {
        this.ownerName = newName;
    }
    public String getOwnerName() {
        return ownerName ;
    }

    public abstract double calculateFare(UsagePolicy policy);
}
