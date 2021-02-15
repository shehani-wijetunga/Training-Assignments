package com.shehani.rentcloud.model.customer;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "loyaltyPoint")

public class Loyalty {
    @Id
    @GeneratedValue
    int transactionId;
    @ManyToOne
    @JoinColumn
    Customer customer;
    int point;
    LocalDateTime expireDate;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public LocalDateTime getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDateTime expireDate) {
        this.expireDate = expireDate;
    }
}
