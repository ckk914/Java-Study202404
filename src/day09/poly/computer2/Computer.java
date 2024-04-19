package day09.poly.computer2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Computer {
    //     - 속성:
//            - `parts`: 컴퓨터 부품 객체들을 관리하는 `ComputerPart[]`.
//            - 메소드:
//            - `addPart(ComputerPart part)`: 컴퓨터에 부품을 추가합니다.
//        - `showParts()`: 컴퓨터의 모든 부품 설명을 출력합니다.
    ComputerPart[] parts;

    public Computer(){
        this.parts = new ComputerPart[0];  //⭐️ 0 으로 생성해야함
    }

    public void addPart(ComputerPart p) {
        ComputerPart[] temp = new ComputerPart[parts.length + 1];
        for (int i = 0; i < parts.length; i++) {
            temp[i] = parts[i];
        }
        temp[temp.length - 1] = p;
        parts = temp;
//        System.out.println(Arrays.toString(parts));
    }

    public void showParts() {
        for (ComputerPart c : parts) {
            c.describePart();
        }

    }
}
