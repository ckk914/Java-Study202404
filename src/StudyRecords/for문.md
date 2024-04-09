
---
- alt + enter<br>
인텔리제이 만능 키<br>

// 문자 입력 받고, 정수로 변환 !
```
System.out.print("출생년도: ");
int birthYear = Integer.parseInt(scan.nextLine());

//New Sc 엔터 -> ctrl+alt + v 괄호에 System.in
Scanner scan = new Scanner(System.in); //입력 준비
System.out.print("- 상품의 가격:");
int price = Integer.parseInt(scan.nextLine());
```
### fori 탭 => for문 형식 만들어줌

### 배열 순회 forEach스러운 것
### for(변수: 배열)
```
for(int n : numbers){
System.out.println("n = "+n);
}
//        단축키 iter 엔터
for (int number : numbers) {

        }

//배열 내부 간결하게 출력
System.out.println(Arrays.toString(numbers));

//배열 한번에 만들기
int[] pointList = new int[]{10,20,30,40};
System.out.println(Arrays.toString(pointList)); 
```