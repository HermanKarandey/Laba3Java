/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.foodcontainer.managers;

import ua.lviv.iot.foodcontainer.models.Color;
import ua.lviv.iot.foodcontainer.models.Foodcontainer;
import java.util.List;

public interface IFoodcontainerManager {

    List<Foodcontainer> findByColor(Color color);

    void sortByPrice(List<Foodcontainer> Foodcontainer,
                     SortType sortType);

    void sortByWeight(List<Foodcontainer> Foodcontainer,
                      SortType sortType);
}
