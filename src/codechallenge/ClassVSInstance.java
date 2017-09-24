package codechallenge;

import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 9/23/17.
 */
public class ClassVSInstance {

    static class Person {
        private int age;

        public Person(int initialAge) {
            // Add some more code to run some checks on initialAge
            if (initialAge >= 0) {
                this.age = initialAge;
            } else {
                age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            }
        }

        public void amIOld() {
            String ans = "";
            if (age < 13) {
                ans = "You are young.";
            } else if (age >= 13 && age < 18) {
                ans = "You are a teenager.";
            } else {
                ans = "You are old.";
            }
            // Write code determining if this person's age is old and print the correct statement:
            System.out.println(ans);
        }

        public void yearPasses() {
            // Increment this person's age.
            age++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }

}
