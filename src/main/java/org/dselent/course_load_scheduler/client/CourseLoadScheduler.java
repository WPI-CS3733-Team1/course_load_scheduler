package org.dselent.course_load_scheduler.client;

import org.dselent.course_load_scheduler.client.gin.Injector;
//----------------------------------------------------------------------------------Faculty Issue; Please fix--------//
//import org.dselent.course_load_scheduler.client.presenter.impl.FacultyPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.IndexPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.LoginPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SchedulePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SideBarPresenterImpl;
import org.dselent.course_load_scheduler.client.view.IndexView;
import org.dselent.course_load_scheduler.client.view.ScheduleView;
import org.dselent.course_load_scheduler.client.view.SideBarView;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CourseLoadScheduler implements EntryPoint
{

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad()
	{
		RootLayoutPanel root = RootLayoutPanel.get();
		
		//SimplePanelExample simplePanelExample = new SimplePanelExample();
		//root.add(simplePanelExample);
		
		//SimplePanelExample2 simplePanelExample2 = new SimplePanelExample2();
		//root.add(simplePanelExample2);
		
		//HTMLPanelExample htmlPanelExample = new HTMLPanelExample();
		//root.add(htmlPanelExample);
		
		//FlowPanelExample flowPanelExample = new FlowPanelExample();
		//root.add(flowPanelExample);
		
		//VerticalPanelExample verticalPanelExample = new VerticalPanelExample();
		//root.add(verticalPanelExample);
		
		//HorizontalPanelExample horizontalPanelExample = new HorizontalPanelExample();
		//root.add(horizontalPanelExample);
		
		//DockLayoutPanelExample dockLayoutPanelExample = new DockLayoutPanelExample();
		//root.add(dockLayoutPanelExample);
		
		//GridExample gridExample = new GridExample();
		//root.add(gridExample);

		//TabLayoutPanelExample tabLayoutPanelExample = new TabLayoutPanelExample();
		//root.add(tabLayoutPanelExample);
		
		//ExamplesPanel examplesPanel = new ExamplesPanel();
		//root.add(examplesPanel);

		// Get the injector, which injected objects can be retrieved from
		final Injector injector = Injector.INSTANCE;
		
		//---------------Files originally given-----------------------------------------------------------
		IndexPresenterImpl indexPresenter = injector.getIndexPresenter(); // on-demand injection
		indexPresenter.init();
		IndexView indexView = indexPresenter.getView();		
		//---------------End of OG files-----------------------------------------------------------		
		SideBarPresenterImpl sideBarPresenter = injector.getSideBarPresenter();
		sideBarPresenter.setParentPresenter(indexPresenter);
		sideBarPresenter.init();
		SideBarView sideBarView = sideBarPresenter.getView();
		
		
		
		/*
		LoginPresenterImpl loginPresenter = injector.getLoginPresenter();
		loginPresenter.init();
		*/
		
		//LoginView loginView = loginPresenter.getView();	
		

		//System.out.println("[CourseLoadScheduler] onModuleLoad() called!");
		//SchedulePresenterImpl schedulePresenter = injector.getSchedulePresenter();
		//schedulePresenter.setParentPresenter(indexPresenter);
		//schedulePresenter.init();
		//SideBarPresenterImpl sideBar
		
		//----------------------------------------------------------------------------------Faculty Issue; Please fix--------//
		//FacultyPresenterImpl facultyPresenter = injector.getFacultyPresenter();
		//facultyPresenter.init();
		
		
		//System.out.println("[CourseLoadScheduler] onModuleLoad() called!");
		SchedulePresenterImpl schedulePresenter = injector.getSchedulePresenter();
		schedulePresenter.setParentPresenter(indexPresenter);
		schedulePresenter.init();
		
		SideBarPresenterImpl sidebarPresenter = injector.getSideBarPresenter();
		//sidebarPresenter.setParentPresenter(indexPresenter);
		sidebarPresenter.init();
		
		
		sideBarPresenter.go(RootPanel.get("sideBarContainer"));
		sideBarPresenter.go(root);
		
		//schedulePresenter.go(indexView.getViewRootPanel());
		//loginPresenter.go(indexView.getViewRootPanel());
		//schedulePresenter.go(sideBarView.getViewRootPanel());
		sideBarPresenter.go(sideBarView.getViewRootPanel());
		//indexPresenter.go(RootPanel.get("indexContainer"));
		//indexPresenter.go(root);
		
		//schedulePresenter.go(indexView.getViewRootPanel());
		//loginPresenter.go(indexView.getViewRootPanel());
		
		//schedulePresenter.go(indexView.getViewRootPanel());
		
		//----------------------------------------------------------------------------------Faculty Issue; Please fix--------//
		//facultyPresenter.go(indexView.getViewRootPanel());	
	}
}
