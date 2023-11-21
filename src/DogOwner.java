public class DogOwner {
    public String name;
    public String sex;
    public Dog dog;

    public DogOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void changeDogName(String newName) {
        dog.name = newName;
    }

    public void increaseDogAge() {
        dog.age++;
    }

    public void setDog(Dog dog) {
         if (this.dog != null) {
             System.out.println("Een eigenaar kan maar 1 hond hebben.");

         } else {
             this.dog = dog;
         }
    }

    public String toString() {
        return (DogOwner.this.name + " heeft een " + dog.species + ", deze " + dog.sex + " is jaar oud en van het soort: " + dog.species + ". De hond heet: " + dog.name);
    }

}
