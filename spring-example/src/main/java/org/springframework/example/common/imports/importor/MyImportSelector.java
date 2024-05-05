package org.springframework.example.common.imports.importor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

@Slf4j
public class MyImportSelector implements ImportSelector {
	public MyImportSelector() {
		log.info(this.getClass() + " construct");
	}

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"org.springframework.example.common.imports.beans.B"};
	}
}
