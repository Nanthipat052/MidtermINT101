import java.util.InputMismatchException;
import java.util.Scanner;
public class section5 {
    public static void main(String[] args) {


    //EXCEPTION การจัดการข้อผิดพลาด
    //try    catch
    //case 1 mathmatic
    int a = 10;
    int b = 0; 
    int c = a/b;
    System.out.println(c);

    //case 2 outofpositionArray
    int[] item = {10,20,30};
    System.out.println(item[100]);
    
    //case 3 Fill String in Scanner but set for Int
    Scanner sc = new Scanner(System.in);
    int bsc = sc.nextInt();
    System.out.println(bsc);


    //EXCEPTION (try...catch)
    //ArrayIndexOutOfBoundsException,ArithmeticException,InputMissmatchException
    //ZeroDivisionException,IOException,FileNotFoundException

    try{ //try
    int ae = 10; 
    int be = 2;
    int ce = ae/be;
    System.out.println(ce);

    int[] itemex = {10,20,30};
    System.out.println(itemex[100]);

    Scanner scex = new Scanner(System.in);
    int bscex = sc.nextInt();
    System.out.println(bscex);

    }catch(ArithmeticException e){ //if happen exception go to catch
        System.out.println("Cant divine by 0");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Out of bound");
    }
    catch(InputMismatchException e){
        System.out.println("Out of bound");
    }
    catch(Exception e){ //ทุก exception สามารถลงที่นี่
        e.printStackTrace();//ให้จาวาบอกว่าเออเร่ออะไร
    }


    //finally (ใช้กับ try catch) เมื่อไม่เกิดข้อผิดพลาดหรือเกิดก็จะทำคำสั่งนี้ทุกครั้ง
    //คำสั่งที่ระบุมักเป็นส่วนสำคัญโปรเเกรม  เช่น ปิดไฟล์ ปิดการเชื่อมฐานข้อมูล
    //คำสั่ง disconnect กับ server
     try{ //try
        Scanner trysc = new Scanner(System.in);
        System.out.println("num is :");
        int numtry = trysc.nextInt();
        System.out.println(numtry);
    }catch(ArithmeticException e){ //if happen exception go to catch
        e.printStackTrace();
    }
    finally{
        System.out.println("Program final");
    }


    //จัดการ Exception ด้วย throw
    //โยนสิ่งผิดปกติออก ใช้ throw สร้าง
    try{
        Scanner th = new Scanner(System.in);
        int thi = th.nextInt();
        System.out.println(thi);
        if(thi < 0){
        throw new Exception("Pls give more than zero");
    }
    }
    catch (Exception e){
        e.printStackTrace();
    }


 
}
}