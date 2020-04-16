package NutrientDeficiencies;

import BaseClasses.BaseNutrientDeficiency;
import Enums.*;

public class Deficiency extends BaseNutrientDeficiency {

    public Deficiency(String nutrient, String description, String solution, Color color,
                     LocationOnPlant locationOnPlant, LocationOnLeaf locationOnLeaf,
                     VeinsAndStems veinsAndStems, TypeOfTransformation typeOfTransformation) {

        super(nutrient, description, solution, color, locationOnPlant,
                locationOnLeaf, veinsAndStems, typeOfTransformation);
    }
}
