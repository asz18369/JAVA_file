class Test{}

class Dog{
        int size;
        String breed;
        String name;

        void bark() {
            System.out.println("Ruff!");
        }

        
    public static void main(String[] args){
        Dog d = new Dog();
        d.size = 40;
        d.bark();

        
    }
}

class Cat {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("meow");
    }
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.size = 10;
        cat.bark();
    }
}
