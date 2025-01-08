package com.wecp.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Shipment;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Integer>{
    @Query("select s from shipment s where s.shipmentId= : shipmentId")
    Shipment findByShipmentId(int shipmentId);
    
    @Query("delete from Shipment s where s.warehouse.warehouseId = :warehouseId")
    void deleteByWarehouseId(int warehouseId);

    @Query("delete from Shipment s where s.product.productID = :productId")
    void deleteByProductId(int productId);
    @Query("delete from Shipment s where s.product.supplier.supplierId = :supplierId")
    void deleteBySupplierId(int supplierId);

}
