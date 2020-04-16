package BaseClasses;

import BaseClasses.BaseSymptoms;
import Enums.*;

public class BaseNutrientDeficiency extends BaseSymptoms {
    // FIELDS
    public String nutrient;
    public String description;
    public String solution;

    Color color;
    LocationOnPlant locationOnPlant;
    LocationOnLeaf locationOnLeaf;
    VeinsAndStems veinsAndStems;
    TypeOfTransformation type;

    // CONSTRUCTOR
    public BaseNutrientDeficiency(String nutrient, String description, String solution, Color color,
                                  LocationOnPlant locationOnPlant, LocationOnLeaf locationOnLeaf,
                                  VeinsAndStems veinsAndStems, TypeOfTransformation typeOfTransformation) {

        super(color, locationOnPlant, locationOnLeaf, veinsAndStems, typeOfTransformation);

        this.nutrient = nutrient;
        this.description = description;
        this.solution = solution;
        this.color = color;
    }

    // METHODS
    public String getNutrient() {
        return nutrient;
    }

    public void setNutrient(String nutrient) {
        this.nutrient = nutrient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public LocationOnPlant getLocationOnPlant() {
        return locationOnPlant;
    }

    @Override
    public void setLocationOnPlant(LocationOnPlant locationOnPlant) {
        this.locationOnPlant = locationOnPlant;
    }

    @Override
    public LocationOnLeaf getLocationOnLeaf() {
        return locationOnLeaf;
    }

    @Override
    public void setLocationOnLeaf(LocationOnLeaf locationOnLeaf) {
        this.locationOnLeaf = locationOnLeaf;
    }

    @Override
    public VeinsAndStems getVeinsAndStems() {
        return veinsAndStems;
    }

    @Override
    public void setVeinsAndStems(VeinsAndStems veinsAndStems) {
        this.veinsAndStems = veinsAndStems;
    }

    public TypeOfTransformation getType() {
        return type;
    }

    public void setType(TypeOfTransformation type) {
        this.type = type;
    }
}
