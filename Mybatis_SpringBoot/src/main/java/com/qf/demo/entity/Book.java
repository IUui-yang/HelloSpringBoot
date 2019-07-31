package com.qf.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class Book {
    private Integer id;

    @NotBlank(message = "书名不能为空...")
    private String bookName;


    @DecimalMin(value = "20.0",message ="价格不能小于20..." )
    private Double price;

    @Min(value = 18, message = "用户ID不能小于18...")
    private Integer userId;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", userId=" + userId +
                '}';
    }


    public Book() {
    }

    public Book(Integer id, String bookName, Double price, Integer userId) {
        this.id = id;
        this.bookName = bookName;
        this.price = price;
        this.userId = userId;
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getBookName() {
//        return bookName;
//    }
//
//    public void setBookName(String bookName) {
//        this.bookName = bookName == null ? null : bookName.trim();
//    }
//
//    public Double getPrice() {
//        return price;
//    }
//
//    public void setPrice(Double price) {
//        this.price = price;
//    }
//
//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
}