package main;
//Strategy Pattern
//Parent class or base class for InitializeData Strategies.
//This is also a Component In Abstract Factory Pattern.
public abstract class InitializeData {
    public abstract void InitializeDate(DataStore ds);
}
