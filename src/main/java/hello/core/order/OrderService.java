package hello.core.order;

public interface OrderService {
    Order createOrder(Long memberId,String iemName, int itemPrice);


}
