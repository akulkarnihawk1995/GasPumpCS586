package main;
//Abstract Factory Pattern
//This class contains methods (defined) and variables that will be used by GasPump2 or GP2
//This class mostly contains getters and setters that'll be used by GP2
public class DataStore2 extends DataStore {
    float temp_a;
    float temp_b;
    String temp_p;
    String pin;
    float price;
    int G;
    float total;
    float Rprice;
    float Dprice;
    float Sprice;
    float temp_c;

    public float getFloatTemp_a() {
        return temp_a;
    }

    public void setTemp_a(float temp_a) {
        this.temp_a = temp_a;
    }

    public float getTemp_b() {
        return temp_b;
    }

    public void setTemp_b(float temp_b) {
        this.temp_b = temp_b;
    }

    public String getTemp_p() {
        return temp_p;
    }

    public void setTemp_p(String temp_p) {
        this.temp_p = temp_p;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public float getFloatPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        G = g;
    }

    public float getFloatTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getRprice() {
        return Rprice;
    }

    public void setRprice(float rprice) {
        Rprice = rprice;
    }

    public float getDprice() {
        return Dprice;
    }

    public void setDprice(float dprice) {
        Dprice = dprice;
    }

    public float getSprice() {
        return Sprice;
    }

    public void setSprice(float sprice) {
        Sprice = sprice;
    }

    public float getFloatTemp_c() {
        return temp_c;
    }

    public void setTemp_c(float temp_c) {
        this.temp_c = temp_c;
    }

    //Datastore1's method are abstract here. These methods are implemented here because class is declared
    @Override
    public int getIntTemp_c() {
        return 0;
    }

    @Override
    public void setTemp_c(int temp_c) {

    }

    @Override
    public int getCash() {
        return 0;
    }

    @Override
    public void setCash(int cash) {

    }

    @Override
    public int getIntTotal() {
        return 0;
    }

    @Override
    public void setTotal(int total) {

    }

    @Override
    public int getL() {
        return 0;
    }

    @Override
    public void setL(int l) {

    }

    @Override
    public int getIntPrice() {
        return 0;
    }

    @Override
    public void setPrice(int price) {

    }

    @Override
    public int getIntTemp_a() {
        return 0;
    }

    @Override
    public void setTemp_a(int temp_a) {

    }

    @Override
    public int getW() {
        return 0;
    }

    @Override
    public void setW(int w) {

    }

}
