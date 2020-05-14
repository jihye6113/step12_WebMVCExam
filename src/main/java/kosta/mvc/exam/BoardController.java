package kosta.mvc.exam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kosta.mvc.domain.Board;

@Controller
public class BoardController {
	@Autowired // 초기값 세팅을 위해 필요한 어노테이션
	private List<Board> list = new ArrayList<Board>();
	
	@RequestMapping(value="/list.kosta")
	public void aa(Model model) {
		
		model.addAttribute("list", list); // ${list}
	} 
	
	@RequestMapping("{url}.kosta")
	public void url() {}

	@PostMapping("/insert.kosta")
	public String insert(Board board) {
		
		list.add(board);
		
		return "redirect:list.kosta"; // 등록 이미 끝나서 들고갈 데이터가 없기 때문에 redirect 사용
	}
	
}
