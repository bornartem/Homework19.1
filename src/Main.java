import exc.WrongLoginException;
import exc.WrongPassException;

public class Main {
    private final static String PATTERN = "[\\w]+";
    public static void main(String[] args) {
        try {
            auth("Rocky","Pass", "Pass!");
        } catch (WrongLoginException | WrongPassException e){
            System.out.println(e.getMessage());
        }
    }

    public static boolean auth(String login, String pass, String confirmPass) throws WrongLoginException, WrongPassException {
if(!login.matches(PATTERN)){
    throw new WrongLoginException("Invalid login");
}
if (!pass.matches(PATTERN)){
    throw new WrongPassException("Invalid pass");
}
if(!confirmPass.equals(pass)){
    throw new WrongPassException("Invalid pass");
}
return true;
    }
}