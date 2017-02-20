package com.coding.basic;


public class ArrayList implements List {
	
	private int size = 0;
	private Object[] elementData = new Object[100];
	
	public void add(Object o){
		if(size < this.elementData.length){//加至末尾，size+1
			this.elementData[size] = o;
			size++;
		}else{//扩张数组，然后加至末尾，size+1
			this.elementData = grow(this.elementData,100);
			this.elementData[size] = o;
			size++;
		}
	}
	
	public void add(int index, Object o){
		if(index < 0 || index > this.size){//index小于0or大于size，参数错误
			return;
		}
//		while(index >= this.elementData.length){//index应<length,否则扩张数组
//			this.elementData = grow(this.elementData, 100);
//		}
		if(size >= this.elementData.length){//当前数组容量已满，需扩张
			this.elementData = grow(this.elementData, 100);
		}
		
		//此时只需考虑将o加至index处
		if(index < size){//移动数据，然后插入o，size+1
			for(int i = size;i > index;i--){
				this.elementData[i] = this.elementData[i-1];
			}
			this.elementData[index] = o;
			this.size++;
		}else{//直接插入o，size+1
			this.elementData[index] = o;
			this.size++;
		}
		
	}
	
	public Object get(int index){
		if(index < 0 || index >= this.size){//index小于0or大于size，参数错误
			return null;
		}
		return this.elementData[index];
	}
	
	public Object remove(int index){
		if(index < 0 || index >= this.size){//index小于0or大于size，参数错误
			return null;
		}
		
		Object o = this.elementData[index];
		//此时只需考虑将index处的o移除
		for(int i = index;i<this.size;i++){
			this.elementData[i] = this.elementData[i+1];
		}
		this.size--;
		return o;
	}
	
	public int size(){
		return this.size;
	}
	
	public Iterator iterator(){
		return null;
	}
	
	/*
	 * 说明：扩张数组
	 * 参数：被扩张的原数组，扩张的增加数（扩张后数组的大小为原数组的长度+增加数）
	 * 返回值：扩张后的数组
	 */
	private static Object[] grow(Object[] src,int size){
//		return Arrays.copyOf(src, src.length + size);
		Object[] target = new Object[src.length + size];
		System.arraycopy(src, 0, target, 0, src.length + size);
		return target;
	}
}
