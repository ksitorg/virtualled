package de.haw.eled.virtualled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

/**
 * Created by Tim on 05.05.2017.
 */
//@Configuration
//public class WebConfig extends WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter {
//    public static final Logger LOG = LoggerFactory.getLogger(WebConfig.class);
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        LOG.info("Resource!");
//        LOG.info(registry.toString());
//        //registry.addResourceHandler("*.css").addResourceLocations("classpath:/resources/static/lib/LEDStrip");
//        registry.addResourceHandler("/css/*.css").addResourceLocations("classpath:/resources/static/css/");
////        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/resources/static/**");
////        registry.addResourceHandler("/static/**").addResourceLocations("/resources/static/**");
////        registry.addResourceHandler("/static/**").addResourceLocations("resources/static/");
//        //registry.addResourceHandler("/LEDStrip/*").addResourceLocations("/resources/static/lib/LEDStrip/");
//    }
//}
