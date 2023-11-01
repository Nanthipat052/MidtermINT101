public class Kk011066 {
    public static void main(String[] args) {
        //This day
        //conditional math/random exception
        demoIf();

    }
    static void demoIf(){
        double d = Math.random();
        System.out.println("d ="+ d);
        if(d<0.5){
            System.out.println("d < 0.5");
        }
        else{
            System.out.println("d>0.5");
        }
    }
}