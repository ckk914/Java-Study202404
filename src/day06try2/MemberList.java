package day06try2;

public class MemberList {
    Member[] mArr;

    MemberList() {
        this.mArr = new Member[0];
    }

    // 맨 끝에 추가
    void push(Member newMember) {
        Member[] temp = new Member[mArr.length + 1];
        for (int i = 0; i < mArr.length; i++) {
            temp[i] = mArr[i];
        }
        temp[temp.length - 1] = newMember;
        mArr = temp;
    }
    // 인덱스 찾기
    int findIndex(String email) {
        for (int i = 0; i < mArr.length; i++) {
            if (email.equals(mArr[i].email)) {
                return i;
            }
        }
        return -1;
    }
    // 한 명의 회원 정보 얻기
    Member get(String email) {
        int index = findIndex(email);
        return get(index);
    }
    Member get(int index) {
        return mArr[index];
    }

    // 맨 끝 제거
    Member pop() {
        // 맨 끝 회원 백업
        Member lastMember = mArr[mArr.length - 1];
        Member[] temp = new Member[mArr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = mArr[i];
        }
        mArr = temp;
        return lastMember;
    }

    // 회원 정보 삭제
    Member remove(int index) {
        // 삭제 대상 백업
        Member removedMember = mArr[index];
        for (int i = index; i < mArr.length - 1; i++) {
            mArr[i] = mArr[i + 1];
        }
        pop();
        return removedMember;
    }
    Member remove(Member deleteMember) {
        int index = findIndex(deleteMember.email);
        return remove(index);
    }



    // 배열에 저장된 요소 수 리턴
    int size() {
        return mArr.length;
    }

    // 배열 리턴
    Member[] getMembers() {
        return mArr;
    }

}
