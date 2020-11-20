package com.main;

import Chicken.Chickens;
import Chicken.Cock;
import Chicken.Hen;
import Transportation.Bus;
import Transportation.Driving;
import Transportation.Plane;
import Transportation.Train;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //11. Abstract class and interface
        Cock cock = new Cock();
        Hen hen = new Hen();
        Chickens chickens = new Chickens();
        Integer totalNum = 100;

        Integer cockMaxNum = totalNum / cock.getPrice();
        Integer henMaxNum = totalNum / hen.getPrice();
        Integer chickenMaxNum = totalNum / chickens.getPrice();
        for(Integer i = cockMaxNum ; i >=0 ; i--) {
            for(Integer j = henMaxNum ; j >= 0 ; j--) {
                for(Integer k = chickenMaxNum ; k >= 0 ; k--) {
                    if((i * cock.getPrice() + j * hen.getPrice() + k * chickens.getPrice()) == 100 && (i + j + k * 3) == 100) {
                        System.out.println("You can have below combination : ");
                        System.out.println("Cock : " + i);
                        System.out.println("Hen : " + j);
                        System.out.println("Chicken : " + k * 3);
                    }
                }
            }
        }

        Set<String> availableTransportationSet = new HashSet<>();
        Driving driving = new Driving();
        if(driving.getPrice() <= 500) availableTransportationSet.add("driving");
        Bus bus = new Bus();
        if(bus.getPrice() <= 500) availableTransportationSet.add("bus");
        Train train = new Train();
        if(train.getPrice() <= 500) availableTransportationSet.add("train");
        Plane plane = new Plane();
        if(plane.getPrice() <= 500) availableTransportationSet.add("plane");
        System.out.println("You can choose these transportations : " + String.join(", ", availableTransportationSet));
    }
}
