package org.springframework.example.common.imports;

import org.springframework.example.common.imports.beans.A;
import org.springframework.example.common.imports.importor.MyDeferredImportSelector;
import org.springframework.example.common.imports.importor.MyImportBeanDefinitionRegistrar;
import org.springframework.example.common.imports.importor.MyImportSelector;
import org.springframework.context.annotation.Import;

@Import({A.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class, MyDeferredImportSelector.class})
public class AppConfig {
}
