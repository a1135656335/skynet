# Release Notes

## 1.3.0

### New Features

- [Add apollo config center support](https://github.com/apache/dubbo-go/pull/250)
- [Gracefully shutdown](https://github.com/apache/dubbo-go/pull/255)
- [Add consistent hash load balance support](https://github.com/apache/dubbo-go/pull/261)
- [Add sticky connection support](https://github.com/apache/dubbo-go/pull/270)
- [Add async call for dubbo protocol](https://github.com/apache/dubbo-go/pull/272)
- [Add generic implement](https://github.com/apache/dubbo-go/pull/291)
- [Add request timeout for method](https://github.com/apache/dubbo-go/pull/284)
- [Add grpc protocol](https://github.com/apache/dubbo-go/pull/311)

### Enhancement
    
- [The SIGSYS and SIGSTOP are not supported in windows platform](https://github.com/apache/dubbo-go/pull/262)
- [Error should be returned when `NewURL` failed](https://github.com/apache/dubbo-go/pull/266)
- [Split config center GetConfig method](https://github.com/apache/dubbo-go/pull/267)
- [Modify closing method for dubbo protocol](https://github.com/apache/dubbo-go/pull/268)
- [Add SetLoggerLevel method](https://github.com/apache/dubbo-go/pull/271)
- [Change the position of the lock](https://github.com/apache/dubbo-go/pull/286)
- [Change zk version and add base_registry](https://github.com/apache/dubbo-go/pull/355)

### Bugfixes
    
- [Fix negative wait group count](https://github.com/apache/dubbo-go/pull/253)
- [After disconnection with ZK registry, cosumer can't listen to provider changes](https://github.com/apache/dubbo-go/pull/258)
- [The generic filter and default reference filters lack ','](https://github.com/apache/dubbo-go/pull/260)
- [Url encode zkpath](https://github.com/apache/dubbo-go/pull/283)
- [Fix jsonrpc about HTTP/1.1](https://github.com/apache/dubbo-go/pull/327)
- [Fix zk bug](https://github.com/apache/dubbo-go/pull/346)
- [HessianCodec failed to check package header length](https://github.com/apache/dubbo-go/pull/381)

## 1.2.0

### New Features

- [Add etcdv3 registry support](https://github.com/apache/dubbo-go/pull/148)
- [Add nacos registry support](https://github.com/apache/dubbo-go/pull/151)
- [Add fail fast cluster support](https://github.com/apache/dubbo-go/pull/140)
- [Add available cluster support](https://github.com/apache/dubbo-go/pull/155)
- [Add broadcast cluster support](https://github.com/apache/dubbo-go/pull/158)
- [Add forking cluster support](https://github.com/apache/dubbo-go/pull/161)
- [Add service token authorization support](https://github.com/apache/dubbo-go/pull/202)
- [Add accessLog filter support](https://github.com/apache/dubbo-go/pull/214)
- [Add tps limit support](https://github.com/apache/dubbo-go/pull/237)
- [Add execute limit support](https://github.com/apache/dubbo-go/pull/246)
- [Move callService to invoker & support attachments](https://github.com/apache/dubbo-go/pull/193)
- [Move example in dubbo-go project away](https://github.com/apache/dubbo-go/pull/228)
- [Support dynamic config center which compatible with dubbo 2.6.x & 2.7.x and commit the zookeeper impl](https://github.com/apache/dubbo-go/pull/194)

### Enhancement

- [Split gettyRPCClient.close and gettyRPCClientPool.remove in protocol/dubbo/pool.go](https://github.com/apache/dubbo-go/pull/186)
- [Remove client from pool before closing it](https://github.com/apache/dubbo-go/pull/190)
- [Enhance the logic for fetching the local address](https://github.com/apache/dubbo-go/pull/209)
- [Add protocol_conf default values](https://github.com/apache/dubbo-go/pull/221)
- [Add task pool for getty](https://github.com/apache/dubbo-go/pull/141)
- [Update getty: remove read queue](https://github.com/apache/dubbo-go/pull/137)
- [Clean heartbeat from PendingResponse](https://github.com/apache/dubbo-go/pull/166)

### Bugfixes

- [GettyRPCClientPool remove deadlock](https://github.com/apache/dubbo-go/pull/183/files)
- [Fix failover cluster bug and url parameter retries change int to string type](https://github.com/apache/dubbo-go/pull/195)
- [Fix url params unsafe map](https://github.com/apache/dubbo-go/pull/201)
- [Read protocol config by map key in config yaml instead of protocol name](https://github.com/apache/dubbo-go/pull/218)
- *Fix dubbo group issues #238* [pr #243](https://github.com/apache/dubbo-go/pull/243) and [pr #244](https://github.com/apache/dubbo-go/pull/244)
- [Fix bug in reference_config](https://github.com/apache/dubbo-go/pull/157)
- [Fix high memory bug in zookeeper listener](https://github.com/apache/dubbo-go/pull/168)

## 1.1.0

### New Features

- [Support Java bigdecimal](https://github.com/apache/dubbo-go/pull/126)
- [Support all JDK exceptions](https://github.com/apache/dubbo-go/pull/120)
- [Support multi-version of service](https://github.com/apache/dubbo-go/pull/119)
- [Allow user set custom params for registry](https://github.com/apache/dubbo-go/pull/117)
- [Support zookeeper config center](https://github.com/apache/dubbo-go/pull/99)
- [Failsafe/Failback  Cluster Strategy](https://github.com/apache/dubbo-go/pull/136)

### Enhancement

- [Use time wheel instead of time.After to defeat timer object memory leakage](https://github.com/apache/dubbo-go/pull/130)

### Bugfixes

- [Preventing dead loop when got zookeeper unregister event](https://github.com/apache/dubbo-go/pull/129)
- [Delete ineffassign](https://github.com/apache/dubbo-go/pull/127)
- [Add wg.Done() for mockDataListener](https://github.com/apache/dubbo-go/pull/118)
- [Delete wrong spelling words](https://github.com/apache/dubbo-go/pull/107)
- [Use sync.Map to defeat from gettyClientPool deadlock](https://github.com/apache/dubbo-go/pull/106)
- [Handle panic when function args list is empty](https://github.com/apache/dubbo-go/pull/98)
- [url.Values is not safe map](https://github.com/apache/dubbo-go/pull/172)
