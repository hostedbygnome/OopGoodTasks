package ru.oop.task3;

import java.util.List;

/**
 * <b>Задача 3:</b><br>
 * То же самое, что и задача 2, но добраться нужно с пересадками<br>
 * Можно определить транспортные средства списком:<br>
 * {@code Arrays.asList(new Car(person), new Bus("43", person),
 *        new Bus("50", person));}
 * <ul>
 *   <li>Код не должен превышать 12 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(Person person, Position destination)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 * </ul>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class MainTask3 {

    /**
     * Переехать из текущего места в заданную точку
     * на любом, заранее определённом транспорте
     */
    public static void moveTo(Person person, List<Transport> vehicles, Position destination)
    {
        for (int i = 0; i < vehicles.size(); i++)
        {
            Transport currentRequiredTransport = vehicles.get(i);
            person.walk(currentRequiredTransport.getPosition());
            person.goToTransport(currentRequiredTransport);
            if (i + 1 != vehicles.size()) // если есть пересадка — нужно двигаться к следующему транспорту
            {
                currentRequiredTransport.goTo(vehicles.get(i + 1).getPosition());
            }
            else
            {
                currentRequiredTransport.goTo(destination);
            }
        }
        person.walk(destination);
        assert person.getPosition() == destination;
    }
}
