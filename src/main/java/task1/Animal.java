/**
 * Створити нову базу даних за допомогою MySQLWorkbench.
 * Створити звичайний java-проєкт та під'єднати до нього бібліотеки JPA та Hibernate.
 * Створити файл з налаштуваннями persistence.xml у теці META-INF.
 * Створити клас Animal (int age, String name, boolean tail) з методами get та set як сутність до нашої таблиці.
 * За допомогою jpa зробити crud у класі AnimalHelper.
 */


package task1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Animal {
    @Id
    @GeneratedValue
    int id;
    int age;
    String name;
    boolean tail;
}

