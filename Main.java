public class Main {
    public static void main(String[] args) {
        System.out.println("[안내] TRPG 를 시작합니다.");
        System.out.println("[안내] 자신의 유닛 정보를 입력해 주세요.");
        My_Unit_Info.myUnit();
        printBorder.pB();
        Enemy_Unit_Info.enemyUnit();
        printBorder.pB();
    }
}