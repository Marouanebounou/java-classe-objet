// 1
class Student{
    String name;
    int age ;
    double grade;
    public Student(String name , int age , double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void afficher(){
        System.out.println("Name: " + name + " - age : " + age + " - grade : " + grade);
    }
}
// 2
class Product{
    static int counter = 1;
    int id;
    String name;
    double price;
    public Product(String name , double price){
        id = counter++;
        this.name = name;
        this.price = price;
    }
    public void afficherProducts(){
        System.out.println("id: " + id +" Name: " + name + " - price : " + price);
    }
}
// 3
class Rectangle{

    int length;
    int width;
    int area;
    public Rectangle(int length , int width){
        this.length = length;
        this.width = width;
    }

    public void calculateArea(){
        area = length * width;
    }
    public void display(){
        System.out.println("Area = " + area);
    }
}
// 4
class BankAccount{
    static int counter = 1;
    int  accountNumber ;
    double balance;
    public BankAccount(){
        accountNumber = counter++;
        balance = 0.0;
    }
    public void deposit(double amount){
        balance+= amount;
        System.out.println(amount + " effectue avec succès");
    }
    public void withdraw(double amount){
        if (amount > balance) {
            System.out.println("Pas assez d'argent");
        }else{
            balance-= amount;
            System.out.println(amount+" retrait réussi");
        }
    }
    public void displayBalance(){
        System.out.println(balance + "MAD");
    }

}
// 5
class Car{
    String brand;
    String model;
    int year;
    public Car(){
        brand = "Ford";
        model = "Focus";
        year = 2020;
    }
    public Car(String brand,String model,int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void displayCar(){
        System.out.println("Brand : " + brand + " - Model : " + model + " - Year : " + year);
    }
}
// 6
class Circle{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return (radius * radius) *  3.14;
    }
    public double getCircumference(){
        return 2 * 3.14 * radius;
    }
    public void display(){
        System.out.println("Area = " + getArea());
        System.out.println("Circle reference : " + getCircumference());
    }
}
// 7
class Movie{
    String titre;
    int rating;
    public Movie(String titre,int rating){
        this.titre = titre;
        this.rating = rating;
    }
    public void displayRating(){
        if (rating > 8) {
            System.out.println("Excellent");
        }else if (rating >= 5){
            System.out.println("Good");
        }else{
            System.out.println("Poor");
        }
    }


}
// 8
class Employee{
    String name; 
    double salary;
    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    public double annualSalary(){
        return salary * 12;
    }
    public void display(){
        System.out.println("Name : " + name + " - salary : " + salary + " Mad - Annual salary : " + annualSalary() + " Mad");
    }
}
// 9
class Book{
    String title; 
    String author; 
    int price;
    public Book(String title,String author,int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void display(){
        System.out.println("Titre: " + title + " - author : " + author + " - price : " + price + " Mad");
    }
}
// 10
class Temperature{
    int celsius;
    public Temperature(int celsius){
        this.celsius = celsius;
    }
    public double toFahrenheit(){
        return (celsius * 9/5) + 32;
    }
    public void display(){
        System.out.println(toFahrenheit());
    }
}


public class main {
    public static void main(String[] args){
        // 1
        // Student s1 = new Student("Marouane" , 21 ,17.0);
        // s1.afficher();
        // 2
        // Product p1 =new Product("Phone", 5000.0);
        // Product p2 =new Product("Laptop", 10000.0);
        // Product p3 =new Product("Keyboard", 1000.0);
        // p1.afficherProducts();
        // p2.afficherProducts();
        // p3.afficherProducts();
        // 3
        // Rectangle r1 = new Rectangle(5, 2);
        // r1.calculateArea();
        // r1.display();
        // 4
        // BankAccount acc = new BankAccount();
        // acc.displayBalance();
        // acc.deposit(15000.0);
        // acc.withdraw(10000.0);
        // acc.displayBalance();
        // 5
        // Car car = new Car();
        // car.displayCar();
        // Car car2 = new Car("Mercedis" , "E202" , 2025);
        // car2.displayCar();
        // 6
        // Circle c1 = new Circle(12.5);
        // c1.display();
        // 7
        // Movie m1 = new Movie("Good days", 3);
        // m1.displayRating();
        // 8
        // Employee e1 =new Employee("Marouane bounou", 15000.0);
        // e1.display();
        // 9
        // Book b1 = new Book("Good", "Not me", 17);
        // Book b2 = new Book("Baad", "also Not me", 100);
        // Book b3 = new Book("Not bad", "Me this time", 150);
        // b1.display();
        // b2.display();
        // b3.display();
        // 10
        Temperature t1 = new Temperature(25);
        t1.display();

    }
}
