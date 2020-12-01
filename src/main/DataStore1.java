package main;

public class DataStore1 extends DataStore {
    int temp_c;
    int cash;
    int total;
    int L;
    int price;
    int temp_a;
    int w;

    @Override
    public int getIntTemp_c() {
        return temp_c;
    }

    public void setTemp_c(int temp_c) {
        this.temp_c = temp_c;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getIntTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getL() {
        return L;
    }

    public void setL(int l) {
        L = l;
    }

    public int getIntPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIntTemp_a() {
        return temp_a;
    }

    public void setTemp_a(int temp_a) {
        this.temp_a = temp_a;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }


    // overriden methods return nothing abstract

    @Override
    public float getFloatTemp_a() {
        return 0;
    }

    @Override
    public void setTemp_a(float temp_a) {

    }

    @Override
    public float getTemp_b() {
        return 0;
    }

    @Override
    public void setTemp_b(float temp_b) {

    }

    @Override
    public String getTemp_p() {
        return null;
    }

    @Override
    public void setTemp_p(String temp_p) {

    }

    @Override
    public String getPin() {
        return null;
    }

    @Override
    public void setPin(String pin) {

    }

    @Override
    public float getFloatPrice() {
        return 0;
    }

    @Override
    public void setPrice(float price) {

    }

    @Override
    public int getG() {
        return 0;
    }

    @Override
    public void setG(int g) {

    }

    @Override
    public float getFloatTotal() {
        return 0;
    }

    @Override
    public void setTotal(float total) {

    }

    @Override
    public float getRprice() {
        return 0;
    }

    @Override
    public void setRprice(float rprice) {

    }

    @Override
    public float getDprice() {
        return 0;
    }

    @Override
    public void setDprice(float dprice) {

    }

    @Override
    public float getSprice() {
        return 0;
    }

    @Override
    public void setSprice(float sprice) {

    }

    @Override
    public float getFloatTemp_c() {
        return 0;
    }

    @Override
    public void setTemp_c(float temp_c) {

    }

}
