import java.util.Scanner;

public class section1 {
    public static void main(String[] args) {
        //SYSTEMOUT PRINTLINE

        System.out.print("Welcome to");//no next line
        System.out.println("Kongraksiam studio");


        //COMMENT

        // this is comment

        //VARIABLE AND DATATYPES
            //class
                //First text is uppercase
            //data 
                //all text is lowercase
            //constant
                //all text is uppercase


       //VARIABLE

       int num;
       num = 50; //fix variable value
       boolean status;
       status = false;
       char alphabet;
       float num2;
       double num3;
       //more variable in one line
       int a =0 , b = 5 , c = 9;


       //SHOW VARIABLE

       System.out.println(a+b+c);


       //CONSTANT VARIABLE(final)

       final int numf = 6;
       System.out.println(numf);


       //RULE OF NAME VARIABLE

          //num,text,mark
          //opening word not num or specialtext but can use undercase _
          //not same keyword of java
          //case sensitive
        int upperCase = 6;


        //MIN-MAX VALUE OF EACH VARIABLE

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);


        //TYPE CASTING

        //1. widening casting  (small data to big data) auto
        //byte->short->char->int->long->float->double
        //2. narrowing casting  (big info to small info) do
        //double->float->long->int->char->short->byte
        int numInt = 10;
        double numDouble = numInt;
        System.out.println(numInt);
        System.out.println(numDouble);//int to double

        double numDouble1 = 10.0;
        int numInt1 = numDouble1; //cant do
        int numInt2 = (int)numDouble1;
        System.out.println(numInt2);


        //STRING เก็บชุดข้อความ 

        //char เรียงต่อกัน (เก็บอักษร) -> string 
        String as = "ABC",bs="200";
        // bst = bs+50 // '200'+50 = 20050
        int bsn; 
        bsn = Integer.parseInt(bs); //change to int
        System.out.println(as);
        System.out.println(bs);


        //CHECK VARIABLE TYPE
        Integer asw = 5;
        boolean result = asw.toString() instanceof String;
        //instance of
        System.out.println(result);


        //INPUT SCANNER
        //import scanner class 
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();//รับค่าจากเเป้นพิมพ์
        //if next(); //อ่านข้อความที่รับจากเเป้นพิมทั้งบรรทัด
        int numb = sc.nextInt();


        //ESCAPE CHARACTER
        /*
         \n  -> next line
         \t  -> tab
         */
        System.out.println("hello\nworld\tnaja");

        //OPERATION

       //operation (Arithmatic)
       System.out.println(9+9); //18
       System.out.println(9-6); //3
       System.out.println(6*8); //48
       System.out.println(8/2); //4
       System.out.println(6%2); //0

       //operation (unary)
       int z = 5;
        ++z; //implement+ prefix
        --z; //decliment- postfix
        z++;
        z--;
        System.out.println(z);

        //operation (assignment)
        // = , += , -= , *= , /= , %=
        z += 3;

        //operation (comparison)
        // == , != , < , > ,<= , >=
        System.out.println(z <= z);
  
        //operation (logical)
        // ! , && , ||
        boolean tf = true;
        System.out.println(!tf);//false


      //conditionalstatement(if else)
      int conditionn = 5;
      if(conditionn > 0){
         System.out.println("na");    
      }
      else if(conditionn == 5){
         System.out.println("ha");
      }
      else{
         System.out.println("error");
      }
     
     //conditionalstatement(switch)
     switch (conditionn){
         case 1:
         System.out.println("one");
         case 5:
         System.out.println("ha");
     }
 
     //Loop (while)
     int wh = 10;
     while(wh > 6){
         System.out.println("morethan");
     }
     //Loop (do while)
     do{
         System.out.println("morethan");
     }while(wh>9);
     //Loop (for(initialization; condition; update;))
     for(int i = 3; i<=9; i++){
         System.out.println(i);
     }

     //BREAK -> stop loop to run next code
     int i = 4;
     if(i==5)break;
     //CONTINUE -> stop loop but return run start loop again
     if(i%2==0)continue;
     //USE IN LOOP


    }
}