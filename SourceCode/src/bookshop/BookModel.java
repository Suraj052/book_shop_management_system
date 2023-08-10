/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop;

/**
 *
 * @author suraj
 */
public class BookModel {
    private String id;
    private String name;
    private String author;
    private String category;
    private int quantity;
    private int price;
    private int demand;
    private String buyDate;
    
    public BookModel(String id,String name,String author,String category,int quantity,int price)
    {
        this.id = id;
        this.name=name;
        this.author=author;
        this.category=category;
        this.quantity=quantity;
        this.price=price;
    }
    
    public BookModel(String id,String name,int quantity)
    {
        this.id = id;
        this.name=name;
        this.quantity=quantity;
    }
    
    public BookModel(String id,String name,int quantity,int demand)
    {
        this.id = id;
        this.name=name;
        this.quantity=quantity;
        this.demand = demand;
    }
    public BookModel(String id,String name,int quantity,int price,String buyDate)
    {
        this.id = id;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
        this.buyDate=buyDate;
    }
    
    
    
    public String getID()
    {
        return id;
    }
    
    public String getname()
    {
        return name;
    }
    
    public String getauthor()
    {
        return author;
    }
    
    public String getcategory()
    {
        return category;
    }
    
    public int getquantity()
    {
        return quantity;
    }
    
    public int getprice()
    {
        return price;
    }
    public int getdemand()
    {
        return demand;
    }
    
    public String getdate()
    {
        return buyDate;
    }
}
