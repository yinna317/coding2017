package cn.wsc.util;

import java.util.Iterator;

/**
 * List接口
 *
 * @author Administrator
 * @date 2017年2月20日下午9:15:32
 * @version v1.0
 *
 * @param <T>
 */
public interface List<T> {
	
	/**
	 * 获取集合元素个数
	 * @return
	 */
	int size();
	
	/**
	 * 集合是否为空
	 * @return
	 */
	boolean isEmpty();
	
	/**
	 * 是否包含指定元素
	 * @param o
	 * @return
	 */
	boolean contains(Object o);
	
	/**
	 * 获取当前集合迭代器对象
	 * @return
	 */
	Iterator<T> iterator();
	
	/**
	 * 返回集合数组对象
	 *
	 * @return
	 */
	Object[] toArray();
	
	/**
	 * 将集合元素复制到新数组中
	 * @param a
	 * @return
	 */
	T[] toArray(T[] a);
	
	/**
	 * 在集合末尾追加元素
	 * @param t
	 */
	void add(T t);
	
	/**
	 * 将元素添加至指定下标位置
	 * @param index
	 * @param t
	 */
	void add(int index,T t);
	
	/**
	 * 获取指定下标元素
	 * @param index
	 * @return
	 */
	T get(int index);
	
	/**
	 * 删除并返回指定下标元素
	 * @param index
	 * @return
	 */
	T remove(int index);
	
}
