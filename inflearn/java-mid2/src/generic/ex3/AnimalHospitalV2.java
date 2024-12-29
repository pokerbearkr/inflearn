package generic.ex3;

public class AnimalHospitalV2<T> {
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        animal.toString();
        animal.equals(null);
        //System.out.println("동물 이름:" + animal.getName());
       // System.out.println("동물 크기:" + animal.getSize());
        //animal.sound();
    }

    public T bigger(T target) {
        return null;
    //    return animal.getSize() > target.getSize() ? animal : target;
    }
}
