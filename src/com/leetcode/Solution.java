package com.leetcode;

/**
@Component
 @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) 

public class ProtoTypeBean {  

    public ProtoTypeBean() { System.out.println(" Creating ProtoTypeBean "; } 
}  @Component 

public class SingletonBean {  
    @Autowired 
    private ProtoTypeBean protoTypeBean;  

    //public ProtoTypeBean() { System.out.println(" Creating SingletonBean "; } 
}  @Service 

public class Service1 {  
    @Autowired 
    private ProtoTypeBean protoTypeBean;  
    @Autowired 
    private SingletonBean singletonBean; 
}  @Service 

public class Service2 {  
    @Autowired 
    private SingletonBean singletonBean; 
}

public class Singleton {
    public static String a;

    private Singleton {
        a = "Hello";
    }

    public static Singleton getInstance() {
        return  a;
    }
}

 */