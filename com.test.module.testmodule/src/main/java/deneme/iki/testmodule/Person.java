package deneme.iki.testmodule;

public class Person {
	 
    private Allocator allocator;
 
    Person(Allocator allocator) {
        this.allocator = allocator;
    }
 
    public String getDetails(String name) {
        return allocator.getAllocation(name);
    }
 
    public String setName(String name) {
        if (NameValidator.isNameValid(name)) {
            return name;
        } else {
            return "DEFAULT";
        }
    }
 
    public String getAllocationValue() {
        return allocator.getAllocationValue();
    }
 
}
