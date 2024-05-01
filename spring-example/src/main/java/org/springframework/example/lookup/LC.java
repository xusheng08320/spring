package org.springframework.example.lookup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public abstract class LC {

	public void printInfo() {
		LB lb = createb();
		log.debug("lb-[{}]", lb);
		lb = createb();
		log.debug("lb-[{}]", lb);
	}

	@Lookup
	public abstract LB createb();
}
