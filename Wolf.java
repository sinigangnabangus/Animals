public class Wolf{

	public int wolfname;

	public void setName(int name){

		wolfname = name + 1;
		
	}

	public int getName(){
		return wolfname;

	}


	public void Talk(){

		System.out.println("Hi my name is Wolf " + wolfname);
	}
	
	
}