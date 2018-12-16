package ru.mirea.leo;

public class Car implements Lab4_Priceable
{
    int price;
    Car(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return price;
    }
}
