public class Zoo {
    private String name = "no name";
    private String size; //small , middle , big
    private String typeAnimals;
    private double visitors;
    private double animals;
    private static double totalNumberOfAnimals = 0;

    public Zoo() {
    }

    public Zoo(String name, String size, String typeAnimals, double visitors) {
        setName(name);
        setSize(size);
        setTypeAnimals(typeAnimals);
        setVisitors(visitors);
    }

    public Zoo(String name, String size, String typeAnimals, double visitors, double animals) {
        setName(name);
        setSize(size);
        setTypeAnimals(typeAnimals);
        setVisitors(visitors);
        setAnimals(animals);
    }

    public String toString() {
     return "Zoo is called " + name + "its size -" + size + ".There are such animals in the zoo :" + typeAnimals +
             visitors + "visitors come every day" + "In the Zoo" + animals + "animals " ;
    }
    static void printStaticSum(){
        System.out.println("The Zoo can hold" + totalNumberOfAnimals+ "animals" + " tons\n" );
    }
    public void printSum(){
        System.out.println("The Zoo" + name + "have" + animals + "animals" + "all can accomodate" + totalNumberOfAnimals );
    }
    public void resetValues(String name, String size, String typeAnimals, double visitors, double animals){
        setName(name);
        setSize(size);
        setTypeAnimals(typeAnimals);
        setVisitors(visitors);
        setAnimals(animals);
    }

    public String getName(){
        return name ;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size) {
        this.size = size ;
    }
    public String getTypeAnimals(){
        return typeAnimals;
    }
    public void setTypeAnimals(String typeAnimals) {
        this.typeAnimals = typeAnimals;
    }
    public double getVisitors(){
        return visitors;
    }
    public void setVisitors(double visitors) {
        this.visitors = visitors;
    }
    public double getAnimals(){
        return animals;
    }
    private void setAnimals(double animals) {
        this.animals = animals ;
    }

    public void setTotalNumberOfAnimalsdouble(double totalNumberOfAnimals) {
        totalNumberOfAnimals -= this.totalNumberOfAnimals;
        totalNumberOfAnimals += totalNumberOfAnimals;
        this.totalNumberOfAnimals=totalNumberOfAnimals;
    }
}
