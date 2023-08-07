public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this. bandName= bandName;
    }

    public void singing(){
        System.out.println("Music: " + getDesignation());
    }
    public void playGitar(String name){
        System.out.println("Type of Guitar: " + name);
    }

    @Override
    public void learn() {
        System.out.println("learn: to play guitar and singing");
    }

    @Override
    public void walk() {
        System.out.println("walk: Theater");
    }

    @Override
    public void eat() {
        System.out.println("eat: Fruits and vegetables, whole grains and beans, and moderate amounts of healthy fats and oils");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Profession: Singer\n" +
                "Company: " + bandName + "\n";
    }

}
