package ua.lviv.iot.managers;
import ua.lviv.iot.animals.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Animals reindeer = new Reindeer();
		Animals whiteBear = new WhiteBear();
		Animals polarFox = new PolarFox();
		
		reindeer.setSex(Sex.MALE);
		whiteBear.setSex(Sex.FEMALE);
		polarFox.setSex(Sex.MALE);
		
		reindeer.setTypeOfFood(TypeOfFood.HERBIVOROUS);
		whiteBear.setTypeOfFood(TypeOfFood.CARNIVOROUS);
		polarFox.setTypeOfFood(TypeOfFood.CARNIVOROUS);
		
		reindeer.setSize(Size.BIG);
		whiteBear.setSize(Size.BIG);
		polarFox.setSize(Size.MEDIUM);
		
		reindeer.setWeightOfConsumingMeal(0);
		whiteBear.setWeightOfConsumingMeal(7);
		polarFox.setWeightOfConsumingMeal(3);
		
		 List<Animals> animals = new ArrayList<>();
	        animals.add(reindeer);
	        animals.add(whiteBear);
	        animals.add(polarFox);
	        
	        
	        AnimalsManagerIml manager = new AnimalsManagerIml(animals);
	        
	        List<Animals> carnivous = manager.searchCarnivorousAnimals(TypeOfFood.CARNIVOROUS);
	        carnivous.forEach((Animals animal) -> {
	            System.out.println(animal);
	        });
		
	        System.out.println();
	        
	        
	        List<Animals> sortCarnivousAnimalByEatingMeal = manager.sortCarnivorousAnimalsByEatingMeal(animals, true);
	        sortCarnivousAnimalByEatingMeal.forEach((Animals animal) -> {
	            System.out.println(animal.getWeightOfConsumingMeal());
	        });
		
	

	}

}
