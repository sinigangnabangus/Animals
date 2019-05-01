public class Lion{

	public int lionname;

	public void setName(int name){

		lionname = name + 1;
		
	}

	public int getName(){
		return lionname;

	}


	public void Talk(){

		System.out.println("Hi my name is Lion " + lionname);
	}
	
}