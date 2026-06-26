package com.java.Inheritance;

public class MobilePhone extends Product {
    int cameraInPixels;
    float dispalySize;

    MobilePhone(){
        super();
        System.out.println("Mobilephone constructor called");

    }

    public MobilePhone(int id, String name, int maxRetailPrice, float discountPercentage, float rating, int reviewsCount, String company, String category, int cameraInPixels, float dispalySize) {
        super(id, name, maxRetailPrice, discountPercentage, rating, reviewsCount, company, category);
        this.cameraInPixels = cameraInPixels;
        this.dispalySize = dispalySize;
    }
    @Override

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Camera In Pixels:" + cameraInPixels);
        System.out.println("dispalySize:" + dispalySize);
    }
}
