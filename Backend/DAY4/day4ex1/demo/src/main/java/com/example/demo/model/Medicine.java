package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Medicine {
    @Id
    private int medicineId;
    private String medicineName;
    private String medicineFor;
    private String medicineBrand;
    private String manufacturedin; 
    private double medicinePrice;
    private String expiryDate;
    public Medicine(int medicineId, String medicineName, String medicineFor, String medicineBrand,
            String manufacturedin, double medicinePrice, String expiryDate) {
        this.medicineId = medicineId;
        this.medicineName = medicineName;
        this.medicineFor = medicineFor;
        this.medicineBrand = medicineBrand;
        this.manufacturedin = manufacturedin;
        this.medicinePrice = medicinePrice;
        this.expiryDate = expiryDate;
    }
    public int getMedicineId() {
        return medicineId;
    }
    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }
    public String getMedicineName() {
        return medicineName;
    }
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
    public String getMedicineFor() {
        return medicineFor;
    }
    public void setMedicineFor(String medicineFor) {
        this.medicineFor = medicineFor;
    }
    public String getMedicineBrand() {
        return medicineBrand;
    }
    public void setMedicineBrand(String medicineBrand) {
        this.medicineBrand = medicineBrand;
    }
    public String getManufacturedin() {
        return manufacturedin;
    }
    public void setManufacturedin(String manufacturedin) {
        this.manufacturedin = manufacturedin;
    }
    public double getMedicinePrice() {
        return medicinePrice;
    }
    public void setMedicinePrice(double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
   
}
