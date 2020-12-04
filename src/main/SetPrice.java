package main;
//Strategy Pattern
//Parent class or base class for SetPrice Strategies.
//This is also a Component In Abstract Factory Pattern.
public abstract class SetPrice {
    public abstract void SetPrice(DataStore ds,int price);
}
