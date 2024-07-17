package lesson3.homeWork2;

public class Task3 {
    public static void main(String[] args) {

        Item product1 = new Item("арматура", "h1", 1);
        product1.categoryName = "ремонт";
        Item product2 = new Item("бедон", "h2", 31 );
        product2.categoryName = "ремонт";
        Item product3 = new Item("цемент", "h3", 9 );
        product3.categoryName = "ремонт";
        Item product4 = new Item("плитка", "h4", 1 );
        product4.categoryName = "ремонт";
        Item product5 = new Item("шкаф", "h5", 1 );
        product5.categoryName = "мебель";

        System.out.println(product1.code + " - " + product1.name + " - " +  product1.price + " - " +  product1.count + " - " + product1.categoryName );
        System.out.println(product2.code + " - " + product2.name + " - " +  product2.price + " - " +  product2.count + " - " + product2.categoryName );
        System.out.println(product3.code + " - " + product3.name + " - " +  product3.price + " - " +  product3.count + " - " + product3.categoryName );
        System.out.println(product4.code + " - " + product4.name + " - " +  product4.price + " - " +  product4.count + " - " + product4.categoryName );
        System.out.println(product5.code + " - " + product5.name + " - " +  product5.price + " - " +  product5.count + " - " + product5.categoryName );


    }
}
