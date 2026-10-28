class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat is meowing");
    }
}

class Cow extends Animal {
    void chew() {
        System.out.println("Cow is chewing grass");
    }
}

class AnimalInherit2{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        Cow co1 = new Cow();

        d1.eat();
        d1.bark();

        c1.eat();
        c1.sound();

        co1.eat();
        co1.chew();
    }
}