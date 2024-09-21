
//Note(Random): In java main class is called by Java Virtual Machine(jvm) and 
//in cpp it is called by Operating System




//every class in java is derived from the object class
//even if we do not explicitly mention it it's there 

//In Java, the Object class is the root class from which every class in Java directly or indirectly inherits. 
//It is the ultimate base class for all Java classes. Whether you define a class explicitly as a subclass of Object 
//or not, every class you create in Java automatically extends the Object class.





import java.util.*;                                             // import java.util.*;                     

public class unknown {                                          // public class unknown extends Object{

    public static void main(String[] args) {                    //     public static void main(String args[]){
        System.out.println("Hi");                             //         System.out.println("Hi");
    }                                                           //     }                                                               
}                                                               //}




//above programm on left is same as on right and we can also extend this Object in all Classes actually it extends 
//all our classes even if we do it or not


// Important Methods Provided by Object: The Object class provides several important methods that are inherited by all Java classes:

// toString(): Returns a string representation of the object.

// equals(Object obj): Compares two objects for equality.

// hashCode(): Returns a hash code value for the object, often used in hashing-based collections like HashMap.

// clone(): Creates and returns a copy (clone) of the object.

// getClass(): Returns the runtime class of the object.

// finalize(): Called by the garbage collector before the object is destroyed.

// wait(), notify(), notifyAll(): Methods used for thread synchronization.