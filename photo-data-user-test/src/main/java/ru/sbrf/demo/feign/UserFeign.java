package ru.sbrf.demo.feign;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import ru.sbrf.demo.rest.UserRest;

@FeignClient("datacenter")
@RibbonClient("datacenter")
public interface UserFeign extends UserRest {

}
