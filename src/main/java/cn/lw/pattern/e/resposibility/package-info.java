/**
 *
 * 使多个对象都有机会处理请求，将多个对象连成一条链，并沿着这条链传递该请求。
 *
 * 客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递。
 * 所以职责链将请求的发送者和请求的处理者解耦了。
 *
 * 注：
 *  重点是将请求与处理解耦
 *
 * e.g.
 *      Servlet中Filter、FilterChain
 *      SpringMVC中HandlerInterceptor、HandlerExecutionChain
 *      Dubbo中Filter、Invoker、InvocationChain.buildInvokerChain()
 *      Mybatis中Plugin
 *
 * Created by VictorLiu on 2018/10/17.
 */
package cn.lw.pattern.e.resposibility;