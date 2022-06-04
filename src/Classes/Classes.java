package Classes;

public class Classes {
    int number;
    double moreNumber;
    String name;

    public Classes(int number,double moreNumber,String name){
        this.number=number;
        this.moreNumber=moreNumber;
        this.name=name;
    }
    //METHODS
    public void print(double moreNumber){
        number=2;
        moreNumber=2.2;
        name="name";
        System.out.println(number);
        System.out.println(moreNumber);
        System.out.println(name);

        setNumber(4);
        setMoreNumber(2.22);
        setName("newName");
        System.out.println(number);
        System.out.println(moreNumber);
        System.out.println(name);
    }
    //OVERLOADING METHOD BY HAVING DIFFERENT PARAMETERS
    //THIS IS ALSO POLYMORPHISM BECAUSE THE METHODS DO DIFFERENT THINGS
    public void print(int number){
        number=2;
        moreNumber=2.2;
        name="name";
        System.out.println(number + moreNumber + name);

        setNumber(4);
        setMoreNumber(2.22);
        setName("newName");
        System.out.println(number + moreNumber + name);
    }

    //GETTERS
    public int getNumber() {
        return number;
    }
    public double getMoreNumber() {
        return moreNumber;
    }
    public String getName() {
        return name;
    }
   //SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public void setMoreNumber(double moreNumber) {
        this.moreNumber = moreNumber;
    }
    public void setNumber(int number){
        this.number=number;
    }
    //TOSTRING
   public String toString(){
        return "This is a toString: " + number + " " + moreNumber + " " + name;
   }

    public static void main(String[] args) {
        new Classes(10,2.344,"me").print(10);
        new Classes(20,60,"you").print(3.66);
        //We create 2 instances of the Classes class. the second one we give the same value as the first one
        //Thereby the second one is now referring to the first one for its values
        Classes objectReference = new Classes(5,5.5,"here");
        Classes objectReference2 = objectReference;

        //We make an array of class objects and print them
        Classes[] array;
        array = new Classes[2];
        array[0] = objectReference;
        array[1] = objectReference;
        System.out.println(array[0] + " " + array[1]);
    }

}
