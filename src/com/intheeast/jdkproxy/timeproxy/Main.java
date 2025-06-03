package com.intheeast.jdkproxy.timeproxy;

import com.intheeast.jdkproxy.timeproxy.proxy.ProxyFactory;
import com.intheeast.jdkproxy.timeproxy.service.CalculatorService;
import com.intheeast.jdkproxy.timeproxy.service.CalculatorServiceImpl;
import com.intheeast.jdkproxy.timeproxy.service.GreetingService;
import com.intheeast.jdkproxy.timeproxy.service.GreetingServiceImpl;
import com.intheeast.jdkproxy.timeproxy.service.MathService;
import com.intheeast.jdkproxy.timeproxy.service.MathServiceImpl;
import com.intheeast.jdkproxy.timeproxy.service.NewsService;
import com.intheeast.jdkproxy.timeproxy.service.NewsServiceImpl;
import com.intheeast.jdkproxy.timeproxy.service.WeatherService;
import com.intheeast.jdkproxy.timeproxy.service.WeatherServiceImpl;

public class Main {
	
	 public static void main(String[] args) {		 
		 
		 GreetingService greeting = ProxyFactory.createProxy(
				 new GreetingServiceImpl(), GreetingService.class);
         greeting.sayHello("John");

         MathService math = ProxyFactory.createProxy(
                 new MathServiceImpl(), MathService.class);
         System.out.println("🧮 덧셈 결과: " + math.add(5, 7));

         WeatherService weather = ProxyFactory.createProxy(
                 new WeatherServiceImpl(), WeatherService.class);
         System.out.println("🌤️ 날씨 정보: " + weather.getWeather("서울"));

         NewsService news = ProxyFactory.createProxy(
                 new NewsServiceImpl(), NewsService.class);
         System.out.println("📰 뉴스: " + news.getHeadline());

         CalculatorService calculator = ProxyFactory.createProxy(
                 new CalculatorServiceImpl(), CalculatorService.class);
         System.out.println("✖️ 곱셈 결과: " + calculator.multiply(3.5, 2));
	 }
}
