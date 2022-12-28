import java.util.Scanner;

public class Enemy_Unit_Info {
    public static void enemyUnit() {
        Scanner in = new Scanner(System.in);
        System.out.println("상대 유닛 [이름] 을 입력해 주세요.");
        String unit1Id2 = in.nextLine();
        System.out.println("상대 유닛 [공격력] 을 입력해 주세요.");
        int unit1AttackValue2 = in.nextInt();
        if (unit1AttackValue2 < 0 || unit1AttackValue2 > 50) {
            System.out.println("상대 유닛의 유효 공격력은 1 ~ 50 입니다.");
        }
        System.out.println("상대 유닛 [방어력] 을 입력해 주세요.");
        int unitShieldValue2 = in.nextInt();
        if (unitShieldValue2 < 0 || unitShieldValue2 > 10) {
            System.out.println("상대 유닛의 유효 방어력은 1 ~ 10 입니다.");
        }
        System.out.println("상대 유닛 [체력] 을 입력해 주세요.");
        int unitHealthValue2 = in.nextInt();
        if (unitHealthValue2 < 0 || unitHealthValue2 > 50) {
            System.out.println("상대 유닛의 유효 방어력은 1 ~ 50 입니다.");
        }
        System.out.println("[안내] 생성된 유닛 정보는 다음과 같습니다.");
        System.out.println("[안내] "+unit1Id2+" 유닛이 게임에 참여하였습니다.");
        System.out.println("[공격력] : " +unit1AttackValue2);
        System.out.println("[방어력] : " +unitShieldValue2);
        System.out.println("[체력] : " +unitHealthValue2);
    }
}
