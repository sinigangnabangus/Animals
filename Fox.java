public class Fox{

	public int foxname;

	public void setName(int name){

		foxname = name + 1;
		
	}

	public int getName(){
		return foxname;

	}


	public void Talk(){

		System.out.println("Hi my name is Fox " + foxname);
	}



	
}