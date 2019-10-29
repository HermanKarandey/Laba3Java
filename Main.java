/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.lviv.iot.foodcontainer;

import ua.lviv.iot.foodcontainer.models.*;
import ua.lviv.iot.foodcontainer.managers.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Foodcontainer> foodcontainer = new LinkedList<>();

        Breadbox breadbox = new breadbox("chalky", new Size(100.0, 80.0, 5.0), "aluminum", 250.0,
                new Color(0, 128, 128), 25.0, "Economix", Material.METAL);

        Sugarblow sugarblow= new Sugarblow(0.7, 2, 26.0, new Color(0, 0, 0), 100.0,
                "Buromax", Material.METAL_PLUS_PLASTIC);

        Termoss termoss = new Termoss(2.0, 50.0,
                new Color(128, 128, 128), 0.2, "ABC", Material.METAL);

        Oiler oiler= new oiler("engineering", 64, new Size(15.2, 5.0, 0.5),
                35.0, new Color(128, 128, 128), 0.1, "Company", Material.PLASTIC);

        foodcontainer.add(termoss);
        foodcontainer.add(breadbox);
        foodcontainer.add(sugarbowl);
        foodcontainer.add(oiler);

        FoodcontainerManager manager = new FoodcontainerManager(foodcontainer);
        System.out.println("Вибірка за матеріалом");
        System.out.println(manager.findByMaterial(new Color(128, 128, 128)));
        System.out.println("Сортування за зростанням за кольором");

        manager.sortByColor(foodcontainer, SortType.ASCENDING);
        System.out.println(foodcontainer);
        manager.sortColor(foodcontainer, SortType.DESCENDING);
        System.out.println("Сортування за спаданням за кольором");
        System.out.println(foodcontainer);
        System.out.println("Сортування за зростанням за вагою");
        manager.sortByWeight(foodcontainer, SortType.ASCENDING);
        System.out.println(foodcontainer);
        manager.sortByWeight(foodcontainer, SortType.DESCENDING);
        System.out.println("Сортування за спаданням за вагою");
        System.out.println(foodcontainer);
    }
}
