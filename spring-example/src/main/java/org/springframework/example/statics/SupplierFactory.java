package org.springframework.example.statics;

import org.springframework.beans.factory.annotation.Lookup;

public class SupplierFactory {

	public Object instanceObject() {
		return new A((2.0F));
	}

	@Lookup
	public static Object getObject() {
		return new A(2.0F);
	}
}
