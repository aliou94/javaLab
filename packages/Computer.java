package packages;

public class Computer {

	  private String brand;
	  private int year;
	  private int cost ;
	  
	  

	  // Getter
	  public String getName() {


		  return brand;
	 
	  }
	  
	  
	  public int getYear() {


		  return year;
	 
	  }
	  
	  
	  public int getCost() {


		  return cost;
	 
	  }

	  // Setter
	  public void setName(String brand, int year, int cost) {
	    this.brand = brand;
	    this.year = year;
	    this.cost = cost;
	 
	  }

			  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer Mack = new Computer();
		

		
		Mack.setName("Mac book", 2020, 2000);
		
		 System.out.println(Mack.getName());

		 System.out.println(Mack.getYear());
		 
		 System.out.println( "$" + Mack.getCost());
	}
	}


