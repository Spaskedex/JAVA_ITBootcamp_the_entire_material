package ObjektnoOrjentisanoProgramiranje.Class_8_OOP.Auto_covek.Auto_Covek;


/*
Zadatak 1:
Napraviti klasu Auto koja ima od atributa naziv modela, maksimalnu brzinu na sat, cenu i boju.
Napraviti metodu koja racuna za Koliko sati taj auto moze da predje 1000km.
Napraviti metodu koja smanjuje cenu za 10% ako je boja automobila ljubicasta.
Klasa mora imati adekvatan konstruktor i toString.
 */

public class car {

   private String model;
   private int maxSpeed;
   private double price;
   private String color;

    public car(String model, int maxSpeed, double price, String color) {
          this.model=model;
          this.maxSpeed=maxSpeed;
          this.price=price;
          this.color=color;

    }

    public String toString() {
        return model + " " + maxSpeed + " " + price + " " + color;
    }

    public int speed(int maxSpeed) {
        return 1000/maxSpeed;
    }

    public double popustNaBoju(String color) {
        if(getColor().equals("purple")) {
            price*=0.9;
            return price;
        } else {
            return price;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel (String model) {
        this.model=model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int newSpeed) {
        this.maxSpeed=newSpeed;
    }

    public double getPrice() {
        return  price;
    }

    public void setPrice(double newPrice) {
        this.price=newPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color=newColor;
    }




}
