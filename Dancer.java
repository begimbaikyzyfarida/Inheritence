public class Dancer extends Person{

    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String companyName) {
        this.groupName = companyName;
    }

    public void dancing(){
        System.out.println("type of dancing: " + getDesignation());
    }

    @Override
    public void learn() {
        System.out.println("learn: dancing");
    }

    @Override
    public void walk() {
        System.out.println("walk: Street");
    }

    @Override
    public void eat() {
        System.out.println("eat: Fruits, veggies, legumes, nuts, and seeds");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Profession: Dancing\n" +
                "Company: " + groupName + "\n";
    }
}
