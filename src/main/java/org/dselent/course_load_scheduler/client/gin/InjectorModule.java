package org.dselent.course_load_scheduler.client.gin;

import org.dselent.course_load_scheduler.client.presenter.AdminPresenter;
import org.dselent.course_load_scheduler.client.presenter.AdminTopBarPresenter;
import org.dselent.course_load_scheduler.client.presenter.CreateAdminPresenter;
import org.dselent.course_load_scheduler.client.presenter.CreateCoursePresenter;
import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.presenter.FacultyTopBarPresenter;
//----------------------------------------------------------------------------------Faculty Issue in Imports; Please fix--------//
//import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.LoginPresenter;
import org.dselent.course_load_scheduler.client.presenter.ModPresenter;
import org.dselent.course_load_scheduler.client.presenter.ModeratorTopBarPresenter;
import org.dselent.course_load_scheduler.client.presenter.SchedulePresenter;
import org.dselent.course_load_scheduler.client.presenter.SearchPresenter;
import org.dselent.course_load_scheduler.client.presenter.impl.AdminPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AdminTopBarPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.CreateAdminPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.CreateCoursePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.FacultyPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.FacultyTopBarPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.SideBarPresenter;
//import org.dselent.course_load_scheduler.client.presenter.impl.FacultyPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.IndexPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.LoginPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.ModPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.ModeratorTopBarPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SchedulePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SearchPresenterImpl;
import org.dselent.course_load_scheduler.client.view.AdminTopBarView;
import org.dselent.course_load_scheduler.client.view.AdminView;
import org.dselent.course_load_scheduler.client.view.CreateAdminView;
import org.dselent.course_load_scheduler.client.view.CreateCourseView;
import org.dselent.course_load_scheduler.client.view.CreateSectionView;
import org.dselent.course_load_scheduler.client.view.FacultyTopBarView;
import org.dselent.course_load_scheduler.client.view.FacultyView;
import org.dselent.course_load_scheduler.client.presenter.impl.SideBarPresenterImpl;
import org.dselent.course_load_scheduler.client.service.UserService;
import org.dselent.course_load_scheduler.client.service.impl.UserServiceImpl;
//import org.dselent.course_load_scheduler.client.view.FacultyView;
import org.dselent.course_load_scheduler.client.view.IndexView;
import org.dselent.course_load_scheduler.client.view.LoginView;
import org.dselent.course_load_scheduler.client.view.ModView;
import org.dselent.course_load_scheduler.client.view.ModeratorTopBarView;
import org.dselent.course_load_scheduler.client.view.ScheduleView;
import org.dselent.course_load_scheduler.client.view.SearchView;
import org.dselent.course_load_scheduler.client.view.SideBarFacultyBottomView;
import org.dselent.course_load_scheduler.client.view.SideBarFacultyMiddleView;
import org.dselent.course_load_scheduler.client.view.SideBarFacultyTopView;
import org.dselent.course_load_scheduler.client.view.impl.AdminTopBarViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AdminViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.CreateAdminViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.CreateCourseViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.CreateSectionViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.FacultyTopBarViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.FacultyViewImpl;
import org.dselent.course_load_scheduler.client.view.SideBarView;
//import org.dselent.course_load_scheduler.client.view.impl.FacultyViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.IndexViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.LoginViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.ModViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.ModeratorTopBarViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.ScheduleViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.SearchViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.SideBarFacultyBottomImpl;
import org.dselent.course_load_scheduler.client.view.impl.SideBarFacultyMiddleImpl;
import org.dselent.course_load_scheduler.client.view.impl.SideBarFacultyTopImpl;
import org.dselent.course_load_scheduler.client.view.impl.SideBarViewImpl;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

/**
 * Module where all to-be-injected dependencies are defined
 * 
 * @author dselent
 *
 */
