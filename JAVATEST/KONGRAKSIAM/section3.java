public class section3 {
    
    public static void main(String[] args) {  
        summation(10, 20,30);

        //argument return 
        connectServer(100);
    }

    //VARIABLE ARGUMENT
    //modifier type method name (type...arr){}
    public static void summation(int a,int b){
        int sum = a+b;
        System.out.println("sum ="+sum);
    }
    //cant do
    //make new method but not same parameter
    public static void summation(int a,int b,int c){
        int sum = a+b;
        System.out.println("sum ="+sum);
    }
    //make it easy!!!!!!!!!!!!!!!! use ...
    public static void summation(int...num){
        // ... mean so many argument
        int sum = 0;
        for (int i = 0; i<num.length; i++){
            sum += num[i];
        }
        System.out.println(sum);
    }


    //RETURN

    //โยนค่าออกมาจาก method เก็บในตัวเเปร หรือ เเสดงผลก็ได้
    //ex. method check connect server
    public static void connectServer(int ping){
        System.out.println("connect server " + ping);
        if(ping>100){
            return;
        }
        // ไม่ทำงานเพราะ return ไปก่อนหน้า กระโดดออกจากตัว method
        System.out.println("เชื่อมต่อกับserver");
    }
}
