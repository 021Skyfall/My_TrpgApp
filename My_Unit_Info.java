import java.util.Scanner;

public class My_Unit_Info {
    String unit1Id;
    int unit1AttackValue;
    int unitShieldValue;
    int unitHealthValue;

    public static void myUnit() {
        Scanner in = new Scanner(System.in);
        System.out.println("유닛 [이름] 을 입력해 주세요.");
        String unit1Id = in.nextLine();
        System.out.println("유닛 [공격력] 을 입력해 주세요.");
        int unit1AttackValue = in.nextInt();
        if (unit1AttackValue < 0 || unit1AttackValue > 50) {
            System.out.println("유닛의 유효 공격력은 1 ~ 50 입니다.");
        }
        System.out.println("유닛 [방어력] 을 입력해 주세요.");
        int unitShieldValue = in.nextInt();
        if (unitShieldValue < 0 || unitShieldValue > 10) {
            System.out.println("유닛의 유효 방어력은 1 ~ 10 입니다.");
        }
        System.out.println("유닛 [체력] 을 입력해 주세요.");
        int unitHealthValue = in.nextInt();
        if (unitHealthValue < 0 || unitHealthValue > 50) {
            System.out.println("유닛의 유효 방어력은 1 ~ 50 입니다.");
        }
        System.out.println("[안내] 생성된 유닛 정보는 다음과 같습니다.");
        System.out.println("[안내] "+unit1Id+" 유닛이 게임에 참여하였습니다.");
        System.out.println("[공격력] : " +unit1AttackValue);
        System.out.println("[방어력] : " +unitShieldValue);
        System.out.println("[체력] : " +unitHealthValue);
    }
    public static void myAttack() {
        int unit1AttackValue;
    }
}
