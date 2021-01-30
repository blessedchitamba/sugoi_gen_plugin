package edu.stanford.bmir.protege.examples.view;

import java.awt.BorderLayout;
import javax.swing.*; 
import org.protege.editor.owl.ui.view.AbstractOWLViewComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Interchangeability.SugoiDesktopApplicationOnline;

public class ExampleViewComponent extends AbstractOWLViewComponent {

    private static final Logger log = LoggerFactory.getLogger(ExampleViewComponent.class);

    private Metrics metricsComponent;
    private Sugoi sugoi;
    private SugoiFrame sugoiFrame;
    // label to display text 
    private JLabel label; 
    private String text;
    private JPanel panel;
    private JFrame myFrame;


    @Override
    protected void initialiseOWLView() throws Exception {
        setLayout(new BorderLayout());
        // metricsComponent = new Metrics(getOWLModelManager());
        // add(metricsComponent, BorderLayout.CENTER);
        // log.info("Example View Component initialized");
        sugoiFrame = new SugoiFrame();
        sugoi = sugoiFrame.initialize();

        text = "This is the SUGOI-Gen Protege plugin.";
        label = new JLabel(text);
        panel = new JPanel();
        //myFrame = new JFrame("This is the SUGOI-Gen Protege plugin!!");
        panel.add(label);
        panel.add(sugoi);
        //add(sugoi, BorderLayout.CENTER);
    }

	@Override
	protected void disposeOWLView() {
		//metricsComponent.dispose();
	}
}
