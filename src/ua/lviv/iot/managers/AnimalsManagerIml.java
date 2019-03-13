package ua.lviv.iot.managers;
import ua.lviv.iot.animals.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalsManagerIml implements AnimalsManager {
  private  List<Animals> animals = new LinkedList<>();
  private boolean reverse;
  

public AnimalsManagerIml(List<Animals> animals, boolean reverse) {
	this.animals = animals;
	this.reverse = reverse;
  }

public AnimalsManagerIml(List<Animals> animals) {
	this.animals=animals;
}

public boolean getReverse() {
	return reverse;
}

public void setReverse(boolean reverse) {
	this.reverse = reverse;
}


public List<Animals> getAnimals() {
	return animals;
}

public void setAnimals(List<Animals> animals) {
	this.animals = animals;
}
  
 public List<Animals> searchCarnivorousAnimals( TypeOfFood typeOfFood ){
	 List<Animals> foundList;
     foundList = this.animals.stream().filter(gt -> typeOfFood.equals(gt.getTypeOfFood()))
             .collect(Collectors.toList());
     return foundList;
	}
 
 
 public List<Animals> sortCarnivorousAnimalsByEatingMeal(List<Animals> animals, boolean reverse){
	 Collections.sort(animals, (o1, o2) -> o1.getWeightOfConsumingMeal() - o2.getWeightOfConsumingMeal());
     return animals;
 }


}


 
 
 
 

