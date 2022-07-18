class Cycleer {

private double numOfWheels;
private double weight;

	Cycleer(double nofw, double w){

		this.numOfWheels = nofw;
		this.weight = w;

		try {
			if(numOfWheels<=0 || weight<=0) {
				throw new Exception("Number of Wheels or Weight can not be less than zero");
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	public void displayMessage() {

		System.out.println("the Weight is " + weight);
		System.out.println("there is " + numOfWheels + " number of wheels");
	}
	  public String toString () {
	      return "Cycleer: numOfWheels=" + numOfWheels + ", weight=" + weight;
	    }
}