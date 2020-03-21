package top.txwgoogol.designpattern.state;

/**
 * 状态模式 -- Android源码中WI-FI管理中心
 * 使用场景
 * 1. 一个对象的行为取决于它的状态，并缺它必须在运行时根据状态改变它的行为。
 * 2. 代码中包含大量与对象状态有关的条件语句，
 * 例如，一个操作中包含又庞大的多分枝语句，且这些分支依赖于该对象的状态。
 * 状态模式将每一个条件分支放入一个独立的类中，这使得可以根据队形自身的情况将对象的状态最为一个对象，
 * 这一对象自身的情况将对象的状态作为一个对象，这一对象可以不依赖于其他对象而独立变化，
 * 这样通过多态去除过多的、重复的if-else等分支语句。
 * 优点：
 * State将所有与一个特定状态相关的行为都放入一个状态对象中，它提供了一个更好的方法来组织与特定状态相关的代码，
 * 将繁琐的状态判断转换成结构清晰的状态类族，在避免代码膨胀的同时也保证了可拓展性与可维护性。
 * 缺点：
 * 状态模式的使用必然会增加系统类和对象的个数。
 * 电视状态接口 定义电视操作的函数
 *
 * @author txwgoogol
 * @date 2017/11/8.
 */
public interface State {

    public void nextChannel();

    public void preChannel();

    public void turnUp();

    public void turnDown();

}