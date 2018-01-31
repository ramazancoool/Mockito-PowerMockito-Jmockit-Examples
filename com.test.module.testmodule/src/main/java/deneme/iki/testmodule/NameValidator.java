package deneme.iki.testmodule;

public class NameValidator {
	 
    private NameValidator() {
 
    }
 
    public static Boolean isNameValid(String name) {
        return name.matches("^[a-zA-Z]+$");
    }
 
}