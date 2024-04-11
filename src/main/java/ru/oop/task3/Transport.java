package ru.oop.task3;

/**
 * Транспорт
 *
 * @author mnovozhilov
 * @since 11.04.2024
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