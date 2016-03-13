/*
 * generated by Xtext 2.9.2
 */
package nl.coenbijlsma.languages.d3ql.ui;

import com.google.inject.Injector;
import nl.coenbijlsma.languages.d3ql.ui.internal.D3qlActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class D3qlExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return D3qlActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return D3qlActivator.getInstance().getInjector(D3qlActivator.NL_COENBIJLSMA_LANGUAGES_D3QL_D3QL);
	}
	
}
