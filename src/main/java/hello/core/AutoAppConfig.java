package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//        basePackages = "hello.core.member",  // 탐색할 패키지의 시작 위치를 지정한다. 이 패키지를 포함해 하위 패키지를 모두 탐색
//        basePackageClasses = AutoAppConfig.class,  //지정한 클래스의 패키지를 탐색 시작 위치로 지정한다.
        //지정하지않으면 @ComponentScan이 붙은 설정 정보 클래스의 패키지가 시작 위치가 된다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
