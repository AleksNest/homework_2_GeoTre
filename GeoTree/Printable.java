package GeoTree;

import java.util.ArrayList;

public interface Printable {
    void printPerson(ArrayList<Person> allPerson);           //метод печати всех введенных людей

    void printGeoTree(ArrayList<Node> tree);                   //метод печати всего дерева

    static void printReserch(ArrayList<String> result, String name, Relationship relationship) {   //метод печати поиска по родственнику
        System.out.println(relationship + " " + name + " = " + result);

    }

}


