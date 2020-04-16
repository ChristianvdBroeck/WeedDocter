package BaseClasses;

import Enums.*;

public class BaseSymptoms {

    // FIELDS
    // Discoloration
    Color color;
    VeinsAndStems veinsAndStems;

    // Transformation
    TypeOfTransformation typeOfTransformation;

    LocationOnPlant locationOnPlant;
    LocationOnLeaf locationOnLeaf;

    // CONSTRUCTOR
    public BaseSymptoms(Color color, LocationOnPlant locationOnPlant, LocationOnLeaf locationOnLeaf,
                        VeinsAndStems veinsAndStems, TypeOfTransformation typeOfTransformation) {
        this.color = color;
        this.locationOnPlant = locationOnPlant;
        this.locationOnLeaf = locationOnLeaf;
        this.veinsAndStems = veinsAndStems;
    }

    // METHODS
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public LocationOnPlant getLocationOnPlant() {
        return locationOnPlant;
    }

    public void setLocationOnPlant(LocationOnPlant locationOnPlant) {
        this.locationOnPlant = locationOnPlant;
    }

    public LocationOnLeaf getLocationOnLeaf() {
        return locationOnLeaf;
    }

    public void setLocationOnLeaf(LocationOnLeaf locationOnLeaf) {
        this.locationOnLeaf = locationOnLeaf;
    }

    public VeinsAndStems getVeinsAndStems() {
        return veinsAndStems;
    }

    public void setVeinsAndStems(VeinsAndStems veinsAndStems) {
        this.veinsAndStems = veinsAndStems;
    }
}
