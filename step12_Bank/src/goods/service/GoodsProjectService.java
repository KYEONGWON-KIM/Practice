package goods.service;

import java.util.ArrayList;

import goods.exception.NotExistException;
import goods.model.GoodsModelVirtualDB;
import goods.model.dto.Deposit;
import goods.model.dto.GoodsProject;
import goods.model.dto.Personaldata;
import goods.model.dto.Withdraw;
import net.sf.json.JSONArray;

public class GoodsProjectService {

	private static GoodsProjectService instance = new GoodsProjectService();
	private GoodsModelVirtualDB projectVirtualData = GoodsModelVirtualDB.getInstance();

	private GoodsProjectService() {
	}

	public static GoodsProjectService getInstance() {
		return instance;
	}

	// 모든 Project 반환
	public ArrayList<GoodsProject> getAllProjects() {
		return projectVirtualData.getProjectList();
	}

	// Project 검색
	public GoodsProject getGoodsProject(String projectName) {
		GoodsProject project = null;
		ArrayList<GoodsProject> allProjects = projectVirtualData.getProjectList();
		for (GoodsProject p : allProjects) {
			if (p != null && p.getgoodsProjectName().equals(projectName)) {
				return p;
			}
		}
		return project;
	}

	// Project 추가
	public void projectInsert(GoodsProject project) {
		projectVirtualData.insertProject(project);
	}

	// Project 수정
	public void projectUpdate(String projectName, Personaldata personaldata) throws NotExistException {
		GoodsProject project = getGoodsProject(projectName);
		if (project == null) {
			throw new NotExistException("xxxxxxx 수정하고자 하는 Project가 미 존재합니다. xxxxxxx\n");
		} else if (personaldata instanceof Deposit) {// personaldata -> 수혜자
			project.setdeposit((Deposit) personaldata);
//
		} else if (personaldata instanceof Withdraw) {// personaldata -> 기부자
			project.setwithraw((Withdraw) personaldata);
//
		}
	}

	// Project 삭제
	public void projectDelete(String projectName) throws NotExistException {

		GoodsProject project = getGoodsProject(projectName);
		if (project == null) {
			try {

			} catch (Exception e) {

			}
			throw new NotExistException("xxxxxxx 삭제하고자 하는 Project가 미 존재합니다. xxxxxxx\n");
		}
		projectVirtualData.deleteProject(project);
	}

//JSON 프로젝트 변환
	public JSONArray projectJSON() {
		JSONArray j = JSONArray.fromObject(projectVirtualData.getProjectList());
		return j;

	}
}