package site.metacoding.test.web;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.test.domain.boardTbl;
import site.metacoding.test.service.tblService;

@RequiredArgsConstructor
@Controller
public class tblController {

    private final tblService tblService;

    @GetMapping({ "/" })
    public String home2(String search, Model model) {
        if (search == null) {
            List<boardTbl> tblEntitys = tblService.게시글찾기("");
            model.addAttribute("tblEntitys", tblEntitys);
        } else {
            List<boardTbl> tblEntitys = tblService.게시글찾기(search);
            model.addAttribute("tblEntitys", tblEntitys);
        }
        return "home";
    }
}
