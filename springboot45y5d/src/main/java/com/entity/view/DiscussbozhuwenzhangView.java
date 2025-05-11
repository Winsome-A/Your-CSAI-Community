package com.entity.view;

import com.entity.DiscussbozhuwenzhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 
 */
@TableName("discussbozhuwenzhang")
public class DiscussbozhuwenzhangView  extends DiscussbozhuwenzhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussbozhuwenzhangView(){
	}
 
 	public DiscussbozhuwenzhangView(DiscussbozhuwenzhangEntity discussbozhuwenzhangEntity){
 	try {
			BeanUtils.copyProperties(this, discussbozhuwenzhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
