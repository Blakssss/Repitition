package OOPArv;

public class DenDerArver extends Arv {
    int first = 10;
    double second = 1.5;

    public DenDerArver(int i) {
        super();
    }

    @Override
    public void print(){
        super.print();
    }
    public void isInstanceOf(){
        DenDerArver denDerArver2 = new DenDerArver(2);
            if(denDerArver2 instanceof Arv){
                System.out.println("it is indeed an instance of " + denDerArver2);
            }
        }

   public void casting(){
       System.out.println(first);
       System.out.println(second);
       first = (int)second;
       System.out.println(first);
       second = first;
       System.out.println(second);
   }

    public static void main(String[] args) {
        new DenDerArver(1).print();
        new DenDerArver(3).isInstanceOf();
        new DenDerArver(3).casting();
    }
}
