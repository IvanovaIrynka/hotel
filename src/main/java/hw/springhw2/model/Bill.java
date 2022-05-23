package hw.springhw2.model;/*
  @author   User
  @project   spring-hw2
  @class  Bill
  @version  1.0.0 
  @since 05.05.2022 - 20.53
*/

public class Bill {
    private Settlement numbOfSettelment;
    private Discount discount;

    public Bill() {
    }

    public Bill(Settlement numbOfSettelment) {
        this.numbOfSettelment = numbOfSettelment;
    }

    public Settlement getNumbOfSettelment() {
        return numbOfSettelment;
    }

    public void setNumbOfSettelment(Settlement numbOfSettelment) {
        this.numbOfSettelment = numbOfSettelment;
    }
    

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public int getPrice(){
        int price = 0;
        if( this.numbOfSettelment.equals(3)){
             discount.equals(discount.REGULAR_CUSTOMER); }

        if(discount.equals(discount.REGULAR_CUSTOMER)){
            price -= (price * 0.05);}
        return price;
            
        }



    }

