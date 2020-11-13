
import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import java.io.File;
import java.util.Scanner;

public class LoginSystem {

    private static Scanner x;
    private static Scanner z;
    Scanner r = new Scanner(System.in);

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your username : ");
        String username = sc.nextLine();
        System.out.print("Enter your password : ");
        String password = sc.nextLine();
        String filepath = "D:\\Assignment-Pro-2\\coach.dat";

    boolean flag = false;
    String found = "Your username or password may be incorrect";
    String tempUsername = "";
    String tempPassword = "";

    
    
        try{
        x = new Scanner(new File(filepath));

        x.useDelimiter("[,\n]");
        while (x.hasNext()) {
            tempUsername = x.next();
            tempPassword = x.next();
            if (tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim())) {
                found = "Login Successfull";
                flag = true;
            }
        }
        x.close();
        System.out.println(found);

    }
    catch(Exception e)
    {
                System.err.println("Error");

    }

}
