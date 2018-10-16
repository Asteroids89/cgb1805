package cn.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages="cn.tedu.mapper")//扫描mybatis的接口文件
public class App {
    public static void main( String[] args ){
		SpringApplication.run(App.class, args);
    }
}
