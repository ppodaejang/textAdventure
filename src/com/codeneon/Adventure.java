package com.codeneon;

import java.util.Scanner;

import static com.codeneon.PrintSlowly.printSlowly;

public class Adventure {

    Scanner sc = new Scanner(System.in);


    private static void gameOver() {
        printSlowly(".....GAME OVER.....");
        System.exit(0);
    }


    public int EnterCastle() {

        int weapon = 0;

        while (true) {

            printSlowly("성문을 열기 위해 어떤 방법을 선택하시겠습니까? 번호를 입력해주세요.");
            printSlowly("1. 열쇠 찾기");
            printSlowly("2. 무력으로 부수기");

            int choice = Integer.parseInt(sc.nextLine());

            // 1.열쇠 찾기 선택
            if (choice == 1) {
                printSlowly("용사님, 열쇠를 찾아야 합니다. 어디서부터 찾아볼까요?");
                printSlowly("1. 마왕성 주변 탐색");
                printSlowly("2. 마을 사람들에게 정보 구하기");

                int keyChoice = Integer.parseInt(sc.nextLine());

                if (keyChoice == 1) {
                    printSlowly("용사님, 마왕성 주변을 꼼꼼히 살펴보았지만 열쇠는 보이지 않습니다.");
                    printSlowly("다른 방법을 찾아봐야 할 것 같습니다.");
                } else if (keyChoice == 2) {
                    printSlowly("용사님, 마을 사람들에게 열쇠 정보를 구했습니다.");
                    printSlowly("마왕성 지하에 숨겨져 있다고 합니다. 지하로 향해볼까요?");
                    printSlowly("1. 지하로 내려가기");
                    printSlowly("2. 다른 방법 찾아보기");

                    int undergroundChoice = Integer.parseInt(sc.nextLine());

                    if (undergroundChoice == 1) {
                        printSlowly("지하로 내려갑니다.");
                        printSlowly("지하는 고블린으로 가득합니다.");
                        printSlowly("용사님, 이곳은 마왕의 함정이었습니다.");
                        printSlowly("고블린의 공격으로 용사님은 전투 불능 상태에 빠졌습니다.");
                        gameOver();
                        break;
                    } else if (undergroundChoice == 2) {
                        printSlowly("용사님, 다른 방법을 찾아보도록 하겠습니다.");
                        printSlowly("1. 마을 회관으로 가기");
                        printSlowly("2. 장비 가게로 가기");

                        int choiceOther = Integer.parseInt(sc.nextLine());

                        switch (choiceOther) {
                            case 1:
                                printSlowly("마을 회관에 도착하였습니다.");
                                printSlowly("마을 어르신께서 마왕성 지하동굴 지도를 주셨습니다.");
                                break;
                            case 2:
                                printSlowly("장비 가게에 도착하였습니다.");
                                printSlowly("장비 상인께서 최신 무기와 마왕성 지하동굴 지도를 주셨습니다.");
                                weapon = 1;
                                break;
                            default:
                                printSlowly("잘못된 선택입니다. 다시 선택해주세요.");
                                continue;
                        }

                        printSlowly("지도를 가지고 지하동굴로 향합니다.");
                        printSlowly("지도에 표시된 비밀 통로를 통하여 마왕성 안으로 진입하였습니다!");
                        break;
                    } else {
                        printSlowly("잘못된 선택입니다. 다시 선택해주세요.");
                        continue;
                    }
                } else {
                    printSlowly("잘못된 선택입니다. 다시 선택해주세요.");
                    continue;
                }
            } else if (choice == 2) {
                printSlowly("성문을 무력으로 공격합니다.");
                printSlowly("성문에는 방어 마법이 걸려있었습니다.");
                printSlowly("용사님은 마법 공격으로 전투 불능 상태에 빠졌습니다.");
                gameOver();
                break;
            } else {
                printSlowly("잘못된 선택입니다. 다시 선택해주세요.");
                continue;
            }
        }
        return weapon;
    }

    public void solveProblems() {

        printSlowly("====================================================");
        printSlowly("..........");
        printSlowly("용케 성 안으로 들어왔구나..");
        printSlowly("하지만 앞으로 나아가는 것이 쉽지 않을 것이다.");
        printSlowly("어디 한번 함정을 피할 수 있을지 지켜볼까?");


        // 1번 문제
        printSlowly("=========================");
        printSlowly("정면 벽에 문제가 적혀있습니다. 문제를 보고 답을 숫자로 작성해주세요.");
        printSlowly("Q. 12*4-36/3+8+2 = ");
        int answer = Integer.parseInt(sc.nextLine());
        if (answer == 46) {
            printSlowly("문이 열립니다. 다음 단계로 이동합니다.");
        } else {
            printSlowly("틀렸습니다! 천장에서 바위가 떨어집니다!");
            gameOver();
        }

        // 2번 문제
        printSlowly("=========================");
        printSlowly("두 번째 문제가 보입니다.");
        printSlowly("Q. 1, 3, 5, 7, 9의 평균은 얼마일까요? ");
        answer = Integer.parseInt(sc.nextLine());
        if (answer == 5) {
            printSlowly("정답입니다! 문이 열리고 다음 공간으로 이동합니다.");
        } else {
            printSlowly("틀렸습니다! 바닥이 열려 구덩이로 떨어집니다!");
            gameOver();
        }

        // 3번 문제
        printSlowly("=========================");
        printSlowly("마지막 문제입니다. 힘내세요!");
        printSlowly("Q. 사람의 몸에는 몇 개의 감각기관이 있을까요? ");
        answer = Integer.parseInt(sc.nextLine());
        if (answer == 5) {
            printSlowly("정답입니다! 마지막 관문이 열립니다.");
        } else {
            printSlowly("틀렸습니다! 벽에서 독침이 날아옵니다!");
            gameOver();
        }
    }

