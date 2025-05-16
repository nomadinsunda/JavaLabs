package com.intheeast.exceptions.throwed;

import java.io.IOException;

public class ThrowVsThrowsExample {

    // throws 선언: 이 메서드는 IOException을 던질 수 있습니다.
    public static void readFile(String filename) throws IOException {
        if (filename == null || filename.isEmpty()) {
            // 실제 예외를 던짐 (throw 사용)
        	// 그리고 IOException은 Checked Exception이기 때문에,
        	// 예외 처리 코드를 작성(throws IOException)해야 함.
            throw new IOException("파일 이름이 비어있습니다.");
        }

        // 파일 읽는 코드 (생략)
        System.out.println("파일을 읽습니다: " + filename);
    }

    public static void main(String[] args) {
        try {
            readFile("");  // 비어있는 파일명 전달 → 예외 발생
        } catch (IOException e) {
            System.err.println("예외 발생: " + e.getMessage());
        }
    }
}