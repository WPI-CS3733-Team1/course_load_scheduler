package org.dselent.course_load_scheduler.client;

import java.util.ArrayList;
import java.util.HashMap;

import org.dselent.course_load_scheduler.client.gin.Injector;
import org.dselent.course_load_scheduler.client.presenter.impl.AdminPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.CreateAdminPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.FacultyPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.FacultyTopBarPresenterImpl;
//----------------------------------------------------------------------------------Faculty Issue; Please fix--------//
//import org.dselent.course_load_scheduler.client.presenter.impl.FacultyPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.IndexPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.LoginPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.ModPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SchedulePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SearchPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SideBarPresenterImpl;
import org.dselent.course_load_scheduler.client.service.impl.UserServiceImpl;
import org.dselent.course_load_scheduler.client.view.IndexView;
import org.dselent.course_load_scheduler.client.view.ScheduleView;
import org.dselent.course_load_scheduler.client.view.SearchView;
import org.dselent.course_load_scheduler.client.view.SideBarView;
import org.dselent.course_load_scheduler.client.view.impl.FacultyTopBarViewImpl;

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
		/*
		SideBarPresenterImpl sideBarPresenter = injector.getSideBarPresenter();
		sideBarPresenter.setParentPresenter(indexPresenter);
		SideBarView sideBarView = sideBarPresenter.getView();
		sideBarPresenter.init();
		
		SearchPresenterImpl searchPresenter = injector.getSearchPresenter();
		searchPresenter.setParentPresenter(indexPresenter);
		searchPresenter.init();
		SearchView searchView = searchPresenter.getView();
		*/
		
		
		/*
		LoginPresenterImpl loginPresenter = injector.getLoginPresenter();
		loginPresenter.init();
		*/
		
		//LoginView loginView = loginPresenter.getView();	
		//System.out.println("[CourseLoadScheduler] onModuleLoad() called!");
		//FacultyTopBarPresenterImpl facultyTopBarPresenter = injector.getFacultyTopBarPresenter();
		//facultyTopBarPresenter.setParentPresenter(indexPresenter);
		//facultyTopBarPresenter.init();

		//System.out.println("[CourseLoadScheduler] onModuleLoad() called!");
		//SchedulePresenterImpl schedulePresenter = injector.getSchedulePresenter();
		//schedulePresenter.setParentPresenter(indexPresenter);
		//schedulePresenter.init();
		//SideBarPresenterImpl sideBar
		
		//----------------------------------------------------------------------------------Faculty Issue; Please fix--------//
		
		//FacultyTopBarPresenterImpl facultyTopBarPresenter = injector.getFacultyTopBarPresenter();
		//facultyTopBarPresenter.setParentPresenter(indexPresenter);
		//facultyTopBarPresenter.getView().setPresenter(facultyTopBarPresenter);
		//FacultyTopBarViewImpl ftbv = injector.getFacultyTopBarView();
		//ftbv.setPresenter(facultyTopBarPresenter); //presenter still null?
		
		//facultyTopBarPresenter.init();
		
		//**********************************************************************
		
		//FacultyPresenterImpl facultyPresenter = injector.getFacultyPresenter();
		//facultyPresenter.init();
		
		LoginPresenterImpl login = injector.getLoginPresenter();
		login.init();
		
		//***********************FACULTY PRESENTER TEST***********************

		//**********************************************************************
		
		//ModPresenterImpl modPresenter = injector.getModPresenter();
		//modPresenter.init();
		
		//**********************************************************************
		
		//AdminPresenterImpl adminPresenter = injector.getAdminPresenter();
		//adminPresenter.init();
		
		/*
		AdminPresenterImpl adminPresenter = injector.getAdminPresenter();
		adminPresenter.setParentPresenter(indexPresenter);
		adminPresenter.init();
		
		ModPresenterImpl modPresenter = injector.getModPresenter();
		modPresenter.setParentPresenter(indexPresenter);
		modPresenter.init();
		*/
		//System.out.println("[CourseLoadScheduler] onModuleLoad() called!");
		/*
		SchedulePresenterImpl schedulePresenter = injector.getSchedulePresenter();
		schedulePresenter.setParentPresenter(indexPresenter);
		schedulePresenter.init();
		
		SideBarPresenterImpl sidebarPresenter = injector.getSideBarPresenter();
		//sidebarPresenter.setParentPresenter(indexPresenter);
		sidebarPresenter.init();		
		
		CreateAdminPresenterImpl createAdmin1Presenter = injector.getCreateAdminPresenter();
		createAdmin1Presenter.setParentPresenter(indexPresenter);
		createAdmin1Presenter.init();
		*/
		//indexPresenter.go(RootPanel.get("indexContainer"));
		//indexPresenter.go(root);
		
		//schedulePresenter.go(indexView.getViewRootPanel());
		//loginPresenter.go(indexView.getViewRootPanel());
		//schedulePresenter.go(indexView.getViewRootPanel());
		//facultyTopBarPresenter.go(indexView.getViewRootPanel());

		//sideBarPresenter.go(root);
		
		UserServiceImpl userService = injector.getUserService();
		userService.init();

		indexPresenter.go(root);
		
		//schedulePresenter.go(indexView.getViewRootPanel());
		//loginPresenter.go(indexView.getViewRootPanel());
		//schedulePresenter.go(sideBarView.getViewRootPanel());
		//sideBarPresenter.go(sideBarView.getViewRootPanel());
		//indexPresenter.go(RootPanel.get("indexContainer"));
		
		//facultyPresenter.go(indexView.getViewRootPanel());
		//adminPresenter.go(indexView.getViewRootPanel());
		//sideBarPresenter.go(indexView.getViewRootPanel());
		//createAdmin1Presenter.go(indexView.getViewRootPanel());
		//createAdmin2Presenter.go(indexView.getViewRootPanel());

		//modPresenter.go(indexView.getViewRootPanel());
		
		//searchPresenter.go(indexView.getViewRootPanel());
		
		//facultyPresenter.go(indexView.getViewRootPanel());
		
		login.go(indexView.getViewRootPanel());
		
		//modPresenter.go(indexView.getViewRootPanel());
		
		//adminPresenter.go(indexView.getViewRootPanel());
		
		//schedulePresenter.go(indexView.getViewRootPanel());
		//loginPresenter.go(indexView.getViewRootPanel());
		
		//schedulePresenter.go(indexView.getViewRootPanel());
		
		//----------------------------------------------------------------------------------Faculty Issue; Please fix--------//
		//facultyPresenter.go(indexView.getViewRootPanel());
	}
}
