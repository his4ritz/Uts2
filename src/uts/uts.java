package uts;
public class uts {
    private String firstName;
    private String lastName;
    private String fullName;
    public uts(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        this.fullName = first + " " + last;
    }    
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName() {
        return fullName;
        
    }
    public static void main(String[] args) {
        NameMe nameMe = new NameMe("John", "Doe");
        System.out.println(nameMe.getFirstName()); 
        System.out.println(nameMe.getLastName()); 
        System.out.println(nameMe.getFullName()); 
    }
}

        