package day03;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int KorScore = 77;
        int EngScore = 100;
        int MathScore = 99;

        int[] scoreskim = {KorScore, EngScore, MathScore};
        int[] scoresPark = {66, 88, 22};
        int[] scoresHong = {99, 98, 77};
        //2차원배열: 배열안의 요소가 또다시 배열인 형태
        int[][] classScores = {scoreskim, scoresHong, scoresPark};
/*
{
    {77,100,99},
    {66,88,22},
    {99,98,77}
}
*/
        System.out.println(classScores.length); //3
        System.out.println(scoreskim == classScores[0]); //true
        System.out.println(Arrays.toString(classScores[1])); //true
        System.out.println(classScores[2][1]); //88
        System.out.println(Arrays.toString(classScores)); //전체 주소
        System.out.println(Arrays.deepToString(classScores)); //전체 값 출력

        System.out.println("======================");
        System.out.println("2차원 배열의 2번 인덱스 주소:" + classScores[2]);
        System.out.println("ScoreHong 주소:" + scoresHong);

//        2차원 배열의 순회
        for (int i = 0; i < classScores.length; i++) {
            {
                for (int j = 0; j < classScores[i].length; j++) {
                    System.out.printf("%d", classScores[i][j]);
                }
                //            System.out.println(classScores[i]);
            }
        }

        //js: for~of, java: enhanced for loop,iteration,foreach
        for(int[] scores: classScores){
            for(int n:scores){
                System.out.printf("%d", n);
            }
            System.out.println();
        }
        int[][] arr2by3 = {
                {10,20,30},
                {40,50,60}
        };

        int[][] arr4by5 = new int[4][5];
        for (int[] ints : arr4by5) {
            for (int anInt : ints) {
                System.out.printf("%d ", anInt);
            }
            System.out.println();
        }

    }
}
