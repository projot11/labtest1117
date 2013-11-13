package lab_test1117;

public class Story {
         Task task1;
         Task task2;
         int priorityNum;
         int storyPts;
	public Story(Task task1, Task task2, int i, int j) {
		// TODO Auto-generated constructor stub
		this.task1=task1;
		this.task2=task2;
		this.priorityNum=i;
		this.storyPts=j;
	}
	public int getPriorityNum() {
		return priorityNum;
	}
	public void setPriorityNum(int priorityNum) {
		this.priorityNum = priorityNum;
	}
	public int getStoryPts() {
		return storyPts;
	}
	public void setStoryPts(int storyPts) {
		this.storyPts = storyPts;
	}

}
