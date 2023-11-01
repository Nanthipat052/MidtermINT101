import java.io.*; //import java.io.*
public class section7 {
    public static void main(String[] args) {
        File f = new File("demoFileWriter.txt");//file position
        //Buffered Reader

        try{

            FileWriter writer = new FileWriter(f);
            //BufferedWriter(เขียนไฟล์ที่มีขนาดใหญ่เเละรวดเร็วกว่่า writer)
            //นำBufferedครอบWriter
            BufferedWriter bwrite = new BufferedWriter(writer);
            bwrite.write("Hello world\n");
            bwrite.write("Program learn\n");
            bwrite.write("By kongraksiam");
            bwrite.close(); //write and close at Buffered
            System.out.println("Final");
        }catch(Exception e){
            e.printStackTrace();
        }
        
        //BufferedReader(เป็นการอ่านทีละบรรทัดเเละเก็บข้อมูลในรูปเเบบ String)
        try{
            FileReader reader = new FileReader(new File("demoFileWriter.txt"));
            BufferedReader brread = new BufferedReader(reader);
            String message="";

            while((message = brread.readLine()) != null){ //อ่านมาทีละบรรทัด
                System.out.println(message);
            }
        }
        catch(Exception  e){
            System.out.println("Cant found file");
        }
    }
}
