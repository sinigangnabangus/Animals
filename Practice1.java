public class Practice1 {
	
	public static void main (String[] args) {

		int numberfox = Randomizer.HowMany(1, 5);
		int numberlion = Randomizer.HowMany(1, 5);
		int numberwolf = Randomizer.HowMany(1, 5);
		int totalnumber = numberfox + numberlion + numberwolf;

		System.out.println("There are " + totalnumber + " animals in the zoo.");

		Fox foxes[] = new Fox[numberfox];
		Lion lions[] = new Lion[numberlion];
		Wolf wolves[] = new Wolf[numberwolf];
			
		for(int i=0; i<numberfox; i++){
			
			foxes[i] = new Fox();

			foxes[i].setName(i);
			System.out.println("Animal " + foxes[i].getName());
			foxes[i].Talk();
			
		}

		for(int i=0; i<numberlion; i++){

			lions[i] = new Lion();

			lions[i].setName(i);
			System.out.println("Animal " + (lions[i].getName() + numberfox));
			lions[i].Talk();
					
		}

		for(int i=0; i<numberwolf; i++){

			wolves[i] = new Wolf();

			wolves[i].setName(i);
			System.out.println("Animal " + (wolves[i].getName() + numberfox + numberlion));
			wolves[i].Talk();
					
		}


	}
}