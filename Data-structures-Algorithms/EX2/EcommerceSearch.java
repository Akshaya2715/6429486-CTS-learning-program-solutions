import java.util.*;

public class EcommerceSearch{
    static class Product{
        int id;
        String name;
        String category;
        public Product(int id,String name,String category){
            this.id=id;
            this.name=name;
            this.category=category;
        }
        public String toString(){
            return "Product : ID="+id+",Name='"+name+"',Category='"+category;
        }
    }
    public static Product findProductLinear(Product[] products,int searchId){
        for(Product p:products){
            if(p.id==searchId)return p;
        }
        return null;
    }
    public static Product findProductBinary(Product[] products,int searchId){
        int start=0,end=products.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(products[mid].id==searchId)return products[mid];
            else if(products[mid].id<searchId)start=mid+1;
            else end=mid-1;
        }
        return null;
    } 
    public static void main(String[] args){
        Product[] inventory={
            new Product(55,"Kurtas","Clothing"),
            new Product(56,"Bracelet","Accessories"),
            new Product(57,"Keyboard","Electronics"),
            new Product(58,"Moisturizer","SkinCare"),
            new Product(59,"Slippers","Footwear")
        };
        System.out.println("6429486 - Akshaya V");
        System.out.println("All Products:");
        for(Product p:inventory){
            System.out.println(p);
        }
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter Product ID to search:");
        int searchId=sc.nextInt();
        Product resultLinear=findProductLinear(inventory,searchId);
        System.out.println("\nLinear Search Result:"+(resultLinear!=null?resultLinear:"Product not found"));
        Arrays.sort(inventory,Comparator.comparingInt(p->p.id));
        Product resultBinary=findProductBinary(inventory,searchId);
        System.out.println("Binary Search Result:"+(resultBinary!=null?resultBinary:"Product not found"));
    }
}
