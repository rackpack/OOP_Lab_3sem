package ru.mirea.leo;

public class Horse implements Lab4_Priceable
{
    int price;
    Horse(int price)
    {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
