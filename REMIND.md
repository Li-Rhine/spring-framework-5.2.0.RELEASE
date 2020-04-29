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