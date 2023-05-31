
public class Test {
    public static void main(String[] args) {

        Steel steel = new Steel();
        Iron iron = new Iron();
        Copper copper = new Copper();
        Plastic plastic = new Plastic();

        String checkResult;

        Sword<Steel> steelSword = new Sword<>(steel);
        checkResult = steelSword.checkEndurance()
                ? "Проверка прочности пройдена"
                : "Проверка прочности не пройдена";
        System.out.println("Steel sword - ".concat(checkResult));

        Sword<Iron> ironSword = new Sword<>(iron);
        checkResult = ironSword.checkEndurance()
                ? "Проверка прочности пройдена"
                : "Проверка прочности не пройдена";
        System.out.println("Iron sword - ".concat(checkResult));

        Sword<Copper> copperSword = new Sword<>(copper);
        checkResult = copperSword.checkEndurance()
                ? "Проверка прочности пройдена"
                : "Проверка прочности не пройдена";
        System.out.println("Cooper sword - ".concat(checkResult));

//        Создать пластиковый мечь невозможно
//        Sword<Plastic> plasticSword = new Sword<>(plastic);
    }
}
