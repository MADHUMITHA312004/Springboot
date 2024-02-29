package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Medicine;
import com.example.demo.service.MedicineService;;
@RestController
public class MedicineController {
    private final MedicineService medicineService;

    public MedicineController(MedicineService medicineService) {
        this.medicineService = medicineService;
    }
    @PostMapping("/api/medicine")
    public ResponseEntity<Medicine>createMedicine(@RequestBody Medicine medicine){
        Medicine createdMedicine=medicineService.createMedicine(medicine);
        return new ResponseEntity<>(createdMedicine,HttpStatus.CREATED);
    }
    @GetMapping("/api/medicines")
    public ResponseEntity<List<Medicine>>getAllMedicines(){
        List<Medicine>medicines=medicineService.getAllMedicines();
        return new ResponseEntity<>(medicines,HttpStatus.OK);
    } 
    @GetMapping("/api/medicine/{medicineId}")
    public ResponseEntity<Medicine>getById(@PathVariable int medicineId){
        Medicine medicine=medicineService.getMedicineById(medicineId);
        if(medicine!=null){
            return new ResponseEntity<>(medicine,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } 
}