package org.dselent.course_load_scheduler.client.gin;

import org.dselent.course_load_scheduler.client.presenter.AdminTopBarPresenter;
import org.dselent.course_load_scheduler.client.presenter.FacultyTopBarPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.LoginPresenter;
import org.dselent.course_load_scheduler.client.presenter.ModeratorTopBarPresenter;
import org.dselent.course_load_scheduler.client.presenter.SchedulePresenter;
import org.dselent.course_load_scheduler.client.presenter.impl.AdminTopBarPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.FacultyTopBarPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.IndexPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.LoginPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.ModeratorTopBarPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SchedulePresenterImpl;
import org.dselent.course_load_scheduler.client.view.AdminTopBarView;
import org.dselent.course_load_scheduler.client.view.FacultyTopBarView;
import org.dselent.course_load_scheduler.client.view.IndexView;
import org.dselent.course_load_scheduler.client.view.LoginView;
import org.dselent.course_load_scheduler.client.view.ModeratorTopBarView;
import org.dselent.course_load_scheduler.client.view.ScheduleView;
import org.dselent.course_load_scheduler.client.view.impl.AdminTopBarViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.FacultyTopBarViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.IndexViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.LoginViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.ModeratorTopBarViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.ScheduleViewImpl;

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
        bind(FacultyTopBarPresenter.class).to(FacultyTopBarPresenterImpl.class).in(Singleton.class);
        bind(AdminTopBarPresenter.class).to(AdminTopBarPresenterImpl.class).in(Singleton.class);
        bind(ModeratorTopBarPresenter.class).to(ModeratorTopBarPresenterImpl.class).in(Singleton.class);
        
        // views
        bind(IndexView.class).to(IndexViewImpl.class).in(Singleton.class);
        bind(LoginView.class).to(LoginViewImpl.class).in(Singleton.class);
        bind(ScheduleView.class).to(ScheduleViewImpl.class).in(Singleton.class);
        bind(FacultyTopBarView.class).to(FacultyTopBarViewImpl.class).in(Singleton.class);
        bind(AdminTopBarView.class).to(AdminTopBarViewImpl.class).in(Singleton.class);
        bind(ModeratorTopBarView.class).to(ModeratorTopBarViewImpl.class).in(Singleton.class);
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