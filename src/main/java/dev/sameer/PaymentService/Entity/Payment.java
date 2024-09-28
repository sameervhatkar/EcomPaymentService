package dev.sameer.PaymentService.Entity;

import dev.sameer.PaymentService.Enum.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private UUID paymentId;
    private double amount;
    private UUID userId;
    private UUID orderId;
    private UUID transactionId;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @OneToOne
    private Currency currency;
}
