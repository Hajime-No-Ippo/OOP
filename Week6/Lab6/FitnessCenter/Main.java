public class Main {
    public static void main(String[] args) {
        MemberShip m = new MemberShip("Tom", 50, "Dublin", true);
        MemberShip n = new MemberShip("Alex", 500, "Dublin", true);
        MemberShip p = new MemberShip("Peter", 20, "Dublin", true);
        MemberShip c = new MemberShip("John", 7, "Dublin", true);

        BallGameClass bgc = new BallGameClass("FC0023", "Football", c);
        bgc.chargeFee();
        bgc.printFee();

        c.chargeBalance(10.0);

        YogaClass vgn = new YogaClass("YG002DS3", "Yoga", n);
        vgn.chargeFee();
        vgn.printFee();

        FitnessClass fnm = new FitnessClass("0023", "Running", m);
        fnm.chargeFee();
        fnm.printFee();
    }
}
