package org.dselent.course_load_scheduler.client.gin;

import org.dselent.course_load_scheduler.client.presenter.impl.AdminPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AdminTopBarPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.CreateAdminPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.CreateCoursePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.CreateSectionPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.FacultyPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.FacultyTopBarPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.IndexPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.LoginPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.ModPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SchedulePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SearchPresenterImpl;
import org.dselent.course_load_scheduler.client.view.impl.AdminTopBarViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AdminViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.CreateCourseViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.CreateSectionViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.FacultyTopBarViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.FacultyViewImpl;
//----------------------------------------------------------------------------------Faculty Issue; Please fix--------//
//import org.dselent.course_load_scheduler.client.presenter.impl.FacultyPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SideBarPresenterImpl;
import org.dselent.course_load_scheduler.client.service.impl.UserServiceImpl;
//----------------------------------------------------------------------------------Faculty Issue; Please fix--------//
//import org.dselent.course_load_scheduler.client.view.impl.FacultyViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.IndexViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.LoginViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.ModViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.ScheduleViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.SearchViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.SideBarFacultyBottomImpl;
import org.dselent.course_load_scheduler.client.view.impl.SideBarFacultyMiddleImpl;
import org.dselent.course_load_scheduler.client.view.impl.SideBarFacultyTopImpl;
import org.dselent.course_load_scheduler.client.view.impl.SideBarViewImpl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

/**
 * Interface required by gin due to lack of runtime reflections
 * Provide methods to get all objects that are to be injected
 * 
 * GinModules annotation: indicates what the module file is
 * 
 * @author dselent
 *
 */
@GinModules(InjectorModule.class)
public interface Injector extends Ginjector
{
	// GIN generator will instantiate this
	// GWT.create uses deferred bindings where many permutations are created but only one
	// is used at runtime (the one for the specific browser)
    public static final Injector INSTANCE = GWT.create(Injector.class);
 
    // event bus
    public SimpleEventBus getEventBus();
    
    //services
    public UserServiceImpl getUserService();
    
    // presenters
    public IndexPresenterImpl getIndexPresenter();
    public LoginPresenterImpl getLoginPresenter();
    public SchedulePresenterImpl getSchedulePresenter();
    public FacultyTopBarPresenterImpl getFacultyTopBarPresenter();
    public AdminTopBarPresenterImpl getAdminTopBarPresenter();
    public CreateCoursePresenterImpl getCreateCoursePresenter();
    public CreateSectionPresenterImpl getCreateSectionPresenter();
    public AdminPresenterImpl getAdminPresenter();
    public ModPresenterImpl getModPresenter();
    public CreateAdminPresenterImpl getCreateAdminPresenter();
	//----------------------------------------------------------------------------------Faculty Issue; Please fix--------//
    public FacultyPresenterImpl getFacultyPresenter();
    public SideBarPresenterImpl getSideBarPresenter();
    public SearchPresenterImpl getSearchPresenter();
    //views
    public IndexViewImpl getIndexView();
    public LoginViewImpl getLoginView();
    public ScheduleViewImpl getScheduleView();
    public FacultyTopBarViewImpl getFacultyTopBarView();
    public AdminTopBarViewImpl getAdminTopBarView();
    public CreateCourseViewImpl getCreateCourseView();
    public CreateSectionViewImpl getCreateSectionView();
    public AdminViewImpl getAdminView();
    public ModViewImpl getModView();
    
	//----------------------------------------------------------------------------------Faculty Issue; Please fix--------//
    public FacultyViewImpl getFacultyView();
    public SideBarViewImpl getSideBarView();
    public SideBarFacultyBottomImpl getSideBarFacultyBottom();
    public SideBarFacultyMiddleImpl getSideBarFacultyMiddle();
    public SideBarFacultyTopImpl getSideBarFacultyTop();
    public SearchViewImpl getSearchView();
  
    
}
