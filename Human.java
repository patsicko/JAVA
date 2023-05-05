class African {
  String color="black";
}
class Citizen extends African {
  String country;
}

public class Human extends Citizen{
  String firstName;
  String lastName;
  int age;
  String gender;
  String district;
  String sector;
  String userName;
  String email;

  public static void log(String params){
    System.out.println(params);
  }

  public static void log(int params){
    System.out.println(params);
  }


  public String getIdentification() {
return  "She is called "+this.firstName+" "+this.lastName+", She is "+this.age+
" years old "+" and she is a "+this.gender +"\n She lives in "+this.district+" District in "+this.country +" and she is "+this.color;
  };

  public void setGender(String gender) {
    this.gender=gender;
  };
  

  Human(String firstName, String lastName,int age){
  this.firstName=firstName;
  this.lastName=lastName;
  this.age=age;
  };

  // Human2(String userName,String email,int age){
  //   this.userName=userName;
  //   this.email=email;
  // }

  public void addData(String district,String sector){
    this.district=district;
    this.sector=sector;
    
  }
   
    public static void main(String[] args){
        Human human= new Human("MANIBAHO","Patrick",40);
      
       human.firstName="Jane";
       human.setGender("female");
       human.addData("Musanze", "Muhoza");
       human.country="Rwanda";
      String person= human.getIdentification();
      
      log(person);
      log(5);
     
      

     
    
    }
}
