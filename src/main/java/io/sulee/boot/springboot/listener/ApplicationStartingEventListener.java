package io.sulee.boot.springboot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Application 이 구동되는 순간 발생하는 리스너
 */

@Slf4j
public class ApplicationStartingEventListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        log.info("Application Start: {}", event);
    }
}
