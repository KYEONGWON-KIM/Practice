package goods.view;

import java.util.ArrayList;

import goods.model.dto.GoodsProject;
import net.sf.json.JSON;

public class EndView {
	
	//특정 프로젝트 출력 
	public static void projectView(GoodsProject project){
		System.out.println(project);		
	}
		
	//모든 프로젝트 출력
	public static void projectListView(ArrayList<GoodsProject> allGoodsProject){
		for(int index = 0; index < allGoodsProject.size(); index++){			
			System.out.println("[고객 " + (index+1) + "]\n" + allGoodsProject.get(index) +"\n");
		}
	}
	
	//예외가 아닌 단순 메세지 출력
	public static void messageView(String message) {
		System.out.println(message);
	}
	//JSON 출력
	public static void JSONView(JSON jsonArray) {
		System.out.println(jsonArray);
	}
}





