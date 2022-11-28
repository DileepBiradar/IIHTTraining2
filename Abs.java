//abstract class 
abstract class Bank{    
    abstract int getInterestRate();    
}    
//concrete class
class Citi extends Bank{    
    int getInterestRate(){return 7;}    
}
//concrete class
class HSBC extends Bank{    
    int getInterestRate(){return 6;}    
}    
     
class Main1{    
    public static void main(String args[]){    
        Bank b;  
        b = new Citi ();      // concrete class object
        System.out.println("Citi Rate of Interest is: "+b.getInterestRate()+"%");    
        b = new HSBC ();        // concrete class object
        System.out.println("HSBC Rate of Interest is: "+b.getInterestRate()+"%");    
    }
}    