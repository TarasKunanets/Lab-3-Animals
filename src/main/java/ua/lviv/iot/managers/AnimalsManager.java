package ua.lviv.iot.managers;

import java.util.List;

import ua.lviv.iot.animals.TypeOfFood;

import ua.lviv.iot.animals.Animals;

public interface AnimalsManager {
	
  public List<Animals> searchCarnivorousAnimals( TypeOfFood typeOfFood );

  public List<Animals> sortCarnivorousAnimalsByEatingMeal( List<Animals> animals,  boolean reverse);


}
