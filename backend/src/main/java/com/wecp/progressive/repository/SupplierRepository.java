package com.wecp.progressive.repository;

import com.wecp.progressive.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
    @Query("delete from Supplier s where s.supplierId = : supplierId")
    void deleteBySupplierId(@Param("supplierId") int supplierId);
    @Query("select s from supplier s where s.supplierId = :supplierId")
    Supplier findBySupplierId(@Param("supplierId") int supplierId);
    @Query("select s from supplier s where s.username = :username")
    Supplier findByUsername(String username);
    @Query("select s from supplier s where s.email = :email")
    Supplier findByEmail(String email);
}