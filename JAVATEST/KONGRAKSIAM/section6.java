import java.io.*; //import java.io.*
public class section6 {
    public static void main(String[] args) {
        File f = new File("demoFileWriter.txt");//file position
    //JAVA I/O (จัดการ File)
    try{

        //FileWriter
        FileWriter writer = new FileWriter(f);//สร้างfile ชื่อ demo.txt
        //FileWriter writer = new FileWriter(new File("demoFileWriter.txt"));

        writer.write("Hello world");//write file
        writer.close();//close file
        System.out.println("Final");
    }catch(Exception e){
        e.printStackTrace();
    }
    
    //FileReader
    try{
        FileReader reader = new FileReader(f);
        //FileReader read = new FileReader(new File("demoFileWriter.txt"));
        int data; //เก็บค่า unicode จากไฟล์ที่ไปอ่าน

        while((data = reader.read())!= -1){ //read file
            System.out.println(data); //print unicode
            System.out.printf("%c\n,data"); //change code to text
            //printf is mean format string
            //%c is กลุ่มข้อความ  , %d is เลขฐาน 10
        }
    }
    catch(FileNotFoundException  e){
        System.out.println("Cant found file");
    }
    catch(Exception e){
        System.out.println("Cant found file");
    }
}
}
