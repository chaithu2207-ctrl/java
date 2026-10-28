class animalparent{
     void eat(){
        System.out.println("Animal is eating");
    }
}
class dog extends animalparent{
    void bark(){
        System.out.println("Dog barks");
    }
}
class puppy extends dog{
    void weep(){
        System.out.println("puppy is weeping");
    }
}
public class Animal{
public static void main(String[]args){
    puppy p1= new puppy();
    p1.eat();
    p1.bark();
    p1.weep();
}
}