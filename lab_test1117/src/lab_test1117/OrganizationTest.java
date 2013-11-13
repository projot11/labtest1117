package lab_test1117;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OrganizationTest {
	Organization organization;
	teamMember productowner;
	teamMember scrummaster;
	teamMember programmer;
	teamMember tester;
	Team team;
	Project project;
	Sprint sprint1;
	Sprint sprint2;
	Story story1;
	Story story2;
	Story story3;
	Story story4;
	Task task1;
	Task task2;
	Task task3;
	Task task4;
	Task task5;
	Task task6;
	Task task7;
	Task task8;
	
	
	@Before 
	public void setUp() throws Exception {
		productowner= new productOwner();
		scrummaster = new scrumMaster();
		programmer = new Programmer();
		tester = new Tester();
		team = new Team(productowner,scrummaster,programmer,tester);   //teams members.
		//story2 = new Story();
		task1 = new Task(4,"design IU");                               //tasks to be done.
		task2 = new Task(3,"code the UI");
		task3 = new Task(5,"design backend");
		task4 = new Task(6,"code backend");
		task5 = new Task(5,"Design forms");
		task6 = new Task(5,"implement connctivity");
		task7 = new Task(3,"test the application");
		task8 = new Task(4,"launch the application");
		programmer.setRole(task2.getTask());                      	//allocation of task.
		tester.setRole(task7.getTask());                            //allocation of task.
		scrummaster.setRole(task1.getTask());                       //allocation of task.
		
		
		
		story1 = new Story("As a user i want to use the UI",task1,task2,3,4);
		story2 = new Story("As a user i want to retrive data frm DBase",task3,task4,3,4);
		story3 = new Story("As a user i want to login",task5,task6,3,4);
		story4 = new Story("As a admin i want to alunch the application",task7,task8,3,4);
		sprint1 = new Sprint(story1,story2);
		sprint2 = new Sprint(story3,story4);
		project = new Project(team,sprint1,sprint2);
		
		organization(project);
		
		
		
		
		
		
		
		
	}
	
	private void organization(Project project2) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void test() {
		assertEquals(4, task1.getHours());                          //test cases.
		assertEquals(3, task2.getHours());
		assertEquals(4, story1.getStoryPts());
		assertEquals(4, story2.getStoryPts());
		assertEquals(4, story4.getStoryPts());
		assertEquals(3, story4.getPriorityNum());
		assertEquals("code the UI", task2.getTask());
		assertEquals("As a admin i want to alunch the application", story4.getStorytask());
		assertEquals("As a user i want to retrive data frm DBase", story2.getStorytask());
		assertEquals("code the UI", programmer.getRole());
		assertEquals("test the application", tester.getRole());
		assertEquals("design IU", scrummaster.getRole());
		
		
		
		
		
	}

}
