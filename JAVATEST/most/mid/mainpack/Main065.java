package mainpack;

import obj.pornput.Obj065;
import unti.pornput.Unti065;

class Main065 {
    public static void main(String[] args) {
        testZ();
    }

    private static void testZ() {
        System.out.println(Unti065.compute065RightTriangleArea(-1, 1));
        System.out.println(Unti065.compute065RightTriangleArea(1, -1));
        System.out.println(Unti065.compute065RightTriangleArea(1, 1));

        System.out.println(Unti065.evalute065(101)); // X
        System.out.println(Unti065.evalute065(80)); // A
        System.out.println(Unti065.evalute065(70)); // B
        System.out.println(Unti065.evalute065(60)); // C
        System.out.println(Unti065.evalute065(50)); // D
        System.out.println(Unti065.evalute065(0)); // E
        System.out.println(Unti065.evalute065(-1)); // X

        System.out.println(Unti065.computeMagicPornput(1, 3, 2)); // 7
        // 1 + (1+1) + (1+3) = 7

        Obj065 o1 = new Obj065("065", "Pornput", 1000);
        Obj065 o2 = new Obj065("065", "Pornput", 2000); // 2000
        Obj065 o3 = o2; // value = 2000
        System.out.println(o1.getId065());
        System.out.println(o1.getNamePornput());
        System.out.println(o1.getValue065());

        o1.setId065("123");
        o1.setNamePornput("Sood");
        o1.setValue065(3000);

        System.out.println(o1.getId065());
        System.out.println(o1.getNamePornput());
        System.out.println(o1.getValue065());

        System.out.println(Obj065.compare(o2, o3));// 2000 == 2000 =  0
        System.out.println(Obj065.compare(o1, o2)); // 3000 > 2000 =  1
        System.out.println(Obj065.compare(o2, o1)); // 2000 < 3000 = -1

        System.out.println(o1.isGreaterThan(o2)); // true
        System.out.println(o2.isGreaterThan(o1)); // false
        System.out.println(o2.isGreaterThan(o3)); // false
        
        System.out.println(o1);
        System.out.println(o2);
    }

}