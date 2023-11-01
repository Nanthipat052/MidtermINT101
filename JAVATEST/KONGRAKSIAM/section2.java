public class section2 {
    public static void main(String[] args) {


        //ARRAY
        //can collect more element
        // each element collect value and index (index tell where element)
        //index Location reference element (start 0)
        //member in array should same data type
        //separated by ,

        //เเบบกำหนดสมาชิก
        int[] numm = {10,20,30};
        numm[1] = 50;
        String[] animal = {"cat","dog","hen"};
        animal[0] = "turtle";

        //เเบบกำหนดขนาดเอาไว้เเล้วเซตค่าทีหลัง
        int[] number= new int[4];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        System.out.println("number is: "+number[2]);


        //ARRAY MEMBER
        System.out.println(animal.length);
        boolean[] status={true,false,true};
        System.out.println(status.length);


        //ACCESS MEMBER ARRAY WITH FOR LOOP
        String[] pet = {"cat","rabbit"};

        for(int i = 0; i<pet.length; i++){
            System.out.println(pet[i]);
        }


        //ACCESS MEMBER ARRAY ds WITH FOR EACH
        for(String data : pet){
            System.out.println(data);
        }

        int sum=0;
         for(int item : number){
            System.out.println(sum += item);
        }


        //ARRAY 2 มิติ
        // Array ที่มีข้อมูลภายในเป็น array (array ซ้อน array) เปรียบเสมือน matrix
        //มีโครงสร้างเเบบเเถวเเนวนอนเเละคอลัมน์เเนวตั้ง
        String[][] product = {
            //คอลัมน์0   คอลัมน์1   คอลัมน์2
            {"chair","table","light"},     // เเถว 0
            {"keyboard","mouse","cpu"},    // เเถว 1
            {"lipstic","rollon","cream"}   // เเถว 2
        };
        System.out.println(product[2][1]);
        //[line][column]
        product[2][1] = "CHANGE"; //change data

        //ACCESS DATA WITH LOOP
        for(int row = 0; row < product.length; row++){
            for(int column=0; column<product[row].length; column++){
                System.out.println("row:" +row+"column"+column+product[row][column]);
            }
        }
        //CALL METHOD
        method1();

        //ARGUMENT
        display("Kongraksiam");
        plus(200,300);

        //GET METHOD DATA
        double bonus=getBonus();
        int salary = 500;
        salary += bonus;
        System.out.println(salary);

        //METHOD รับเเละรีเทิร์นค่า
        maxNumber(50,40);

        //argument METHOD รับค่า ARRAY 
        int[] numberA = {10,20,30,40,50};
        displayArray(numberA);

        //argument METHOD รับค่า ARRAY เเละคืนค่า 
        int[] numberB = {10,20,30,40,50};
        System.out.println(findMaxArrayRE(numberB));
        System.out.println(findMinArrayRE(numberB));

        //argument method find maxvaluePOSITION in Array
        int[] numberP = {10,40,70,80,50};
        System.out.println(positionmaxvalueinArray(numberP));
        System.out.println(positionminvalueinArray(numberP));

        //argument method เปรียบเทียบระหว่าง 2 ARRAY
        int[] numberCA = {10,40,70,80,50};
        int[] numberCB = {10,20,30,40,50};
        System.out.println(compareArray(numberCA, numberCB));

        //argument METHOD SWAP VALUE IN ARRAY
        int[] numberS = {10,20,30};
        swapElement(numberS,0,2);

        //argument COPY ARRAY METHOD
        int[] numberPC = {10,40,70,80,50};
        int[] numberCP = copyArray(numberPC);
        displayArraycp(numberCP);

        //argument FIND ELEMENT IN ARRAY
        int[] findE = {100,400,700,800,500};
        System.out.println(searchElement(findE,500));

        String[] findST = {"Mango","Dog","Hen"};
       method1
        System.out.println(searchElementST(findST,"Dog"));
    }
    //METHOD
    //ชุดคำสั่งที่รอเรียกใช้งาน
    //1.methodที่ไม่มีการรับเเละส่งค่า
    //modifier void methodname(){}
    static void method1(){
        //กลุ่มคำสั่งที่อยากให้ทำงาน
        System.out.println("hello");
    }

    //methodที่มีการรับค่าเข้ามาทำงาน
    //modifier void methodname(parameter1,parameter2,...){}
    //argument is variable ที่ต้องการส่งค่ามาให้ method 
    //parameter is variable ที่ method สร้างไว้สำหรับรับค่าจาก argument
    static void display(String message){
        System.out.println(message);
    }

    static void plus(int a,int b){
        int c = a+b;
        System.out.println(c);
    }
    //void  ไม่รีเทิร์นค่า############


    //METHOD RETURN ค่า
    static String getIP(){
        return "127.0.0.1";
    }
    static Double getBonus(){
        return 1000.0;
    }
    

    //METHOD รับเเละรีเทิร์นค่า
    static int maxNumber(int a,int b){
        if(a==b){
            return a;
        }
        else if(a>b){
            return a;
        }
        else{
            return b;
        }
    }


    //METHOD รับค่า ARRAY
    //modifier void methodname (type[] arr){}
    static void displayArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("ลำดับที่ =" + i + "ค่า" + arr[i]);
        }
    }


    //METHOD รับค่า ARRAY เเละคืนค่า
    //modifier void methodname (type[] arr){}
     static int findMaxArrayRE(int[] arr){
        //หาค่าที่มากสุดในarray
        int maxValue = arr[0]; //เก็บค่าสูงสุดไว้เป็นค่าเเรก
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
     }

      static int findMinArrayRE(int[] arr){
        //หาค่าที่น้อยสุดในarray
        int minValue = arr[0]; //เก็บค่าสูงสุดไว้เป็นค่าเเรก
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<minValue){
                minValue = arr[i];
            }
        }
        return minValue;
     }


     //METHOD FIND POSITION IN ARRAY
     //data นี้อยู่ตำเเหน่งไหนใน array
     static int positionmaxvalueinArray(int[] arr){
        int maxIndex = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
     }

       static int positionminvalueinArray(int[] arr){
        int minIndex = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
     }


     //METHOD เปรียบเทียบสมาชิกใน Array
     static boolean compareArray(int[]a,int[]b){
        if(a.length != b.length) return false;
        for(int i = 0; i < a.length; i++){
            if(a[i] == b[i]){
                return true;
            }
        }
        return true;
     }


     //METHOD SWAP VALUE IN ARRAY
     static void swapElement(int[] a,int x,int y){
        // x = start
        // y = lastvalue
        // จัดเก็บตำเเหน่งชั่วคราว
        // 10 20 30
        //a 10 to 30
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
     } 


     //METHOD COPY ARRAY VALUE รับค่าเเละคืนค่า array
     static int[] copyArray(int[] a){
        // โยน array A = 6, array ใหม่ = 6 ช่อง
        int[] newArrc = new int[a.length];
        for(int i = 0; i < a.length; i++){
            newArrc[i] = a[i];
        }
        return newArrc;
     }
     
         static void displayArraycp(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    //FIND MEMBER IN ARRAY
    //num
    static int searchElement(int[] arr,int num){
        for(int i = 0; i<arr.length; i++)
        if(arr[i] == num){
            return i;
        }
        return -1;
    }
    //string
        static int searchElementST(String[] arr,String text){
        for(int i = 0; i<arr.length; i++)
        if(arr[i].equals(text)){
            return i;
        }
        return -1;
    }
}
