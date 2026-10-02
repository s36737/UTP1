// TODO: musimy dodac brakujace klasy!

// OK, ja dodam ‘Adder‘, a s36718 doda ‘Subtractor‘.

public class Main {
public static void main(String[] args) {
    Substractor adder = new Substractor();
    System.out.println(adder.add(1, 2));

    Subtractor subtractor = new Subtractor();

    System.out.println(subtractor.subtract(6, 3));
}
}

