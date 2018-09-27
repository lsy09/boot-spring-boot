package io.sulee.boot.springboot.support;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class AppArgsAccessor  {

    @Autowired
    public AppArgsAccessor(ApplicationArguments args){
        boolean debug = args.containsOption("debug");
        log.debug("debug={}", debug);
        List<String> files = args.getNonOptionArgs();
        log.debug("files={}", files);
        // "--debug logfile.txt" 라는 실행인자를 주어 애플리케이션을 실행하면 debug=true, files=["logfile.txt"]를 확인할 수 있다.

    }
}
