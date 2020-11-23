package io.learnstuff.features.aop;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AuditProxy implements java.lang.reflect.InvocationHandler {

  private Object obj;

  public static Object newInstance(Object obj) {
    return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(),
        obj.getClass().getInterfaces(), new AuditProxy(obj));
  }

  private AuditProxy(Object obj) {
    this.obj = obj;
  }

  public Object invoke(Object proxy, Method m, Object[] args) {
    Object result = null;
    try {
      System.out.println("We call the method: " + m.getName() + "().");
      long start = System.nanoTime();
      result = m.invoke(obj, args);
      long end = System.nanoTime();
      System.out.println(String.format("Method call took %d ns.", (end - start)));
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("Call ended for method: " + m.getName() + "().");
    }
    return result;
  }
}
