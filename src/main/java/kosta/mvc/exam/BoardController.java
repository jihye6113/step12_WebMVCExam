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
	@Autowired // �ʱⰪ ������ ���� �ʿ��� ������̼�
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
		
		return "redirect:list.kosta"; // ��� �̹� ������ ��� �����Ͱ� ���� ������ redirect ���
	}
	
}
