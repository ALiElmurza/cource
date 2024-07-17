package lesson3.homeWork3;

public class Card {
    void printCard(String cardNumber) {
        StringBuilder privatCard = new StringBuilder(cardNumber);
        privatCard.substring(0, '*');
        privatCard.substring(1, '*');
        privatCard.substring(2, '*');
        privatCard.substring(3, '*');
        privatCard.substring(4, '*');
        privatCard.substring(5, '*');
        privatCard.substring(6, '*');
        privatCard.substring(7, '*');
        privatCard.substring(8, '*');
        privatCard.substring(9, '*');
        privatCard.substring(10, '*');
        privatCard.substring(11, '*');


        System.out.println(privatCard);
    }
}
