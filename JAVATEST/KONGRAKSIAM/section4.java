public class section4 {
    public static void main(String[] args) {


    //เจาะลึก CHARACTER

    //สร้าง object character ด้วย class
    //เช็ครูปเเบบตัวอักษรด้วย isletter,isdegit
    //isUpperCase,isLowerCase
    //toUpperCase,toLowerCase
    char alphabet='a';
    char[] group = {'A','B','C'};
    System.out.println(alphabet);
    System.out.println(group[1]);

    //สร้างในรูปเเบบ OBJ
    Character alphabett = new Character('3');
    char c = 'B';

    //เป็นตัวอักษรหรือไม่
    System.out.println(Character.isLetter(alphabett));
    System.out.println(Character.isLetter(c));
    //เป็นตัวอักษรเลขหรือไม่
    System.out.println(Character.isDigit(alphabet));

    //CHECK Upper,Lower case
    if(Character.isUpperCase(c)){
        System.out.println("Uppercase");
    }
     if(Character.isLowerCase(c)){
        System.out.println("Lowercase");
    }

     //TO UPPER,LOWER CASE เเปลงเป็น
    Character k = new Character('k');
    char result = Character.toUpperCase(k);
    System.out.println(result);


    //เจาะลึก STRING
    String name = "Kongraksiam";
    //OBJ 
    String city = new String("Rayong");
    System.out.println(city);


     //CONCATENATION => ต่อstring
    String results = name+city;
    System.out.println(results);

    System.out.println(results.concat("INTHAI"));


    //หาความยาว STRING
    String citys = "MONACA";
    int count = citys.length();
    System.out.println(citys.length());//length รวมพื้นที่ว่างด้วย
    


    //หาตำเเหน่งตัวอักษรใน STRING (charAt)
    String longT = "longtext";
    System.out.println(longT.charAt(3));//นับเเบบ array 0 1 2 3
    

    
    //เปรียบเทียบ STRING (equals & equalsIgnoreCase)
    String name1 = "Kongraksiam";
    String name2 = "KongraKsiam";
    boolean resultss = name1.equals(name2); //คิด case sensitive
    boolean resultssig = name1.equalsIgnoreCase(name2); // ไม่คิด case sensitive
    System.out.println(resultss); 
    System.out.println(resultssig);


    //Find ข้อความที่อยู่หน้าสุด (startsWith)
    String fullname = "Witthawin";
    boolean resultnamesta = fullname.startsWith("Wit");
    System.out.println(resultnamesta);
    //Find ข้อความที่อยู่ท้ายสุด (endsWith)
    boolean resultnameend = fullname.endsWith("win");
    System.out.println(resultnameend);


    //หาตำเเหน่งคำในข้อความ (IndexOf)
    //ได้ตำเเหน่งตัวเเรก
    int resultsss = fullname.indexOf("tha");
    System.out.println(resultsss);


    //เจาะลึกSTRING PART2
    //เเทนที่ข้อความ(replace,replaceFirst)
    String message = "2020 2020 2022 2022 2024";
    message = message.replace("2020", "2018");
    System.out.println(message);//เปลี่ยน 2020 ทุกตัวที่เจอ
    message = message.replaceFirst("2022", "2036");
     System.out.println(message);//เปลี่ยน 2022 ตัวเเรกที่เจอ

    //การหั่น STRING(split)
    String fruit = "mango,apple,orange";
    //หั่น String โดยใช้ , เเบ่ง
    String[] fruitone = fruit.split(",");//change string to array
    //can choose sign of split
    System.out.println(fruitone[0]);

    //หาข้อความย่อย(subString)
    String namesp = "kongraksiam";
    String resultnamesp = namesp.substring(0, 4);
    System.out.println(resultnamesp);

    //เเปลง STRING เป็น CHARACTER (toCharArray)
    String STC = "kongraksiam";
    char [] STCC = STC.toCharArray();
    System.out.println(STCC);
    System.out.println(STCC[8]);

    //เเปลง CHARACTER เป็น STRING
    char [] CTS = {'k','o','n','g'};
    String resultCTS = String.copyValueOf(CTS);
    System.out.println(resultCTS);

    //การตัดช่องว่างใน STRING
    String namespace = "    kongraksiam    ";
    namespace = namespace.trim();
    System.out.println(namespace.length());
    System.out.println(namespace);

    //เเปลงเป็นตัวพิมพ์เล็ก - ใหญ่
    String textsmall = "kongRaksiaM";
    System.out.println(textsmall.toUpperCase());
    System.out.println(textsmall.toLowerCase());

    //เเปลงตัวเลขเป็น STRING(valueOf)
    int a = 546;
    String re = String.valueOf(a);
    System.out.println(re);
    }


    
}
