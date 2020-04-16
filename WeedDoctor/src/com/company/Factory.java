package com.company;

import BaseClasses.BaseNutrientDeficiency;
import Enums.*;
import NutrientDeficiencies.Deficiency;

// this class generates all objects:
//      all deficiencies
//      all burns
public class Factory {

    public Deficiency magnesiumDeficiency;
    public Deficiency nitrogenDeficiency;
    public Deficiency molybdenumDeficiency;
    public Deficiency ironDeficiency;

    public Deficiency getIronDeficiency() {
        return ironDeficiency;
    }

    public void generateDeficiencies() {
        // wat als een deficiency meerdere symptomen heeft?
        // zoals verkleuring over het gehele blad EN aan de tips?
        // Wat als een verkleuring laag EN middle is?

        // magnesium
        this.magnesiumDeficiency = new Deficiency("Magnesium", "Magnesium Deficiency", "Add Magnesium",
                Color.BROWN, LocationOnPlant.LOWER/*OR MIDDLE!*/, LocationOnLeaf.CLOUDED,
                VeinsAndStems.RED_PINK_VEINS /*maar niet altijd!*/, TypeOfTransformation.CURLED_TIPS);

        // nitrogen
        this.nitrogenDeficiency = new Deficiency("Nitrogen", "Nitrogen Deficiency", "Add Nitrogen",
                Color.YELLOW, LocationOnPlant.LOWER/*OR MIDDLE!*/, LocationOnLeaf.WHOLE_LEAF,
                VeinsAndStems.RED_PINK_NERVES/*OR PURPLE*/, TypeOfTransformation.CURLED_TIPS);

        // molybdenum
        this.molybdenumDeficiency = new Deficiency("Molybdenum", "Molybdenum Deficiency", "Add Molybdenum",
                Color.RED/*OR_PINK*/, LocationOnPlant.LOWER/*OR MIDDLE!*/, LocationOnLeaf.EDGES,
                VeinsAndStems.RED_PINK_NERVES/*OR PURPLE*/, TypeOfTransformation.NONE);

        // iron
        this.ironDeficiency = new Deficiency("Iron", "Iron Deficiency", "Add Iron",
                Color.YELLOW/*TO WHITE*/, LocationOnPlant.UPPER, LocationOnLeaf.WHOLE_LEAF,
                VeinsAndStems.NONE, TypeOfTransformation.NONE);
    }
}
