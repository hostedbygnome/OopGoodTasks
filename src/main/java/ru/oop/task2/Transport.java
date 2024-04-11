package ru.oop.task2;

/**
 * Транспорт
 *
 * @author mnovozhilov
 * @since 05.04.2024
 */
public abstract class Transport implements Positioned
{
    @Override
    public Position getPosition()
    {
        return null;
    }

    /**
     * Проехать от текущей позиции к заданной точке
     */
    void goTo(Position destination)
    {
    }
}