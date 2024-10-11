package com.dice.accounts.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter @Setter @ToString
public class Accounts extends BaseEntity {
   @Column(name = "customer_id")
    private Long customerId;

   @Column(name="account_number")
   @Id
    private Long accouneNumber;

   @Column(name="account_type")
    private String accountType;

    @Column(name = "branch_address")
    private String branchAddress;
}