public class InjectorModule extends AbstractGinModule
{
	@Override
    protected void configure()
    {
		// event bus
        bind(SimpleEventBus.class).in(Singleton.class);
        
        //services
        bind(UserService.class).to(UserServiceImpl.class).in(Singleton.class);
        
        // presenters
        bind(IndexPresenter.class).to(IndexPresenterImpl.class).in(Singleton.class);
        bind(LoginPresenter.class).to(LoginPresenterImpl.class).in(Singleton.class);
        bind(SchedulePresenter.class).to(SchedulePresenterImpl.class).in(Singleton.class);
        bind(FacultyTopBarPresenter.class).to(FacultyTopBarPresenterImpl.class).in(Singleton.class);
        bind(AdminTopBarPresenter.class).to(AdminTopBarPresenterImpl.class).in(Singleton.class);
        bind(ModeratorTopBarPresenter.class).to(ModeratorTopBarPresenterImpl.class).in(Singleton.class);
        bind(SideBarPresenter.class).to(SideBarPresenterImpl.class).in(Singleton.class);
        bind(CreateCoursePresenter.class).to(CreateCoursePresenterImpl.class).in(Singleton.class);
        bind(CreateAdminPresenter.class).to(CreateAdminPresenterImpl.class).in(Singleton.class);
		//----------------------------------------------------------------------------------Faculty Issue; Please fix--------//
        bind(FacultyPresenter.class).to(FacultyPresenterImpl.class).in(Singleton.class);
        bind(AdminPresenter.class).to(AdminPresenterImpl.class).in(Singleton.class);
        bind(ModPresenter.class).to(ModPresenterImpl.class).in(Singleton.class);
        bind(SearchPresenter.class).to(SearchPresenterImpl.class).in(Singleton.class);
        
        // views
        bind(IndexView.class).to(IndexViewImpl.class).in(Singleton.class);
        bind(LoginView.class).to(LoginViewImpl.class).in(Singleton.class);
        bind(ScheduleView.class).to(ScheduleViewImpl.class).in(Singleton.class);
        bind(FacultyTopBarView.class).to(FacultyTopBarViewImpl.class).in(Singleton.class);
        bind(AdminTopBarView.class).to(AdminTopBarViewImpl.class).in(Singleton.class);
        bind(ModeratorTopBarView.class).to(ModeratorTopBarViewImpl.class).in(Singleton.class);
        bind(SideBarView.class).to(SideBarViewImpl.class).in(Singleton.class);
        bind(SideBarFacultyBottomView.class).to(SideBarFacultyBottomImpl.class).in(Singleton.class);
        bind(SideBarFacultyMiddleView.class).to(SideBarFacultyMiddleImpl.class).in(Singleton.class);
        bind(SideBarFacultyTopView.class).to(SideBarFacultyTopImpl.class).in(Singleton.class);
        bind(CreateCourseView.class).to(CreateCourseViewImpl.class).in(Singleton.class);
        bind(CreateSectionView.class).to(CreateSectionViewImpl.class).in(Singleton.class);
        bind(CreateAdminView.class).to(CreateAdminViewImpl.class).in(Singleton.class);
		//----------------------------------------------------------------------------------Faculty Issue; Please fix--------//
        bind(FacultyView.class).to(FacultyViewImpl.class).in(Singleton.class);  
        bind(AdminView.class).to(AdminViewImpl.class).in(Singleton.class);
        bind(ModView.class).to(ModViewImpl.class).in(Singleton.class);
        bind(SearchView.class).to(SearchViewImpl.class).in(Singleton.class);
        //bind(SideBarFacultyBottomView.class).to(SideBarFacultyBottomImpl.class).in(Singleton.class);
        //bind(SideBarFacultyMiddleView.class).to(SideBarFacultyMiddleImpl.class).in(Singleton.class);
        //bind(SideBarFacultyTopView.class).to(SideBarFacultyTopImpl.class).in(Singleton.class);
    }
	/*
	 * Tried playing with this but had unresolved issues
	@Provides @Singleton @Inject
	public LoginPresenter provideLoginPresenter(IndexPresenter parentPresenter)
	{
	    return new LoginPresenter(parentPresenter);
	}
	*/
}