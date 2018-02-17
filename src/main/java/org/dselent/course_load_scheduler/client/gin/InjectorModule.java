package org.dselent.course_load_scheduler.client.gin;

import org.dselent.course_load_scheduler.client.presenter.FacultyPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.LoginPresenter;
import org.dselent.course_load_scheduler.client.presenter.SchedulePresenter;
import org.dselent.course_load_scheduler.client.presenter.SideBarPresenter;
<<<<<<< HEAD
=======
import org.dselent.course_load_scheduler.client.presenter.impl.FacultyPresenterImpl;
>>>>>>> dfc027dc0941f951499d551abf8f1c887e839169
import org.dselent.course_load_scheduler.client.presenter.impl.IndexPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.LoginPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SchedulePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SideBarPresenterImpl;
<<<<<<< HEAD
=======
import org.dselent.course_load_scheduler.client.view.FacultyView;
>>>>>>> dfc027dc0941f951499d551abf8f1c887e839169
import org.dselent.course_load_scheduler.client.view.IndexView;
import org.dselent.course_load_scheduler.client.view.LoginView;
import org.dselent.course_load_scheduler.client.view.ScheduleView;
import org.dselent.course_load_scheduler.client.view.SideBarView;
<<<<<<< HEAD
=======
import org.dselent.course_load_scheduler.client.view.impl.FacultyViewImpl;
>>>>>>> dfc027dc0941f951499d551abf8f1c887e839169
import org.dselent.course_load_scheduler.client.view.impl.IndexViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.LoginViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.ScheduleViewImpl;
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
        
        // presenters
        bind(IndexPresenter.class).to(IndexPresenterImpl.class).in(Singleton.class);
        bind(LoginPresenter.class).to(LoginPresenterImpl.class).in(Singleton.class);
        bind(SchedulePresenter.class).to(SchedulePresenterImpl.class).in(Singleton.class);
        bind(SideBarPresenter.class).to(SideBarPresenterImpl.class).in(Singleton.class);
        bind(FacultyPresenter.class).to(FacultyPresenterImpl.class).in(Singleton.class);
        bind(SideBarPresenter.class).to(SideBarPresenterImpl.class).in(Singleton.class);
        
        // views
        bind(IndexView.class).to(IndexViewImpl.class).in(Singleton.class);
        bind(LoginView.class).to(LoginViewImpl.class).in(Singleton.class);
        bind(ScheduleView.class).to(ScheduleViewImpl.class).in(Singleton.class);
        bind(SideBarView.class).to(SideBarViewImpl.class).in(Singleton.class);
        bind(FacultyView.class).to(FacultyViewImpl.class).in(Singleton.class);
        bind(SideBarView.class).to(SideBarViewImpl.class).in(Singleton.class);
        
       
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