refresh():
    prepareRefresh 刷新前的工作准备
    obtainFreshBeanFactory 获取之类刷新后的内部beanFactory实例
    prepareBeanFactory 为容器注册必要的系统级别的Bean
    postProcessBeanFactory 允许容器的子类去注册postProcessor
    invokeBeanFactoryPostProcessors 调用容器级别的后置处理器
    registerBeanPostProcessors 向容器注册Bean级别的后置处理器
    initMessageSource 初始化国际化配置
    initApplicationEventMulticaster 初始化事件发布者组件
    onRefresh 在单例Bean初始化之前预留给子类初始化其他特殊bean的口子
    registerListeners 向前面的事件发布者组件注册事件监听者
    finishBeanFactoryInitialization 设置系统级别的服务，实例化所有非懒加载的单例
    finishRefresh 触发初始化完成的回调方法，并发布容器刷新完成的事件给监听者
    resetCommonCaches 重置Spring内核中的共用缓存
    
    
依赖注入线路：
    AbstractBeanFactory  -doGetBean  获取Bean实例
    DefaultSingletonRegistry  -getSingleton  获取单例实例
                              -三级缓存  解决循环依赖
    AbstractAutowireCapableBeanBeanFactory  -createBean  创建Bean实例的准备
                                            -doCreateBean  创建Bean实例
                                            -applyMergedBeanDefinitionPostProcessors  处理@Autowire以及@Value
                                            -populateBean 给Bean实例注入属性值(依赖注入在此)
    AutowiredAnnotationBeanPostProcessor    -postProcessProperties Autowired的依赖注入逻辑
    DefaultListableBeanFactory              -doResolveDependency  依赖解析
    DependencyDescriptor                    -InjectionPoint     创建依赖实例
    
    
    
doGetBean
    1、尝试从缓存中获取Bean
    2、循环依赖的判断
    3、递归去父容器获取Bean实例
    4、从当前容器获取BeanDefinition实例
    5、递归实例化显式依赖的Bean depends-on
    6、根据不同的Scope采用不同的策略创建Bean实例
    7、对Bean进行类型检查
    
    
createBean
    1、Bean类型解析
    2、处理方法覆盖
    3、Bean实例化前的后置处理
    4、doCreateBean