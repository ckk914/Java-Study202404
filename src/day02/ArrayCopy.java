package day02;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        String[] pets = {"멍멍","야옹","꽥꽥"};

        //같은 주소를 가르키게 함
        //배열 복사 X -> 배열 주소 복사임.
        String[] petsCopy = pets;

        System.out.println("pets = " + pets);
        System.out.println("petsCopy = " + petsCopy);
        
        pets[1]="냥냥";
        //원본을 수정했는데, 사본이 수정됨!
        System.out.println("Arrays.toString(petsCopy) = " + Arrays.toString(petsCopy));
        //⭐제대로된 배열 복사 방법
        String[] petsCopy2 = new String[pets.length];
        for (int i = 0; i <pets.length ; i++) {
            petsCopy2[i] = pets[i];
        }

        pets[1]="골골";
        System.out.println("Arrays.toString(petsCopy) = " + Arrays.toString(pets));
        System.out.println("Arrays.toString(petsCopy) = " + Arrays.toString(petsCopy2));
        
    }
}
