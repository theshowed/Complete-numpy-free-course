import java.util.ArrayList;
import java.util.Scanner;

public class Main{

  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Cultures> arraysa = new ArrayList<>();

  for(int i=0; i <2; i++){
    System.out.print("Enter country name: ");
    String name = scanner.next();
    System.out.print("Enter country flag: ");
    String flag = scanner.next();
    System.out.print("Enter country currency: ");
    String currency = scanner.next();
    System.out.print("Enter country year it was founded: ");
    int founded = scanner.nextInt();
    System.out.print("Enter country traditional food: ");
    String food  = scanner.next();
    Cultures details = new Cultures(flag, name, currency, food, founded);
    arraysa.add(details);

   // Cultures detai = new Cultures(flag, name, currency, food, founded);


   for(Cultures info :arraysa){
    System.out.println("Name: " + info.getName());
    System.out.println("currency " + info.getCurrency());
    System.out.println("Traditional food: " + info.getFood());
  
    System.out.println("Basic details about the country");
    System.out.println(info.getHistoryDetails());
    System.out.println(info.getBasicDetails());
    System.out.println(info.getID());
    //System.out.println(COLOR);



  
  }
  //System.out.println(arraysa.);
  //System.out.println(details.getFlagColor());
 // System.out.println(details.get);
 // System.out.println(details);



  }
  scanner.close();



    

  }

}

