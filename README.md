# DubboPlay
### Dubbo小试

- 补充之前的Spring Cloud Alibaba系列入门的仓库中的另一种实现RPC方式
- spring-boot-version：2.2.5.RELEASE
  spring-cloud.version：Hoxton.SR3
  nacos.version:1.3.2
  dubbo.version:2.7.6
- 简单的从客户端调用方法,并且服务端是一个controller(没啥关系,只要实现同一个接口就能调用到)
- 实现的就是服务端实现返回字符串"hello,",之后与客户端里面的word字符串拼接一下,证明RPC实现
- 主要就仨注解:`@EnableDubbo`,`@DubboService`,`@DubboReference`

By：tyza66(洮羱芝闇)