public class Person {
    public int age;
    public String name;

    public Person(String name, int age) {
        if (name == null || age < 1) {
            // skapa ett undantag
        }

        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Person p = new Person("Nisse", 45);

        System.out.println(p.name);
    }
}
