package Encapsulation;

public class ObjectDemos {

    int num;
    float marks;

    public ObjectDemos(int num, float marks) {
        this.num = num;
        this.marks = marks;
    }

    @Override
    public int hashCode() { /// unique  rep of an object via a number, it's not the address of the object(never)
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) { /// used to compare objects
        return this.num == ((ObjectDemos)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() { /// gives string rep for the code
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable { /// gets called when garbage collection is used
        super.finalize();
    }

    public static void main(String[] args) {



        //Hashmap
        ObjectDemos objectDemos = new ObjectDemos(34, 78.13f); ///uses a specific integer for representation of the object.
        ObjectDemos objectDemos1 = new ObjectDemos(34, 98.65f); ///for same object the number can be diff.
        ObjectDemos objectDemos2 = objectDemos; ///for the same object the number will be same.

        System.out.println(objectDemos.hashCode()); //prints 2065951873 object1
        System.out.println(objectDemos1.hashCode()); //prints 1791741888 diff cause diff object
        System.out.println(objectDemos2.hashCode()); //prints 2065951873 cause same object(object1) used


        //Equals
        if(objectDemos == objectDemos1) {
            System.out.println("Object is equal to object1");
        }
        if(objectDemos.equals(objectDemos1)) {
            System.out.println("Object is equal to object1");
        }


        // GetClass
        System.out.println(objectDemos.getClass()); //it'll be stored in the heap memory
        System.out.println(objectDemos.getClass().getName()); //it'll be stored in the heap memory
    }
}
