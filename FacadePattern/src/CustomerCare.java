public class CustomerCare {
    private PhoneCall Order;
    private PhoneCall Payment;
    private PhoneCall Delivery;
    
    public CustomerCare()
    {
        Order = new Order();
        Payment= new Payment();
        Delivery= new Delivery();
    }
    
    public void takeOrder()
    {
        Order.action();
    }
    public void takePayment()
    {
        Payment.action();
    }
    public void Delivery()
    {
        Delivery.action();
    }
}
