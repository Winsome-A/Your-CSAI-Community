package com.entity.view;

import com.entity.BozhuwenzhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 博主文章
 
 */
@TableName("bozhuwenzhang")
public class BozhuwenzhangView  extends BozhuwenzhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BozhuwenzhangView(){
	}
 
 	public BozhuwenzhangView(BozhuwenzhangEntity bozhuwenzhangEntity){
 	try {
			BeanUtils.copyProperties(this, bozhuwenzhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
