import java.time.LocalDate;
import java.time.Period;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge(birthDate);
    }

    public Contact(Contact source){
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    public int toAge(String birthDate) {
        LocalDate dob = LocalDate.parse(birthDate);  
        return calculateAge(dob);
    }

    public int calculateAge(LocalDate dob){
        LocalDate curDate = LocalDate.now();  
         
        if ((dob != null) && (curDate != null)){  
            return Period.between(dob, curDate).getYears();  
        }  
        
        return 0;
    }
            
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
        int newAge = toAge(this.birthDate);
        setAge(newAge);
    }

    private void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
}
