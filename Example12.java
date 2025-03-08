class Product
{
    String ProdImg;
    String prodName;
    int mrp;
    float ratings;
    void printObject(){
        System.out.println("prodImg is"+this.ProdImg);
        System.out.println("product name is "+this.prodName);
        System.out.println("prod price is"+this.mrp);
        System.out.println("prod rating is "+this.ratings);
    }
}

class Example12
{
    public static void main(String args[])
    {
        Product p1=new Product();
        p1.ProdImg="https://www.google.com";
        p1.prodName="iphone";
        p1.mrp=100000;
        p1.ratings=4.5f;
        p1.printObject();
    }
}