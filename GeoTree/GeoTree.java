package GeoTree;

import java.util.ArrayList;

public class GeoTree implements Printable {
    public ArrayList<Node> tree = new ArrayList<>();
    public ArrayList<Person> allPerson = new ArrayList<>();                // создали список всех имен

    public ArrayList<Node> getTree() {
        return tree;
    }

    public ArrayList<Person> getAllPerson() {
        return allPerson;
    }           // список всех людей

    public String toString() {
        return tree + String.valueOf(tree);
    }

    public void appendParChild(Person parent, Person children) {            // метод добавления родства родитель - ребенок
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
        if (!allPerson.contains(parent)) {
            allPerson.add(parent);
        }
        if (!allPerson.contains(children)) {
            allPerson.add(children);
        }

    }


    public void appendSistBr(Person sistBr1, Person sistBr2) {            // метод добавления родствабрат-сестра
        tree.add(new Node(sistBr1, Relationship.sistBr, sistBr2));
        tree.add(new Node(sistBr2, Relationship.sistBr, sistBr1));
        if (!allPerson.contains(sistBr1)) {
            allPerson.add(sistBr1);
        }
        if (!allPerson.contains(sistBr2)) {
            allPerson.add(sistBr2);
        }

    }


    @Override
    public void printPerson(ArrayList<Person> allPerson) {
        for (Person person : allPerson) {
            System.out.println(person.getFullName());
        }
    }

    @Override
    public void printGeoTree(ArrayList<Node> tree) {
        for (Node p : tree) {
            System.out.println(p.p1);
        }
    }
}
