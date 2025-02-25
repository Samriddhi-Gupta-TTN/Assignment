public class Question_1 {
    enum House{
        ONE_BHK(3221291),
        TWO_BHK(788423824),
        PENT_HOUSE(99837889),
        FARM_HOUSE(78987778);

        int price;

        House(int price){
            this.price = price;
        }
        int getPrice(){
            return price;
        }
    }
    public static void main(String[] args){
        for(House house : House.values())
            System.out.println(house+": Rs."+ house.getPrice());
    }
}
