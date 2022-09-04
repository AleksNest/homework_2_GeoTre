package GeoTree;

import java.util.ArrayList;

public class Reserch implements Printable {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2.getFullName());
            }

        }
        return result;
    }

    public ArrayList<String> spendAllRelatives(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }


    @Override
    public void printPerson(ArrayList<Person> allPerson) {

    }

    @Override
    public void printGeoTree(ArrayList<Node> tree) {

    }
}
