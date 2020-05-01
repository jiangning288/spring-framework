package com.luban.imports;

import com.luban.dao.IndexDao;
import com.luban.dao.IndexDao3;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: spring
 * @description:
 * @author: Jiang Ning
 * @create: 2020-04-26 00:10
 **/

public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{IndexDao3.class.getName()};
	}
}
