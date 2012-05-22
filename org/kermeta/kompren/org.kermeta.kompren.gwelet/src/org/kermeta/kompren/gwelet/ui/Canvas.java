package org.kermeta.kompren.gwelet.ui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.malai.presentation.ConcretePresentation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import fr.inria.zvtm.engine.Camera;
import fr.inria.zvtm.engine.View;
import fr.inria.zvtm.engine.VirtualSpace;
import fr.inria.zvtm.engine.VirtualSpaceManager;

public class Canvas implements ConcretePresentation {
	protected VirtualSpace vs;
	
	protected View view;
	
	
	public Canvas() {
		super();
		vs = VirtualSpaceManager.INSTANCE.addVirtualSpace("Gwelet");
		List<Camera> cameras = new ArrayList<Camera>();
		Camera detailCam = vs.addCamera();
		Camera overviewCam = vs.addCamera();
		overviewCam.setAltitude(800f, true);
		cameras.add(detailCam);
		view = VirtualSpaceManager.INSTANCE.addFrameView(cameras, "Gwelet", View.STD_VIEW, 800, 600, true);
		view.setBackgroundColor(Color.WHITE);
	}
	

	@Override
	public void save(boolean generalPreferences, String nsURI, Document document, Element root) {
		// Nothing to do.
	}

	@Override
	public void load(boolean generalPreferences, String nsURI, Element meta) {
		// Nothing to do.
	}

	@Override
	public void setModified(boolean modified) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isModified() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reinit() {
		// TODO Auto-generated method stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
	}
}
