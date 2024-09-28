package dev.sameer.PaymentService.Service;

import com.razorpay.RazorpayException;
import dev.sameer.PaymentService.DTO.PaymentRequestDTO;

public interface PaymentService {
    String doPayment(PaymentRequestDTO paymentRequestDTO) throws RazorpayException;
}
