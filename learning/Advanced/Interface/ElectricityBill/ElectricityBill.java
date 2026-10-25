interface  Units{
    
    void acceptUnit(double unit);
}

interface Bills{

    void claculateBill();
}

class ElectricityBill implements Units,Bills{

    double unit = 0 ;
    double rate = 12;
    @Override
    public void acceptUnit(double unit){
        this.unit = unit;
    }

    @Override
    public void claculateBill(){
         System.out.println("Bill: " + this.unit * this.rate);
    }

    public static void main(String[] args){
        ElectricityBill eb = new ElectricityBill();

        eb.acceptUnit(230.0);
        eb.claculateBill();
    }
}