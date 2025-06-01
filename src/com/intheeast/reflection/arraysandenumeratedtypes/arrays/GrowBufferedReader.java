package com.intheeast.reflection.arraysandenumeratedtypes.arrays;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import static java.lang.System.out;

public class GrowBufferedReader {
    private static final int srcBufSize = 10 * 1024;
    private static char[] src = new char[srcBufSize];
    static {
    	src[srcBufSize - 1] = 'x';
    }
    private static CharArrayReader car = new CharArrayReader(src);

    // --add-opens java.base/java.io=ALL-UNNAMED
    public static void main(String... args) {
	    try {
	    	/*
	    	 BufferedReader는 생성될 때 자체적으로 고정 크기의 버퍼(cb)를 새로 생성.
			 이 크기는 BufferedReader의 디폴트 버퍼 크기인 8192(= 8KB).
			 즉, car가 아무리 큰 char[]을 기반으로 만들어졌더라도,
			 BufferedReader는 내부적으로 별도의 자체 버퍼를 관리하며, 
			 이 버퍼의 크기는 디폴트로 8192임.
	    	 */
	        BufferedReader br = new BufferedReader(car);
	
	        Class<?> c = br.getClass();
	        Field f = c.getDeclaredField("cb");
	
	        // cb는 private 필드입니다.
	        f.setAccessible(true);
	        char[] cbVal = char[].class.cast(f.get(br));
	
	        char[] newVal = Arrays.copyOf(cbVal, cbVal.length * 2);
	        if (args.length > 0 && args[0].equals("grow"))
	        	f.set(br, newVal);
	
	        for (int i = 0; i < srcBufSize; i++)
	        	br.read();
	
	        // 새로운 백업 배열이 사용되고 있는지 확인합니다.
	        if (newVal[srcBufSize - 1] == src[srcBufSize - 1])
	        	out.format("Using new backing array, size=%d%n", newVal.length);
	        else
	        	out.format("Using original backing array, size=%d%n", cbVal.length);
	
	        // 실제 코드에서는 이 예외를 더 우아하게 처리해야 합니다.
	    } catch (FileNotFoundException x) {
	        x.printStackTrace();
	    } catch (NoSuchFieldException x) {
	        x.printStackTrace();
	    } catch (IllegalAccessException x) {
	        x.printStackTrace();
	    } catch (IOException x) {
	        x.printStackTrace();
	    }
    }
}