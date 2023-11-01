import javax.print.attribute.IntegerSyntax;

public class section8 {
    public static void main(String[] args) {
        //การจัดการค่าทางคณิตศาสตร์
        //PI E
        System.out.println(Math.PI);
        System.out.println(Math.E);

        int r = 2;
        double area = Math.PI*r*r;
        System.out.println(area);

        //CHANGE TO POSITIVE
        int a = -30;
        System.out.println(Math.abs(a));

        //ปัดเศษ (ciel floor rint)
        double num = 14.4;
        System.out.println(Math.ceil(num));//upทุกกรณี
        System.out.println(Math.floor(num));//downทุกกรณี

        System.out.println(Math.rint(num));//> .5 ปัดขึ้น
        System.out.println(Math.rint(num));//<= .5 ปัดลง
        // >= .5 up <=.4 down (round)
        System.out.println(Math.round(num));

        //SQUARUTE
        int snum = 25;
        System.out.println(Math.sqrt(snum));

        //Power
        int pnum = 5;
        System.out.println(Math.pow(pnum,2));

        //Random
        double[] n = {2,4,6,8,10,12,14,16,18,20};
        double numr = for (var each : collection) {
            
        }
        
         numr = Math.random();
        System.out.println(numr);

    }
    }

