package pl.pgrochala.sales.payment;

public interface PaymentGateway {

    RegisterPaymentResponse handle(RegisterPaymentRequest registerPaymentRequest);
}
