package com.lambdaschool.javaorders.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "payments")
public class Payment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentid;

    @Column(nullable = false)
    private String type;

    public Payment()
    {
    }

    @ManyToMany(mappedBy = "payments")
    private Set<Order> orders = new HashSet<>();

    public Payment(String type)
    {
        this.type = type;
    }



    public long getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(long paymentid) {
        this.paymentid = paymentid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentid=" + paymentid +
                ", type='" + type + '\'' +
                '}';
    }
}
