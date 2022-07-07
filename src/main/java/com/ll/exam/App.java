package com.ll.exam;

import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("== 명언 SSG ==");

        Scanner sc = new Scanner(System.in);

        int wiseSayinglastId = 0;

        outer:
        while (true) {
            System.out.printf("명령) ");
            String cmd = sc.nextLine().trim();

            switch (cmd) {
                case "종료":
                    break outer;

                case "등록" :
                    System.out.printf("명언 : ");
                    String content = sc.nextLine().trim();
                    System.out.printf("작가 : ");
                    String author = sc.nextLine().trim();
                    int id = ++wiseSayinglastId;

                    WiseSaying wiseSaying = new WiseSaying(id, content, author);
                    System.out.println(wiseSaying);

                    System.out.printf("%d번 명언이 등록되었습니다.\n", id);
                    break;

                case "목록" :
                    System.out.println("|  번호  |  작가  |  명언  |");
            }
        }

        sc.close();
    }
}