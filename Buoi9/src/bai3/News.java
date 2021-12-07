package bai3;

import  java.util.ArrayList;
import  java.util.Scanner ;
public class News implements INews{
    private int id ;
    private String title ;
    private String publishDate ;
    private String author ;
    private String content ;
    private float averageRate ;
    Scanner sc = new Scanner(System.in) ;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setContent(String content) {
        this.content = content;
    }

    ArrayList<Integer> rateList = new ArrayList<>();
    public void InputCal (){
        for (int i = 0 ;i<3;i++) {
            System.out.print("Nhap danh gia :");
            rateList.add(sc.nextInt()) ;
        }
    }
    public void Calculate() {
        int sum = 0 ;
        for (int i = 0; i < rateList.size(); i++) {
            sum+= rateList.get(i) ;
        }
        this.averageRate = sum/rateList.size() ;
    }

    @Override
    public void display() {
        System.out.println("Title :" + this.title);
        System.out.println("PublishDate : " + this.publishDate);
        System.out.println("Author : " + this.author);
        System.out.println("Content : " + this.content);
        System.out.println("AverageRate : " + this.averageRate);
    }


}
