package com.zyn.bean2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 *  Aop注解版三步步骤：
 *          1.在业务逻辑类和切面类都注入到容器中，并告诉Spring哪个是切面类(@Aspect)
 *          2.在切面类上的每一个通知方法标注注解@Before等，告诉spring何时何地运行（切入点表达式）
 *          3.开启基于注解的aop模式：@EnableAspectJAutoProxy
 *
 * @create 2020-02-24-10:44
 */
@Aspect
public class LogAspects {

    //抽取公共的切入表达式
    @Pointcut("execution(public int com.zyn.bean2.Calculator.*(..))")
    private void pointCut(){

    }

    @Before("pointCut()")
    public void logStart(){
        System.out.println("除法运行");
    }

    //引用其他切面的切入表达式
    @After("com.zyn.bean2.LogAspects.pointCut()")
    public void logEnd(){
        System.out.println("除法结束");
    }

    //joinPoint对象可以获取被切入方法的相关信息,其必须写在第一个参数上，可以通过joinPoint.getArgs()方法获取其入参数据
    @AfterReturning(value = "pointCut()",returning = "obj")
    public void logReturn(JoinPoint joinPoint,Object obj){

        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName()+"...AfterReturning返回值为："+obj+"参数为："+ Arrays.asList(args));
        System.out.println("除法正常返回");
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(Exception exception){

        System.out.println("AfterThrowing的异常信息为"+exception);
        System.out.println("除法抛出异常");
    }
}
