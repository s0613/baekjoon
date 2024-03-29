package sorting;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AgeSorting_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Member members[] = new Member[n];
        for(int i = 0; i < n; i++){
            members[i] = new Member(sc.nextInt(), sc.nextLine());
        }
        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return Integer.compare(o1.age, o2.age);
            }
        });
        for (Member member : members) {
            System.out.println(member.age + member.name);
        }
    }
    static class Member{
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
