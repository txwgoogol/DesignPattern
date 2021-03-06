package top.txwgoogol.designpattern.prototype;

/**
 * 原型模式
 * 使用场景
 * 1. 类初始化需要消耗许多的资源，这个资源包括数据硬件、资源等，通过原型拷贝避免这些消耗。
 * 2. 通过new产生一个对象需要非常频繁的数据准备或访问权限。
 * 3. 一个对象需要提供给其他对象访问，而且各个调用者都可能需要更改其值时，可以考虑使用原型拷贝模式拷贝多个对象提供者使用，即保护性拷贝。
 * 优点：原型模式是在内存中二进制流的拷贝，要比直接new一个对象性能好很多，特别要在一个循环体内产生大量对象时，原型模式可以很好的实现其优点。
 * 缺点：即是它的缺点也是它的优点，直接在内存中拷贝，构造函数是不会执行的，在实际开发当中要注意这个潜在的问题。优点和缺点都是减少了约束。
 *
 * @author txwgoogol
 * @date 2017/11/8.
 */
public class Prototype {
}
