package task1;

public class Lion {
    public static void main(String[] args) {
        AnimalHelper helper = new AnimalHelper();

        Animal newAnimal = new Animal();
        newAnimal.setName("Лев");
        helper.createAnimal(newAnimal);
        System.out.println("Створення тварини: " + newAnimal.getName());

        Animal readAnimal = helper.readAnimal(newAnimal.getId());
        System.out.println("Прочитано: " + readAnimal.getName());

        readAnimal.setName("Кіт");
        helper.updateAnimal(readAnimal);
        System.out.println("Оновлення: " + readAnimal.getName());

        helper.deleteAnimal(readAnimal.getId());
        System.out.println("Видаляємо тварину за ID: " + readAnimal.getId());

        helper.close();
    }

}
