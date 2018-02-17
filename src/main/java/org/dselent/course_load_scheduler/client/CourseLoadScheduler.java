package org.dselent.course_load_scheduler.client;

import org.dselent.course_load_scheduler.client.gin.Injector;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import org.dselent.course_load_scheduler.client.presenter.impl.AdminInboxPresenterImpl;
=======
import org.dselent.course_load_scheduler.client.presenter.impl.FacultyPresenterImpl;
>>>>>>> 21eddb0790cc495a1d25bb55512193b6b01f8bce
=======
import org.dselent.course_load_scheduler.client.presenter.impl.FacultyPresenterImpl;
>>>>>>> 21eddb0790cc495a1d25bb55512193b6b01f8bce
=======
import org.dselent.course_load_scheduler.client.presenter.impl.FacultyPresenterImpl;
>>>>>>> 21eddb0790cc495a1d25bb55512193b6b01f8bce
import org.dselent.course_load_scheduler.client.presenter.impl.IndexPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.LoginPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SchedulePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SideBarPresenterImpl;
import org.dselent.course_load_scheduler.client.view.IndexView;
import org.dselent.course_load_scheduler.client.view.ScheduleView;

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
		
		IndexPresenterImpl indexPresenter = injector.getIndexPresenter(); // on-demand injection
		indexPresenter.init();
		IndexView indexView = indexPresenter.getView();		
		
		LoginPresenterImpl loginPresenter = injector.getLoginPresenter();
		loginPresenter.init();
<<<<<<< HEAD
=======
		*/
>>>>>>> 21eddb0790cc495a1d25bb55512193b6b01f8bce
		
		//LoginView loginView = loginPresenter.getView();	
		
		FacultyPresenterImpl facultyPresenter = injector.getFacultyPresenter();
		facultyPresenter.init();
		
		
		//System.out.println("[CourseLoadScheduler] onModuleLoad() called!");
		SchedulePresenterImpl schedulePresenter = injector.getSchedulePresenter();
		schedulePresenter.setParentPresenter(indexPresenter);
		schedulePresenter.init();
		
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		AdminInboxPresenterImpl adminInboxPresenter = injector.getAdminInboxPresenter();
		adminInboxPresenter.setParentPresenter(indexPresenter);
		adminInboxPresenter.init();
=======
		SideBarPresenterImpl sidebarPresenter = injector.getSideBarPresenter();
		//sidebarPresenter.setParentPresenter(indexPresenter);
		sidebarPresenter.init();
>>>>>>> 21eddb0790cc495a1d25bb55512193b6b01f8bce
		
		//indexPresenter.go(RootPanel.get("indexContainer"));
		//indexPresenter.go(root);
		
		//loginPresenter.go(indexView.getViewRootPanel());
<<<<<<< HEAD
		//schedulePresenter.go(indexView.getViewRootPanel());
		adminInboxPresenter.go(indexView.getViewRootPanel());
=======
		
		//schedulePresenter.go(indexView.getViewRootPanel());
		
		facultyPresenter.go(indexView.getViewRootPanel());	
>>>>>>> 21eddb0790cc495a1d25bb55512193b6b01f8bce
=======
		SideBarPresenterImpl sidebarPresenter = injector.getSideBarPresenter();
		//sidebarPresenter.setParentPresenter(indexPresenter);
		sidebarPresenter.init();
		
		//indexPresenter.go(RootPanel.get("indexContainer"));
		//indexPresenter.go(root);
=======
		SideBarPresenterImpl sidebarPresenter = injector.getSideBarPresenter();
		//sidebarPresenter.setParentPresenter(indexPresenter);
		sidebarPresenter.init();
		
		//indexPresenter.go(RootPanel.get("indexContainer"));
		//indexPresenter.go(root);
>>>>>>> 21eddb0790cc495a1d25bb55512193b6b01f8bce
		
		//schedulePresenter.go(indexView.getViewRootPanel());
		//loginPresenter.go(indexView.getViewRootPanel());
		
		//schedulePresenter.go(indexView.getViewRootPanel());
		
		facultyPresenter.go(indexView.getViewRootPanel());	
<<<<<<< HEAD
>>>>>>> 21eddb0790cc495a1d25bb55512193b6b01f8bce
=======
>>>>>>> 21eddb0790cc495a1d25bb55512193b6b01f8bce
	}
}
