import java.util.*;

public class Main {
    public static void main(String[] args) {
      Product laptop = new Product("Laptop", 80000);
      Product needle = new Product("needle", 2);
      Product mobile = new Product("Mobile", 55000);

      ShoopingCart sc = new ShoopingCart();
      Scanner s = new Scanner(System.in);

      while(true){
        System.out.println("    menu   ");
        System.out.println("0. exit");
        System.out.println("1. add product");
        System.out.println("2. view cart");
        System.out.print("select your choose: ");
        int choose = s.nextInt();

        if(choose == 0){
          break;
        }

        if(choose == 1){
          System.out.println("1. laptop");
          System.out.println("2. mobile");
          System.out.println("3. needle");
          System.out.print("select your choose: ");
          int cho = s.nextInt();

          switch(cho){
              case 1 -> sc.addProduct(laptop);
              case 2 -> sc.addProduct(mobile);
              case 3 -> sc.addProduct(needle);
              default -> System.out.println("invalid inout");
          }
        } else if(choose == 2){
          sc.printProductAdded();
        }
      }

      sc.calculateTotal();
   }
}

class Product{
    private String name;
    private double price;
    private int quantity;

    Product(String name, double price){
       this.name = name;
       this.price = price;
    }

    // void setName(String name){
    //   this.name = name;
    // }

    // void setPrice(double price){
    //   this.price = price;
    // }

    void addQuantity(double q){
      this.quantity += q;
    }

    String getName(){
      return this.name;
    }

    double getPrice(){
      return this.price;
    }

    double getQuantity(){
      return this.quantity;
    }

    public String toString(){
      return name +"       "+ quantity+"         "+price;
    }
}

class ShoopingCart{
   ArrayList<Product> product = new ArrayList<>();

   void addProduct(Product p){
      if(!this.product.contains(p)){

          p.addQuantity(1);
          product.add(p); 

      } else {

          for(Product pro: product){
              if(p.getName().equals(pro.getName())){
                  pro.addQuantity(1);
              }
          }

      } 
   }

   void printProductAdded(){
      System.out.println("***********************************");
      System.out.println("    Product in cart");
      System.out.println("Name       Quantity    Price");
      for(Product p:this.product){
        System.out.println(p);
      }
      System.out.println("***********************************");
   }

   void calculateTotal(){
      double total = 0;

      for(Product pro:product){
         total += pro.getPrice()*pro.getQuantity();
      }


      printProductAdded();

      System.out.println("Total    " + total);

      if(total > 5000){
          System.out.println("Discount      10%");
          total = total* 0.9;
      }else{
        System.out.println("Discount      0%");
      }

      System.out.println("GrandTotal    " + total);
      System.out.println("***********************************");
   }
}
