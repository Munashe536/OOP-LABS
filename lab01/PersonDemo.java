 
public class PersonDemo {
    public static void main(String[] args) {
        Address a = new Address();
        a.street = "12 Samora Machel Ave";
        a.city = "Harare";
        a.country = "Zimbabwe";

        Person p1 = new Person();
        p1.name = "Tariro";
        p1.address = a;

        // EXPLAIN: chained dot operator: person -> address -> city
        System.out.println(p1.name + " lives in " + p1.address.city);

        // A person whose address was never set: the field is null
        Person p2 = new Person();
        p2.name = "Farai";

        // 1) What happens: p2.address.city throws NullPointerException,
        //    because null refers to no object, so there is no city field to read.
        try {
            System.out.println(p2.name + " lives in " + p2.address.city);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: p2.address is null");
        }

        // 2) The safe way: check for null before using the chain
        if (p2.address != null) {
            System.out.println(p2.address.city);
        } else {
            System.out.println(p2.name + " has no address recorded");
        }
    }
}
