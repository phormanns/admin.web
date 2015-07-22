package de.hsadmin.web;

import com.vaadin.ui.AbstractSplitPanel;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;

public class MainWindow extends CustomComponent {

	private static final long serialVersionUID = 1L;

	public MainWindow() {
		setSizeFull();
		Panel mainPanel = new Panel("HSAdmin Main Window");
		mainPanel.setSizeFull();
		final AbstractSplitPanel content = new HorizontalSplitPanel();
		content.setSizeFull();
		mainPanel.setContent(content);
		final EntryPointsSelector entryPoints = new EntryPointsSelector();
		entryPoints.setSizeFull();
		content.setFirstComponent(entryPoints);
		final Label dialog = new Label("Hello world");
		content.setSecondComponent(dialog);
		content.setSplitPosition(30.0f);
		setCompositionRoot(mainPanel);
	}
}
