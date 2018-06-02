package com.zxt.imooc.four;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value=2)
@Component
public class BeanImplTwo implements BeanInterface {
}
