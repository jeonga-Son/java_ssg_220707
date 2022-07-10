package com.ll.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class App {
        public void run() {
            System.out.println("\n======= 명언 SSG =======\n");
            System.out.println("[명령어를 입력해주세요.]");
            Scanner sc = new Scanner(System.in);

            // 가장 마지막 명언글의 번호
            List<WiseSaying> wiseSayings = new ArrayList<>(); // ArrayList<Object> wiseSayings = new ArrayList<WiseSaying>으로도 쓸 수 있음.
                                                                //업캐스팅 해서 선언한 것. ArrayList는 빠른 탐색, List인터페이스를 구현한 LinkedList는
                                                                // 삽입/ 삭제에 유리하다는 장점이 있음. 나중에 기존 코드를 바꾸지 않고 인터페이스 내에서 변경하기 쉽도록 하기 위해서이다.
            int wiseSayingLastId = 0;

        outer:
        while (true) {
            System.out.printf("명령) ");
            String cmd = sc.nextLine().trim();

            switch (cmd) {
                case "등록":
                    System.out.printf("명언 : ");
                    String content = sc.nextLine().trim();
                    System.out.printf("작가 : ");
                    String author = sc.nextLine().trim();
                    int id = ++wiseSayingLastId; // 명언 글 번호 증가

                    WiseSaying wiseSaying = new WiseSaying(id, content, author);
                    wiseSayings.add(wiseSaying);

                    System.out.printf("%d번 명언이 등록되었습니다.\n", id);
                    //System.out.println(wiseSayings);
                    break;

                case "목록":

                    System.out.println("\n번호 / 작가 / 명언");
                    System.out.println("---------------------------------------------------");
                    if(wiseSayings.size() == 0) {
                        System.out.println("[리스트가 존재하지 않습니다. 명언을 입력해주세요.]\n");
                    }

                    for (int i = wiseSayings.size() - 1; i >= 0; i--) {
                        WiseSaying wiseSaying_ = wiseSayings.get(i);
                        System.out.printf("%d / %s / %s\n", wiseSaying_.id, wiseSaying_.content, wiseSaying_.author);
                    }
                    System.out.println("");
                    break;

                case "종료":
                    break outer;
            }
        }
        sc.close();
    }
}