package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Owner peter = new Owner("Peter", 15, "Musterst. 1");
        Owner hans = new Owner("Hans", 16, "Musterst. 2");
        Owner anna = new Owner("Anna", 17, "Musterst. 3");
        Owner andrea = new Owner("andrea", 15, "Musterst. 4");
        Species shepherd = new Species("Schäferhund", "1 kg meet per day");
        Species siameseCat = new Species("Siamkatze", "300g fish per day");
        Species sausageDog = new Species("Dackel", "200 g meet per day");
        Animal bigDog = new Animal(01, "Wuffi", shepherd, 3, peter);
        Animal cat = new Animal(02, "Mauzi", siameseCat, 5, hans);
        Animal littleDog = new Animal(03, "Kläffi", sausageDog, 5, anna);
        Animal littleDog2 = new Animal(03, "Kläffi", sausageDog, 5, anna);
        System.out.println(cat);
        System.out.println(bigDog.equals(littleDog));
        System.out.println(littleDog2.equals(littleDog));


    }
}