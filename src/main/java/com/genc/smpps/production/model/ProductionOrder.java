package com.genc.smpps.production.model;


import com.genc.smpps.product.model.FinishedProduct;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ProductionOrder")
public class ProductionOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "productId", nullable = false)
    private FinishedProduct finishedProduct;

    private int plannedQuantity;

    private int producedQuantity;

    private LocalDate startDate;

    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    // Constructors
    public ProductionOrder() {}

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public FinishedProduct getFinishedProduct() {
        return finishedProduct;
    }

    public void setFinishedProduct(FinishedProduct finishedProduct) {
        this.finishedProduct = finishedProduct;
    }

    public int getPlannedQuantity() {
        return plannedQuantity;
    }

    public void setPlannedQuantity(int plannedQuantity) {
        this.plannedQuantity = plannedQuantity;
    }

    public int getProducedQuantity() {
        return producedQuantity;
    }

    public void setProducedQuantity(int producedQuantity) {
        this.producedQuantity = producedQuantity;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}