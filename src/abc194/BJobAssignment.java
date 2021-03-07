package abc194;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * https://atcoder.jp/contests/abc194/tasks/abc194_b
 * 
 * 解説によれば O(N) のやり方だった模様。なお、一般的には全探索で解くらしい。
 * https://atcoder.jp/contests/abc194/editorial/870
 */
public class BJobAssignment {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      List<Employee> employees = new ArrayList<>(N);
      for (int i = 0; i < N; i++) {
        int A = sc.nextInt();
        int B = sc.nextInt();
        employees.add(new Employee(i, A, B));
      }
      employees.sort(Comparator.comparingInt(Employee::getA));
      // for (Employee employee : employees) {
      // System.out.println(employee.id + " " + employee.A + " " + employee.B);
      // }
      Employee firstMinAEmployee = employees.get(0);
      Employee secondMinAEmployee = employees.get(1);
      employees.sort(Comparator.comparingInt(Employee::getB));
      // for (Employee employee : employees) {
      // System.out.println(employee.id + " " + employee.A + " " + employee.B);
      // }
      Employee firstMinBEmployee = employees.get(0);
      Employee secondMinBEmployee = employees.get(1);
      if (firstMinAEmployee.id != firstMinBEmployee.id) {
        System.out.println(Integer.max(firstMinAEmployee.A, firstMinBEmployee.B));
      } else {
        int pattern1 = firstMinAEmployee.A + firstMinBEmployee.B;
        int pattern2 = Integer.min(Integer.max(firstMinAEmployee.A, secondMinBEmployee.B),
            Integer.max(secondMinAEmployee.A, firstMinBEmployee.B));
        System.out.println(Integer.min(pattern1, pattern2));
      }
    }
  }

  static class Employee {
    final int id;
    final int A;
    final int B;

    public Employee(int id, int A, int B) {
      this.id = id;
      this.A = A;
      this.B = B;
    }

    int getA() {
      return A;
    }

    int getB() {
      return B;
    }

  }
}
