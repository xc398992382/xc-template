package com.xc.template.utils.copy;

@FunctionalInterface
/**
 * 类拷贝回调方法
 * @author  xuchuang
 * @date  2020-08-28
 */
public interface BeanUtilCopyCallBack<S, T> {

    /**
     * 定义默认回调方法
     * @param s: 数据源类 ，
     * @param t: 目标类
     */
    void callBack(S s, T t);
}
