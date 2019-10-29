/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.foodcontainer.managers;
import ua.lviv.iot.officeAppliances.models.*;
import java.util.*;
import java.util.stream.Collectors;
import static ua.lviv.iot.officeAppliances.managers.SortType.*;

public class FoodcontainerManager implements IFoodcontainerManager {

    private List<Foodcontainer> foodcontainer;

    public FoodcontainerManager(List<Foodcontainer> foodcontainer) {
        this.foodcontainer = foodcontainer;
    }

    public FoodcontainerManager() {

    }

    public List<Foodcontainer> getFoodcontainer() {
        return foodcontainer;
    }

    public void setFoodcontainer(List<Foodcontainer> foodcontainer) {
        this.foodcontainer = foodcontainer;
    }

    @Override
    public List<Foodcontainer> findByColor(Color color) {
        return foodcontainer.stream().filter(col -> col.getColor().equals(color)).collect(Collectors.toList());
    }

    @Override
    public void sortByPrice(List<Foodcontainer> foodcontainer, SortType sortType) {
        if (sortType == ASCENDING) {
            Collections.sort(foodcontainer, Comparator.comparing(Foodcontainer::getPrice));

        } else {
            Collections.sort(foodcontainer, Comparator.comparing(Foodcontainer::getPrice).reversed());
        }
    }

    @Override
    public void sortByWeight(List<Foodcontainer> foodcontainer, SortType sortType) {
        if (sortType == ASCENDING) {
            Collections.sort(foodcontainer, Comparator.comparing(Foodcontainer::getWeight));
        } else {
            Collections.sort(foodcontainer, Comparator.comparing(Foodcontainer::getWeight).reversed());
        }
    }
}
