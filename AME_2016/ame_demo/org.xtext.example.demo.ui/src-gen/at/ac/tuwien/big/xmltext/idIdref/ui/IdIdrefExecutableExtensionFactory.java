/*
 * generated by Xtext
 */
package at.ac.tuwien.big.xmltext.idIdref.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import at.ac.tuwien.big.xmltext.idIdref.ui.internal.IdIdrefActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class IdIdrefExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return IdIdrefActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return IdIdrefActivator.getInstance().getInjector(IdIdrefActivator.AT_AC_TUWIEN_BIG_XMLTEXT_IDIDREF_IDIDREF);
	}
	
}
