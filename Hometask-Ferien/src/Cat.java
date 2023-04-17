public class Cat {
    public String name;
    public int age;
    public int weight;

    public Cat(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void out(){
        System.out.println("The name is: " + name);
        System.out.println("The age is: " + age);
        System.out.println("The weight is: " + weight);
    }
}
