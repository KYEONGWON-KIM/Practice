package goods.controller;

import java.util.ArrayList;

import goods.exception.NotExistException;
import goods.model.dto.GoodsProject;
import goods.model.dto.Personaldata;
import goods.service.GoodService;
import goods.service.GoodsProjectService;
import goods.view.EndView;
import goods.view.FailView;

public class GoodsController {

	private static GoodsController instance = new GoodsController();
	private GoodsProjectService service = GoodsProjectService.getInstance();

	private GoodsController() {
	}

	public static GoodsController getInstance() {
		return instance;
	}

	// 모든
	public void projectListView() {
		ArrayList<GoodsProject> projectList = service.getAllProjects();
		if (projectList.size() != 0) {
			EndView.projectListView(projectList);
			GoodService.getInstance().InfoLog();
		} else {
			EndView.messageView("찾으시는 자료가 없습니다.");
			GoodService.getInstance().ErrLog();
		}
	}
    //특정 검색
	public void projectView(String GoodsName) {
		ArrayList<GoodsProject> projectList = service.getAllProjects(); //
		//
		for (GoodsProject project : projectList) {
			//
			if (project != null && project.getgoodsProjectName().equals(GoodsName)) {
				EndView.projectView(project);
				GoodService.getInstance().InfoLog();

				return;
			}
		}
		EndView.messageView("찾으시는 자료가 없습니다.");
		GoodService.getInstance().WarnLog();
	}
    //추가
	public void insertProject(GoodsProject newProject) {
		service.projectInsert(newProject);
	}
    //수정
	public void updateProject(String projectName, Personaldata people) {
		try {
			service.projectUpdate(projectName, people);
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
			GoodService.getInstance().ErrLog();
			// e.printStackTrace();
		}
	}
    //예외
	public void deleteProject(String projectName) {
		ArrayList<GoodsProject> projectList = service.getAllProjects();
		//
		for (GoodsProject project : projectList) {
			//
			if (project != null && project.getgoodsProjectName().equals(projectName)) {
				try {
					service.projectDelete(projectName);
				} catch (NotExistException e) {
					FailView.failMessageView(e.getMessage());
					// e.printStackTrace();
				}
				return;
			}
		}
		EndView.messageView("찾으시는 자료가 없습니다.");
		GoodService.getInstance().ErrLog();

	}
    //제이슨
	public void JsongetAllProjects() {
		if (service.projectJSON().size() != 0) {
			EndView.JSONView(service.projectJSON());
			GoodService.getInstance().InfoLog();
		}
	}

}
