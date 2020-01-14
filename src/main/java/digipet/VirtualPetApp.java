package digipet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet digiPet = new VirtualPet("Lucky", "tiger", 15, 15, 15, 15);
		

		System.out.println("\t\tSay Hello to your new pet!  \n\t" + digiPet.name
				+ " the tiger needs your love and care. \nAll you have to do is take care of him and watch him grow.  \n\tWould you like to play with him?");
	
		String userOption;
		while (digiPet.digiPetIsLiving()) {
			do {
				System.out.println(digiPet.showMenu());
				userOption = input.next();
			} while (!userOption.equals("1") && !userOption.equals("2") && !userOption.equals("3")
					&& !userOption.equals("4") && !userOption.equals("5"));
			switch (userOption) {
			case "1":
				digiPet.play();
				digiPet.tick();
				System.out.println("Lucky is playing!");
				if (digiPet.digiPetIsLiving() == true) {
					System.out.println("Now " + digiPet.name + " is happy!");
					System.out.println(digiPet.getMoodLvl());
				}
				break;
			case "2":
				digiPet.feed();
				digiPet.tick();
				if (digiPet.digiPetIsLiving() == true) {
					System.out.println(digiPet.name + " is full!");
					System.out.println(digiPet.getHungerLvl());
				}
				break;
			case "3":
				digiPet.sleep();
				digiPet.tick();
				if (digiPet.digiPetIsLiving() == true) {
					System.out.println(digiPet.name + " feels refreshed!");
					System.out.println(digiPet.getEnergyLvl());
				}
				break;
			case "4":
				digiPet.bathe();
				digiPet.tick();
				if (digiPet.digiPetIsLiving() == true) {
					System.out.println(digiPet.name + " has used the restroom and has been cleaned!");
					System.out.println(digiPet.getHygieneLvl());
				}
				break;
			case "5":
				System.out.println(digiPet.showStatus());
				break;
			}
		}
		if (digiPet.digiPetIsLiving() == false) {
			System.out.println(
					"Uh oh!"  + "\n" + digiPet.name + " died of " + digiPet.reasonForDeath());
			System.exit(0);
		}
		input.close();

	}

}
