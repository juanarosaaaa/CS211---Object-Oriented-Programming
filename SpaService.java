public class SpaService{
    private String serviceDescription;
    private double price;

    public static void main(String[] args){
        
    }
    public void setServiceDescription(String service){
        serviceDescription = service;
    }
    public void setPrice(double pr){
        price = pr;
    }
    public String getServiceDescription(){
        return serviceDescription;
    }
    public double getPrice(){
        return price;
    }
}