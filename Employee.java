 import java.time.LocalDate;
 import java.util.Date;
 public class Employee{
 
   
    private int id;

    @Patern(regexp = "^[A-Z][a-z]*$")
    public String name;

    private LocalDate dob;
    private Gender gender;

    @Patern(regexp = "^[0-9]{9}V$")
    public String nic;

    @Patern(regexp = "^[0-9]{10}$")
    public String mobile;

    @Patern(regexp = "^[a-z]*@[a-z]*.[a-z]*(.[a-z]*)+$")
    public String email;
    
    private Designation designation;
    private StatusEmployee statusEmployee;


    Employee(){    }

    
    public void setId(int id){ this.id = id; }
    public int getId(){ return id; }
    
    public void setName(String name){ this.name = name; }
    public String getName(){ return name; }

    public void setDob(LocalDate dob){ this.dob = dob; }
    public LocalDate getDob(){ return dob; }
    
    public void setGender(Gender gender){ this.gender = gender; }
    public Gender getGender(){ return gender; }
    
    public void setNic(String nic){ this.nic = nic; }
    public String  getNic(){ return nic; }
 
    public void setMobile(String mobile){ this.mobile = mobile; }
    public String  getMobile(){ return mobile; }

    
    public void setEmail(String email){ this.email = email; }
    public String  getEmail(){ return email; }
    
    public void setDesignation(Designation designation){ this.designation =designation; }
    public Designation getDesignation(){ return designation; }
    
    public void setStatusEmployee(StatusEmployee  statusEmployee){ this.statusEmployee = statusEmployee; }
    public StatusEmployee getStatusEmployee(){ return  statusEmployee; }

    @Override
    public String toString(){

        return name;
    }
    public LocalDate Date(){
        return dob;
    }
}