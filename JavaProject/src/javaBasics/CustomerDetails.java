package javaBasics;

public class CustomerDetails {
private String customerId;
private String customerName;
private long phoneNumber;
private String city;
private double unitConsumed;
private double costPerUnit;
public void setCustomerId(String customerId){
 this.customerId=customerId;
}
public void setCustomerName(String customerName){
 this.customerName=customerName;
}
public void setPhoneNumber(long phoneNumber){
 this.phoneNumber=phoneNumber;
}
public void setCity(String city){
 this.city=city;
}
public void setUnitsConsumed(double unitConsumed){
 this.unitConsumed=unitConsumed;
}
public void setCostPerUnit(double costPerUnit){
 this.costPerUnit=costPerUnit;
}
public String getCustomerId(){
 return customerId;
}
public String getCustomerName(){
 return customerName;
}
public long getPhoneNumber(){
 return phoneNumber;
}
public String getCity(){
 return city;
}
public double getUnitsConsumed(){
 return unitConsumed;
}
public double getCostPerUnit(){
 return costPerUnit;
}
public CustomerDetails(String customerId, String customerName, long
phoneNumber, String city, double unitConsumed, double costPerUnit){

 this.customerId=customerId;
 this.customerName=customerName;
 this.phoneNumber=phoneNumber;
 this.city=city;
 this.unitConsumed=unitConsumed;
 this.costPerUnit=costPerUnit;

}
public double calculateElectricityBill(){
 return(unitConsumed*costPerUnit);
 }
}
