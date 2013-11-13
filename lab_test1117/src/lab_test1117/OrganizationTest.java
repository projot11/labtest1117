package lab_test1117;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OrganizationTest {

	teamMember productowner;
	teamMember scrummaster;
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
		team = new Team(productowner,scrummaster);              //teams part done.
		//story2 = new Story();
		task1 = new Task(4);
		task2 = new Task(3);
		task3 = new Task(5);
		task4 = new Task(6);
		task5 = new Task(5);
		task6 = new Task(5);
		task7 = new Task(3);
		task8 = new Task(4);
		
		
		
		story1 = new Story(task1,task2,3,4);
		story2 = new Story(task3,task4,3,4);
		story3 = new Story(task5,task6,3,4);
		story4 = new Story(task7,task8,3,4);
		sprint1 = new Sprint(story1,story2);
		sprint2 = new Sprint(story3,story4);
		project = new Project(team,sprint1,sprint2);
		
		
		
		
		
	}
	
	@Test
	public void test() {
		assertEquals(4, task1.getHours());
		assertEquals(3, task2.getHours());
		assertEquals(4, story1.getStoryPts());
		assertEquals(4, story2.getStoryPts());
		assertEquals(4, story4.getStoryPts());
		
		
		
	}

}
