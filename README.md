# spring-cloud-sample
<p>--一个自己的备忘测试项目，主要是测试springcloud的consul服务注册与发现。</p>
<p>--其中demo是服务端，client是客户端。</p>
<p>--服务端默认的启动profile是dev，可以在此基础上再启动一个prod的项目，只要指定启动参数 -Dspring-profiles.active=prod即可</p>
<p>--这样就可以测试负载均衡的效果</p>

<p>*在测试之前要安装consul，可以用docker来安装，安装后修改工程中的spring.cloud.consul.host即可</p>

docker run -d --name=dev-consul -e CONSUL_BIND_INTERFACE=eth0 -p 8500:8500 consul
