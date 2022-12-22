public class main {
    public static void main (String[]args){

       Cartoon[] obj;
        obj = new Cartoon[4];
        
       
         
        for ( int i = 0 ; i<4 ; i++)
        {  obj[i].setName("a" + i);
           obj[i].setAuthor("b" + i);
           obj[i].setPrice(i);
        }
        for ( int i = 0 ; i<1 ; i++)
        {  
           obj[i].getPrice();
           obj[i].getAuthor();
           obj[i].getName();
        }
    }
} 

interface product{
    public void setPrice(double price);
    public void getPrice();
    public void setName(String name);
    public void getName();
    public void getAuthor();
    public void setAuthor(String author);
}

class book implements product{
    double price;
    String name;
    String author;
    public book() {
    }


    void getAuthor(String outher){
        System.out.println("name of outher :" + outher);
    } 
    @Override
    public void getName(){
         System.out.println("name of book :" + name);
    }
    
    @Override
    public void getPrice() {
          System.out.println("Price of book :"+this.price);
    }

    @Override
    public void setPrice(double price) {
         this.price=price;
    }

    @Override
    public void setName(String name) {
          this.name=name;
    }

    @Override
    public void getAuthor() {
        System.out.println("Author : "+author);
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }
    
}

class Cartoon extends book{

    public Cartoon() {
    }


 
}


