public class Cultures extends Country implements sharedvalues{

    private String food;
    private int founded;

    public Cultures(String flagcolor, String name, String currency, String food, int founded){
        super(flagcolor,name, currency );
        this.founded = founded;
        this.food = food;
    }

    

    public  int getCountry(){
        return founded;
    }

    public String getFood(){
        return food;
    }

    public String getBasicDetails(){
        return String.format("The country name is %s, the color of it's flag is %s and is current cuurency is %s ", super.getName(), super.getFlagColor(), super.getCurrency() );
    }

    public String getHistoryDetails(){
        return String.format("the county was founded in %d and it's traditional food is %s", getCountry(), getFood());

    }



    @Override
    public void getname() {
        System.out.println("Hey the name is soully");
    }


public int getID(){
    return sharedvalues.ID;

    
}




  
}
