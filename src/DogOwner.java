public class DogOwner {
    public String name;
    public String sex;
    public Dog dog;

    public DogOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void changeDogName(Dog dog, String newName) {
        dog.name = newName;
    }

    public void increaseDogAge(Dog dog) {
        dog.age++;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
        // Ik had hier eerst het volgende om te checken of er al een hond was geinstantieerd, maar dit werkte niet
        // if (this.dog == null) {
        //     this.dog = dog;
        // } else {
        //     System.out.println("Een eigenaar kan maar 1 hond hebben.");
        // }
    }

    public String toString() {
        return (DogOwner.this.name + " heeft een " + dog.species + ", deze " + dog.sex + " is jaar oud en van het soort: " + dog.species + ". De hond heet: " + dog.name);
    }

}
