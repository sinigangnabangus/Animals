public class Practice1 {
	
	public static void main (String[] args) {

		int numberfox = Randomizer.HowMany(1, 5);
		int numberlion = Randomizer.HowMany(1, 5);
		int numberwolf = Randomizer.HowMany(1, 5);
		int totalnumber = numberfox + numberlion + numberwolf;

		System.out.println("There are " + totalnumber + " animals in the zoo.");

		Fox foxes = new Fox();
		Lion lions = new Lion();
		Wolf wolves = new Wolf();
		int Foxes[] = new int[numberfox];
		int Lions[] = new int[numberlion];
		int Wolves[] = new int[numberwolf];


		for(int i=0; i<numberfox; i++){

			foxes.setName(i);
			System.out.println("Animal " + foxes.getName());
			foxes.Talk();

			Foxes[i] = foxes.getName();

		}

		for(int i=0; i<numberlion; i++){

			lions.setName(i);
			System.out.println("Animal " + (lions.getName() + numberfox));
			lions.Talk();

			Lions[i] = lions.getName();
		
		}

		for(int i=0; i<numberwolf; i++){

			wolves.setName(i);
			System.out.println("Animal " + (wolves.getName() + numberfox + numberlion));
			wolves.Talk();

			Wolves[i] = wolves.getName();
		
		}


	}
}