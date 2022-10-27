package com.book;
import java.util.Scanner;

public class Book
{
    private int id;
    private String name;
    private String author;
    private String publication;
    private int year;
    private int amount;
    private int price;

    public Book(int id,String name,String author,String publication,int year,int amount, int price)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publication = publication;
        this.year = year;
        this.amount = amount;
        this.price = price;
    }

    public static void printBooksByAuthor(Book[] objects)
    {
        System.out.print("Enter name author: ");
        Scanner sc = new Scanner(System.in);
        String author = sc.nextLine();
        boolean flag = false;

        for(Book object : objects)
        {
            if(author.equals(object.author))
            {
                System.out.println(object.toString());
                flag = true;
            }
        }

        if(!flag)
            System.out.println("Elements not found");

    }

    public static void printBooksByPublications(Book[] objects)
    {
        System.out.print("Enter name publications: ");
        Scanner sc = new Scanner(System.in);
        String publication = sc.nextLine();
        boolean flag = false;

        for(Book object : objects)
        {
            if(publication.equals(object.publication))
            {
                System.out.println(object.toString());
                flag = true;

            }
        }
        if(!flag)
            System.out.println("Elements not found");
    }

    public static void printBooksByYear(Book[] objects)
    {
        System.out.print("Enter year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean flag = false;

        for(Book object : objects)
        {
            if(object.year > year)
            {
                System.out.println(object.toString());
                flag = true;
            }
        }
        if(!flag)
            System.out.println("Elements not found");
    }

    public static void printAll(Book[] objects)
    {
        for(Book object : objects)
            System.out.println(object);
    }

    @Override
    public String toString()
    {
       return id + " " + name + " " + author + " " + publication + " " + year + " " + amount + " " + price;
    }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAuthor(String author) { this.author = author; }
    public void setPublication(String publication) { this.publication = publication; }
    public void setYear(int year) { this.year = year; }
    public void setAmount(int amount) { this.amount = amount; }
    public void setPrice(int price) { this.price = price; }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getAuthor() { return author; }
    public String getPublication() { return publication; }
    public int getYear() { return year; }
    public int getAmount() { return amount; }
    public int getPrice() { return price; }
}