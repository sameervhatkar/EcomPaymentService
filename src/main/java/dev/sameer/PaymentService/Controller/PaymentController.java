package dev.sameer.PaymentService.Controller;

import com.razorpay.RazorpayException;
import dev.sameer.PaymentService.DTO.PaymentRequestDTO;
import dev.sameer.PaymentService.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment")
    public ResponseEntity<String> doPayment(@RequestBody PaymentRequestDTO paymentRequestDTO) throws RazorpayException {
        return ResponseEntity.ok(paymentService.doPayment(paymentRequestDTO));
    }
}
