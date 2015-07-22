package de.hsadmin.web;

import com.vaadin.ui.Accordion;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Panel;

public class EntryPointsSelector extends CustomComponent {

	private static final long serialVersionUID = 1L;

	public EntryPointsSelector() {
		final Panel panel = new Panel("Entry Point");
		final Accordion content = new Accordion();
		panel.setContent(content);
		setCompositionRoot(panel);
	}
	
}
