import java.util.Scanner;

public class PasswordValidator 
{
    public static void main(String[] args)
	{
        String error1 = "The password may not contain the keywords password or 123456.";
        String error2 = "The password may not start with the keyword qwerty but it may contain it.";
        String error3 = "The password must be longer than 8 characters.";
        String error4 = "The password must contain at least one of the following special characters: $, @ or !.";
        String success = "The password is valid!";

        // Implement your password validator here!
		String Message = " ";
		String Password = " ";
		
		System.out.print("Your password: ");
		Scanner input = new Scanner(System.in);
		Password = input.nextLine();
		Password = Password.toLowerCase();
		int PassLength = Password.length();
		
		
		if (Password.contains("password") ||Password.contains("123456"))
			Message = "The password may not contain the keywords password or 123456.";
		else if (Password.startsWith("qwerty") )
			Message = "The password may not start with the keyword qwerty but it may contain it.";
		else if (PassLength <= 8)
			Message = "The password must be longer than 8 characters.";
				
		else if (!Password.contains("@")&&!Password.contains("$")&&!Password.contains("!"))
			Message = "The password must contain at least one of the following special characters: $, @ or !.";
		else 
			Message = "The password is valid!";
		
		System.out.println(Message);
    }
}