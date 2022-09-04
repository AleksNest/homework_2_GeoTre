package GeoTree;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Irina");
        Person vasya = new Person("Vasya");
        Person masha = new Person("Masha");
        Person jane = new Person("jane");
        Person ivan = new Person("Vanya");
        Person petr = new Person("Petr");
        Person tanya = new Person("tanya");
        Person elena = new Person("Elena");
        Person katya = new Person("Katya");
        Person oleg = new Person("Oleg");
        GeoTree gt = new GeoTree();
//        Printable printable = new Printable();

        gt.appendParChild(irina, vasya);             // добавление ребенка к родителю
        gt.appendParChild(irina, oleg);
        gt.appendParChild(irina, katya);
        gt.appendParChild(irina, masha);
        gt.appendParChild(masha, ivan);
        gt.appendSistBr(jane, irina);               // добавление сестры/брата
        gt.appendSistBr(irina, petr);

        gt.printPerson(gt.getAllPerson());   // Печать всех людей

        Printable.printReserch(new Reserch(gt).spend(irina, Relationship.parent), "irina", Relationship.parent);
        Printable.printReserch(new Reserch(gt).spend(jane, Relationship.sistBr), "jane", Relationship.sistBr);
        Printable.printReserch(new Reserch(gt).spend(vasya, Relationship.children), "vasya", Relationship.children);


    }
}