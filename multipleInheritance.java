class House{
    String name = "Bhawan";
    int rooms = 10;
    public void store(String name, int rooms){
        System.out.println("There are "+this.rooms+" rooms in "+this.name);
    }
}


//all classes which are not inheriting from any other class actually inherit from Object by default

class Myhouse extends House{      //and all classes which are inheriting also inherits Object class but indirectly throught it's super class
    //so above if i write class Myhouse extends House Object
    //it will give error because it is multiple inheritance

    String name = "Mera";
    int rooms = 3;
    
    //Method overloading (same name different Signature)
    public void store(){
        System.out.println("There are "+rooms+" rooms in "+name);
    }
}


public class multipleInheritance {
    public static void main(String[] args) {
        Myhouse mine = new Myhouse();
        mine.store("Ghar",1000);
    }
}
