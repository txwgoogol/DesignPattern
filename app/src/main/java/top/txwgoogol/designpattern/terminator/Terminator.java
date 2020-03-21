package top.txwgoogol.designpattern.terminator;

/**
 * 中介者模式
 * 使用场景
 * 当对象之间的交互操作很多且每个对象的行为操作都依赖彼此时，未防止在修改一个对象的行为时，
 * 同时涉及修改很多其他对象的行为，可采取中介者模式，来解决紧耦合问题。
 * 该模式将对象之间的多对多关系变成一对多关系，中介者对象将系统从网状结构变成以调停者为中心的星形结构，
 * 达到降低系统的复杂性，提高可拓展的作用。
 * 优点: 解耦使得结构清晰
 * 缺点: 如果依赖关系不复杂的话，使用中介者模式导致逻辑复杂。
 *
 * @author txwgoogol
 * @date 2017/11/8.
 */
public class Terminator {

}