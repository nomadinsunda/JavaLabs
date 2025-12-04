package com.intheeast.jdkproxy.timeproxy.proxy;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.*;
import java.time.ZonedDateTime;

public class TimeLoggingHandler implements InvocationHandler {

	 private final Object target;
	 // C:\development\Workspace\codes\java_proj\JavaLabs
	 private static final String LOG_FILE = "method_invocation.log";
	
	 public TimeLoggingHandler(Object target) {
	     this.target = target;
	 }
	 
	 // 공통 관심사
	 private ZonedDateTime printZoneDateTime(Method method) {
		 ZonedDateTime now = ZonedDateTime.now();
         System.out.printf("🕒 [%s] 메서드 호출됨: %s()%n", now, method.getName());
         return now;
	 }
	
	 @Override
     public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		 
		 // around advice??
		 // aspect가 수행하는 동작
		 ZonedDateTime now = printZoneDateTime(method);

         Object result = method.invoke(target, args);

         logToFile(now, method); // 호출 이후 로그 파일 기록

         return result;
     }

	 // 공통 관심사
     private void logToFile(ZonedDateTime time, Method method) {
         try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
             writer.printf("[%s] 호출된 메서드: %s()%n", time, method.getName());
         } catch (IOException e) {
             System.err.println("⚠️ 로그 파일 기록 실패: " + e.getMessage());
         }
     }
}
