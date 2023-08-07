public class Programmer extends Person {

    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void coding(){
        System.out.println("Type of programming: " + getDesignation());
    }

    @Override
    public void learn() {
        System.out.println("learn: Programmer");
    }

    @Override
    public void walk() {
        System.out.println("walk: Office");
    }

    @Override
    public void eat() {
        System.out.println("eat: Oily fish, such as trout, salmon, sardines, and mackerel, flax seeds (For vegetarians), walnuts ");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Profession: Programmer\n" +
                "Company: " + companyName + "\n";
    }
}
