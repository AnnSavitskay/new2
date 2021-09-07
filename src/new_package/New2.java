package new_package;
import java.util.Scanner;

class New1 {
    void str(){
        System.out.println("Hello, nice to meet you");
    }
}

public class New2{
    static int a;
    static void str()
    {
        a = 5;
        System.out.println("HEEELLOOO");
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        str();
        a = 10;
        System.out.println(a);
        New1 new1;
        new1 = new New1();
        new1.str();
        System.out.println("Hello world");
        Scanner scan = new Scanner(System.in);
        String ans = scan.nextLine();
        System.out.println(ans);
        New3 new3;
        new3 = new New3();
        new3.str();
    }
}

/*class New3 {
    New1 new1;
    void str()
    {
        new1 = new New1();
        new1.str();
        System.out.println("Hello again");
    }
}*/