    public void monsterBattle(){
        int heroHP = 10;
        int mon1HP = 5;
        int mon2HP = 5;

        printSlowly("====================================================");
        printSlowly("..........");
        printSlowly("여기까지 오다니 제법이구나...");
        printSlowly("나를 쓰러뜨리고 싶거든 내 수하와 먼저 싸워야 할 것이다.");
        printSlowly("=========================");

        printSlowly("마왕 앞으로 몬스터 두마리가 나타났습니다.");

        int target = 0;
        boolean gameOver = false;

        // 턴 방식으로 공격
        while (!gameOver){

            if(heroHP<0)
                heroHP =0;
            if(mon1HP<0)
                mon1HP = 0;
            if (mon2HP<0)
                mon2HP = 0;


            printSlowly("용사 체력 : " + heroHP
                    + ", 몬스터1 체력 : " + mon1HP
                    + ", 몬스터2 체력 : " + mon2HP);
            printSlowly("=========================");

            // 몬스터가 있으면 용사가 공격
            if(mon1HP > 0 && mon2HP > 0){
                printSlowly("몬스터1 또는 몬스터2를 공격하시겠습니까?");
                printSlowly("1. 몬스터1 공격");
                printSlowly("2. 몬스터2 공격");
                target = Integer.parseInt(sc.nextLine());

                switch (target){
                    case 1:
                        printSlowly("몬스터1을 공격합니다.");
                        printSlowly("몬스터1의 체력이 2 감소합니다.");
                        mon1HP-=2;
                        if(mon1HP<=0){
                            printSlowly("---몬스터1은 전투 불능 상태가 되었습니다.---");
                        }
                        break;
                    case 2:
                        printSlowly("몬스터2을 공격합니다.");
                        printSlowly("몬스터2의 체력이 2 감소합니다.");
                        mon2HP-=2;
                        if(mon2HP<=0){
                            printSlowly("---몬스터2가 전투 불능 상태가 되었습니다.---");
                        }
                        break;
                    default:
                        printSlowly("잘못된 선택입니다. 다시 선택해주세요.");
                        continue;
                }



            } else if(mon1HP <= 0 && mon2HP > 0){
                printSlowly("몬스터2를 공격하시겠습니까?");
                printSlowly("1. 몬스터2 공격");
                printSlowly("2. 휴식하고 체력 1 회복하기");

                target = Integer.parseInt(sc.nextLine());

                switch (target){
                    case 1:
                        printSlowly("몬스터2을 공격합니다.");
                        printSlowly("몬스터2의 체력이 2 감소합니다.");
                        mon2HP-=2;
                        if(mon2HP<=0){
                            printSlowly("---몬스터2가 전투 불능 상태가 되었습니다.---");
                        }
                        break;
                    case 2:
                        printSlowly("휴식하고 체력 1을 회복합니다.");
                        heroHP+=1;
                        break;
                    default:
                        printSlowly("잘못된 선택입니다. 다시 선택해주세요.");
                        continue;
                }



            } else if(mon1HP>0 && mon2HP<=0){
                printSlowly("몬스터1를 공격하시겠습니까?");
                printSlowly("1. 몬스터1 공격");
                printSlowly("2. 휴식하고 체력 1 회복하기");

                target = Integer.parseInt(sc.nextLine());

                switch (target){
                    case 1:
                        printSlowly("몬스터1을 공격합니다.");
                        printSlowly("몬스터1의 체력이 2 감소합니다.");
                        mon1HP-=2;
                        if(mon1HP<=0){
                            printSlowly("---몬스터1가 전투 불능 상태가 되었습니다.---");
                        }
                        break;
                    case 2:
                        printSlowly("휴식하고 체력 1을 회복합니다.");
                        heroHP+=1;
                        break;
                    default:
                        printSlowly("잘못된 선택입니다. 다시 선택해주세요.");
                        continue;
                }

            } else {
                gameOver = true;
            }

            //몬스터가 공격
            printSlowly("============**============");

            if (mon1HP > 0 && mon2HP > 0) {
                printSlowly("몬스터1이 용사를 공격합니다.");
                printSlowly("용사의 체력이 1 감소합니다.");
                heroHP-=1;
                printSlowly("몬스터2가 용사를 공격합니다.");
                printSlowly("용사의 체력이 1 감소합니다.");
                heroHP-=1;
                if(heroHP<=0){
                    printSlowly("용사가 패배하였습니다..");
                    gameOver = true;
                    break;
                }

            } else if (mon1HP <= 0 && mon2HP > 0){
                printSlowly("몬스터2가 용사를 공격합니다.");
                printSlowly("용사의 체력이 1 감소합니다.");
                heroHP-=1;
                if(heroHP<=0){
                    printSlowly("용사가 패배하였습니다..");
                    gameOver = true;
                    break;
                }

            }  else if (mon1HP > 0 && mon2HP <= 0){
                printSlowly("몬스터1이 용사를 공격합니다.");
                printSlowly("용사의 체력이 1 감소합니다.");
                heroHP-=1;
                if(heroHP<=0){
                    printSlowly("용사가 패배하였습니다...");
                    gameOver = true;
                    break;
                }
            } else {
                gameOver = true;
            }

            if(gameOver){
                printSlowly("#:#:#:#:#:#:#:#:#:#:#:#:#:#:#:#:#:#:#:#");
                printSlowly("몬스터를 모두 무찌르고 용사가 승리하였습니다!");
                printSlowly("#:#:#:#:#:#:#:#:#:#:#:#:#:#:#:#:#:#:#:#");
            }

        }//while

    }




}
