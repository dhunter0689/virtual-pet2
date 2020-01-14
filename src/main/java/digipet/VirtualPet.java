package digipet;

public class VirtualPet {

	public String name;
	public String animal;
	public int hungerlvl;
	public int energylvl;
	public int moodlvl;
	public int hygienelvl;

	public VirtualPet(String name, String animal, int hunger, int energy, int mood, int hygiene) {
		this.name = name;
		this.animal = animal;
		hungerlvl = hunger;
		energylvl = energy;
		moodlvl = mood;
		hygienelvl = hygiene;
	}

	public VirtualPet(String name, String animal) {
		this.name = name;
		this.animal = animal;
		this.hungerlvl = 15;
		this.energylvl = 15;
		this.moodlvl = 15;
		this.hygienelvl = 15;

	}

	public String getName() {
		return name;
	}

	public String getAnimal() {
		return animal;

	}

	public int getHungerLvl() {
		return hungerlvl;

	}

	public int getEnergyLvl() {
		return energylvl;
	}

	public int getMoodLvl() {
		return moodlvl;
	}

	public int getHygieneLvl() {
		return hygienelvl;
	}

	public String showMenu() {
		return "What would you like to do? \n\tPress 1 to play with " + name + "\n\tPress 2 to feed " + name
				+ "\n\tPress 3 to make " + name + " sleep" + "\n\tPress 4 to take " + name
				+ " to the bathroom\n\tPress 5 to see how " + name + " is doing\n";
	}

	public void tick() {
		hungerlvl -= 1;
		energylvl -= 1;
		moodlvl -= 1;
		hygienelvl -= 1;
	}
	public void play() {
		moodlvl += 3;
		energylvl -= 4;
		hygienelvl -= 2;
	}

	public void feed() {
		hungerlvl += 4;
		energylvl -= 2;
		hygienelvl -= 1;
	}

	public void sleep() {
		energylvl += 8;
		moodlvl += 3;
		hungerlvl -= 3;
		hygienelvl -= 1;
	}

	public void bathe() {
		hygienelvl += 6;
		moodlvl += 3;
		energylvl -= 1;
		hungerlvl -= 1;
	}

	public String showStatus() {
		return "\t" + name + "'s mood:  " + moodlvl + "\n\t" + name + "'s hunger: " + hungerlvl + "\n\t" + name
				+ "'s energy: " + energylvl + "\n\t" + name + "'s hygiene: " + hygienelvl;
	}

	boolean digiPetIsLiving() {
		if (hygienelvl > 0 && moodlvl > 0 && energylvl > 0 && hungerlvl > 0) {
			return true;
		}
		return false;
	}
	String reasonForDeath() {
		if(energylvl == 0) {
			return "Died from exhaustion.";
			
		}
		if(hygienelvl == 0) {
			return "Died from living in filth.";
		}
		if(moodlvl == 0) {
			return "Died from neglect and depression.";
		}
		if(hungerlvl == 0) {
			return "Died from starvation.";
		}else
			return "R.I.P " + name;
		
	}

	public boolean digiPetIsLiving1() {
		
		return false;
	}
}
