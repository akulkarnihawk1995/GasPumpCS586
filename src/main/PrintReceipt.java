package main;
//Strategy Pattern
//Parent class or base class for PrintReceipt Strategies.
//This is also a Component In Abstract Factory Pattern.
public abstract class PrintReceipt {
    public abstract void PrintReceipt(DataStore ds);
}
