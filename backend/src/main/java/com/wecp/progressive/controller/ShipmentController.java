package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Shipment;
import com.wecp.progressive.service.impl.ShipmentServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ShipmentController {

    @Autowired
    private ShipmentServiceImpl shipmentServiceImpl;

    @GetMapping("/shipment")
    public ResponseEntity<List<Shipment>> getAllShipments() {
        try{
            return new ResponseEntity<>(shipmentServiceImpl.getAllShipments(), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/shipment/{shipmentID}")
    public ResponseEntity<Shipment> getShipmentById(@PathVariable int shipmentID) {
        try{
            if(shipmentServiceImpl.getShipmentById(shipmentID)==null){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(shipmentServiceImpl.getShipmentById(shipmentID), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/shipment")
    public ResponseEntity<Integer> addShipment(@RequestBody Shipment shipment) {
        try{
            return new ResponseEntity<>(shipmentServiceImpl.addShipment(shipment), HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/shipment/{shipmentID}")
    public ResponseEntity<Void> updateShipment(@PathVariable int shipmentID,@RequestBody Shipment shipment) {
        try{
            shipmentServiceImpl.updateShipment(shipment);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/shipment/{shipmentID}")
    public ResponseEntity<Void> deleteShipment(@PathVariable int shipmentID) {
        try{
            shipmentServiceImpl.deleteShipment(shipmentID);
            return new ResponseEntity<>( HttpStatus.NO_CONTENT);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
