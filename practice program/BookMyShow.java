class Movie
{
	String name;
	int duaration;
	String language;
	Movie(String name,int duaration,String language)            //Movie class constructor
	{
		this.name=name;
		this.duaration=duaration;
		this.language=language;
	}
	public  void displayMovie()
	{
		System.out.println("***Movie Details***");
		System.out.println("Movie name:"+this.name);
		System.out.println("Duration:"+this.duaration);
		System.out.println("Language:"+this.language);
	}
}
class Ticket extends Movie
{
	double price;
	String theaterName;
	boolean foodInclude;
	Ticket(double price,String theaterName,boolean foodInclude,String name,int duaration,String language)     //Ticket class constructor
	{
		super(name,duaration,language);
		this.theaterName=theaterName;
		this.foodInclude=foodInclude;
	}
	public  void displayTicket()
	{
		super.displayMovie();
		System.out.println("***Ticket Details***");
		System.out.println("Price:"+this.price);
		System.out.println("Theater Name:"+this.theaterName);
		System.out.println("is foodInclude:"+this.foodInclude);
	}

}


class BookMyShow
{
	public static void main(String[] args) {
		Ticket obj=new Ticket(500,"Apsara",true,"Lagan",3,"Hindi");
		obj.displayTicket();
		
	}
}