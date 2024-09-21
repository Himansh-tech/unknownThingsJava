

//Inheritaed and Inner class 

//Note(Random): for overriding it is must that we inherit from some class

// class Animal{
//     void sound(){
//         System.out.println("Animals Sound");
//     }
// }

// //below is class which is inheriting
// class Dog extends Animal{
//     void sound(){
//         System.out.println("Bark");
//     }
// }
// public class iandi {

//     public static void main(String args[]){
//         Dog rocky = new Dog();
//         rocky.sound();
//     }
// }




// //this is not Inheritance done inside the class itself

// class Animal{
//     void sound(){
//         System.out.println("Animals Sound");
//     }

//     class Dog extends Animal{
//         void sound(){
//             System.out.println("Bark");
//         }
//     }
// }

// //below is class which is inheriting

// public class iandi {

//     public static void main(String args[]){
//         Animal rocky = new Animal();
//         rocky.sound(); //Animal Sound

//         Animal.Dog ramu = rocky.new Dog();
//         ramu.sound();  //Bark
//     }
// }



//this is not Inheritance  but inner class(or class inside a class)

class Animal{
    void sound(){
        System.out.println("Animals Sound");
    }

    class Dog{
        void sound(){
            System.out.println("Bark");
        }
    }
}

//below is class which is inheriting

public class iandi {

    public static void main(String args[]){
        Animal rocky = new Animal();
        rocky.sound(); //Animal Sound

        Animal.Dog ramu = rocky.new Dog();
        ramu.sound();  //Bark
    }
}



